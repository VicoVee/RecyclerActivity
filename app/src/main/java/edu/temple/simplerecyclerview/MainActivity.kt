package edu.temple.simplerecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Step 1: Reference RecyclerView object
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)

        // Step 2: Provide a LayoutManager
        recyclerView.layoutManager = LinearLayoutManager(this)

        //TODO Step 4: Provide a RecyclerView.Adapter
        val numbers = IntArray(25){(it+1) * 5}
        recyclerView.adapter = NumberDisplayAdapter(numbers)


    }
}