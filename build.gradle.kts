plugins {
    id("java")
    id("org.openrewrite.rewrite") version "6.11.2"
}

group = "org.sample.rewrite"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    rewrite("org.openrewrite.recipe:rewrite-migrate-java:2.11.0")
}

dependencies {

}

rewrite {
    activeRecipe(
        "org.openrewrite.java.migrate.Java8toJava11"
    )
}

tasks.test {
    useJUnitPlatform()
}