package com.example.jetpackcanvasicons

import android.graphics.Paint

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Canvas
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.drawscope.DrawStyle
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.graphics.nativeCanvas
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.Typeface
import androidx.compose.ui.text.style.TextAlign
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
              //  FacebookUI()
              //  MessengerIcon()
             //   GooglePhotos()
            //    getWeatherApp()
                socialMediaUI()
            }
        }
    }
}


@Composable
fun socialMediaUI() {

    Box(modifier = Modifier.fillMaxSize().padding(20.dp).background(Color.Yellow)) {

        Column {


            Text(textAlign = TextAlign.Center, text = "Social Media Icons", modifier = Modifier.padding(15.dp).fillMaxWidth())

            Canvas(
                modifier = Modifier.size(100.dp)
                    .padding(10.dp).offset(10.dp, 30.dp).background(Color.White)
            ) {

                //instagram

                val instaColors = listOf(Color.Yellow, Color.Red, Color.Magenta)

                drawRoundRect(
                    //  color = Color.Yellow,
                    brush = Brush.linearGradient(colors = instaColors),
                    cornerRadius = CornerRadius(50f, 50f),
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
                    center = Offset(this.size.width * .8f, this.size.height * .2f)

                )
            }
        }


        //messenger


        Canvas(
            modifier = Modifier.size(100.dp).offset(100.dp, 30.dp).padding(10.dp)
        ) {
            val colors = listOf(Color(0xFF02b8f9), Color(0xFF0277fe))

            val trianglePath = Path().let {
                it.moveTo(this.size.width * .20f, this.size.height * .77f)
                it.lineTo(this.size.width * .20f, this.size.height * 0.95f)
                it.lineTo(this.size.width * .37f, this.size.height * 0.86f)
                it.close()
                it
            }


            val electricPath = Path().let {
                it.moveTo(this.size.width * .20f, this.size.height * 0.60f)
                it.lineTo(this.size.width * .45f, this.size.height * 0.35f)
                it.lineTo(this.size.width * 0.56f, this.size.height * 0.46f)
                it.lineTo(this.size.width * 0.78f, this.size.height * 0.35f)
                it.lineTo(this.size.width * 0.54f, this.size.height * 0.60f)
                it.lineTo(this.size.width * 0.43f, this.size.height * 0.45f)
                it.close()
                it
            }

            drawOval(
                Brush.verticalGradient(colors = colors),
                size = Size(this.size.width, this.size.height * 0.95f)
            )

            drawPath(
                path = trianglePath,
                Brush.verticalGradient(colors = colors),
                style = Stroke(width = 15f, cap = StrokeCap.Round)
            )

            drawPath(
                path = electricPath, color = Color.White
            )

        }


        //google photos
        Canvas(
            modifier = Modifier
                .size(100.dp).offset(200.dp, 30.dp)
                .padding(10.dp)
        ) {
            //red
            drawArc(
                color = Color(0xFFf04231),
                startAngle = -90f,
                sweepAngle = 180f,
                useCenter = true,
                size = Size(size.width * .50f, size.height * .50f),
                topLeft = Offset(size.width * .25f, 0f)
            )

            //blue
            drawArc(
                color = Color(0xFF4385f7),
                startAngle = 0f,
                sweepAngle = 180f,
                useCenter = true,
                size = Size(size.width * .50f, size.height * .50f),
                topLeft = Offset(size.width * .50f, size.height * .25f)
            )

            //green
            drawArc(
                color = Color(0xFF30a952),
                startAngle = 0f,
                sweepAngle = -180f,
                useCenter = true,
                size = Size(size.width * .50f, size.height * .50f),
                topLeft = Offset(0f, size.height * .25f)
            )

            //yellow
            drawArc(
                color = Color(0xFFffbf00),
                startAngle = 270f,
                sweepAngle = -180f,
                useCenter = true,
                size = Size(size.width * .50f, size.height * .50f),
                topLeft = Offset(size.width * .25f, size.height * .50f)
            )


        }


    }


    @Composable
    fun InstagramUI() {

        val instaColors = listOf(Color.Yellow, Color.Red, Color.Magenta)
        Canvas(
            modifier = Modifier
                .size(100.dp)
                .padding(20.dp)
        ) {
            drawRoundRect(
                //  color = Color.Yellow,
                brush = Brush.linearGradient(colors = instaColors),
                cornerRadius = CornerRadius(50f, 50f),
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
                center = Offset(this.size.width * .8f, this.size.height * .2f)

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
            typeface =
                android.graphics.Typeface.createFromAsset(assetManager, "subfolder/FACEBOLF.OTF")
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

    @Composable
    fun MessengerIcon() {

        val colors = listOf(Color(0xFF02b8f9), Color(0xFF0277fe))
        Canvas(
            modifier = Modifier
                .size(100.dp)
                .padding(20.dp)
        ) {

            val trianglePath = Path().let {
                it.moveTo(this.size.width * .20f, this.size.height * .77f)
                it.lineTo(this.size.width * .20f, this.size.height * 0.95f)
                it.lineTo(this.size.width * .37f, this.size.height * 0.86f)
                it.close()
                it
            }


            val electricPath = Path().let {
                it.moveTo(this.size.width * .20f, this.size.height * 0.60f)
                it.lineTo(this.size.width * .45f, this.size.height * 0.35f)
                it.lineTo(this.size.width * 0.56f, this.size.height * 0.46f)
                it.lineTo(this.size.width * 0.78f, this.size.height * 0.35f)
                it.lineTo(this.size.width * 0.54f, this.size.height * 0.60f)
                it.lineTo(this.size.width * 0.43f, this.size.height * 0.45f)
                it.close()
                it
            }

            drawOval(
                Brush.verticalGradient(colors = colors),
                size = Size(this.size.width, this.size.height * 0.95f)
            )

            drawPath(
                path = trianglePath,
                Brush.verticalGradient(colors = colors),
                style = Stroke(width = 15f, cap = StrokeCap.Round)
            )

            drawPath(
                path = electricPath, color = Color.White
            )


        }
    }

    @Composable
    fun GooglePhotos() {

        Canvas(
            modifier = Modifier
                .size(100.dp)
                .padding(20.dp)
        ) {
            //red
            drawArc(
                color = Color(0xFFf04231),
                startAngle = -90f,
                sweepAngle = 180f,
                useCenter = true,
                size = Size(size.width * .50f, size.height * .50f),
                topLeft = Offset(size.width * .25f, 0f)
            )

            //blue
            drawArc(
                color = Color(0xFF4385f7),
                startAngle = 0f,
                sweepAngle = 180f,
                useCenter = true,
                size = Size(size.width * .50f, size.height * .50f),
                topLeft = Offset(size.width * .50f, size.height * .25f)
            )

            //green
            drawArc(
                color = Color(0xFF30a952),
                startAngle = 0f,
                sweepAngle = -180f,
                useCenter = true,
                size = Size(size.width * .50f, size.height * .50f),
                topLeft = Offset(0f, size.height * .25f)
            )

            //yellow
            drawArc(
                color = Color(0xFFffbf00),
                startAngle = 270f,
                sweepAngle = -180f,
                useCenter = true,
                size = Size(size.width * .50f, size.height * .50f),
                topLeft = Offset(size.width * .25f, size.height * .50f)
            )

        }
    }


    @Composable
    fun getWeatherApp() {
        val backgroundColor = listOf(Color(0xFF2078EE), Color(0xFF74E6FE))
        val sunColor = listOf(Color(0xFFFFC200), Color(0xFFFFE100))
        Canvas(
            modifier = Modifier
                .size(100.dp)
                .padding(16.dp)
        ) {
            val width = size.width
            val height = size.height

            //cloud
            val path = Path().apply {
                moveTo(width.times(.76f), height.times(.72f))
                cubicTo(
                    width.times(.93f),
                    height.times(.72f),
                    width.times(.98f),
                    height.times(.41f),
                    width.times(.76f),
                    height.times(.40f)
                )
                cubicTo(
                    width.times(.75f),
                    height.times(.21f),
                    width.times(.35f),
                    height.times(.21f),
                    width.times(.38f),
                    height.times(.50f)
                )
                cubicTo(
                    width.times(.25f),
                    height.times(.50f),
                    width.times(.20f),
                    height.times(.69f),
                    width.times(.41f),
                    height.times(.72f)
                )
                close()
            }

            drawRoundRect(
                brush = Brush.verticalGradient(backgroundColor),
                cornerRadius = CornerRadius(50f, 50f)
            )

            drawCircle(
                brush = Brush.verticalGradient(sunColor),
                radius = width.times(.17f),
                center = Offset(width.times(.35f), height.times(.35f))
            )

            drawPath(path = path, color = Color.White.copy(alpha = .90f))
        }
    }
}






