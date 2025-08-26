package org.niccolo.website.composables

import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.attributes.ATarget
import org.jetbrains.compose.web.attributes.target
import org.jetbrains.compose.web.dom.A
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.Text

@Composable
fun Links() {
  Div {
    Div {
      A(href = "https://github.com/piazzesiNiccolo", attrs = { target(ATarget.Blank) }) {
        Text("piazzesiNiccolo")
      }
    }
    Div {
      A(href = "mailto:npiazzesi@gmail.com", attrs = { target(ATarget.Blank) }) {
        Text("npiazzesi@gmail.com")
      }
    }
    Div {
      A(href = "https://www.linkedin.com/in/npiazzesi22/", attrs = { target(ATarget.Blank) }) {
        Text("Niccolò Piazzesi")
      }
    }
  }
}
