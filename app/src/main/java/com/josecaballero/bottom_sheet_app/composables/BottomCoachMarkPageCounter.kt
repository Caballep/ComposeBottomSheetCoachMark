package com.josecaballero.bottom_sheet_app.composables

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun BottomCoachMarkPageCounter(totalPages: Int, currentPage: Int, onPageChange: (page: Int) -> Unit) {
    val pageArray by remember { mutableStateOf(Array(totalPages) { "•" }) }

    for (i in pageArray.indices) {
        pageArray[i] = if (i == currentPage - 1) "•" else "•"
    }

    Column(
        modifier = Modifier
            .padding(8.dp)
            .background(Color(0xFF9B9B9B), MaterialTheme.shapes.medium)
            .padding(horizontal = 8.dp, vertical = 1.dp)
    ) {
        Row(
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .padding(vertical = 8.dp)
        ) {
            pageArray.forEachIndexed { index, item ->
                Text(
                    text = item,
                    modifier = Modifier
                        .clickable { onPageChange(index + 1) }
                        .padding(4.dp)
                        .weight(1f),
                    color = if (index == currentPage - 1) Color.Black else Color(0xFF505050),
                    textAlign = TextAlign.Center,
                    fontSize = 26.sp,
                    fontWeight = androidx.compose.ui.text.font.FontWeight.Bold
                )
            }
        }
    }
}

@Preview
@Composable
fun PageCounterPreview() {
    MaterialTheme {
        BottomCoachMarkPageCounter(totalPages = 5, currentPage = 3, onPageChange = {})
    }
}
