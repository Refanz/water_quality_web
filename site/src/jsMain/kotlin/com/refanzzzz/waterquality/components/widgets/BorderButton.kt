package com.refanzzzz.waterquality.components.widgets

import androidx.compose.runtime.Composable
import com.refanzzzz.waterquality.styles.AppColors
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.backgroundColor
import com.varabyte.kobweb.compose.ui.modifiers.border
import com.varabyte.kobweb.compose.ui.modifiers.color
import com.varabyte.kobweb.compose.ui.modifiers.fontWeight
import com.varabyte.kobweb.compose.ui.modifiers.padding
import com.varabyte.kobweb.silk.style.CssStyle
import com.varabyte.kobweb.silk.style.selectors.hover
import com.varabyte.kobweb.silk.components.forms.Button
import com.varabyte.kobweb.silk.style.toModifier
import org.jetbrains.compose.web.css.LineStyle
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.Text

val BorderButtonStyle = CssStyle {
    base {
        Modifier
            .padding(
                leftRight = 12.px,
                topBottom = 4.px
            )
            .color(AppColors.PRIMARY_BLUE.color)
            .fontWeight(FontWeight.Thin)
            .backgroundColor(color = AppColors.BACKGROUND_WHITE.color)
            .border(1.px, LineStyle.Solid, AppColors.PRIMARY_BLUE.color)
    }

    hover {
        Modifier
            .backgroundColor(AppColors.BACKGROUND_LIGHT.color)
    }
}

@Composable
fun BorderButton(btnText: String, onClick: () -> Unit) {
    Button(
        onClick = {
            onClick()
        },
        modifier = BorderButtonStyle.toModifier()
    ) {
        Text(btnText)
    }
}