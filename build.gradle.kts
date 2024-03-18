plugins {
    kotlin("multiplatform") version("2.0.0-Beta4")
    id("com.google.devtools.ksp") version "2.0.0-Beta4-1.0.19"
}

kotlin {
    jvm()
    macosArm64()
}

repositories {
    mavenCentral()
}

dependencies {
    add("kspJvm",project(":processor"))
    add("kspMacosArm64",project(":processor"))
}
