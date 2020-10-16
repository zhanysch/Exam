package com.example.magazin.ui

import DataSecond
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

import com.example.magazin.R
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.recycler_helper.view.*

class RvAdapter(private val listener: ItemListener):RecyclerView.Adapter<RvAdapter.RvVholder>() {
    private val list = arrayListOf<DataSecond>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RvVholder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.recycler_helper,parent,false)
        return RvVholder(view)

    }
    fun update(list : List<DataSecond>?){
        if (list!= null){
            this.list.clear()
            this.list.addAll(list)
            notifyDataSetChanged()
        }
    }
    override fun getItemCount() = list.size



    class RvVholder(v : View) : RecyclerView.ViewHolder(v){
        fun bind(item: DataSecond, listener: ItemListener){
            Picasso.get().load(item.image).into(itemView.imageShow)
            itemView.Nameof.text = item.name

        }
    }

    override fun onBindViewHolder(holder: RvVholder, position: Int) {
        holder.bind(list[position],listener)
    }
}