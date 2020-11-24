package com.example.startandroidpainting144

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class RotateActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(RotateView(this))
    }
}