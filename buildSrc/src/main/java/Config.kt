import org.gradle.api.JavaVersion

object Config {
    const val minSdk = 19
    const val compileSdk = 30
    const val targetSdk = 30
    val javaVersion = JavaVersion.VERSION_1_8
}