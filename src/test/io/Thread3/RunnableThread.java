package test.io.Thread3;

public class RunnableThread implements Runnable{
    int tickets = 3;
    @Override
    public void run(){
        while(tickets>0){
            System.out.println(Thread.currentThread().getName()+"还剩"+tickets--+"张票");
        }
    }
}
