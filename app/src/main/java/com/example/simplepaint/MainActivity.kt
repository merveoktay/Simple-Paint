package com.example.simplepaint

import android.graphics.Color
import android.graphics.Paint
import android.graphics.Path
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.Toast
import com.example.simplepaint.PaintView.Companion.colorList
import com.example.simplepaint.PaintView.Companion.currentBrush
import com.example.simplepaint.PaintView.Companion.pathList

class MainActivity : AppCompatActivity() {

    companion object {
        var path = Path()
        var paintBrush = Paint()
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()

        val redBtn=findViewById<ImageButton>(R.id.redColor)
        val blueBtn=findViewById<ImageButton>(R.id.blueColor)
        val blackBtn=findViewById<ImageButton>(R.id.blackColor)
        val eraserBtn=findViewById<ImageButton>(R.id.whiteColor)

        redBtn.setOnClickListener{
            Toast.makeText(this, "Red Color Clicked", Toast.LENGTH_SHORT).show()
            paintBrush.color=Color.RED
            currentColor(paintBrush.color)
        }
        blueBtn.setOnClickListener{
            Toast.makeText(this, "Blue Color Clicked", Toast.LENGTH_SHORT).show()
            paintBrush.color=Color.BLUE
            currentColor(paintBrush.color)
        }
        blackBtn.setOnClickListener{
            Toast.makeText(this, "Black Color Clicked", Toast.LENGTH_SHORT).show()
            paintBrush.color=Color.BLACK
            currentColor(paintBrush.color)
        }
        eraserBtn.setOnClickListener{
            Toast.makeText(this, "Eraser Clicked", Toast.LENGTH_SHORT).show()
            pathList.clear()
            colorList.clear()
            path.reset()
        }

    }
    private fun currentColor(color:Int){
        currentBrush =color
        path= Path()
    }
}