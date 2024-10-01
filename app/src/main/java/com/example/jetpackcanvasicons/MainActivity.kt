package com.example.jetpackcanvasicons

import android.graphics.Paint

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Canvas

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.drawscope.DrawStyle
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.graphics.nativeCanvas
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.Typeface
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jetpackcanvasicons.ui.theme.JetpackCanvasIconsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            JetpackCanvasIconsTheme {
               // InstagramUI()
                FacebookUI()
            }
        }
    }
}

@Composable
fun InstagramUI() {

    val instaColors = listOf(Color.Yellow,Color.Red,Color.Magenta)
Canvas(
    modifier = Modifier
        .size(100.dp)
        .padding(20.dp)
) {
  drawRoundRect(
    //  color = Color.Yellow,
    brush = Brush.linearGradient(colors = instaColors),
      cornerRadius = CornerRadius(50f,50f),
      style = Stroke(width = 16f, cap = StrokeCap.Round)
      )
    drawCircle(
        brush = Brush.linearGradient(colors = instaColors),
        radius = 40f,
        style = Stroke(width = 20f, cap = StrokeCap.Round)
    )

    drawCircle(
        brush = Brush.linearGradient(colors = instaColors),
        radius = 15f,
       center = Offset(this.size.width*.8f,this.size.height*.2f)

    )

}

}

@Composable
fun FacebookUI() {

    val assetManager = LocalContext.current.assets
    val paint = Paint().apply {
        textAlign = Paint.Align.CENTER
        textSize = 200f
        color = Color.White.toArgb()
      //  typeface = android.graphics.Typeface.createFromAsset(assetManager, "FACEBOLF.OTF")
      //  typeface = android.graphics.Typeface.createFromAsset(assetManager, "FACEBOLF.OTF")
        typeface = android.graphics.Typeface.createFromAsset(assetManager, "subfolder/FACEBOLF.OTF")

    }


    Canvas(
        modifier = Modifier
            .size(100.dp)
            .padding(16.dp)
    ) {
        drawRoundRect(
            color = Color(0xFF1776d1),
            cornerRadius = CornerRadius(20f, 20f)
        )
        drawContext.canvas.nativeCanvas.drawText("f", center.x + 25, center.y + 90, paint)
    }

}

