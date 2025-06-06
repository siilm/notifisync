// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.kotlin.android) apply false
    alias(libs.plugins.kotlin.compose) apply false
    kotlin("plugin.serialization") version "1.9.22" apply false
}

buildscript {
    dependencies {
        // 确保存在Kotlin Gradle插件
        classpath(kotlin("gradle-plugin", version = "1.9.22"))
    }
}