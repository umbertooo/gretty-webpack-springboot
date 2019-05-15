/*
 * This file was generated by the Gradle 'init' task.
 *
 * This generated file contains a sample Java project to get you started.
 * For more details take a look at the Java Quickstart chapter in the Gradle
 * User Manual available at https://docs.gradle.org/5.2.1/userguide/tutorial_java_projects.html
 */

plugins {
    java
    war
    id("org.springframework.boot") version "2.1.4.RELEASE"
    id("io.spring.dependency-management") version "1.0.7.RELEASE"
    id("org.gretty") version "2.3.1"
}

repositories {
    mavenCentral()
    jcenter()
}

base {
    archivesBaseName = "webpack-demo"
}

java {
	sourceCompatibility = JavaVersion.VERSION_1_8
	targetCompatibility = JavaVersion.VERSION_1_8
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-web:2.1.4.RELEASE")
    providedRuntime("org.springframework.boot:spring-boot-starter-tomcat:2.1.4.RELEASE")
    testImplementation("junit:junit:4.12")

    implementation(project(":gui", "archives"))
}

gretty {
    servletContainer = "tomcat8"
}