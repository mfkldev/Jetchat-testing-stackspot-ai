package com.example.compose.jetchat.customview

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.FrameLayout
import android.widget.ImageView
import android.widget.TextView
import com.example.compose.jetchat.R

class MfklBody @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : FrameLayout(context, attrs, defStyleAttr) {

    private val imageView: ImageView
    private val textView: TextView

    init {
        val view = LayoutInflater.from(context).inflate(R.layout.mfkl_body, this, true)
        imageView = view.findViewById(R.id.mfkl_body_cv_imageView)
        textView = view.findViewById(R.id.mfkl_body_cv_textView)
    }

    fun setImageResource(resId: Int) {
        imageView.setImageResource(resId)
    }

    fun setText(text: CharSequence) {
        textView.text = text
    }
}