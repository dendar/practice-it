public class TwoRockets {
    public static void main(String[] arg){
    top();
    middle();
    middle2();
    middle();
    top();
    
    }
    public static void top() {
        System.out.println("   /\\       /\\");
        System.out.println("  /  \\     /  \\");
        System.out.println(" /    \\   /    \\");
    }
    public static void middle() {

            System.out.println("+------+ +------+");
            System.out.println("|      | |      |");
            System.out.println("|      | |      |");
            System.out.println("+------+ +------+");
        }
    public static void middle2(){

        System.out.println("|United| |United|");
        System.out.println("|States| |States|");


    }
}
