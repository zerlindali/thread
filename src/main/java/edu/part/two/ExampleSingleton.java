package edu.part.two;

public class ExampleSingleton {
    private static ExampleSingleton singletonInstance;
    private static int accessCount = 0;

    private ExampleSingleton(){
        System.out.println( "I, the ExampleSingleton, am being created");
    }

    public static ExampleSingleton getInstance(){
        accessCount++;
        if(singletonInstance == null) {
            singletonInstance = new ExampleSingleton();
        }
        System.out.println("The sole instance of ExampleSingleton is being retrieved");
        return singletonInstance;
    }

    public int accessCount(){
        return accessCount;
    }
}
