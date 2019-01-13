
/*
Write a method called printPowersOf2 that accepts a maximum number as an argument and prints each power of 2 from 20 (1) up to that maximum power, inclusive. For example, consider the following calls:


printPowersOf2(3);
printPowersOf2(10);
These calls should produce the following output:

1 2 4 8
1 2 4 8 16 32 64 128 256 512 1024

 */

public class printPowersOf2 {

    public static void main(String[] args){
        printPowersOf2(4);
        printPowersOf2(11);
        printPowersOf2(9);


    }
    public  static void printPowersOf2(int number){
        int power= 1;
        System.out.print(power +  " ");
        for(int i =1; i<=number; i++){

            power = (power)*(2);
            System.out.print(power +  " ");

        }

        System.out.println();

    }

}
