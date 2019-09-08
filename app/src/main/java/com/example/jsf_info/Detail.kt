package com.example.jsf_info

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import org.w3c.dom.Text

class Detail : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val imgDtlLogo: ImageView = findViewById(R.id.dtl_img_logo)
        val tvDtlName: TextView = findViewById(R.id.dtl_tv_name)
        val tvDtlVersion: TextView = findViewById(R.id.dtl_tv_version)
        val tvDtlDeveloper: TextView = findViewById(R.id.dtl_tv_developer)
        val tvDtlRelease: TextView = findViewById(R.id.dtl_tv_release)
        val tvDtlDescription: TextView = findViewById(R.id.dtl_tv_description)
        val btnUrl: Button = findViewById(R.id.dtl_btn_url)

        val iLogo = intent.getIntExtra(EXTRA_LOGO, 0)
        val tName = intent.getStringExtra(EXTRA_NAME)
        val tVersion= intent.getStringExtra(EXTRA_VERSION)
        val tDev = intent.getStringExtra(EXTRA_DEVELOPER)
        val tRelease = intent.getStringExtra(EXTRA_RELEASE)
        val tDescription = intent.getStringExtra(EXTRA_DESCRIPTION)
        val bUrl = intent.getStringExtra(EXTRA_URL)

        Glide.with(this)
            .load(iLogo)
            .apply(RequestOptions())
            .into(imgDtlLogo)
        tvDtlName.text = tName
        tvDtlVersion.text = tVersion
        tvDtlDeveloper.text = tDev
        tvDtlRelease.text = tRelease
        tvDtlDescription.text = tDescription
        btnUrl.setOnClickListener {
            val openUrl = Intent(android.content.Intent.ACTION_VIEW)
            openUrl.data = Uri.parse(bUrl)
            startActivity(openUrl)
        }

        val actionbar = supportActionBar
        actionbar!!.title = "Detail of $tName"
        actionbar.setDisplayHomeAsUpEnabled(true)

    }

    companion object {
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_DEVELOPER = "extra_developer"
        const val EXTRA_RELEASE = "extra_release"
        const val EXTRA_VERSION = "extra_version"
        const val EXTRA_DESCRIPTION = "extra_description"
        const val EXTRA_URL = "extra_url"
        const val EXTRA_LOGO = "extra_logo"
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}
