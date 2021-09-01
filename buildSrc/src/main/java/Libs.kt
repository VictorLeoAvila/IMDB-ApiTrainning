import Versions.androidMaterialVersion
import Versions.appCompatVersion
import Versions.constraintLayoutVersion
import Versions.coreKtxVersion
import Versions.koinVersion
import Versions.lifecycleVersion
import Versions.navigationFragmentVersion
import Versions.navigationUiVersion
import Versions.okHttpVersion
import Versions.paginVersion
import Versions.retrofitVersion

object Libs {

    // google
    const val androidXCore = "androidx.core:core-ktx:$coreKtxVersion"
    const val appCompat = "androidx.appcompat:appcompat:$appCompatVersion"
    const val androidMaterial = "com.google.android.material:material:$androidMaterialVersion"
    const val constraintLayout = "androidx.constraintlayout:constraintlayout:$constraintLayoutVersion"

    // Glide
    const val glide = "com.github.bumptech.glide:glide:${Versions.glideVersion}"
    const val glideCompiler = "com.github.bumptech.glide:compiler:${Versions.glideVersion}"

    //retrofit
    const val retrofit = "com.squareup.retrofit2:retrofit:$retrofitVersion"
    const val converterGson = "com.squareup.retrofit2:converter-gson:$retrofitVersion"

    //okHttpClient
    const val okHttp = "com.squareup.okhttp3:okhttp:$okHttpVersion"
    const val logginInterceptor = "com.squareup.okhttp3:logging-interceptor:$okHttpVersion"

    //lifecycle
    const val lifeCycleViewModel = "androidx.lifecycle:lifecycle-viewmodel-ktx:$lifecycleVersion"
    const val liveData = "androidx.lifecycle:lifecycle-livedata-ktx:$lifecycleVersion"
    const val lifeCycleRuntime = "androidx.lifecycle:lifecycle-runtime-ktx:$lifecycleVersion"
    //noinspection LifecycleAnnotationProcessorWithJava8
    const val lifecycleCompiler = "androidx.lifecycle:lifecycle-compiler:$lifecycleVersion"
    const val lifeCycleService = "androidx.lifecycle:lifecycle-service:$lifecycleVersion"

    //pagin
    const val paging = "androidx.paging:paging-runtime-ktx:$paginVersion"

    //navigation
    const val navigationFragment = "androidx.navigation:navigation-fragment-ktx:$navigationFragmentVersion"
    const val  navigationUi = "androidx.navigation:navigation-ui-ktx:$navigationUiVersion"

    //koin
    const val koin = "io.insert-koin:koin-core:$koinVersion"
    const val koinAndroid = "io.insert-koin:koin-android:$koinVersion"
    const val koinAndroidCompat = "io.insert-koin:koin-android-compat:$koinVersion"
    const val koinWorkmanager = "io.insert-koin:koin-androidx-workmanager:$koinVersion"

}