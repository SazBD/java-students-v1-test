package test.exdemo2;

public class Demo {
    public static void main(String[] args) {
        try {
            checkAge(15);
        } catch (AgeException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void checkAge(int age) throws AgeException{
        if(age<18){
            throw new AgeException("年龄不能小于18");
        }
    }
}
