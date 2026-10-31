plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}
android {
    namespace = "id.calista.digitalstore"
    compileSdk = 35
    defaultConfig {
        applicationId = "id.calista.digitalstore"
        minSdk = 23
        targetSdk = 35
        versionCode = 1
        versionName = "1.0.0"
    }
}
