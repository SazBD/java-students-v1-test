package test.io.Demo3;
import java.io.*;
public class Demo {
    public static void main(String[] args) {
        File f = new File("d.txt");
        try(FileWriter fw = new FileWriter(f)){
            fw.write("第一行\n");
            fw.write("第二行\n");
            fw.write("第三行\n");

        }catch (Exception e){e.printStackTrace();}

        try(FileReader fr = new FileReader(f)){
            int a;
            while ((a = fr.read()) != -1){
                System.out.print((char)a);
            }
        }catch (Exception e){e.printStackTrace();}

        try(BufferedReader br = new BufferedReader(new FileReader(f))){
            String l;
            int a=0;
            while((l=br.readLine()) != null){
                System.out.println(l);
                a++;
            }
            System.out.println("行数为："+a);
        }catch(Exception e){e.printStackTrace();}
    }
}
