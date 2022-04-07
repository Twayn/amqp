import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
	id("org.springframework.boot") version "2.6.5"
	id("io.spring.dependency-management") version "1.0.11.RELEASE"
	kotlin("jvm") version "1.6.10"
	kotlin("plugin.spring") version "1.6.10"
	kotlin("plugin.jpa") version "1.6.10"
}

//subprojects{
//	apply {
//		plugin("org.springframework.boot")
//		plugin("io.spring.dependency-management")
//		plugin("org.jetbrains.kotlin.jvm")
//		plugin("org.jetbrains.kotlin.plugin.spring")
//		plugin("org.jetbrains.kotlin.plugin.jpa")
//	}
//
//	group = "com.study"
//	version = "0.0.1-SNAPSHOT"
//	java.sourceCompatibility = JavaVersion.VERSION_17
//
//	repositories {
//		mavenCentral()
//	}
//
//	dependencies {
//		implementation("org.springframework.boot:spring-boot-starter-data-jpa")
//		implementation("org.springframework.boot:spring-boot-starter-web")
//		implementation("org.springframework.boot:spring-boot-starter-actuator")
//		implementation("org.springframework.boot:spring-boot-starter-amqp")
//		implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
//		implementation("org.jetbrains.kotlin:kotlin-reflect")
//		implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
//		implementation("com.fasterxml.jackson.module:jackson-module-kotlin:2.13.2")
//		developmentOnly("org.springframework.boot:spring-boot-devtools")
//		runtimeOnly("com.h2database:h2")
//		testImplementation("org.springframework.boot:spring-boot-starter-test")
//		testImplementation("org.springframework.amqp:spring-rabbit-test")
//	}
//
//	tasks.withType<KotlinCompile> {
//		kotlinOptions {
//			freeCompilerArgs = listOf("-Xjsr305=strict")
//			jvmTarget = "17"
//		}
//	}
//
//	tasks.withType<Test> {
//		useJUnitPlatform()
//	}
//}

allprojects{
	apply {
		plugin("org.springframework.boot")
		plugin("io.spring.dependency-management")
		plugin("org.jetbrains.kotlin.jvm")
		plugin("org.jetbrains.kotlin.plugin.spring")
		plugin("org.jetbrains.kotlin.plugin.jpa")
	}

	group = "com.study"
	version = "0.0.1-SNAPSHOT"
	java.sourceCompatibility = JavaVersion.VERSION_17

	repositories {
		mavenCentral()
	}

	dependencies {
		implementation("org.springframework.boot:spring-boot-starter-data-jpa")
		implementation("org.springframework.boot:spring-boot-starter-web")
		implementation("org.springframework.boot:spring-boot-starter-actuator")
		implementation("org.springframework.boot:spring-boot-starter-amqp")
		implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
		implementation("org.jetbrains.kotlin:kotlin-reflect")
		implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
		implementation("com.fasterxml.jackson.module:jackson-module-kotlin:2.13.2")
		developmentOnly("org.springframework.boot:spring-boot-devtools")
		runtimeOnly("com.h2database:h2")
		testImplementation("org.springframework.boot:spring-boot-starter-test")
		testImplementation("org.springframework.amqp:spring-rabbit-test")
	}

	tasks.withType<KotlinCompile> {
		kotlinOptions {
			freeCompilerArgs = listOf("-Xjsr305=strict")
			jvmTarget = "17"
		}
	}

	tasks.withType<Test> {
		useJUnitPlatform()
	}
}