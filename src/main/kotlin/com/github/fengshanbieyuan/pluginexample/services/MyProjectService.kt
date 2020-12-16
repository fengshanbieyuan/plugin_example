package com.github.fengshanbieyuan.pluginexample.services

import com.intellij.openapi.project.Project
import com.github.fengshanbieyuan.pluginexample.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
