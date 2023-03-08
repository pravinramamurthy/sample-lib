package com.example.mylibrary

import android.content.Context
import android.view.Gravity

import android.widget.Toast


/**
 * Created by Praveen on 08,March,2023
 */
class ShowTost {

    fun add(a: Int, b: Int, context: Context){
        val res = a + b
        val toast = Toast.makeText(context, res.toString(), Toast.LENGTH_LONG)
        toast.setGravity(Gravity.BOTTOM, 0, 50)
        toast.show()
    }
}