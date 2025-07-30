import androidx.compose.runtime.Composable
import com.refanzzzz.waterquality.components.widgets.PrimaryButton
import com.refanzzzz.waterquality.components.widgets.WhiteButton
import com.refanzzzz.waterquality.styles.AppColors
import com.refanzzzz.waterquality.styles.AppStrings
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.css.TextDecorationLine
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.components.icons.fa.FaWater
import com.varabyte.kobweb.silk.components.icons.fa.IconSize
import com.varabyte.kobweb.silk.components.navigation.Link
import com.varabyte.kobweb.silk.components.text.SpanText
import com.varabyte.kobweb.silk.style.CssStyle
import com.varabyte.kobweb.silk.style.selectors.hover
import com.varabyte.kobweb.silk.style.toModifier
import org.jetbrains.compose.web.css.cssRem
import org.jetbrains.compose.web.css.px

@Composable
fun NavBar() {

    val links = listOf("Home", "Fitur", "Peta Air", "Cara Kerja", "Blog", "Tentang", "Kontak")

    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .padding(
                leftRight = 24.px,
                topBottom = 8.px,
            )
            .fillMaxWidth()
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .fillMaxWidth()
                .maxWidth(80.cssRem)
        ) {
            NavLogo()
            NavLinks(links)
            NavButton()
        }
    }
}

@Composable
fun NavLogo() {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .gap(12.px)
    ) {
        FaWater(
            size = IconSize.X2,
            modifier = Modifier
                .color(AppColors.PRIMARY_BLUE.color)
        )
        SpanText(
            text = AppStrings.AppName.text,
            modifier = Modifier
                .fontWeight(FontWeight.Bold)
                .fontSize(24.px)
                .color(AppColors.PRIMARY_BLUE_DARK.color)
        )
    }
}

@Composable
fun NavLinks(links: List<String>) {
    Row(
        modifier = Modifier
            .gap(12.px)
    ) {
        NavLink("Home", "/")
        NavLink("Features", "/")
        NavLink("Water Maps", "/")
        NavLink("How it Works", "/")
        NavLink("About", "about")
    }
}

val NavLinkStyle = CssStyle {
    base {
        Modifier
            .textDecorationLine(TextDecorationLine.None)
            .color(AppColors.TEXT_SECONDARY.color)
    }
    hover {
        Modifier
            .color(AppColors.PRIMARY_BLUE.color)
    }
}

@Composable
fun NavLink(text: String, path: String) {
    Link(
        path = path,
        text = text,
        modifier = NavLinkStyle.toModifier()
    )
}

@Composable
fun NavButton() {
    Row(
        modifier = Modifier
            .gap(12.px)
    ) {
        WhiteButton(
            "Masuk",
            onClick = {}
        )

        PrimaryButton(
            btnText = "Mulai Sekarang",
            onClick = {}
        )
    }
}