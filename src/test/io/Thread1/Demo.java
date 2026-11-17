package test.io.Thread1;

public class Demo {
    public static void main(String[] args) {
        MyTheard mt = new MyTheard();
        mt.run();
        mt.start();
    }
}
