package com.example.stopwatch

import android.app.Dialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.NumberPicker
import com.example.stopwatch.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    val binding by lazy{
        ActivityMainBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.IVTimerImage.setOnClickListener {
            var dialog = Dialog(this)
            dialog.setContentView(R.layout.dialog)
            var numberPicker = dialog.findViewById<NumberPicker>(R.id.NPNumberPicker)
            numberPicker.minValue =0
            numberPicker.maxValue = 5
            dialog.show()
        }
    }
}