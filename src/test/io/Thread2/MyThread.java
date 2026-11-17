package test.io.Thread2;

public class MyThread implements Runnable{
    @Override
    public void run() {
        for (int i = 1; i < 4; i++) {
            System.out.println(Thread.currentThread().getName()+" "+i);
        }
    }
}
