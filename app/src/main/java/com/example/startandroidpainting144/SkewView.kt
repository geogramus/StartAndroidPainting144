package com.example.startandroidpainting144

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Matrix
import android.graphics.Paint
import android.graphics.Path
import android.view.View

class SkewView(context: Context) : View(context) {

    var p = Paint().apply {
        strokeWidth = 3f
        style = Paint.Style.STROKE
    }
    var path = Path()
    var pathDst = Path()
    var innerMatrix = Matrix()
    init {
        path.addRect(100f, 100f, 200f, 200f, Path.Direction.CW);
    }

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
        canvas ?: return
        canvas.drawARGB(80, 102, 204, 255)


        // перемещение на 200 вправо
        // и наклон по вертикали на 0.5
        // точка наклона - слева
        innerMatrix.reset()
        innerMatrix.setTranslate(200f, 0f)
        innerMatrix.postSkew(0.0f, 0.5f, 300f, 100f)
        path.transform(innerMatrix, pathDst)
        canvas.drawPath(pathDst, p)
        canvas.drawCircle(300f, 100f, 5f, p)

        // перемещение на 400 вправо
        // и наклон по вертикали на 0.5
        // точка наклона - справа
        innerMatrix.reset()
        innerMatrix.setTranslate(400f, 0f)
        innerMatrix.postSkew(0.0f, 0.5f, 600f, 100f)
        path.transform(innerMatrix, pathDst)
        canvas.drawPath(pathDst, p)
        canvas.drawCircle(600f, 100f, 5f, p)

        p.color = Color.BLUE;

        // перемещение на 150 вниз
        // и наклон по горизонтали на 0.5
        // точка наклона - сверху
        innerMatrix.reset();
        innerMatrix.setTranslate(0f, 150f)
        innerMatrix.postSkew(0.5f, 0.0f, 100f, 250f)
        path.transform(innerMatrix, pathDst)
        canvas.drawPath(pathDst, p)
        canvas.drawCircle(100f, 250f, 5f, p)

        // перемещение на 300 вниз
        // и наклон по горизонтали на 0.5
        // точка наклона - снизу
        innerMatrix.reset()
        innerMatrix.setTranslate(0f, 300f)
        innerMatrix.postSkew(0.5f, 0.0f, 100f, 500f)
        path.transform(innerMatrix, pathDst)
        canvas.drawPath(pathDst, p)
        canvas.drawCircle(100f, 500f, 5f, p)
    }
}