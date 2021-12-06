package package1;

import package2.Module;
import package2.Postgraduate;
import package2.Teacher;
import package2.Undergraduate;

public class Main {
    public static void main(String[] args) {
        Undergraduate john = new Undergraduate();
        john.name = "John";
        john.age = 21;
        john.studentId = 1;
        john.year = 2;
        
        Postgraduate jane = new Postgraduate();
        jane.age = 23;
        jane.name = "Jane";
        jane.studentId = 2;
        jane.prevDegree = "BSc in IT";
        
        john.projectPartner = jane;
        jane.projectPartner = john;
        
        Teacher smith = new Teacher();
        smith.name = "Smith";
        smith.empNo = 1000;
        
        Module programming = new Module();
        Module graphicDesign = new Module();

        smith.module = programming;
        jane.modules[0] = graphicDesign;        
        john.modules[0] = graphicDesign;
        john.modules[1] = programming;
    }
}
