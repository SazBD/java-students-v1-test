package test.io.IOdemo1;

import java.io.File;
import java.io.IOException;

public class FileDemo {
    public static void main(String[] args) {
        // 1. 创建 File 对象（只代表路径，此时硬盘上可能还没有这个文件）
        File file = new File("test.txt");

        try {
            // 2. 【判断与创建】
            if (!file.exists()) { // 如果文件不存在
                boolean isCreated = file.createNewFile(); // 创建空文件
                System.out.println("创建文件成功？" + isCreated);
            }

            // 3. 【获取信息】
            System.out.println("文件名：" + file.getName());
            System.out.println("绝对路径：" + file.getAbsolutePath());
            System.out.println("文件大小（字节）：" + file.length()); // 此时是0

            // 4. 【删除文件】
            // file.delete(); // 把这一行取消注释，文件就会被删掉
            // System.out.println("文件删了吗？" + !file.exists());

        } catch (IOException e) {
            System.out.println("出错了：" + e.getMessage());
        }
    }
}