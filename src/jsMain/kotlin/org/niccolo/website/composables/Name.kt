package org.niccolo.website.composables

import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.Text
import org.niccolo.website.style.Content.name

@Composable
fun Name() {
  Div(attrs = { classes(name) }) { Text("Niccolò Piazzesi") }
}
