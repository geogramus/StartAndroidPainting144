package com.example.startandroidpainting144

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.rotate
import kotlinx.android.synthetic.main.activity_main.scale
import kotlinx.android.synthetic.main.activity_main.set
import kotlinx.android.synthetic.main.activity_main.skew
import kotlinx.android.synthetic.main.activity_main.translate

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        translate.setOnClickListener {
            startActivity(Intent(this, TranslateActivity::class.java))
        }
        rotate.setOnClickListener {
            startActivity(Intent(this, RotateActivity::class.java))
        }
        scale.setOnClickListener {
            startActivity(Intent(this, ScaleActivity::class.java))
        }
        skew.setOnClickListener {
            startActivity(Intent(this, SkewActivity::class.java))
        }
        set.setOnClickListener {
            startActivity(Intent(this, SetActivity::class.java))
        }
    }
}