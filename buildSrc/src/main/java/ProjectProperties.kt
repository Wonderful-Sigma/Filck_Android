import org.gradle.api.JavaVersion

object ProjectProperties {
    const val APPLICATION_ID = "com.example.flick"
    const val COMPILE_SDK_VERSION = 33
    const val MIN_SDK_VERSION = 24
    const val TARGET_SDK_VERSION = 33
    const val VERSION_CODE = 1
    const val VERSION_NAME = "1.0"
    const val JVM_TARGET = "11"
    val JAVA_VERSION = JavaVersion.VERSION_11

    const val BUILD_TYPE_NAME = "release"
    const val IS_MINIFY_ENABLED = false
    const val PROGUARD_FILE_NAME = "proguard-android-optimize.txt"
    const val PROGUARD_FILE = "proguard-rules.pro"

    const val DATA_BINDING = true
}