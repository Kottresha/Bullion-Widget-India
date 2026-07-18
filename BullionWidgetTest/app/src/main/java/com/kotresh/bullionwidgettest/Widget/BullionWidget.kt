package com.kotresh.bullionwidgettest.widget

import android.content.Context
import androidx.glance.GlanceId
import androidx.glance.GlanceModifier
import androidx.glance.appwidget.GlanceAppWidget
import androidx.glance.appwidget.provideContent
import androidx.glance.layout.Column
import androidx.glance.layout.fillMaxSize
import androidx.glance.text.Text

class BullionWidget : GlanceAppWidget() {

    override suspend fun provideGlance(
        context: Context,
        id: GlanceId
    ) {
        provideContent {
            Column(
                modifier = GlanceModifier.fillMaxSize()
            ) {
                Text("Bullion Widget")
                Text("22K : ₹7500")
                Text("24K : ₹8200")
                Text("Silver : ₹110")
            }
        }
    }
}