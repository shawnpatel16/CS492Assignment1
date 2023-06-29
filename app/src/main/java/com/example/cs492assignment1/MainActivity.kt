/* CS492 Assignment 1
    Shawn Patel
    pateshaw@oregonstate.edu
    CS 492
 */

package com.example.cs492assignment1
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Icon
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.cs492assignment1.ui.theme.CS492Assignment1Theme
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CS492Assignment1Theme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = Color(0xFF3ddc84)) {
                    HomePage("Shawn Patel", "CS 492 Extraordinaire", "+11 123 444 555 666", "" +
                            "@AndroidDev", "pateshaw@oregonstate.edu")
                }
            }
        }
    }
}

@Composable
fun HomePage(name: String,title: String,phone:String,handle:String,email: String, modifier: Modifier = Modifier) {
    Column(horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.Center) {
            Box(modifier = Modifier.background(Color.Black)){
            Image(
                painter = painterResource(id = R.drawable.android_logo),
                contentDescription = "logo",
                modifier = Modifier.size(56.dp)
            )}
        Spacer(Modifier.width(16.dp))
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Text(
                    text = name,
                    textAlign = TextAlign.Center,
                    fontSize = 32.sp,
                    fontWeight = FontWeight.Bold

                )
                Text(
                    text = title,
                    textAlign = TextAlign.Center,
                    fontWeight = FontWeight.Bold

                )
            }
        Spacer(Modifier.height(96.dp))
        Column {
            InfoRow(icon = Icons.Default.Phone, info = phone)
            InfoRow(icon = Icons.Default.Share, info = handle)
            InfoRow(icon = Icons.Default.Email, info = email)
        }

    }
}

@Composable
fun InfoRow(icon: ImageVector, info:String){
    Row(verticalAlignment = Alignment.CenterVertically, modifier = Modifier.padding(vertical = 8.dp), horizontalArrangement = Arrangement.Start){
        Icon(
            imageVector = icon, contentDescription = null,
            modifier = Modifier.padding(end = 16.dp)
        )
        Text(
            text = info,
            modifier = Modifier.align(Alignment.CenterVertically),
            textAlign = TextAlign.Start
        )
    }
}




@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    CS492Assignment1Theme {
        HomePage("Shawn Patel", "CS 492 Extraordinaire", "+11 123 444 555 666", "@androiddev", "pateshaw@oregonstate.edu")
    }
}