package com.github.qingfeng9924.plugindemo.services

import com.intellij.openapi.project.Project
import com.github.qingfeng9924.plugindemo.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
