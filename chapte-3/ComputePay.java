public class ComputePay{
        public static void main(String[] args){
        int firstday = 4;
        int secondday = 5;
        int thirdday = 8;
        int fourthday = 4;
        int hours = firstday + secondday + thirdday +fourthday;

        System.out.println("My total hours worked:");
        System.out.println(hours);
        double hourly  = 8.75;
        System.out.println("My hourly salary:");
        System.out.println("$"+hourly);
        double total = hours * hourly;
        System.out.println("My total pay:");
        System.out.println(total);
        double tax = total*0.20;
        System.out.println("My taxes owed:"); // 20% tax
        System.out.println(tax);
        }
        }