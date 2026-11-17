package project.v1;

import java.util.ArrayList;
import java.util.List;

public class StudentService {
    private List<Student> stuList= FileUtil.load();

    public void addStudent(Student stu){
        if(findById(stu.getId()) != null){
            throw new DuplicateIdException("ID已存在");
        }
        stuList.add(stu);
        FileUtil.save(stuList);
    }

    public List<Student> getStuList(){
        return stuList;
    }

    public Student findById(String id){
        for(Student stu : stuList){
            if(stu.getId().equals(id)){
                return stu;
            }
        }
        return null;
    }

    public boolean deleteById(String id){
        Student stu = findById(id);
            if(stu!=null){
                stuList.remove(stu);
                FileUtil.save(stuList);
                return true;
            }
        return false;
    }

    public boolean updateName(String id,String name){
        Student stu = findById(id);
        if(stu!=null){
                stu.setName(name);
                FileUtil.save(stuList);
                return true;
            }
        return false;
    }
}
