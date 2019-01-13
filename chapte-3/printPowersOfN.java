public class printPowersOfN {
    public static void main(String[] args){
        printPowersOfN(4, 3 );
        printPowersOfN(5, 6);
        printPowersOfN(-2, 8);
    }
    public  static void printPowersOfN(int number, int power){

        for(int i =0; i<=power; i++){


            System.out.print(((int) Math.pow(number, i)) + " ");

        }



        System.out.println();

    }
}
