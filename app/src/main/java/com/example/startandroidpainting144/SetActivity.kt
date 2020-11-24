package com.example.startandroidpainting144

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class SetActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(SetView(this))
    }
}