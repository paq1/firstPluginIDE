package com.example.firstpluginide

import com.intellij.openapi.project.Project
import com.intellij.openapi.wm.ToolWindow
import com.intellij.openapi.wm.ToolWindowFactory
import javax.swing.ImageIcon
import javax.swing.JLabel
import javax.swing.JPanel

class ImageToolWindowFactory: ToolWindowFactory {
    override fun createToolWindowContent(project: Project, toolWindow: ToolWindow) {
        val panel: JPanel = JPanel()
        val imageUrl = javaClass.getResource("/images/menu_ballon.png")
        val imageIcon = ImageIcon(imageUrl)
        val label = JLabel(imageIcon)
        panel.add(label)
        toolWindow.contentManager.addContent(
                toolWindow.contentManager.factory.createContent(panel, "", false)
        )
    }
}