package com.example.compose.jetchat.customview

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.FrameLayout
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.example.compose.jetchat.R

class MfklBodyCustomView @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : FrameLayout(context, attrs, defStyleAttr) {

    private val imageView: ImageView
    private val textView: TextView

    init {
        val view = LayoutInflater.from(context).inflate(R.layout.mfkl_body_custom_view, this, true)
        imageView = view.findViewById(R.id.mfkl_body_cv_imageView)
        textView = view.findViewById(R.id.mfkl_body_cv_textView)
    }

    fun setImageUrl(url: String) {
        Glide.with(context)
            .load(url)
            .centerCrop()
            .into(imageView)
    }

    fun setText(text: CharSequence) {
        textView.text = text
    }
}