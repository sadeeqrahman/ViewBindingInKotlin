package com.encoders.viewbindinginkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.encoders.viewbindinginkotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.name.text = "Sadeeq Rahman"
    }
}