package com.example.centennial2

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.centennial2.databinding.MenuLayoutBinding

class CustomAdapter: RecyclerView.Adapter<Holder>() {
    var listData: MutableList<Menu> = mutableListOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val binding = MenuLayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return Holder(binding)
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        val menu = listData.get(position)
        holder.setMenu(menu)

        val layoutParams = holder.itemView.layoutParams
        layoutParams.width = 900
        holder.itemView.requestLayout()
    }

    override fun getItemCount(): Int {
        return listData.size
    }
}

class Holder(val binding: MenuLayoutBinding): RecyclerView.ViewHolder(binding.root) {
    fun setMenu(menu: Menu) {
        binding.menuImage.setImageResource(menu.menuImage)
    }
}