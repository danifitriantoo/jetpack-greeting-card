package com.danifitrianto.happybirthday

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Divider
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.danifitrianto.happybirthday.ui.theme.HappyBirthdayTheme

class BusinessActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HappyBirthdayTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {

                }
            }
        }
    }
}

@Composable
fun Introduction(name: String, job: String,modifier: Modifier) {
    val image = painterResource(id = R.drawable.android_logo)
    Column(
        modifier = modifier.fillMaxSize(),
        verticalArrangement = Arrangement.SpaceAround,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Column(
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = image,
                contentDescription = null,
                modifier = modifier.size(104.dp)
            )
            Text(
                text = name,
                fontSize = 32.sp,
                color = Color(0xFFFFFFFF)
            )
            Text(
                text = job,
                fontSize = 18.sp,
                color = Color(0xFF3ddc84)
            )
        }
        Contacts(modifier)
    }
}

@Composable
fun Contacts(modifier: Modifier) {
    Box(
        modifier.padding(12.dp)
    ) {
        Column {
            DetailContact(contact = "+62 8837 837 291",modifier)
            DetailContact(contact = "@danifitriantoo",modifier)
            DetailContact(contact = "dani@outlook.com",modifier)
        }
    }
}

@Composable
fun DetailContact(contact: String, modifier: Modifier) {
    Column(
        modifier.padding(12.dp),
        verticalArrangement = Arrangement.Center
        
    ) {
        Divider(
            color = Color.White,
            thickness = 1.dp
        )
        Row {
            Text(
                text = contact,
                fontSize = 20.sp,
                color = Color(0xFFFFFFFF)
            )
        }
    }
}

@Composable
fun GreetingCard(modifier: Modifier = Modifier) {
    Surface(
        color = Color(0xFF222436)
    ) {
        Introduction(
            name = "Dani Fitrianto Nugraha",
            job = "Game Programmer",
            modifier = modifier
        )
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview2() {
    HappyBirthdayTheme {
        GreetingCard()
    }
}