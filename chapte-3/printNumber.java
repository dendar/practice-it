import java.util.Scanner;

public class printNumber {
    public static void main(String[] args) {
        printNumbers(15);
        printNumbers(5);

    }
        public static void printNumbers(int number ){
        //Scanner c1 = new Scanner(System.in);
           // System.out.println("type number ");
           // int number = c1.nextInt();

            for (int i = 1; i <= number; i++) {
                System.out.print("[");
                System.out.print(i);
                System.out.print("] ");
            }
            System.out.println();


        }


    }


