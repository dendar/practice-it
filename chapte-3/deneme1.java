import java.io.*;
import java.util.zip.*;
class DeCompress{
    public static void main(String args[]){
        try{
            FileInputStream fin=new FileInputStream("def.txt");
            InflaterInputStream in=new InflaterInputStream(fin);
            FileOutputStream fout=new FileOutputStream("D.java");

            int i;
            while((i=in.read())!=-1){
                fout.write((byte)i);
                fout.flush();
            }
            fin.close();
            fout.close();
            in.close();
        }catch(Exception e){System.out.println(e);}
        System.out.println("rest of the code");
    }
}