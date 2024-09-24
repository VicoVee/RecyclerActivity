package edu.temple.simplerecyclerview

import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

// Step 3: Complete adapter implementation
//Step 3a: Provide Adapter Parent
//Extend to the RecyclerView.Adapter and place the current's class ViewHolder
class NumberDisplayAdapter(private val numbers: IntArray) :
    RecyclerView.Adapter<NumberDisplayAdapter.NumberViewHolder>() {

    //List all the elements of the view (each component such as images, buttons, etc.)
    //In this case, this holder only holds one type of view: TextView
    class NumberViewHolder(val textView: TextView) : RecyclerView.ViewHolder(textView) {}

    // Step 3b: Complete function definitions for adapter
    //Create Views (For example, setting how big each TextView is)
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        NumberViewHolder(TextView(parent.context).apply {
            setPadding(3, 4, 3, 4)
        }
        )

    //Alternative
//        val textView = TextView(parent.context)
//        textView.setPadding(3, 4, 3,4)
//        val numberViewHolder = NumberViewHolder(textView)
//        return numberViewHolder

    //Populating views (color, images, text, size)
    //Here for each TextView view, we added the text and then changed the size
    override fun onBindViewHolder(holder: NumberViewHolder, position: Int) {
        holder.textView.text = numbers[position].toString()
        holder.textView.textSize = numbers[position].toFloat()
    }

    //Return the total number of views in this holder (Int)
    //An expression can be evaluated and returns a value
    // Ex. return 3-1 => An expression that always evaluate to 2
    override fun getItemCount() = numbers.size


}