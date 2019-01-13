import java.awt.*;
import java.util.Scanner;

public class sumNumber {
    public static void main(String[] args){
        Scanner  input = new Scanner(System.in);
        System.out.println("low?  ");
        int low = input.nextInt();
        System.out.println("high?  ");
        int high = input.nextInt();
        int sum= 0;

        for ( int i =low; i<=high; i++){
            sum += i;
        }
        System.out.println("sum = " + sum);




    }




}
