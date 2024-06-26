package com.submission.eyecare.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.submission.eyecare.databinding.ActivityInfoBinding

class InfoActivity : AppCompatActivity() {

    private lateinit var binding: ActivityInfoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityInfoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val disease = intent.getStringExtra(EXTRA_DISEASE)
        val content = intent.getStringExtra(EXTRA_DESC)
        val img = intent.getStringExtra(EXTRA_IMG)

        binding.apply {
            infoHeader.text = disease
            infoContent.text = content
            Glide.with(this@InfoActivity)
                .load(img)
                .into(infoImg)
        }
    }

    companion object {
        const val EXTRA_DESC = "extra_desc"
        const val EXTRA_DISEASE = "extra_disease"
        const val EXTRA_IMG = "extra_img"
    }
}