package org.niccolo.website.composables

import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.attributes.InputType
import org.jetbrains.compose.web.css.margin
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.dom.A
import org.jetbrains.compose.web.dom.Blockquote
import org.jetbrains.compose.web.dom.Br
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.ElementScope
import org.jetbrains.compose.web.dom.H2
import org.jetbrains.compose.web.dom.H3
import org.jetbrains.compose.web.dom.H4
import org.jetbrains.compose.web.dom.Main
import org.jetbrains.compose.web.dom.P
import org.jetbrains.compose.web.dom.Section
import org.jetbrains.compose.web.dom.Span
import org.jetbrains.compose.web.dom.Text
import org.niccolo.website.style.Content.column
import org.niccolo.website.style.Content.content
import org.niccolo.website.style.Content.job
import org.niccolo.website.style.Content.jobTime
import org.niccolo.website.style.Content.skill
import org.w3c.dom.HTMLSpanElement

@Composable
fun WebsiteBody() {
    Main(attrs = { classes(content) }) {
        Section(attrs = { classes(column) }) { About() }
        Section(attrs = { classes(column) }) {
            Experience()
            Education()
        }
        Section(attrs = { classes(column) }) { Skills() }
    }
}

@Composable
fun Experience() {
    H2 { Text("Work") }
    Section {
        JobLine {
            Text("2023 – Present • Guardsquare")
        }
        P {
            Text("Working on the Android mobile app protection tool")
            A(
                href = "https://www.guardsquare.com/dexguard",
                attrs = { style { margin(0.px) } },
            ) { Text(" DexGuard, ") }
            Text("researching and developing state of the art code obfuscation techniques, anti reverse-engineering features and RASP protections.")
        }
        P {
            Text(" Additionally, I assist in maintaining the open source projects ")
            A(
                href = "https://github.com/Guardsquare/proguard",
                attrs = { style { margin(0.px) } },
            ) { Text("Proguard") }
            Text(" and ")
            A(
                href = "https://github.com/Guardsquare/proguard-core",
                attrs = { style { margin(0.px) } },
            ) { Text("ProguardCORE") }
            Text(", and help maintaining and developing multiple gradle plugins.")
        }
    }
}

@Composable
fun About() {
    Description()
}

@Composable
private fun Education() {
    H2 { Text("Education") }
    H3 { Text("Msc in Computer Science") }
    JobLine { Text("2020–2022 • University of Pisa ") }
    H4 { Text("Main Topics") }
    P {
        Text("Compilers and Interpreters, Software verification, Programming Language Theory applied to cybersecurity")
    }
    H3 { Text("Bsc in Computer Science") }
    JobLine { Text("2017–2020 • University of Florence ") }
}

@Composable
private fun Skills() {
    Div(attrs = { classes(skill, job) })
    H2 { Text("Skills") }
    P { Text("Java, Kotlin, Android Runtime internals, JVM internals, Gradle, Git, Ci/CD systems.") }
    P { Text("Reverse engineering tools (JADX, Ghidra, apktool)") }
}

@Composable
private fun Description() {
    H2 { Text("About Me") }
    P {
        Text("Hi! I am a software engineer, mostly focused on compilers and programming language internals.")
    }
    P {
        Text("I currently work at ")
        A(href = "https://www.guardsquare.com/", attrs = { style { margin(0.px) } }) { Text("Guardsquare, ") }
        Text("applying concepts and methodologies from compiler engineering to mobile application security.")
    }
}


@Composable
private fun JobLine(content: @Composable (ElementScope<HTMLSpanElement>.() -> Unit)) {
    Span(attrs = {classes(jobTime)}) {
        content()
    }
}