package org.niccolo.website.composables

import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.css.margin
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.A
import org.jetbrains.compose.web.dom.Br
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

@Composable
fun WebsiteBody() {
    Main(attrs = { classes(content) }) {
        Section(attrs = { classes(column, about) }) { About() }
        Section(attrs = { classes(column, experience) }) { Experience() }
    }
}

@Composable
fun ProjectsAndSeminars() {
}

@Composable
fun Experience() {
    H2 { Text("Experience") }
    Section {
        Text("2023–Present • Working on mobile application security.")
    }
    H2 { Text("Education") }
    H3 { Text("Msc in Computer Science") }
    H4 { Text("2020–2022 • University of Pisa ") }
    H4 { Text("Main Topics") }
    Ul {
        Li { Text("Compilers and Interpreters") }
        Li { Text("Software verification") }
        Li { Text("Programming Language Theory applied to cybersecurity") }
    }
    H3 { Text("Bsc in Computer Science") }
    P { Text("2017–2020 • University of Florence ") }
}

@Composable
fun About() {
    H2 { Text("About Me") }
    P {
        Text("Hi! I am a software engineer, mostly focused on compilers and programming language internals.")
        Br()
        Text("I currently work at ")
        A(href = "https://www.guardsquare.com/", attrs = { style { margin(0.px) } }) { Text("Guardsquare, ") }
        Text("applying concepts and methodologies from compiler engineering to mobile application security.")
    }
    H2 { Text("Skills") }
    P { Text("TODO") }
    H2 { Text("Personal work") }
    Ul {
        Li { A(href = "https://github.com/niccolo") { Text("This website, built with compose multiplatform") } }
        Br()
        Li { A(href = "https://github.com/niccolo") { Text("A toy compiler for a subset of the C language, built with Ocaml and LLVM.") } }
    }
}
