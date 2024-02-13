package com.josecaballero.bottom_sheet_app.composables

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.josecaballero.bottom_sheet_app.ui.theme.BottomsheetappTheme

@Composable
fun Tag(bottomCoachMarkTagType: BottomCoachMarkTagType) {
    val tagText = when (bottomCoachMarkTagType) {
        BottomCoachMarkTagType.ANNOUNCEMENT -> "< Announcement"
        BottomCoachMarkTagType.ALERT -> "! Alert"
        BottomCoachMarkTagType.OFFER -> "$ Offer"
    }

    Box(
        modifier = Modifier
            .background(getTagColor(bottomCoachMarkTagType), RoundedCornerShape(20.dp))
            .padding(horizontal = 8.dp, vertical = 4.dp)
    ) {
        Text(
            text = tagText,
            color = Color.Black,
            modifier = Modifier.align(Alignment.Center)
        )
    }
}

private fun getTagColor(bottomCoachMarkTagType: BottomCoachMarkTagType): Color {
    return when (bottomCoachMarkTagType) {
        BottomCoachMarkTagType.ANNOUNCEMENT -> Color(0xFFE7C2FF)
        BottomCoachMarkTagType.ALERT -> Color(0xFFFFCE72)
        BottomCoachMarkTagType.OFFER -> Color(0xFFA0F8A0)
    }
}

@Preview(showBackground = false)
@Composable
fun TagPreview() {
    BottomsheetappTheme {
        Tag(BottomCoachMarkTagType.ALERT)
    }
}
