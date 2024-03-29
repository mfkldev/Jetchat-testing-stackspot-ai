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

    private val leftIcon: ImageButton
    private val rightIcon: ImageButton
    private val titleView: TextView
    private val subtitleView: TextView

    init {
        LayoutInflater.from(context).inflate(R.layout.mfkl_header_custom_view, this, true)
        leftIcon = findViewById(R.id.mfkl_header_cv_leftIcon)
        rightIcon = findViewById(R.id.mfkl_header_cv_rightIcon)
        titleView = findViewById(R.id.mfkl_header_cv_headerTitle)
        subtitleView = findViewById(R.id.mfkl_header_cv_headerSubtitle)
    }

    fun setTitle(title: String) {
        titleView.text = title
    }

    fun setSubtitle(subtitle: String) {
        subtitleView.text = subtitle
    }

    fun setLeftIconButtonListener(listener: OnClickListener) {
        leftIcon.setOnClickListener(listener)
    }

    fun setRightIconButtonListener(listener: OnClickListener) {
        rightIcon.setOnClickListener(listener)
    }
}
