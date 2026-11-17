package test.io.Demo2;
import java.io.*;

public class Demo {
    public static void main(String[] args) {
        File f = new File("b.txt");
        try(FileOutputStream fos = new FileOutputStream(f);){
            fos.write('A');
            fos.write('B');
            fos.write('C');
        }catch (Exception e){
            e.printStackTrace();
        }

        try(FileInputStream fis = new FileInputStream(f);){
            int a;
            while ((a = fis.read()) != -1){
                System.out.print((char)a);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
