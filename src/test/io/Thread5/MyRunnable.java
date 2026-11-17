package test.io.Thread5;

public class MyRunnable implements Runnable{
    @Override
    public void run(){
        for (int i = 1; i < 4; i++) {
            System.out.println(Thread.currentThread().getName()+" "+i);
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){e.printStackTrace();}
        }
    }
}
