
//BJP4 Self-Check 3.26: RobertPaulson

import java.util.Scanner;

public class robertPaulson {
    public static void main(String[] args){
        Scanner  c1 = new Scanner(System.in);
        System.out.print("What is your phrase? ");
        String name = c1.nextLine();
        System.out.print("How many times should I repeat it? ");
        int times = c1.nextInt();
        for(int i= 1; i<=times; i++) {
            System.out.println(name);
        }

           /* Write code to read an integer from the user, then print that number multiplied by 2. You may assume that the user types a valid integer. A sample run of the code would produce the following:

            Type an integer: 4
            4 times 2 = 8*/


            Scanner con = new Scanner(System.in);
            System.out.print("Type an integer: ");
            int number = con.nextInt();
            System.out.println(number + " times 2 = " + (number * 2));







        /*Scanner scanner = new Scanner(System.in);
        System.out.print("What is your phrase?");
        String name =  scanner.nextLine();

        System.out.print("How many times should I repeat it?");
        int time = scanner.nextInt();
        for(time=1; time<=3; time++) {
            System.out.println(name);
        }

            Scanner s1 = new Scanner(System.in);
        System.out.println("What is your phrase?");
        String test2 =  s1.nextLine();

        System.out.println("How many times should I repeat it?");
        int t2 = scanner.nextInt();
        for(t2=1; t2<=5; t2++) {
            System.out.println(test2);

        }
    */

     }
}
