[![Java Maven Build Test](https://github.com/deepaksorthiya/graalvm-hello-world/actions/workflows/maven-build.yml/badge.svg)](https://github.com/deepaksorthiya/graalvm-hello-world/actions/workflows/maven-build.yml) <br>

---

### ** GraalVM Native Image Example **

---

# Getting Started

## Requirements:

```
Git: 2.49.0
Maven: 3.9+
Java GraalVM: 24
```

## Install GraalVM JDK 24

Install GDB and GDBServer

```bash
sudo apt-get update
sudo apt-get install gdb -y
sudo apt install gdbserver -y
```

[Install GraalVM JDK 24](https://www.graalvm.org/latest/getting-started/) <br>
Set ``GRAALVM_HOME`` as environment path.

Or use sdkman

```bash
sdk install java 24.0.2-graal
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

It will generate a ```graalvm-hello-world``` in ```target``` folder.

## Run Project:

```bash
./target/spring-boot-graalvm-native
```

## Testing

```bash
./mvnw -Pnative test
```