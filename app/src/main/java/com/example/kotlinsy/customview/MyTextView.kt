package com.example.kotlinsy.customview

import android.content.Context
import android.util.AttributeSet
import com.example.kotlinsy.R

/**
 * create by zhangshi on 2020/4/27.
 */
class MyTextView: androidx.appcompat.widget.AppCompatTextView{

    lateinit var mContext: Context

    constructor(context: Context) : super(context) {
        init(context)
    }

    constructor(context: Context, attributeSet: AttributeSet) : super(context, attributeSet) {
        val typedArray = context.obtainStyledAttributes(attributeSet, R.styleable.MyTextView)
        val headerHeight = typedArray.getDimension(R.styleable.MyTextView_headerHeight, -1f)
        val age = typedArray.getInt(R.styleable.MyTextView_age, -1)
        typedArray.recycle()
        init(context)
        setText("headerHeight=" + headerHeight + ",age=" + age)
    }

    private fun init(context: Context) {
        this.mContext = context

    }

}