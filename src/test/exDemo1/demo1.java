package test.exDemo1;

public class demo1 {
    public static void check(int num) throws Exception{
        if(num<0){
            throw new Exception("数字不能为负数");
        }
    }

    public static void main(String[] args){
//        受检异常，编译直接爆红
        try{
            check(-1);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
//        非受检异常，编译不会报错，运行会报错，程序停止
        String s =null;
        try{
            s.length();
        }
        catch(Exception e){
            System.out.print(e.getMessage());
        }

    }
    
}
