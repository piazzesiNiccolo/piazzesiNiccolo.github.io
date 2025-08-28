package org.niccolo.website

import org.jetbrains.compose.web.css.Style
import org.jetbrains.compose.web.renderComposable
import org.niccolo.website.style.HtmlTags

fun main() {
    renderComposable(rootElementId = "root") {
        Style(HtmlTags)
        Website()
    }
}
