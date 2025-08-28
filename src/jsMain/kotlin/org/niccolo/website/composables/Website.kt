package org.niccolo.website.composables

import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.css.Style
import org.jetbrains.compose.web.dom.AttrBuilderContext
import org.niccolo.website.style.Content
import org.w3c.dom.HTMLElement

@Composable
fun Website(attrs: AttrBuilderContext<HTMLElement>? = null) {
    Style(Content)
    WebsiteHeader()
    WebsiteBody()
}
