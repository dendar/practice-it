public class badNews {
    public static final int MAX_ODD = 21;
    public  static void  writeOdds(){

        //print each odd number
        for (int count =1; count <=(MAX_ODD); count++){
            System.out.print(count + " ");
            //count =count +2;
            //System.out.print();
        }
        //print the last odd number
        //System.out.print(count+2);
    }
    public static void main(String[] args){
        //write all odds up to 21
        writeOdds();
        System.out.println();
        //now write all odds up to 11
        for(int count =1; count<=11; count+=2){
            System.out.print(count + " ");
        }
        //MAX_ODD =11;
        //writeOdds();
    }



}
