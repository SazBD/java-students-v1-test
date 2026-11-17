package test.io.Thread1;

public class MyTheard extends Thread{
    @Override
    public void run(){
        for (int i = 1; i < 4; i++) {
            System.out.println(Thread.currentThread().getName()+" "+i);
        }
    }
}
