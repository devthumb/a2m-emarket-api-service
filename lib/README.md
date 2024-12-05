# External Library maven install

```bash
cd ${project.home}/api-service
```

- com.kdn.kgrid.mg:kgrid-mg-common:1.0
  - kdn DataConverter4IEC61850 관련 dependency
  - rt_da data 변환 시 사용
```bash
mvn install:install-file \
    -Dfile=lib/kgrid-mg-common-1.0.jar \ 
    -DgroupId=com.kdn.kgrid.mg \
    -DartifactId=kgrid-mg-common \
    -Dversion=1.0 \
    -Dpackaging=jar
```

- org.hyperic:sigar:1.6.4
  - kgrid-mg-common 관련 의존성
  - maven central repository 에 없어서 직접 설치  
```bash
mvn install:install-file \                                              
    -Dfile=lib/sigar-1.6.4.jar \
    -DgroupId=org.hyperic \
    -DartifactId=sigar \
    -Dversion=1.6.4 \
    -Dpackaging=jar
```




## hyperic-sigar install

- https://github.com/hyperic/sigar


```bash
# git clone
git clone https://github.com/hyperic/sigar.git
```

```bash
cd sigar
```

```bash
# mvn install
mvn clean install
```

> [ ! ] pom.xml 누락 되서 error

```bash
ls -al
```

```bash
vim pom.xml
```

```xml
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0
                             http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>

    <groupId>org.hyperic</groupId>
    <artifactId>sigar</artifactId>
    <version>1.6.4</version>
    <packaging>jar</packaging>

    <name>Sigar</name>

    <dependencies>
        <!-- Sigar 의존성 추가 -->
    </dependencies>

    <build>
        <plugins>
            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-compiler-plugin</artifactId>
                <version>3.8.1</version>
                <configuration>
                    <source>1.8</source>
                    <target>1.8</target>
                </configuration>
            </plugin>
        </plugins>
    </build>
</project>
```

```bash
mvn clean install
```