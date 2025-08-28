package org.niccolo.website.style

import org.jetbrains.compose.web.css.CSSMediaQuery
import org.jetbrains.compose.web.css.Color
import org.jetbrains.compose.web.css.StyleSheet
import org.jetbrains.compose.web.css.backgroundColor
import org.jetbrains.compose.web.css.color
import org.jetbrains.compose.web.css.cssRem
import org.jetbrains.compose.web.css.fontFamily
import org.jetbrains.compose.web.css.fontSize
import org.jetbrains.compose.web.css.height
import org.jetbrains.compose.web.css.margin
import org.jetbrains.compose.web.css.media
import org.jetbrains.compose.web.css.minHeight
import org.jetbrains.compose.web.css.overflow
import org.jetbrains.compose.web.css.padding
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.css.textDecoration
import org.jetbrains.compose.web.css.textDecorationLine
import org.jetbrains.compose.web.css.textDecorationStyle
import org.jetbrains.compose.web.css.textDecorationThickness
import org.jetbrains.compose.web.css.vh
import org.jetbrains.compose.web.css.width

object HtmlTags : StyleSheet() {
    init {
        "@page" style { margin(0.px) }

        group(type("html"), type("body")) style
            {
                width(100.percent)
                height(100.percent)
                margin(0.px)
                padding(0.px)
                color(Color("#333333"))
            }

        type("body") style
            {
                minHeight(100.vh)
                overflow("visible")
                backgroundColor(Color("#fdf6e3"))
                fontFamily("Roboto", "Helvetica Neue", "Helvetica", "Arial", "sans-serif")
            }

        type("a") style
            {
                textDecoration("underline")
                textDecorationStyle("dashed")
                textDecorationLine("underline")
                textDecorationThickness("1px")
                margin(0.px, 10.px, 0.px, 0.px)
                property("text-underline-position", "under")
                color(Color("#333333"))
            }
        type("h1") style {
            margin(0.px)
            fontSize(2.5.cssRem)
        }
        media(CSSMediaQuery.MediaType(CSSMediaQuery.MediaType.Enum.Print)) {
            type("a") style { textDecoration("none") }
        }
    }
}
