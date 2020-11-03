package com.modcom.linearlayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.text.HtmlCompat
import kotlinx.android.synthetic.main.activity_sysmptoms.*

class SymptomsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sysmptoms)
    tvSigns.text = HtmlCompat.fromHtml("\n" +
        "<body>\n" +
            "<h2>\n"+"Signs and symptoms"+
             "</h2>\n"+
            "<p>\n"+ "1. cough " + "</p>\n"+
            "<p>\n"+ "2. Fever " + "</p>\n"+
            "<p>\n"+ "3. loss of taste " + "</p>\n"+
            "<p>\n"+ "4. blocked chest " + "</p>\n"+
        "</body>"

    , HtmlCompat.FROM_HTML_MODE_LEGACY)
    }
}