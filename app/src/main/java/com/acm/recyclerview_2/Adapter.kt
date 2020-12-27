package com.acm.recyclerview_2

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.acm.recyclerview_2.databinding.ActivityMainBinding
import com.acm.recyclerview_2.databinding.RecycleritemOneBinding

class Adapter(val itemList:ArrayList<Item_One>) :RecyclerView.Adapter<Adapter.RViewHolder>(){
inner class RViewHolder(val binding: RecycleritemOneBinding ):RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RViewHolder {
        val bind=RecycleritemOneBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return RViewHolder(bind)
    }

    override fun getItemCount(): Int= itemList.size

    override fun onBindViewHolder(holder: RViewHolder, position: Int) {
        holder.binding.txtr11.text=itemList.get(position).txt1
        holder.binding.txtr12.text=itemList.get(position).txt2
        holder.binding.txtr13.text=itemList.get(position).txt3
        holder.binding.txtr14.text=itemList.get(position).txt4
        holder.binding.txtr15.text=itemList.get(position).txt5
        holder.binding.idCamera.setImageResource(itemList.get(position).img)
    }
}