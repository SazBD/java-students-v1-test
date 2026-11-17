package test.exDemo1;

// 1. 业务逻辑类（被调用的方法）
class UserService {

    // 【看这里：throws】
    // 方法签名上写了 throws Exception，意思是：我这个方法不保证一定成功，可能会抛异常！
    // 调用我的人，必须用 try-catch 来处理，否则编译报错。
    public void register(String username, String password) throws Exception {

        // 校验逻辑：如果密码长度小于 6 位
        if (password.length() < 6) {

            // 【看这里：throw】
            // 遇到不合法的情况，直接 throw 制造一个异常对象，并把它扔出去！
            // 这行代码一执行，这个方法立刻结束，下面的代码不再运行。
            throw new Exception("密码长度不能少于 6 位！");
        }

        System.out.println("✅ 用户 " + username + " 注册成功！");
    }
}

// 2. 调用者（模拟 Controller 或 Main）
public class aaa {
    public static void main(String[] args) {
        UserService service = new UserService();

        System.out.println("--- 开始注册 ---");

        // 【为什么要有 try-catch？】
        // 因为 UserService 的 register 方法声明了 throws Exception，
        // 编译器强制要求调用者必须“接住”这个可能扔出来的炸弹。
        try {
            service.register("张三", "123"); // 故意传一个 3 位的密码
        } catch (Exception e) {
            // 这里就接住了 UserService 扔出来的那个 Exception
            System.out.println("❌ 注册失败：" + e.getMessage());
        }

        System.out.println("--- 注册流程结束 ---");
    }
}