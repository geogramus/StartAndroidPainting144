package com.example.startandroidpainting144

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Matrix
import android.graphics.Paint
import android.graphics.Path
import android.view.View

class SetView(context: Context) : View(context) {

    var p = Paint().apply {
        strokeWidth = 3f
        style = Paint.Style.STROKE
    }
    var path = Path()
    var pathDst = Path()
    var innerMatrix = Matrix()

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
        canvas ?: return
        canvas.drawARGB(80, 102, 204, 255)

        p.color = Color.BLACK;
        canvas.drawCircle(400f, 200f, 10f, p)

        // прямоугольник
        path.reset()
        path.addRect(300f, 100f, 500f, 300f, Path.Direction.CW)
        canvas.drawPath(path, p)

        // перемещение после поворота
        innerMatrix.reset()
        innerMatrix.setRotate(45f, 400f, 200f)
        innerMatrix.postTranslate(500f, 0f)
        path.transform(innerMatrix, pathDst)
        p.color = Color.GREEN
        canvas.drawPath(pathDst, p)

        // перемещение до поворота
        innerMatrix.reset();
        innerMatrix.setRotate(45f, 400f, 200f)
        innerMatrix.preTranslate(500f, 0f)
        path.transform(innerMatrix, pathDst)
        p.color = Color.RED
        canvas.drawPath(pathDst, p)
    }
}