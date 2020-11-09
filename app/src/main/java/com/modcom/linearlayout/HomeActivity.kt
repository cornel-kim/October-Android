package com.modcom.linearlayout

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        explicit intent to open new actvity
        OpenSecondActivity.setOnClickListener {
            val intent = Intent(this, SymptomsActivity::class.java)
            startActivity(intent)
        }
        btnPrevention.setOnClickListener {
            val intent = Intent(this, prevention::class.java)
            startActivity(intent)
        }
        btnHosi.setOnClickListener {
            val i = Intent(this, hospitals::class.java)
            startActivity(i)
            //android toast
            Toast.makeText(this, "opening list view", Toast.LENGTH_SHORT).show()
        }
    }
}