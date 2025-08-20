[![Java Maven Build Test](https://github.com/deepaksorthiya/graalvm-hello-world/actions/workflows/maven-build.yml/badge.svg)](https://github.com/deepaksorthiya/graalvm-hello-world/actions/workflows/maven-build.yml) <br>

---

### ** GraalVM Native Image Example **

---

# Getting Started

## Requirements:

```
Git: 2.49.0
Maven: 3.9+
Java GraalVM: 25
```

## Install GraalVM JDK 25

[Install GraalVM JDK 24](https://www.graalvm.org/latest/getting-started/) <br>
Set ``GRAALVM_HOME`` as environment path.

Or use sdkman

```bash
sdk install java 25.ea.31-graal
```

## Clone this repository:

```bash
git clone https://github.com/deepaksorthiya/graalvm-hello-world.git
cd graalvm-hello-world
```

## Build Project Using Native Profile:

```bash
./mvnw -Pnative native:compile
```

It will generate a native image ```graalvm-hello-world``` in ```target``` folder.

you can also create native image using

```bash
native-image -O0 -g --verbose -H:+SourceLevelDebug -H:-DeleteLocalSymbols -H:+ReportExceptionStackTraces -H:+UnlockExperimentalVMOptions -H:+JDWP -jar target/graalvm-hello-world-1.0.0-SNAPSHOT.jar target/graalvm-hello-world
```

## Run Project:

```bash
./target/graalvm-hello-world
```

## Debugging

[Debug Docs](https://www.graalvm.org/jdk25/reference-manual/native-image/debugging-and-diagnostics/JDWP/)

```bash
native-image --macro:svmjdwp-library
```

```bash
target/graalvm-hello-world "-XX:JDWPOptions=transport=dt_socket,server=y,address=8000"
```

Create Remote Java Debug and Attach Remote JVM and add arg with
``-agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=*:8000``

(Optional - Only for Debugging)Install GDB and GDBServer

```bash
sudo apt-get update
sudo apt-get install gdb -y
sudo apt install gdbserver -y
```

## Testing

```bash
./mvnw -Pnative test
```
