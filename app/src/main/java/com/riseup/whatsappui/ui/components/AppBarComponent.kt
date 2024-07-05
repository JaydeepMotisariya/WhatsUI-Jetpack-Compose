package com.riseup.whatsappui.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.riseup.whatsappui.R

@Composable
fun AppBarComponent() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(60.dp)
            .background(MaterialTheme.colorScheme.primary)
            .padding(horizontal = 16.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = stringResource(id = R.string.whatsapp_title),
            style = TextStyle(
                fontSize = 20.sp,
                fontWeight = FontWeight.SemiBold,
                color = if (isSystemInDarkTheme()) Color.Gray else Color.White
            )
        )
        Spacer(modifier = Modifier.weight(1f))
        IconComponent(drawableId = R.drawable.ic_camera)
        Spacer(modifier = Modifier.size(20.dp))
        IconComponent(drawableId = R.drawable.ic_search)
        Spacer(modifier = Modifier.size(20.dp))
        IconComponent(drawableId = R.drawable.ic_menu)
    }
}

@Composable
fun IconComponent(drawableId: Int) {
    Icon(
        painter = painterResource(id = drawableId),
        contentDescription = "",
        tint = if (isSystemInDarkTheme()) Color.Gray else Color.White
    )
}

@Preview
@Composable
fun AppBarComponentPreview() {
    AppBarComponent()
}