package com.modcom.linearlayout

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import kotlinx.android.synthetic.main.activity_contactus.*

class contactus : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contactus)
        btnWeb.setOnClickListener {
            //implicit intent to web
            val i = Intent(Intent.ACTION_VIEW, Uri.parse("https://knh.or.ke/"))
            startActivity(i)
        }
        btnCall.setOnClickListener {
            //implicit intent for call
            val i = Intent(Intent.ACTION_DIAL, Uri.parse("tel:07123457"))
            startActivity(i )
        }
        btnMap.setOnClickListener {
            //implicit intent for call
            val i = Intent(Intent.ACTION_VIEW, Uri.parse("geo: -1.301301,36.8048012,17z"))
            startActivity(i )
        }
        btnGallery.setOnClickListener {
            //implicit intent for call
//            val i = Intent(Intent.ACTION_PICK)
//            i.type = "image/*"
//            startActivity(i )
            val intent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)//camera capture
            startActivity(intent)
        }
        btnShare.setOnClickListener {
            //implicit intent for share
            val i = Intent().apply {
                action = Intent.ACTION_SEND
                putExtra(Intent.EXTRA_TEXT, "Find our our application on this link")
                type = "text/plain"
            }
            val shareIntent = Intent.createChooser(i, null)
            startActivity(shareIntent)
        }
    }
}