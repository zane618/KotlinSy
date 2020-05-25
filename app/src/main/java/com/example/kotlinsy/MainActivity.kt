package com.example.kotlinsy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.example.kotlinsy.`interface`.MyButton

class MainActivity : AppCompatActivity() {

    lateinit var btn1: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn1 = findViewById(R.id.btn1)

        btn1.setOnClickListener(object :View.OnClickListener {
            override fun onClick(v: View?) {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }
        })

        val mb = MyButton(this)
        val params = ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT)
        addContentView(mb, params)

        mb.mListener = object : MyButton.OnBtnClick {

            override fun onBtnClick(view: View) {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }

//            override fun onClick() {
//                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
//            }
        }


    }

}
