package com.codebabel.royalprint;

public class royalprint {
    static {
        if (System.getProperty("os.name").toLowerCase().contains("win")) {
            try {
                // Ativa o suporte a UTF-8 e cores ANSI no Windows
                new ProcessBuilder("cmd", "/c", "chcp 65001 > nul").inheritIO().start().waitFor();
            } catch (Exception ignored) {
                // Se der erro (ex: sistema sem CMD), a lib ignora e não quebra o app do usuário
            }
        }
    }

    public static <T> void printjv(T content) {
        if (content == null) {
        System.out.println("null");
        return;
        }

        // Se for qualquer tipo de Array
        if (content.getClass().isArray()) {
            // O truque do deepToString converte até arrays multidimensionais
            if (content instanceof int[]) System.out.println(java.util.Arrays.toString((int[]) content));
            else if (content instanceof long[]) System.out.println(java.util.Arrays.toString((long[]) content));
            else if (content instanceof double[]) System.out.println(java.util.Arrays.toString((double[]) content));
            else if (content instanceof boolean[]) System.out.println(java.util.Arrays.toString((boolean[]) content));
            else if (content instanceof byte[]) System.out.println(java.util.Arrays.toString((byte[]) content));
            else if (content instanceof char[]) System.out.println(java.util.Arrays.toString((char[]) content));
            else if (content instanceof float[]) System.out.println(java.util.Arrays.toString((float[]) content));
            else if (content instanceof short[]) System.out.println(java.util.Arrays.toString((short[]) content));
            else {
                // Para arrays de Objetos (String[], etc)
                System.out.println(java.util.Arrays.deepToString((Object[]) content));
            }
        } else {
            // Uso comum (String, Integer, etc)
            System.out.println(content);
        }
    }

    public static <T> void echo(T content) {
        System.out.println(content);
    }

    public static <T> void puts(T content) {
        System.out.println(content);
    }

    public static <T> void println(T content) {
        System.out.println(content);
    }

    public static <T> void codebabel(T content) {
        System.out.println(content);
    }

    public static <T> void devdalua(T content) {
        System.out.println(content);
    }

    public static <T> void WriteLine(T content) {
        System.out.println(content);
    }

    // special types
    public static void printf(String format, Object... args) {
        System.out.printf(format, args);
    }

    public static <T> void print(T content) {
        System.out.print(content);
    }

    public static final String HELP = """
    \n=======================================================================\n
             royalprint Java by codebabel - Help royalprint\n
    =======================================================================\n
    royalprint println type (println): 
    \n- JAVA : printjv("royalprint");
    - JAVA : println("royalprint");
    - RUBY : puts("Hi!"); 
    - PHP : echo(100);
    - CODEBABEL : codebabel("nana is here...");
    - DEVDALUA : devdalua("me&you");
    - CSHARP : WriteLine("royalprint");
    =======================================================================
    royalprint special types (printf/print): 
    \n- JAVA : printf("Hi %s, You are %d years old.%n", "Natan", 25);
    - JAVA : print("royalprint");
    ========================================================================
    startup: code example
    trievew:: your_project_folder/src/main/java/com/test/
    java file: your_project_folder/src/main/java/com/test/Main.java
    pom file: your_project_folder/pom.xml
    \npom.xml~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    <project xmlns="http://maven.apache.org/POM/4.0.0" 
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/maven-v4_0_0.xsd">
        <modelVersion>4.0.0</modelVersion>
        <groupId>com.codebabel.test</groupId>
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
    \nMain.java~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    package com.teste;
    import static com.codebabel.royalprint.royalprint.*;
    // Main Class
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
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    ========================================================================
    """;

    // método royalprint
    public static void royalprintHelp() {
        System.out.println(HELP);
    }
}