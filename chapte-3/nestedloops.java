
//BJP4 Self-Check 2.30: nestedLoops

public class nestedloops {
    public static void main(String[] args){
        for (int a= 1;  a <= 10; a++){
            for (int b = 1; b <=10 - a; b++ ){
                System.out.print(" ");

            }
            for (int b = 1; b <= 2 * a - 1; b++){
                System.out.print("*");
            }
            System.out.println();

        }
       /* for (int c =1; c<=5; c++){
            System.out.println("       ***");
        } */


    }

}

