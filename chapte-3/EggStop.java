public class EggStop {
    public static void main(String[] args){
        top();
        bottom();
        System.out.println();
        top();
        bottom();
        plus();
        System.out.println();
        top();
        stop();
        bottom();
        plus();




    }
    public static void top(){
        System.out.println("  ______");
        System.out.println(" /      \\");
        System.out.println("/        \\");
    }
    public static void bottom(){
        System.out.println("\\        /");
        System.out.println(" \\______/");

    }
    public static void plus() {
        System.out.println("+--------+");
    }
    public static void stop() {
        System.out.println("|  STOP  |");
    }
}
