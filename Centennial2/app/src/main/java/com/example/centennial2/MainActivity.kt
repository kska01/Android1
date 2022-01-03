package com.example.centennial2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.centennial2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val data: MutableList<Menu> = loadData()
        val adapter = CustomAdapter()
        adapter.listData = data

        binding.recyclerView.adapter = adapter
        binding.recyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)

    }

    fun loadData(): MutableList<Menu> {
        var data: MutableList<Menu> = mutableListOf(
            Menu(R.drawable.menu1, R.string.menu1),
            Menu(R.drawable.menu2, R.string.menu2),
            Menu(R.drawable.menu3, R.string.menu3),
            Menu(R.drawable.menu4, R.string.menu4),
            Menu(R.drawable.menu5, R.string.menu5)
        )
        return data
    }
}