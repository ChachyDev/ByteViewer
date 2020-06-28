package club.chachy.byteviewer

import club.chachy.byteviewer.config.Config
import club.chachy.byteviewer.stylesheets.dark.DarkThemeStylesheet
import club.chachy.byteviewer.stylesheets.light.LightThemeStylesheet
import club.chachy.byteviewer.views.main.MainView
import tornadofx.App
import tornadofx.launch

fun main() {
    launch<Application>()
}

class Application : App(MainView::class, if (Config.isLight) LightThemeStylesheet::class else DarkThemeStylesheet::class)