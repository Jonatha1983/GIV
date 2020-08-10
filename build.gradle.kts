plugins {
    id("org.jetbrains.intellij") version "0.4.21"
    kotlin("jvm") version "1.3.72"
}

group = "com.gafner"
version = "1.0.2"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))
}

//another comment
// See https://github.com/JetBrains/gradle-intellij-plugin/
intellij {
//    version = "202.4357.23"

}
tasks {
    compileKotlin {
        kotlinOptions.jvmTarget = "1.8"
    }
    compileTestKotlin {
        kotlinOptions.jvmTarget = "1.8"
    }
}
tasks.getByName<org.jetbrains.intellij.tasks.PatchPluginXmlTask>("patchPluginXml") {
    changeNotes("""
      <br>
      <em>Initial - Embedded Web Browser</em>""")
}


tasks.getByName<org.jetbrains.intellij.tasks.RunIdeTask>("runIde") {
    jbrVersion("jbr_jcef-11_0_7b912.1")
}