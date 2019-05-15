plugins {
    base
}

tasks.register<Exec>("npmBuild") {
    commandLine = listOf("npm", "run", "build")
    
    inputs.files("package-lock.json")
    inputs.dir("src")
    inputs.dir("public")

    outputs.dir("target")
}

tasks.register<Jar>("jar") {
    dependsOn("npmBuild")
    from("target/classes")
}

artifacts {
    add("archives", tasks.named("jar"))
}