package com.example.kotlinsy.`interface`

import android.content.Context
import android.util.AttributeSet
import android.view.View
import android.widget.Button
import android.widget.TextView

/**
 * create by zhangshi on 2020/4/23.
 */
class MyButton : androidx.appcompat.widget.AppCompatButton {

    lateinit var mListener: OnBtnClick

    constructor(context: Context): super(context)

    constructor(context: Context, attributeSet: AttributeSet): super(context, attributeSet)



    interface OnBtnClick {
        fun onBtnClick(view: View)

//        fun onClick()
    }
}