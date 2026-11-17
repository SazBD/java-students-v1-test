package test.io.Demo4;
import java.io.*;
import java.util.Properties;

public class Demo {
    public static void main(String[] args) {
        Properties p = new Properties();
        p.setProperty("url","jdbc:mysql://localhost:3306/test");
        System.out.println(p.getProperty("url"));
        try {
            p.store(new FileOutputStream("db.properties"),null);
        } catch (Exception e) {
            e.printStackTrace();
        }
        try{
            p.load(new FileInputStream("db.properties"));
            System.out.println(p.getProperty("url"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
