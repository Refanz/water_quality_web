package com.refanzzzz.waterquality.styles

import org.jetbrains.compose.web.css.CSSColorValue
import org.jetbrains.compose.web.css.Color

enum class AppColors(val color: CSSColorValue) {
    // Primary Brand Colors
    PRIMARY_BLUE(Color("#2563eb")),
    PRIMARY_BLUE_DARK(Color("#1e3a8a")),
    PRIMARY_BLUE_LIGHT(Color("#eff6ff")),

    // Neutral Grays
    TEXT_PRIMARY(Color("#111827")),
    TEXT_SECONDARY(Color("#4b5563")),
    TEXT_TERTIARY(Color("#9ca3af")),
    TEXT_WHITE(Color("#ffffff")),
    BACKGROUND_LIGHT(Color("#f9fafb")),
    BACKGROUND_WHITE(Color("#ffffff")),

    // Accent Colors
    SUCCESS_GREEN(Color("#10b981")),
    ACCENT_PURPLE(Color("#8b5cf6")),
    CYAN_ACCENT(Color("#EFF9FF"))
}