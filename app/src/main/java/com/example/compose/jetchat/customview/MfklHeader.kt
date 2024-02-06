package com.example.compose.jetchat.customview

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.ImageButton
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import com.example.compose.jetchat.R

class MfklHeader @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : ConstraintLayout(context, attrs, defStyleAttr) {

    private val backButton: ImageButton
    private val closeButton: ImageButton
    private val titleView: TextView
    private val subtitleView: TextView

    init {
        LayoutInflater.from(context).inflate(R.layout.mfkl_header, this, true)
        backButton = findViewById(R.id.mfkl_header_cv_backButton)
        closeButton = findViewById(R.id.mfkl_header_cv_closeButton)
        titleView = findViewById(R.id.mfkl_header_cv_headerTitle)
        subtitleView = findViewById(R.id.mfkl_header_cv_headerSubtitle)
    }

    fun setTitle(title: String) {
        titleView.text = title
    }

    fun setSubtitle(subtitle: String) {
        subtitleView.text = subtitle
    }

    fun setBackButtonListener(listener: OnClickListener) {
        backButton.setOnClickListener(listener)
    }

    fun setCloseButtonListener(listener: OnClickListener) {
        closeButton.setOnClickListener(listener)
    }
}
