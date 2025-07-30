package com.refanzzzz.waterquality.components.sections.landingpage

import androidx.compose.runtime.Composable
import com.refanzzzz.waterquality.components.widgets.BorderButton
import com.refanzzzz.waterquality.components.widgets.PrimaryButton
import com.refanzzzz.waterquality.styles.AppColors
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.compose.ui.toAttrs
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.text.SpanText
import org.jetbrains.compose.web.css.cssRem
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.Br
import org.jetbrains.compose.web.dom.H1
import org.jetbrains.compose.web.dom.P
import org.jetbrains.compose.web.dom.Text

@Composable
fun Hero() {
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .fillMaxWidth()
            .backgroundColor(AppColors.CYAN_ACCENT.color)
            .padding(
                topBottom = 120.px,
                leftRight = 24.px
            )
    ) {
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .fillMaxWidth()
                .gap(48.px)
                .maxWidth(80.cssRem)
        ) {
            Column(
                verticalArrangement = Arrangement.spacedBy(20.px),
                modifier = Modifier
            ) {
                H1(
                    attrs = Modifier
                        .padding(0.px)
                        .margin(0.px)
                        .fontWeight(FontWeight.Bold)
                        .fontSize(52.px)
                        .toAttrs()
                ) {
                    Text("Prediksi Air ")
                    SpanText(
                        text = "Akurat",
                        modifier = Modifier
                            .color(AppColors.PRIMARY_BLUE.color)
                    )
                    Br()
                    Text("untuk Masa Depan")
                }

                P(
                    attrs = Modifier
                        .maxWidth(400.px)
                        .toAttrs()
                ) {
                    Text(
                        "Dapatkan prediksi ketersediaan air yang akurat dengan teknologi AI terdepan. Bantu perencanaan irigasi dan manajemen sumber daya air yang lebih efisien."
                    )
                }

                Row(
                    modifier = Modifier.gap(12.px),
                ) {
                    PrimaryButton(
                        btnText = "Coba Gratis Sekarang",
                        onClick = {}
                    )
                    BorderButton(
                        btnText = "Pelajari Lebih Lanjut",
                        onClick = {}
                    )
                }
            }
            Image(
                src = "https://images.unsplash.com/photo-1559827260-dc66d52bef19?ixlib=rb-4.0.3&auto=format&fit=crop&w=800&q=80",
                modifier = Modifier
                    .size(
                        width = 600.px,
                        height = 400.px
                    )
                    .borderRadius(12.px)
            )
        }
    }
}