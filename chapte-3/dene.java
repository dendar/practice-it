public class dene {
    public static void main(String[] args){
    printPowersOf2(3);
    printPowersOf2(10);
}

    public static void printPowersOf2(int number){
        int power = 1;
        System.out.print(power + " ");
        for(int i = 1; i <= number; i++){
            power = power * 2;
            //power *= 2:
            System.out.print(power + " ");
        }
        System.out.println();
    }
}
