package org.niccolo.website.composables

import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.dom.H1
import org.jetbrains.compose.web.dom.Text
import org.niccolo.website.style.Content.name

@Composable
fun Name() {
    H1(attrs = { classes(name) }) { Text("Niccolò Piazzesi") }
}
