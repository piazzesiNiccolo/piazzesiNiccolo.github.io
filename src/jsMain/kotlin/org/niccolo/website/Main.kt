package org.niccolo.website

import org.jetbrains.compose.web.css.Style
import org.jetbrains.compose.web.renderComposable
import org.niccolo.website.composables.Website
import org.niccolo.website.style.Builtins

fun main() {
    renderComposable(rootElementId = "root") {
        Style(Builtins)
        Website()
    }
}
