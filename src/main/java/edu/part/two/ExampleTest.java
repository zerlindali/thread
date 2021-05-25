package edu.part.two;

public class ExampleTest {
public static void main(String[] args) {
ExampleSingleton s = ExampleSingleton.getInstance();
System.out.println("The ExampleSingleton has been "
+ "accessed via the getInstance() method "
+ s.accessCount()
+ " time(s)");
s = ExampleSingleton.getInstance();
System.out.println("The ExampleSingleton has been "
+ "accessed via the getInstance() method "
+ s.accessCount()
+ " time(s)");
}
}
