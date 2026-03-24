package helloapp;

public class HelloApp {

    public static void main(String[] args) {

        String result;

        // Default case
        if (args.length == 0) {
            result = "World";
        } else {
            StringBuilder nameBuilder = new StringBuilder();

            // Append all names with ", "
            for (String name : args) {
                nameBuilder.append(name).append(", ");
            }

            // Remove last ", "
            if (nameBuilder.length() > 0) {
                result = nameBuilder.substring(0, nameBuilder.length() - 2);
            } else {
                result = "World";
            }
        }

        System.out.println("Hello, " + result + "!");
    }
}