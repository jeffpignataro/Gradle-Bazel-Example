load("@rules_java//java:defs.bzl", "java_binary")
load("@rules_jvm_external//:defs.bzl", "artifact")
load("@contrib_rules_jvm//java:defs.bzl", "JUNIT5_DEPS", "java_test_suite")

java_library(
    name = "lib",
    srcs = glob(["src/main/java/**/*.java"]),
)

java_binary(
    name = "ProjectRunner",
    main_class = "com.example.ProjectRunner",
    runtime_deps = [
        ":lib",
    ],
)

java_test_suite(
    name = "ProjectRunnerTests",
    size = "small",
    srcs = glob(["src/test/java/**/*.java"]),
    runner = "junit5",
    test_suffixes = ["Tests.java"],
    runtime_deps = JUNIT5_DEPS,
    deps = [
        ":lib",
        artifact("org.junit.jupiter:junit-jupiter-api"),
    ],
)
