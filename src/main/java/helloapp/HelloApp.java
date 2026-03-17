package helloapp;

public class HelloApp {

    public static void main(String[] args) {

        // Check if user passed argument
        if (args.length > 0) {
            String name = args[0];
            System.out.println("Hello, " + name + "!");
        } else {
            // Default case (same as UC1)
            System.out.println("Hello, World!");
        }

    }
}