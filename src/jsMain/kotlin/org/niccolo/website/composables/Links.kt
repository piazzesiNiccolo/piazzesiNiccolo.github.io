package org.niccolo.website.composables

import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.attributes.ATarget
import org.jetbrains.compose.web.attributes.target
import org.jetbrains.compose.web.dom.A
import org.jetbrains.compose.web.dom.Nav
import org.jetbrains.compose.web.dom.Text
import org.niccolo.website.style.Content.links

@Composable
fun Links() {
    Nav(attrs = { classes(links) }) {
        A(
            href = "https://github.com/piazzesiNiccolo",
            attrs = { target(ATarget.Blank) },
        ) {
            Text("piazzesiNiccolo")
        }
        A(
            href = "mailto:npiazzesi@gmail.com",
            attrs = { target(ATarget.Blank) },
        ) {
            Text("npiazzesi@gmail.com")
        }
        A(
            href = "https://www.linkedin.com/in/npiazzesi22/",
            attrs = { target(ATarget.Blank) },
        ) {
            Text("npiazzesi22")
        }
    }
}
