package com.syafii.viewpagertwoapp.utils

import android.app.Activity
import android.content.Intent

fun <T> Activity.openActivity(target : Class<T>){
    val intent = Intent(this, target)
    startActivity(intent)
}