
package javaenc;

import java.util.ArrayList;


public class JavaEnc {

    
    public static void main(String[] args) {
        // TODO code application logic 
        Student s1 = new Student();
        s1.setFirstName("Vasudev");
        s1.setLastName("Kumaran");
        s1.setRollNum(128);
        s1.setSubject("Math");
        s1.setIsPassed(true);
        
        Student s2 = new Student();
        s2.setFirstName("Radha");
        s2.setLastName("Krishnan");
        s2.setRollNum(324);
        s2.setSubject("Physics");
        s2.setIsPassed(true);
        
        //String[] students = new String[]{"Vasudev","Kumaran"};
        Student[] students = new Student[] {s1,s2};
        MyClassRoom mcr = new MyClassRoom(s1);
        mcr.printStudentRecords();
        mcr.printAllStudents(students);
        
        ArrayList<Student> list = new ArrayList<Student>(); // 0
        list.add(s1); // 1 => 0
        list.add(s2); // 2 => 1
        
        for (int i = 0; i < list.size(); i++) {
            Student student = list.get(i);
            System.out.println(student.getFirstName());
            System.out.println(student.getLastName());
            System.out.println(student.getRollNum());
            System.out.println(student.getSubject());
            System.out.println(student.isIsPassed());
        }
    }
    
}
