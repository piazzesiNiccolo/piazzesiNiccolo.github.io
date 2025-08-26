package org.niccolo.website

import androidx.compose.runtime.*
import org.jetbrains.compose.web.dom.AttrBuilderContext
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.Text
import org.niccolo.website.composables.Links
import org.niccolo.website.composables.Name
import org.w3c.dom.HTMLElement

@Composable
fun Website(
    attrs: AttrBuilderContext<HTMLElement>? = null,
) {

  Div {
    Name()
    Links()
  }
  Div {
    Div { Text("Education") }
    Div { Text("Work") }
    Div { Text("Projects and talks") }
  }
}
