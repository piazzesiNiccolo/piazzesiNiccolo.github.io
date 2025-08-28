package org.niccolo.website.composables

import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.attributes.ATarget
import org.jetbrains.compose.web.attributes.target
import org.jetbrains.compose.web.dom.A
import org.jetbrains.compose.web.dom.H1
import org.jetbrains.compose.web.dom.Header
import org.jetbrains.compose.web.dom.Nav
import org.jetbrains.compose.web.dom.Text
import org.niccolo.website.icons.EmailIcon
import org.niccolo.website.icons.GitHubIcon
import org.niccolo.website.icons.LinkedinIcon
import org.niccolo.website.style.Content.header
import org.niccolo.website.style.Content.links
import org.niccolo.website.style.Content.name

@Composable
fun WebsiteHeader() {
    Header(attrs = { classes(header) }) {
        Name()
        Links()
    }
}

@Composable
fun Name() {
    H1(attrs = { classes(name) }) { Text("Niccolò Piazzesi") }
}

@Composable
fun Links() {
    Nav(attrs = { classes(links) }) {
        GitHubIcon()
        A(
            href = "https://github.com/piazzesiNiccolo",
            attrs = { target(ATarget.Blank) },
        ) {
            Text("piazzesiNiccolo")
        }
        EmailIcon()
        A(
            href = "mailto:npiazzesi@gmail.com",
            attrs = { target(ATarget.Blank) },
        ) {
            Text("npiazzesi@gmail.com")
        }
        LinkedinIcon()
        A(
            href = "https://www.linkedin.com/in/npiazzesi22/",
            attrs = { target(ATarget.Blank) },
        ) {
            Text("npiazzesi22")
        }
    }
}
