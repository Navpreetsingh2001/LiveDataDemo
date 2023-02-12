package com.example.practiseviewmodel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.practiseviewmodel.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    var count =0
    private lateinit var binding: ActivityMainBinding
    private lateinit var  viewModelD: ViewModelDemo
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var diaplayText =binding.tvCount
        var btn =binding.btnCount

        viewModelD = ViewModelProvider(this).get(ViewModelDemo::class.java)

        viewModelD.count.observe(this, Observer {
            diaplayText.text =it.toString()
        })


        btn.setOnClickListener {
            viewModelD.updateCount()

        }

    }
}