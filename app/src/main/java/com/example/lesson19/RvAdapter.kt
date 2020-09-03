package com.example.lesson19

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_rv.view.*

class RvAdapter(private val listener: RvListener) : RecyclerView.Adapter<RvViewHolder>() {
    private val list = arrayListOf<CitiesData>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RvViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_rv, parent, false)
        return RvViewHolder(view)
    }

    override fun getItemCount() = list.size

    override fun onBindViewHolder(holder: RvViewHolder, position: Int) {
        holder.bind(list[position], listener)
    }

    fun update(data: ArrayList<CitiesData>) {
        list.clear()
        list.addAll(data)
        notifyDataSetChanged()
    }
}

class RvViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    fun bind(
        item: CitiesData,
        listener: RvListener
    ) {
        itemView.setOnClickListener {
            listener.goToCity(item)
        }
        itemView.tvText.text = item.title
        itemView.ivImage.setImageDrawable(
            ContextCompat.getDrawable(
                itemView.context,
                item.imageOfEmblem
            )
        )
    }
}