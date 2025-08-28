package org.niccolo.website.composables

import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.dom.A
import org.jetbrains.compose.web.dom.H2
import org.jetbrains.compose.web.dom.H3
import org.jetbrains.compose.web.dom.H4
import org.jetbrains.compose.web.dom.Li
import org.jetbrains.compose.web.dom.Main
import org.jetbrains.compose.web.dom.P
import org.jetbrains.compose.web.dom.Section
import org.jetbrains.compose.web.dom.Text
import org.jetbrains.compose.web.dom.Ul
import org.niccolo.website.style.Content.about
import org.niccolo.website.style.Content.column
import org.niccolo.website.style.Content.content
import org.niccolo.website.style.Content.experience
import org.niccolo.website.style.Content.projects

@Composable
fun WebsiteBody() {
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
    P { Text("TODO") }
    H2 { Text("Skills") }
    P { Text("TODO") }
}
