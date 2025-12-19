package com.example.tvlive

import android.app.Activity
import android.os.Bundle
import android.widget.TextView

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val tv = TextView(this)
        tv.text = "Android TV App is running"
        tv.textSize = 24f
        setContentView(tv)
    }
}
