package helloapp;

public class HelloApp {

    public static void main(String[] args) {

        String names;
        if (args.length == 0) {
            names = "World";
        } else {
            names = String.join(", ", args);
        }

        System.out.println("Hello, " + names + "!");
    }
}