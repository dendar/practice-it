public class StarFigure{
    public static void main(String[] args){
        star10();
        star5();
        System.out.println();
        star10();
        star5();
        star10();
        System.out.println();
        star3();
    }
    public static void star10(){
        System.out.println("*****");
        System.out.println("*****");


    }
    public static void star5(){
        System.out.println(" * *");
        System.out.println("  *");
        System.out.println(" * *");


    }
    public static void star3(){
        System.out.println("  *");
        System.out.println("  *");
        System.out.println("  *");
        star10();
        star5();


    }



}