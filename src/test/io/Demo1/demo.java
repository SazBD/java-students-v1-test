package test.io.Demo1;
import java.io.File;
public class demo {
    public static void main(String[] args) throws Exception {
        File dir = new File("mydir");
        dir.mkdir();
        File f = new File(dir,"hello.txt");
        f.createNewFile();
        System.out.println(f.exists());
//        打印绝对路径
        System.out.println(f.getAbsolutePath());
    }

    public static void cleanDir(String path){
        File f = new File(path);
        if(f.isDirectory()){
            File[] files = f.listFiles();
            for(File file:files){
                if(file.isFile()) {
                    file.delete();
                }
            }
            f.delete();
        }

    }
}
