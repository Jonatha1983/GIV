package com.gafner.giv

import com.intellij.openapi.components.ServiceManager
import com.intellij.openapi.project.Project
import com.intellij.openapi.ui.SimpleToolWindowPanel
import com.intellij.ui.layout.panel

class GivToolWindow(private val project: Project) : SimpleToolWindowPanel(true, true) {

    init {
        val panel = panel {
            noteRow("Login to get notified when the submitted\nexceptions are fixed.")
            row("Username:") { userField() }
            row("Password:") { passwordField() }
            row {
                right {
                    link("Forgot password?") { /* custom action */ }
                }
            }
            noteRow("""Do not have an account? <a href="https://account.jetbrains.com/login">Sign Up</a>""")
        }

    }

    private fun passwordField() {
        TODO("Not yet implemented")
    }

    private fun userField() {
        TODO("Not yet implemented")
    }


    companion object {
        fun getInstance(project: Project): GivToolWindow = ServiceManager.getService(project,GivToolWindow::class.java)
    }

}
