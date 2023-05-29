package com.example.affirmations

import android.content.Context
import com.example.affirmations.adapter.ItemApdater
import com.example.affirmations.model.Affirmation
import junit.framework.TestCase.assertEquals
import org.junit.Test
import org.mockito.Mockito.mock

class AffirmationsAdapterTests {

    private val context = mock(Context::class.java )

    @Test
    fun adaptersize(){
        val data = listOf(
            Affirmation(R.string.affirmation1, R.drawable.image1),
            Affirmation(R.string.affirmation2, R.drawable.image2))

        val itemAdapter = ItemApdater(context ,data)
        assertEquals("ItemAdapter not correct size",data.size,itemAdapter.itemCount)
    }
}