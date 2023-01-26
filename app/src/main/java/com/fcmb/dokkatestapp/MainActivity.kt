package com.fcmb.dokkatestapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


    /**
     * uses BVN to generate Otp
     *
     * @param bvn
     * @return
     */
    private fun getOtp(bvn:String):String{
        return "3456"
    }
}