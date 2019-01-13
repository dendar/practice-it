public class Receipt {
    public static void main(String[] args){
        int meal1 = 38;
        int meal2 = 40;
        int meal3 = 30;
        int Subtotal = meal1+meal2+meal3;

        System.out.println("Subtotal:");
        System.out.println(Subtotal);

        double Tax = Subtotal*0.08;
        System.out.println("Tax");
        System.out.println(Tax);

        double Tip = Subtotal*0.15;
        System.out.println("Tip");
        System.out.println(Tip);

        System.out.println("Total");

        double Total = Subtotal+(Subtotal*0.08)+(Subtotal*0.15);
        System.out.println(Total);



    }
}
