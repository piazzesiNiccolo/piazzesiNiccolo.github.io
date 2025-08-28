package org.niccolo.website

import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.css.Style
import org.jetbrains.compose.web.dom.A
import org.jetbrains.compose.web.dom.AttrBuilderContext
import org.jetbrains.compose.web.dom.H2
import org.jetbrains.compose.web.dom.H3
import org.jetbrains.compose.web.dom.H4
import org.jetbrains.compose.web.dom.Header
import org.jetbrains.compose.web.dom.Li
import org.jetbrains.compose.web.dom.Main
import org.jetbrains.compose.web.dom.Section
import org.jetbrains.compose.web.dom.Style
import org.jetbrains.compose.web.dom.Text
import org.jetbrains.compose.web.dom.Ul
import org.niccolo.website.composables.Links
import org.niccolo.website.composables.Name
import org.niccolo.website.style.Content
import org.niccolo.website.style.Content.about
import org.niccolo.website.style.Content.column
import org.niccolo.website.style.Content.content
import org.niccolo.website.style.Content.experience
import org.niccolo.website.style.Content.header
import org.niccolo.website.style.Content.projects
import org.w3c.dom.HTMLElement

@Composable
fun Website(attrs: AttrBuilderContext<HTMLElement>? = null) {
    Style(Content)
    Header(attrs = { classes(header) }) {
        Name()
        Links()
    }
    Main(attrs = { classes(content) }) {
        Section(attrs = { classes(column, about) }) { About() }
        Section(attrs = { classes(column, experience) }) { Experience() }
        Section(attrs = { classes(column, projects) }) { ProjectsAndSeminars() }
    }
}

@Composable
fun ProjectsAndSeminars() {
    H2 { Text("Projects") }
    Ul {
        Li { A(href = "https://github.com/niccolo") { Text("This website, built with compose multiplatform") } }
    }
    H2 { Text("Seminars") }
}

@Composable
fun Experience() {
    H2 { Text("Experience") }
    H2 { Text("Education") }
    H3 { Text("Msc in Computer Science") }
    H4 { Text("Main Topics") }
    Ul {
        Li { Text("Compilers and Interpreters") }
        Li { Text("Software verification") }
        Li { Text("Programming Language Theory applied to cybersecurity") }
    }
}

@Composable
fun About() {
    H2 { Text("About Me") }
    H2 { Text("Skills") }
}
