package day4;

import java.util.List;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class JavaBeansExample {
    static class StudentBean {
        private int studentid;
        private String name;
        private int age;        
        public StudentBean() {}

        public int getStudentid() { return studentid; }
        public void setStudentid(int studentid) { this.studentid = studentid; }
        public String getName() { return name; }
        public void setName(String name) { this.name = name;}
        public int getAge() { return age; }
        public void setAge(int age) { this.age = age; }

        @Override
        public String toString() {
            return "{"+studentid+", "+name+", "+age+"}";
        }
    }
    
    static List<StudentBean> list = new ArrayList<>();
    
    public static void main(String[] args) throws Exception {
        File file = new File("students.txt");
        Scanner in = new Scanner(file);
        int count=0;
        
        while (in.hasNextLine()) {
            String[] line = in.nextLine().split(",");
            int studentid = Integer.parseInt(line[0]);
            String name = line[1];
            int age = Integer.parseInt(line[2]);
            
            StudentBean student = new StudentBean();
            student.setStudentid(studentid);
            student.setName(name);
            student.setAge(age);
            list.add(student);
        }
       
        System.out.println(list);
    }
}
