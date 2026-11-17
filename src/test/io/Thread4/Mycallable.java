package test.io.Thread4;

import java.util.concurrent.Callable;
public class Mycallable implements Callable<Integer>{
    @Override
    public Integer call(){
        int sum=0;
        for (int i = 0; i < 101; i++) {
            sum+=i;
        }
        return sum;
    }
}
