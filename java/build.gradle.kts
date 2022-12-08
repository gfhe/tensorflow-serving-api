/*
 * This file was generated by the Gradle 'init' task.
 *
 * This generated file contains a sample Java project to get you started.
 * For more details take a look at the Java Quickstart chapter in the Gradle
 * User Manual available at https://docs.gradle.org/6.5.1/userguide/tutorial_java_projects.html
 */

plugins {
    // Apply the java plugin to add support for Java
    java

    // Apply the application plugin to add support for building a CLI application.
    application
}

repositories {
    // Use jcenter for resolving dependencies.
    // You can declare any Maven/Ivy/file repository here.
    jcenter()
}

dependencies {
    implementation("javax.annotation:javax.annotation-api:1.3.2")
    implementation("com.google.protobuf:protobuf-java:3.12.2")
    implementation("org.tensorflow:proto:1.15.0")
    implementation("io.grpc:grpc-netty-shaded:1.30.2")
    implementation("io.grpc:grpc-protobuf:1.30.2")
    implementation("io.grpc:grpc-stub:1.30.2")

    // This dependency is used by the application.
    implementation("com.google.guava:guava:29.0-jre")

    // Use JUnit test framework
    testImplementation("junit:junit:4.13")
}

application {
    // Define the main class for the application.
    mainClassName = "com.github.alex.App"
}

