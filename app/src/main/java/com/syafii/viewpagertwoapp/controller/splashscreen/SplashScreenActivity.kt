package com.syafii.viewpagertwoapp.controller.splashscreen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.syafii.viewpagertwoapp.R
import com.syafii.viewpagertwoapp.controller.main.MainActivity
import com.syafii.viewpagertwoapp.utils.openActivity

class SplashScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)


        Handler(Looper.getMainLooper()).postDelayed({
            openActivity(MainActivity::class.java)
            finish()
        }, 3000)

    }
}