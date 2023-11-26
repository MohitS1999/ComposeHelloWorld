package com.example.composehelloworld

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composehelloworld.ui.theme.ComposeHelloWorldTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NotificationCounter()
            //TextInput()
        }
    }
}

@Composable
fun TextInput(){
    val state = remember {
        mutableStateOf("")
    }
    TextField(value = state.value, onValueChange = {
        state.value = it
    },
        label = { Text(text = "Enter Message")})
}
@Preview(showBackground = true, name = "Hello Message1", showSystemUi = true)
@Composable
private fun previewFunction(){
    Column {
        ListViewItem(imgId = R.drawable.girl, name = "Shaniya", occupation = "Developer")
        ListViewItem(imgId = R.drawable.girl, name = "Shaniya", occupation = "Developer")
        ListViewItem(imgId = R.drawable.girl, name = "Shaniya", occupation = "Developer")
        ListViewItem(imgId = R.drawable.girl, name = "Shaniya", occupation = "Developer")

    }
  /* val state = remember {
       mutableStateOf("")
   }
    TextField(value = state.value, onValueChange = {
        state.value = it
    },
        label = { Text(text = "Enter Message")})*/

}

@Composable
fun ListViewItem(imgId:Int,name:String,occupation:String){
    Row(Modifier.padding(5.dp)){
        Image(
            painter = painterResource(id = imgId),
            contentDescription = "",
            Modifier.size(40.dp)
        )
        Column {
            Text(text = name,
                fontWeight = FontWeight.Bold
            )
            Text(text = occupation,
                fontWeight = FontWeight.Thin,
                fontSize = 12.sp)
        }
    }
}

