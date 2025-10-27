package com.example;



/**
* Simple Java application with a tiny API so CI can run unit tests.
*/
public class App {
public static void main(String[] args) {
System.out.println("Hello from simple-java-maven-ci-cd!");
}


/**
* Adds two integers and returns the result.
* Used by unit tests to demonstrate CI test runs.
*/
public int add(int a, int b) {
return a + b;
}
}