package com.example.newsreader

import android.content.Intent
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.core.view.drawToBitmap
import kotlinx.android.synthetic.main.activity_detail_page.*
import kotlinx.android.synthetic.main.activity_list_page.*

class ListPage : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_page)
        card_view.setOnClickListener {
            val detailsIntent = Intent(this, DetailPage::class.java)
            startActivity(detailsIntent)
        }
    }
}
