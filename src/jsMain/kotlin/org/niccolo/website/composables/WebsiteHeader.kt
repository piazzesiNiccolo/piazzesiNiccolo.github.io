package org.niccolo.website.composables

import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.attributes.ATarget
import org.jetbrains.compose.web.attributes.target
import org.jetbrains.compose.web.css.borderRadius
import org.jetbrains.compose.web.css.height
import org.jetbrains.compose.web.css.padding
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.css.width
import org.jetbrains.compose.web.dom.A
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.ElementScope
import org.jetbrains.compose.web.dom.H1
import org.jetbrains.compose.web.dom.Header
import org.jetbrains.compose.web.dom.Img
import org.jetbrains.compose.web.dom.Text
import org.niccolo.website.icons.EmailIcon
import org.niccolo.website.icons.GitHubIcon
import org.niccolo.website.icons.LinkedinIcon
import org.niccolo.website.style.Content.header
import org.niccolo.website.style.Content.links
import org.niccolo.website.style.Content.name
import org.niccolo.website.style.Content.personalLink
import org.w3c.dom.HTMLDivElement

@Composable
fun WebsiteHeader() {
    Header(attrs = { classes(header) }) {
        Div(attrs = { style { padding(12.px, 0.px, 0.px, 0.px) } }) {
            Img(src = "public/images/profile.jpeg", alt = "Picture", attrs = {
                style {
                    height(96.px)
                    width(96.px)
                    borderRadius(50.percent)
                }
            })
            Name()
        }
        Links()
    }
}

@Composable
fun Name() {
    H1(attrs = { classes(name) }) { Text("Niccolò Piazzesi") }
}

@Composable
fun Links() {
    Div(attrs = { classes(links) }) {
        PersonalLink {
            GitHubIcon()
            A(
                href = "https://github.com/piazzesiNiccolo",
                attrs = { target(ATarget.Blank) },
            ) {
                Text("piazzesiNiccolo")
            }
        }
        PersonalLink {
            EmailIcon()
            A(
                href = "mailto:npiazzesi@gmail.com",
                attrs = { target(ATarget.Blank) },
            ) {
                Text("npiazzesi@gmail.com")
            }
        }
        PersonalLink {
            LinkedinIcon()
            A(
                href = "https://www.linkedin.com/in/npiazzesi22/",
                attrs = { target(ATarget.Blank) },
            ) {
                Text("npiazzesi22")
            }
        }
    }
}

@Composable
fun PersonalLink(content: @Composable (ElementScope<HTMLDivElement>.() -> Unit)) {
    Div(attrs = { classes(personalLink) }) {
        content()
    }
}
