package com.example.jetpack_compose_text_expand

import android.inputmethodservice.Keyboard
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jetpack_compose_text_expand.ui.theme.Jetpack_compose_text_expandTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LazyColumn(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(color = Color.Gray)
                    .padding(3.dp)
            ) {
                itemsIndexed(
                    listOf(
                        ItemColumnModel(R.drawable.image1, "Volodumur", "Lorem ipsum " +
                                "dolor sit amet, consectetur adipiscing elit, sed do eiusmod " +
                                "tempor incididunt ut labore et dolore magna aliqua. Ut enim ad " +
                                "minim veniam, quis nostrud exercitation ullamco laboris nisi ut."),
                        ItemColumnModel(R.drawable.image2, "Jon", "Lorem ipsum " +
                                "dolor sit amet, consectetur adipiscing elit, sed do eiusmod " +
                                "tempor incididunt ut labore et dolore magna aliqua. Ut enim ad " +
                                "minim veniam, quis nostrud exercitation ullamco laboris nisi ut."),
                        ItemColumnModel(R.drawable.image3, "Boris", "Lorem ipsum " +
                                "dolor sit amet, consectetur adipiscing elit, sed do eiusmod " +
                                "tempor incididunt ut labore et dolore magna aliqua. Ut enim ad " +
                                "minim veniam, quis nostrud exercitation ullamco laboris nisi ut."),
                        ItemColumnModel(R.drawable.image4, "Andjey", "Lorem ipsum " +
                                "dolor sit amet, consectetur adipiscing elit, sed do eiusmod " +
                                "tempor incididunt ut labore et dolore magna aliqua. Ut enim ad " +
                                "minim veniam, quis nostrud exercitation ullamco laboris nisi ut."),
                        ItemColumnModel(R.drawable.image5, "Gitanas", "Lorem ipsum " +
                                "dolor sit amet, consectetur adipiscing elit, sed do eiusmod " +
                                "tempor incididunt ut labore et dolore magna aliqua. Ut enim ad " +
                                "minim veniam, quis nostrud exercitation ullamco laboris nisi ut."),
                        ItemColumnModel(R.drawable.image6, "Justin", "Lorem ipsum " +
                                "dolor sit amet, consectetur adipiscing elit, sed do eiusmod " +
                                "tempor incididunt ut labore et dolore magna aliqua. Ut enim ad " +
                                "minim veniam, quis nostrud exercitation ullamco laboris nisi ut.")
                    )) { _, item ->
                        ItemColumn(item = item)
                    }
            }
        }
    }
}
