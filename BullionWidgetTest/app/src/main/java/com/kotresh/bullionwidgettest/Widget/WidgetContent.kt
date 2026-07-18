package com.kotresh.bullionwidgettest.widget

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.glance.GlanceModifier
import androidx.glance.background
import androidx.glance.layout.Alignment
import androidx.glance.layout.Column
import androidx.glance.layout.Row
import androidx.glance.layout.fillMaxSize
import androidx.glance.layout.fillMaxWidth
import androidx.glance.layout.padding
import androidx.glance.text.FontWeight
import androidx.glance.text.Text
import androidx.glance.text.TextStyle
import androidx.glance.unit.ColorProvider
import androidx.glance.layout.Spacer
import androidx.glance.layout.width
import androidx.glance.layout.height

@Composable
fun WidgetContent() {

    Column(
        modifier = GlanceModifier
            .fillMaxSize()
            .background(ColorProvider(Color(0xFF111827)))
            .padding(12.dp)
    ) {

        Row(
            modifier = GlanceModifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "🪙 Bullion India",
                style = TextStyle(
                    color = ColorProvider(Color.White),
                    fontWeight = FontWeight.Bold
                )
            )

            Spacer(
                modifier = GlanceModifier.width(20.dp)
            )

            Text(
                text = "10:45 AM",
                style = TextStyle(
                    color = ColorProvider(Color(0xFFCBD5E1))
                )
            )
        }

        Spacer(
            modifier = GlanceModifier.height(12.dp)
        )
        // 22K column
        Column(
            modifier = GlanceModifier
                .fillMaxWidth()
                .background(ColorProvider(Color(0xFF1F2937)))
                .padding(12.dp)
        ) {

            Text(
                text = "22K Gold",
                style = TextStyle(
                    color = ColorProvider(Color(0xFFFACC15)),
                    fontWeight = FontWeight.Bold
                )
            )

            Spacer(modifier = GlanceModifier.height(4.dp))

            Text(
                text = "₹7,520",
                style = TextStyle(
                    color = ColorProvider(Color.White),
                    fontWeight = FontWeight.Bold
                )
            )

            Spacer(modifier = GlanceModifier.height(4.dp))

            Text(
                text = "▲ +₹25",
                style = TextStyle(
                    color = ColorProvider(Color(0xFF22C55E))
                )
            )
        }
        //24k column
        Column(
            modifier = GlanceModifier
                .fillMaxWidth()
                .background(ColorProvider(Color(0xFF1F2937)))
                .padding(12.dp)
        ) {

            Text(
                text = "24K Gold",
                style = TextStyle(
                    color = ColorProvider(Color(0xFFFACC15)),
                    fontWeight = FontWeight.Bold
                )
            )

            Spacer(modifier = GlanceModifier.height(4.dp))

            Text(
                text = "₹10,520",
                style = TextStyle(
                    color = ColorProvider(Color.White),
                    fontWeight = FontWeight.Bold
                )
            )

            Spacer(modifier = GlanceModifier.height(4.dp))

            Text(
                text = "▲ +₹25",
                style = TextStyle(
                    color = ColorProvider(Color(0xFF22C55E))
                )
            )
        }
        //silver column
        Column(
            modifier = GlanceModifier
                .fillMaxWidth()
                .background(ColorProvider(Color(0xFF1F2937)))
                .padding(12.dp)
        ) {

            Text(
                text = "silver",
                style = TextStyle(
                    color = ColorProvider(Color(0xFFFACC15)),
                    fontWeight = FontWeight.Bold
                )
            )

            Spacer(modifier = GlanceModifier.height(4.dp))

            Text(
                text = "₹320",
                style = TextStyle(
                    color = ColorProvider(Color.White),
                    fontWeight = FontWeight.Bold
                )
            )

            Spacer(modifier = GlanceModifier.height(4.dp))

            Text(
                text = "▲ +₹25",
                style = TextStyle(
                    color = ColorProvider(Color(0xFF22C55E))
                )
            )
        }
    }

}