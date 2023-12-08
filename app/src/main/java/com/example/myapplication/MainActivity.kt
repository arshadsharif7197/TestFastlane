package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ShapeDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //note that : activity inherits from componentActivity in old version activity was inherited from AppCompactActivity
        //AppCompact was used for material design backward compatibility like (themes, actionBar, we're using appCompactActivity)
        //but here we'll handle by using ComponentActivity() because all theme specific, toolbar changes would be handled by ourself
        //next change is setContent() method. here we don't have any layout file and we don't have any view
        //we just pass our compose ables in setContent method.
        setContent {
           sayArshad()
        }
    }
@Preview
@Composable
fun sayArshad( name :String= "Arshad Sharif"){

    Text(text = "Hello $name",
        fontStyle = FontStyle.Italic,
        fontWeight = FontWeight.Bold,
        color = Color.Red,
        fontSize = 30.sp,
        textAlign = TextAlign.Center)

    Image(painter = painterResource(id = R.drawable.ic_launcher_background),
        contentDescription = "dummy image",
        alignment = Alignment.BottomEnd,
        colorFilter = ColorFilter.tint(Color.Blue),
        contentScale = ContentScale.Crop
    )
    
    Button(onClick = {  }, colors = ButtonDefaults.buttonColors(
        containerColor = Color.Blue), enabled = true, shape = ShapeDefaults.ExtraLarge
    ){
        Text(text = "Hello")
        Image(painter = painterResource(id = R.drawable.ic_launcher_foreground), contentDescription = "dummy")
    }
}



}