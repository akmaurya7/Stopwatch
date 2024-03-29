package com.example.stopwatch

import android.app.AlertDialog
import android.app.Dialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.NumberPicker
import com.example.stopwatch.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.IVTimerImage.setOnClickListener {
            var dialog = Dialog(this)
            dialog.setContentView(R.layout.dialogbox)
            var numberPicker = dialog.findViewById<NumberPicker>(R.id.numberPicker)
            numberPicker.minValue = 0
            numberPicker.maxValue = 5
            dialog.findViewById<Button>(R.id.setTimeButton).setOnClickListener {
                binding.TVSetTime.text = dialog.findViewById<NumberPicker>(R.id.numberPicker).value.toString() +" min"
                dialog.dismiss()
            }
            dialog.show()
        }


    }

}