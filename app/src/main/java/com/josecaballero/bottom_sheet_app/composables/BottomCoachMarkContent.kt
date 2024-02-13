package com.josecaballero.bottom_sheet_app.composables

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.josecaballero.bottom_sheet_app.ui.theme.BottomsheetappTheme

@Composable
fun BottomCoachMarkContent(bottomCoachMarkTagType: BottomCoachMarkTagType, text1: String, text2: String, text3: String) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        horizontalAlignment = Alignment.Start
    ) {
        Tag(bottomCoachMarkTagType = bottomCoachMarkTagType)
        Text(
            text = text1,
            fontSize = 22.sp,
            color = Color.White,
            modifier = Modifier.padding(top = 16.dp)
        )
        Text(
            text = text2,
            fontSize = 14.sp,
            color = Color.Gray,
            modifier = Modifier.padding(top = 8.dp)
        )
        Text(
            text = text3,
            fontSize = 14.sp,
            color = Color.Gray,
            modifier = Modifier.padding(top = 8.dp)
        )
    }
}

@Preview(showBackground = false)
@Composable
fun BottomCoachMarkContentPreview() {
    BottomsheetappTheme {
        BottomCoachMarkContent(bottomCoachMarkTagType = BottomCoachMarkTagType.ALERT, text1 = "Build with Jetpack Compose", text2 = "Jetpack Compose is Android’s recommended modern toolkit for building native UI. It simplifies and accelerates UI development on Android. Quickly bring your app to life with less code, powerful tools, and intuitive Kotlin APIs.", text3 = "The UI for your app should be responsive to account for different screen sizes, orientations and form factors - an adaptive layout changes based on the screen space available to it.")
    }
}
