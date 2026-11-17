package project.v1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileUtil {
    public static void save(List<Student> list) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("students.txt"))) {
            for (Student s : list) {
                bw.write(s.getId() + "," + s.getName() + "," + s.getAge() + "\n");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static List<Student> load() {
        List<Student> list = new ArrayList<>();
        File f = new File("students.txt");
        if (!f.exists()) {
            return list;
        }
        try (BufferedReader br = new BufferedReader(new FileReader(f))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                Student s = new Student(parts[0], parts[1], Integer.parseInt(parts[2]));
                list.add(s);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
}
