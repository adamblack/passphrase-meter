/*
 * Copyright 2022 Wultra s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions
 * and limitations under the License.
 */

buildscript {
    repositories {
        mavenLocal()
        mavenCentral()
        google()
        maven {
            url = java.net.URI("https://plugins.gradle.org/m2/")
        }
    }
    dependencies {
        classpath("com.android.tools.build:gradle:7.2.1")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:${Constants.kotlinVersion}")
        // releasing
        classpath("io.github.gradle-nexus:publish-plugin:1.1.0")
    }
}

allprojects {
    repositories {
        mavenLocal()
        mavenCentral()
        google()
     }
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}