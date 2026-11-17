package test.io.Thread4;

import java.util.concurrent.FutureTask;

public class Demo {
    public static void main(String[] args) {
        FutureTask <Integer> ft = new FutureTask<>(new Mycallable());
        new Thread(ft).start();
        try {
            System.out.println(ft.get());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
