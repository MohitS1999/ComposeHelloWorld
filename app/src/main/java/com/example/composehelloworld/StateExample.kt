package com.example.composehelloworld

import android.util.Log
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

private const val TAG = "StateExample"
class StateExample {

}

@Preview
@Composable
fun NotificationScreen(){
    NotificationCounter()
}

@Composable
fun NotificationCounter(){
    var count = rememberSaveable{ mutableStateOf(0)}
    Column (verticalArrangement = Arrangement.Center){
        Text(text = "You Have sent ${count.value} notification")
        Button(onClick = {
            count.value++
            Log.d(TAG, "NotificationCounter: Button Clicked")
        }) {
            Text(text = "Send Notification")
        }
    }
}