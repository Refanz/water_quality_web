package com.refanzzzz.waterquality.components.widgets

import androidx.compose.runtime.Composable
import com.refanzzzz.waterquality.styles.AppColors
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.backgroundColor
import com.varabyte.kobweb.compose.ui.modifiers.color
import com.varabyte.kobweb.compose.ui.modifiers.fontWeight
import com.varabyte.kobweb.compose.ui.modifiers.padding
import com.varabyte.kobweb.silk.components.forms.Button
import com.varabyte.kobweb.silk.style.CssStyle
import com.varabyte.kobweb.silk.style.selectors.hover
import com.varabyte.kobweb.silk.style.toModifier
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.Text

val WhiteButtonStyle = CssStyle {
    base {
        Modifier
            .fontWeight(FontWeight.Thin)
            .padding(
                leftRight = 12.px,
                topBottom = 4.px
            )
            .backgroundColor(AppColors.BACKGROUND_WHITE.color)
            .color(AppColors.TEXT_PRIMARY.color)
    }
    hover {
        Modifier
            .backgroundColor(AppColors.BACKGROUND_LIGHT.color)
    }
}

@Composable
fun WhiteButton(text: String, onClick: () -> Unit) {
    Button(
        modifier = WhiteButtonStyle.toModifier(),
        onClick = {
            onClick()
        }
    ) {
        Text(text)
    }
}