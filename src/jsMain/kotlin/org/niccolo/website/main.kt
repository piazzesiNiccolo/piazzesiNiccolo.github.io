package org.niccolo.website

import org.jetbrains.compose.web.css.Style
import org.jetbrains.compose.web.renderComposable
import org.niccolo.website.style.Website

fun main() {
  renderComposable(rootElementId = "root") {
    Style(Website)
    Website()
  }
}
