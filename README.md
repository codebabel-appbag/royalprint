#  [![](https://i.postimg.cc/wBPhM5Lv/jackal-11-24-v2-32-inverted.png)]()  CODEBABEL

# royalprint java: 1.0.0
## 📃 Description / Descrição
~~~
{EN}
royalprint is perfect for simplifying the information that needs to go to the console,
similar to printing in PHP echo("Hi"), println("Hello ..."), puts("She Knows")... and more.
special: printjv("Hello ...") print text, array, numbers...

{PTBR}
royalprint é perfeita para simplificar as informações que precisam ir para o console,
com similaridade de impressão em PHP echo("Hi"), println("Oi"), puts("She Knows")... e mais.
especial: printjv("Hello ...") printa texto, array, números...
~~~


![](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)


[![](https://i.postimg.cc/HLxCjz9S/royalprint.png)]()

## 🌐 Content / Conteúdo
* [Installation](#installation)
* [All print formats](#formats)
* [Basic use](#basic)
* [Complete use](#complete)
* [pom.xml](#pom)
* [Change log](#changelog)

### installation
## 💻 Installation / Instalação:
> by pom.xml and import

### formats
## 📊 All print formats / Todos os formatos
~~~java
// royalprint println like
printjv("royalprint");
puts("Hi!");              // Ruby
echo(100);                // PHP
println("royalprint");    // Java println
codebabel("nana is here...");  
devdalua("me&you");
WriteLine("royalprint");
            
// royalprint special types
printf("Olá %s, você tem %d anos.%n", "Igor", 25);
print("royalprint");

// royalprint help
royalprint();

// como era no passado/how it was in the past.
System.out.println("royalprint");
~~~

### treeview
## 🔹🔹 treeview
~~~
trievew::
    your_project_folder/src/main/java/com/test/

java file:
    your_project_folder/src/main/java/com/test/Main.java

pom file:
    your_project_folder/pom.xml
~~~

### basic
## 🔹🔹 Basic use
~~~java
package com.teste;
import static com.codebabel.royalprint.royalprint.*;
public class Main {
    public static void main(String[] args) {
    // royalprint println like
    printjv("royalprint");  // * special for array and print
        
    // royalprint help
    royalprintHelp();
    }
}
~~~

### complete
## 🔹 Complete use
~~~java
package com.teste;
import static com.codebabel.royalprint.royalprint.*;
public class Main {
    public static void main(String[] args) {
        // royalprint println like
        printjv("royalprint");
        
        int[] numbers = {1, 2, 3, 4, 5}; // array print
        printjv(numbers);
        
        String[] names = {"Java", "CodeBabel"};
        printjv(names);
        
        puts("Hi!"); // Ruby
        
        echo(100);    // PHP
        
        println("royalprint");    // Java println
        
        codebabel("nana is here...");  
        
        devdalua("me&you");
        
        WriteLine("royalprint");
        
        // royalprint special types
        printf("Hi %s, You are %d years old.%n", "Natan", 25);
        print("royalprint");
        
        // royalprint help
        royalprintHelp();
        
        // como era no passado/how it was in the past.
        System.out.println("royalprint");
    }
}
~~~

### pom
## 🔹 pom.xml
~~~xml
<project xmlns="http://maven.apache.org/POM/4.0.0" 
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/maven-v4_0_0.xsd">
    <modelVersion>4.0.0</modelVersion>
    <groupId>com.test</groupId>
    <artifactId>app-teste</artifactId>
    <version>1.0.0</version>
    <properties>
        <maven.compiler.release>17</maven.compiler.release>
        <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
    </properties>
    <repositories>
        <repository>
            <id>jitpack.io</id>
            <url>https://jitpack.io</url>
        </repository>
    </repositories>
    <dependencies>
        <dependency>
            <groupId>com.github.codebabel-appbag</groupId>
            <artifactId>royalprint</artifactId>
            <version>1.0.0</version>
        </dependency>
    </dependencies>
</project>
~~~

### changelog
## 🚨 Change Log
|Version| Version Name | Upgrade Latency |
|-------|--------------|-----------------|
| 1.0.0 |  royalprint  |    START LIB    |

## 💜 Thank's 🧡
~~~
{EN}
Thank you for using the royalprint library.
see ya!

{PTBR}
Valeu por usar a biblioteca royalprint.
tmj!
~~~
© Copyright 2026, Codebabel royalprint cross-language library.
