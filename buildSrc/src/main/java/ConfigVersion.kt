import org.gradle.api.JavaVersion

object ConfigVersion {
    const val minSdk = 19
    const val compileSdk = 31
    const val targetSdk = 31
    val javaVersion = JavaVersion.VERSION_1_8
}