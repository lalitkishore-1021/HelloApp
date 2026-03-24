package helloapp;

public class HelloApp {

    public static void main(String[] args) {

        String names;

        // If no arguments → default
        if (args.length == 0) {
            names = "World";
        } else {
            // Join all names with comma
            names = String.join(", ", args);
        }

        System.out.println("Hello, " + names + "!");
    }
}