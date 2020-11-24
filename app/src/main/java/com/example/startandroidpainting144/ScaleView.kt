package com.example.startandroidpainting144

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Matrix
import android.graphics.Paint
import android.graphics.Path
import android.view.View

class ScaleView(context: Context) : View(context) {

    var p = Paint().apply {
        strokeWidth = 3f
        style = Paint.Style.STROKE
    }
    var path = Path()
    var innerMatrix = Matrix()

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
        canvas ?: return
        canvas.drawARGB(80, 102, 204, 255)

        path.reset()
        path.addRect(300f, 150f, 450f, 200f, Path.Direction.CW)
        path.addRect(350f, 100f, 400f, 250f, Path.Direction.CW)
        path.addCircle(375f, 100f, 5f, Path.Direction.CW)

        p.color = Color.GREEN
        canvas.drawPath(path, p)

        innerMatrix.reset()
        // настраиваем матрицу на изменение размера:
        // в 2 раза по горизонтали
        // в 2,5 по вертикали
        // относительно точки (375, 100)
        innerMatrix.setScale(2f, 2.5f, 375f, 100f)

        path.transform(innerMatrix)

        p.color = Color.BLUE
        canvas.drawPath(path, p)
    }
}