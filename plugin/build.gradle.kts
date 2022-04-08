plugins {
    `java-gradle-plugin`
    `kotlin-dsl` // Comment out to make the code compile!

    id("org.jetbrains.kotlin.jvm") version "1.5.31"

}

repositories {
    mavenCentral()
}

dependencies {
    implementation(platform("org.jetbrains.kotlin:kotlin-bom"))
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
}