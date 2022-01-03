package com.example.centennial2

import android.graphics.Rect
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ItemDecoration
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

//        // 간격 설정
//        val layoutParams = holder.itemView.layoutParams
//        layoutParams.width = 900
//        holder.itemView.requestLayout()
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

class RecyclerViewDecoration(private val divWidth: Int) : ItemDecoration() {
    override fun getItemOffsets(
        outRect: Rect,
        view: View,
        parent: RecyclerView,
        state: RecyclerView.State
    ) {
        super.getItemOffsets(outRect, view, parent, state)
        outRect.right = divWidth
    }

}
