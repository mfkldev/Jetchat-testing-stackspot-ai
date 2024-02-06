package com.example.compose.jetchat.customview

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.Button
import androidx.constraintlayout.widget.ConstraintLayout
import com.example.compose.jetchat.R

class MfklBottom @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : ConstraintLayout(context, attrs, defStyleAttr) {

    private val leftButton: Button
    private val rightButton: Button

    init {
        LayoutInflater.from(context).inflate(R.layout.mfkl_bottom, this, true)
        leftButton = findViewById(R.id.mfkl_bottom_cv_leftButton)
        rightButton = findViewById(R.id.mfkl_bottom_cv_rightButton)
    }

    fun setLeftButtonListener(listener: OnClickListener) {
        leftButton.setOnClickListener(listener)
    }

    fun setRightButtonListener(listener: OnClickListener) {
        rightButton.setOnClickListener(listener)
    }

    fun setLeftButtonText(text: String) {
        leftButton.text = text
    }

    fun setRightButtonText(text: String) {
        rightButton.text = text
    }
}
