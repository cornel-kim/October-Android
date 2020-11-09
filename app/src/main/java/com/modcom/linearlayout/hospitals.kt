package com.modcom.linearlayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_hospitals.*

class hospitals : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hospitals)
        //create an array of hospitals
        //add hospitals in the array
        val hospitals = arrayOf("KNH", "Mater", "Nairobi", "Aga Khan", "Karen")
        //trigger the array using an adapter
        val arrayAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, hospitals)
        listhospitals.adapter = arrayAdapter
    }
}