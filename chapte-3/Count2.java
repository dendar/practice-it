public class Count2 {
    public  static void main(String[] args){
        for(int i=1; i<5; i++){
            int a = i*2;
            System.out.println("2 times " + i + " = " + a);
            System.out.println();
        }
        //BJP4 Self-Check 2.22: loopTable
        for (int c=1; c<=6; c++){
            int d =c*15-11;
            System.out.println("looptable 1 = " +d);
            System.out.println();
        }

        for (int x=1; x<=6; x++){
            int y =40-x*10;
            System.out.println("looptable 2 = " +y);
            System.out.println();
        }

        for (int f=1; f<=6; f++){
            int e =f*4-11;
            System.out.println("looptable 3 = " +e);
            System.out.println();
        }
        for (int k=1; k<=6; k++){
            int l =100-k*3;
            System.out.println("looptable 4 = " +l);
            System.out.println();
        }
        //BJP4 Self-Check 2.23: completeLoop
        for (int j = 1; j<= 6; j++){
           int b = j*18-22;
           System.out.println("oddstuff = " +b);
            System.out.println();
        }
        //BJP4 Self-Check 2.24: oddStuff
        int number = 4;
        for (int count=1; count <= number; count++){
            System.out.println(number);
            number = number/2;
            System.out.println();
        }
        //BJP4 Self-Check 2.25: numberTotal
        int total =25;
        for (int num = 1; num <=(total/2); num++){
            total =total-num;
            System.out.println(total + " " + num);
            System.out.println();

        }

        //BJP4 Self-Check 2.26: fingerTrap
        System.out.println("+----+");
        for (int i = 1; i <= 3; i++){
            System.out.println("\\    /");
            System.out.println("/   \\");
        }
        System.out.println("+----+");

        for (int i =1; i<=3; i++){
            System.out.print("How many lines \n");
            System.out.print("are printed\n");
        }
        System.out.println();
        //BJP4 Self-Check 2.28: blastOff

        System.out.println("T-minus ");
        for (int i = 5; i >=1; i--){
            System.out.println(i + ", ");
        }
        System.out.println("Blastoff");
        System.out.println();

        //BJP4 Self-Check 2.29: multiplication
        for (int i= 1; i <= 5; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print((i * j) + " ");
            }
            System.out.println();

        }
    }

}
