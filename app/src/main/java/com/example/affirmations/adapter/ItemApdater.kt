package com.example.affirmations.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.affirmations.R
import com.example.affirmations.model.Affirmation

class ItemApdater(private val context: Context, private val listOfAffirmations: List<Affirmation>) :
    RecyclerView.Adapter<ItemApdater.ItemViewHolder>() {
    class ItemViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
        val txt: TextView = view.findViewById(R.id.affirmation_text)
        val img: ImageView = view.findViewById(R.id.image)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val adapterLayout =
            LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
        return ItemViewHolder(adapterLayout)
    }

    override fun getItemCount() = listOfAffirmations.size

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = listOfAffirmations[position]
        holder.txt.text = context.resources.getString(item.stringResourceId)
        holder.img.setImageResource(item.imageResourceId)
    }
}