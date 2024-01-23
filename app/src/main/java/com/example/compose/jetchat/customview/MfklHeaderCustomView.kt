package com.example.compose.jetchat.customview

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.ImageButton
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import com.example.compose.jetchat.R

class MfklHeaderCustomView @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : ConstraintLayout(context, attrs, defStyleAttr) {

    private val backButton: ImageButton
    private val closeButton: ImageButton
    private val titleView: TextView
    private val subtitleView: TextView

    init {
        LayoutInflater.from(context).inflate(R.layout.mfkl_header_custom_view, this, true)
        backButton = findViewById(R.id.backButton)
        closeButton = findViewById(R.id.closeButton)
        titleView = findViewById(R.id.headerTitle)
        subtitleView = findViewById(R.id.headerSubtitle)
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
