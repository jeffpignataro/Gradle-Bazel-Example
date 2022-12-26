# Bazel examples and tutorials

Original source repository is [Bazel Build Examples](https://github.com/bazelbuild/examples)

A collection of examples of how to use the Bazel build system.

# Project for comparing Gradle/Bazel

`java-tutorial` is the project which is instrumented with both Gradle and Bazel to demonstrate the capabilities and efficency of both.

## Building/Running with both Gradle and Bazel

### Build

```
./gradlew build && bazel build //:ProjectRunner
```

### Run

```
./gradlew run && bazel run //:ProjectRunner
```
