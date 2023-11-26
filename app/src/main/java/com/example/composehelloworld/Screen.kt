package com.example.composehelloworld

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class Screen {





}

@Preview(heightDp = 500)
@Composable
fun PreviewFuntion(){
    //BlogCategory(R.drawable.girl,"Mohit","Software Developer")
    /*Column(modifier = Modifier.verticalScroll(rememberScrollState())) {
        getCategoryList().map {
            BlogCategory(imgId = it.img, name = it.title, occupation = it.subtitle)
        }
    }*/
    LazyColumn(content = {
        items(getCategoryList()){
            BlogCategory(imgId = it.img, name = it.title, occupation = it.subtitle)
        }
    })
}


@Composable
fun BlogCategory(imgId:Int,name:String,occupation:String){
    Card(
        modifier = Modifier.padding(8.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 8.dp)
    ) {
        Row (
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(8.dp)
        ){
            Image(painter = painterResource(id = imgId), contentDescription = "",
                modifier = Modifier
                    .size(48.dp)
                    .padding(8.dp)
                    .weight(.2f)
            )
            ItemDisplay(name, occupation,Modifier.weight(.8f))
        }
    }
}

@Composable
private fun ItemDisplay(name: String, occupation: String,modifier:Modifier) {
    Column(modifier = modifier) {
        Text(
            text = name,
            style = MaterialTheme.typography.headlineMedium
        )
        Text(
            text = occupation,
            style = MaterialTheme.typography.labelSmall,
            fontWeight = FontWeight.Thin

        )
    }
}

data class Category(val img:Int,val title:String,val subtitle:String)

fun getCategoryList():MutableList<Category>{
    val list = mutableListOf<Category>()
    list.add(Category(R.drawable.girl,"Mohit Singh","Java Programing"))
    list.add(Category(R.drawable.girl,"Rohit Singh","python Programing"))
    list.add(Category(R.drawable.girl,"Sahil Singh","C++ Programing"))
    list.add(Category(R.drawable.girl,"Gomsi Singh","C Programing"))
    list.add(Category(R.drawable.girl,"Navil Singh","Swift Programing"))
    list.add(Category(R.drawable.girl,"Yash Singh","Kotlin Programing"))
    list.add(Category(R.drawable.girl,"Mohit Singh","Java Programing"))
    list.add(Category(R.drawable.girl,"Rohit Singh","python Programing"))
    list.add(Category(R.drawable.girl,"Sahil Singh","C++ Programing"))
    list.add(Category(R.drawable.girl,"Gomsi Singh","C Programing"))
    list.add(Category(R.drawable.girl,"Navil Singh","Swift Programing"))
    list.add(Category(R.drawable.girl,"Yash Singh","Kotlin Programing"))
    list.add(Category(R.drawable.girl,"Mohit Singh","Java Programing"))
    list.add(Category(R.drawable.girl,"Rohit Singh","python Programing"))
    list.add(Category(R.drawable.girl,"Sahil Singh","C++ Programing"))
    list.add(Category(R.drawable.girl,"Gomsi Singh","C Programing"))
    list.add(Category(R.drawable.girl,"Navil Singh","Swift Programing"))
    list.add(Category(R.drawable.girl,"Yash Singh","Kotlin Programing"))

    return list
}