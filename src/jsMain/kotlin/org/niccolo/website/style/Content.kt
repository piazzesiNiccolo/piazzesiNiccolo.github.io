package org.niccolo.website.style

import org.jetbrains.compose.web.css.CSSBuilder
import org.jetbrains.compose.web.css.CSSMediaQuery
import org.jetbrains.compose.web.css.StyleSheet
import org.jetbrains.compose.web.css.and
import org.jetbrains.compose.web.css.em
import org.jetbrains.compose.web.css.fontFamily
import org.jetbrains.compose.web.css.fontSize
import org.jetbrains.compose.web.css.fontWeight
import org.jetbrains.compose.web.css.media
import org.jetbrains.compose.web.css.mediaMaxWidth
import org.jetbrains.compose.web.css.paddingTop
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.css.textAlign
import org.jetbrains.compose.web.css.width

object Content : StyleSheet() {
  val name by style {
    width(100.percent)
    paddingTop(50.px)
    fontSize(3.em)
    fontWeight(300)
    fontFamily(
        "Roboto Slab", "Lato", "Roboto", "Helvetica Neue", "Helvetica", "Arial", "sans-serif")

    centeredOnPhone(default = "right")
  }

  private fun CSSBuilder.centeredOnPhone(default: String) {
    textAlign(default)

    onPhone { textAlign("center") }
  }

  private inline fun CSSBuilder.onPhone(crossinline builder: CSSBuilder.() -> Unit) {
    media(CSSMediaQuery.MediaType(CSSMediaQuery.MediaType.Enum.Screen) and mediaMaxWidth(699.px)) {
      self style { builder() }
    }
  }
}
