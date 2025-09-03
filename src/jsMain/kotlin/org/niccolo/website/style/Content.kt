package org.niccolo.website.style

import org.jetbrains.compose.web.css.AlignItems
import org.jetbrains.compose.web.css.CSSBuilder
import org.jetbrains.compose.web.css.CSSMediaQuery
import org.jetbrains.compose.web.css.Color
import org.jetbrains.compose.web.css.DisplayStyle
import org.jetbrains.compose.web.css.DisplayStyle.Companion.InlineBlock
import org.jetbrains.compose.web.css.FlexDirection
import org.jetbrains.compose.web.css.JustifyContent
import org.jetbrains.compose.web.css.StyleSheet
import org.jetbrains.compose.web.css.alignItems
import org.jetbrains.compose.web.css.and
import org.jetbrains.compose.web.css.borderRadius
import org.jetbrains.compose.web.css.color
import org.jetbrains.compose.web.css.display
import org.jetbrains.compose.web.css.em
import org.jetbrains.compose.web.css.flex
import org.jetbrains.compose.web.css.flexDirection
import org.jetbrains.compose.web.css.fontFamily
import org.jetbrains.compose.web.css.fontSize
import org.jetbrains.compose.web.css.fontStyle
import org.jetbrains.compose.web.css.fontWeight
import org.jetbrains.compose.web.css.height
import org.jetbrains.compose.web.css.justifyContent
import org.jetbrains.compose.web.css.lineHeight
import org.jetbrains.compose.web.css.margin
import org.jetbrains.compose.web.css.marginRight
import org.jetbrains.compose.web.css.media
import org.jetbrains.compose.web.css.mediaMaxWidth
import org.jetbrains.compose.web.css.padding
import org.jetbrains.compose.web.css.paddingTop
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.css.textAlign
import org.jetbrains.compose.web.css.width

object Content : StyleSheet() {
    val header by style {
        style(type("h1")) {
            margin(0.px)
            fontWeight(800)
        }
        display(DisplayStyle.Flex)
        flexDirection(FlexDirection.Column)
        justifyContent(JustifyContent.Center)
        alignItems(AlignItems.Center)
        padding(24.px, 1.px)
        centeredOnPhone("center")
    }

    val links by style {
        margin(10.px, 0.px, 0.px, 0.px)
        display(DisplayStyle.Flex)
        flexDirection(FlexDirection.Row)
        onPhone {
            flexDirection(FlexDirection.Column)
        }

        style(type("svg")) {
            padding(5.px)
            marginRight(5.px)
            fontStyle("normal")
            color(Color.black)
        }

        style(selector("*")) {
            display(InlineBlock)
            height(20.px)
            property("vertical-align", "middle")
        }
    }
    val personalLink by style {
        display(DisplayStyle.Flex)
        flexDirection(FlexDirection.Row)
        justifyContent(JustifyContent.Center)
        alignItems(AlignItems.Center)
        paddingTop(20.px)
    }
    val name by style {
        width(100.percent)
        paddingTop(20.px)
        fontSize(3.em)
        fontWeight(300)
        fontFamily(
            "Roboto Slab",
            "Lato",
            "Roboto",
            "Helvetica Neue",
            "Helvetica",
            "Arial",
            "sans-serif",
        )

        centeredOnPhone(default = "center")
    }

    val content by style {
        display(DisplayStyle.Flex)
        justifyContent(JustifyContent.SpaceBetween)
        alignItems(AlignItems.FlexStart)
        padding(16.px)
        fontSize(1.em)
        onPhone {
            flexDirection(FlexDirection.Column)
            justifyContent(JustifyContent.Center)
            alignItems(AlignItems.Center)
            textAlign("center")
            padding(0.px)
            fontSize(1.2.em)
        }
    }
    val column by style {
        padding(15.px)
        borderRadius(8.px)
        flex(1)
    }

    val jobTime by style {
        fontStyle("italic")
        color(Color.gray)
    }

    val job by style {
        fontSize(0.8.em)
        lineHeight(1.5.em)
    }

    val skill by style {
        width(96.px)
        display(InlineBlock)
    }
    private fun CSSBuilder.centeredOnPhone(default: String) {
        textAlign(default)

        onPhone { textAlign("center") }
    }

    private inline fun CSSBuilder.onPhone(crossinline builder: CSSBuilder.() -> Unit) {
        media(CSSMediaQuery.MediaType(CSSMediaQuery.MediaType.Enum.Screen) and mediaMaxWidth(900.px)) {
            self style { builder() }
        }
    }
}
