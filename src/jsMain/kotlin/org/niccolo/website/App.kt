package org.niccolo.website

import androidx.compose.runtime.*
import org.jetbrains.compose.web.dom.AttrBuilderContext
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.Text
import org.w3c.dom.HTMLElement
import org.niccolo.website.style.App.name
@Composable
fun App(attrs: AttrBuilderContext<HTMLElement>? = null,) {
    Div(attrs = { classes(name) }) {
        Name()
    }
}

@Composable
fun Name() {
    Text("Niccolò Piazzesi")
}