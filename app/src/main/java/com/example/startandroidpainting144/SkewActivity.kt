package com.example.startandroidpainting144

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class SkewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(SkewView(this))
    }
}