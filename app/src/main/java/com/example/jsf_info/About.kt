package com.example.jsf_info

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class About : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        val actionbar = supportActionBar
        actionbar!!.title = "About Developer"
        actionbar.setDisplayHomeAsUpEnabled(true)

        val myPhoto: ImageView = findViewById(R.id.my_photo)
        val srcPhoto = R.drawable.profile

        Glide.with(this)
            .load(srcPhoto)
            .apply(RequestOptions())
            .into(myPhoto)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return super.onSupportNavigateUp()
    }
}
