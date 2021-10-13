package com.aleangelozi.checkboxandradiobutton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rgMeat = findViewById<RadioGroup>(R.id.rgMeat)
        val cbCheese = findViewById<CheckBox>(R.id.cbCheese)
        val cbOnions = findViewById<CheckBox>(R.id.cbOnions)
        val cbSalad = findViewById<CheckBox>(R.id.cbSalad)
        val tvOrder = findViewById<TextView>(R.id.tvOrder)

        val btnOrder = findViewById<Button>(R.id.btnOrder)
        btnOrder.setOnClickListener {
            val checkedMeatRadioButtonId = rgMeat.checkedRadioButtonId
            val meat = findViewById<RadioButton>(checkedMeatRadioButtonId)
            val cheese = cbCheese.isChecked
            val onions = cbOnions.isChecked
            val salad = cbSalad.isChecked
            val orderString = "You ordered a burger with:\n" +
                    "${meat.text}" +
                    (if (cheese) "\nCheese" else "") +
                    (if (onions) "\nOnions" else "") +
                    (if (salad) "\nSalad" else "")
            tvOrder.text = orderString
        }
    }
}