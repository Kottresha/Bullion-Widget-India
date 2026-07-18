package com.kotresh.bullionwidgettest.widget.data

import com.kotresh.bullionwidgettest.widget.model.MetalPrice

object DummyData {
    val metals = listOf(
        MetalPrice(
            title = "22K",
            price = "₹7,520",
            difference = "+₹25",
            isPositive = true
        ),
        MetalPrice(
            title = "24K",
            price = "₹8,210",
            difference = "-₹15",
            isPositive = false
        ),
        MetalPrice(
            title = "Silver",
            price = "₹112.40",
            difference = "+₹1.20",
            isPositive = true
        )
    )
}