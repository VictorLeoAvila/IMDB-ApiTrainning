import Versions.expressoVersion
import Versions.jUnitVersion
import Versions.koinVersion
import Versions.testExtJunitVersion

object TestLibs {

    const val jUnit =  "junit:junit:$jUnitVersion"
    const val extJunit = "androidx.test.ext:junit:$testExtJunitVersion"
    const val espresso = "androidx.test.espresso:espresso-core:$expressoVersion"
    const val  koinTest = "io.insert-koin:koin-test-junit4:$koinVersion"

}