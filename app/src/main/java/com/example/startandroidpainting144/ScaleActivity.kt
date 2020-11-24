package com.example.startandroidpainting144

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class ScaleActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(ScaleView(this))
    }
}