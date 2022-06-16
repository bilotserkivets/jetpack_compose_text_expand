package com.example.jetpack_compose_text_expand

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun ItemColumn(item: ItemColumnModel) {
    var isExpanded by remember {
        mutableStateOf(false)
    }

    Row(modifier = Modifier
        .padding(3.dp)
        .background(Color.White),
        verticalAlignment = Alignment.CenterVertically
        ) {
        Image(
            painter = painterResource(id = item.imageId),
            contentDescription = "image",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(64.dp)
                .clip(CircleShape))
        Column(modifier = Modifier.padding(start = 10.dp, top = 10.dp)) {
            Text(text = item.title)
            Text(
            modifier = Modifier.clickable {
                isExpanded = !isExpanded
            }, text = item.content,
                maxLines = if (isExpanded) 10 else 1)
        }
    }
}