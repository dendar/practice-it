import java.util.Scanner;

public class personDetailScanner {
    public static void main(String[] args){
        String s =  "hello, This is Nadir";
        //create scanner obj pass in it
        Scanner scan =new Scanner(s);
        // Check if the scanner has a token
        System.out.println( "Boolean resualt: " +scan.hasNext());
        //print the string
        System.out.println("String: " +scan.hasNext());
        //scan.close();

        System.out.println("-----Enter Your details------" );
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name =in.next();
        System.out.println("Name: " + name);

        System.out.print("Enter your age: ");
        int age  =in.nextInt();
        System.out.println("Name: " + age);



        System.out.print("Enter your salary: ");
       double d = in.nextDouble();
        System.out.print("Salary: " + d);
    }
}
