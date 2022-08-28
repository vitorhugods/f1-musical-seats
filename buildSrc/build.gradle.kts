
plugins {
    `kotlin-dsl`
}

repositories {
    google()
    mavenCentral()
    gradlePluginPortal()
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:1.7.10")
    implementation("com.android.tools.build:gradle:7.2.2")
    implementation("org.jetbrains.compose:compose-gradle-plugin:1.2.0-alpha01-dev764")
    implementation("org.apache.commons:commons-compress:1.21")
}
