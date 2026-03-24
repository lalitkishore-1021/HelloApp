package helloapp;

public class HelloApp {

    public static void main(String[] args) {

        String names;

        // Default case
        if (args.length == 0) {
            names = "World";
        } else {
            StringBuilder nameBuilder = new StringBuilder();
            boolean first = true;

            // Enhanced for loop
            for (String name : args) {
                if (!first) {
                    nameBuilder.append(", ");
                }
                nameBuilder.append(name);
                first = false;
            }

            names = nameBuilder.toString();
        }

        System.out.println("Hello, " + names + "!");
    }
}