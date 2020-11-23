package com.example.testcompose

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.setContent
import androidx.ui.tooling.preview.Preview

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent { mainLayout() }
    }
}

@Composable
fun mainLayout(){
    Text("Hello world!")
}

@Preview
@Composable
fun previewMainLayout() {
    mainLayout()
}