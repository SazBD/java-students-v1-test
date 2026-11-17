package test.exDemo1;

public class Demo2 {
    // throws 在这里挂警告牌，告诉 main 我不处理
    public static void login(String username) throws Exception{
        if (username==null){
            throw new Exception("用户名不能为空");
        }
    }

    public static void main(String[] args) {
        try {
            login(null);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
