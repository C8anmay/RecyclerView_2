package com.acm.recyclerview_2

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.acm.recyclerview_2.databinding.RecycleritemOneBinding
import com.acm.recyclerview_2.databinding.RecycleritemTwoBinding

class Adapter2(val itemList2:ArrayList<Item_Two>) :RecyclerView.Adapter<Adapter2.R2ViewHolder>() {
    inner class R2ViewHolder(val binding: RecycleritemTwoBinding): RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): R2ViewHolder {
        val bind=RecycleritemTwoBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return R2ViewHolder(bind)
    }

    override fun getItemCount(): Int=itemList2.size

    override fun onBindViewHolder(holder: R2ViewHolder, position: Int) {
        //  holder.binding.txtr15.text=itemList.get(position).txt5
        //        holder.binding.idCamera.setImageResource(itemList.get(position).img)
        holder.binding.txtModel.text=itemList2.get(position).txtModel
        holder.binding.txtName.text=itemList2.get(position).txtName
        holder.binding.txtStar.text=itemList2.get(position).txtStar
        holder.binding.txtNowPrice.text=itemList2.get(position).txtNewPrice
        holder.binding.txtOldPrice.text=itemList2.get(position).txtOldPrice
        holder.binding.imgR2.setImageResource(itemList2.get(position).imgR)
    }
}