public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("hello java");
        System.out.println("\"Quotes\"");
        System.out.println("Slashes \\//");

        System.out.println("How '\"confounding' \"\\\" it is!");
        System.out.println("Slashes \\//");
        System.out.println("Shaq \nin is 7'1");
        System.out.println("The string \"\" is an empty message.");
        System.out.println("\\'\"\"");

        System.out.println("\\\\");
        System.out.println("'");
        System.out.println("b \ta\tb\tc");
        System.out.println("\"\"\"");
        System.out.println("sin, ");
        System.out.println("C:\nin\the downward spiral\n");
        first();
        third();
        second();
        third();

    }
    public static void first(){
        System.out.println("1");
    }
    public static void second(){
        System.out.println("2");
        first();
    }
    public static void third(){
        System.out.println("3");
        first();
        second();
    }

}

