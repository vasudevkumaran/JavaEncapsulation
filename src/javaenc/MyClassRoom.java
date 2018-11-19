package javaenc;

public class MyClassRoom {

    private Student student;

    public MyClassRoom(Student student) {
        this.student = student;
    }

    public void printStudentRecords() {
        System.out.println(student.getFirstName());
        System.out.println(student.getLastName());
        System.out.println(student.getRollNum());
        System.out.println(student.getSubject());
        System.out.println(student.isIsPassed());
    }

    public void printAllStudents(Student[] students) {

        for (int i = 0; i < students.length; i++) {
            Student student1 = students[i];
            System.out.println(student1.getFirstName());
            System.out.println(student1.getLastName());
            System.out.println(student1.getRollNum());
            System.out.println(student1.getSubject());
            System.out.println(student1.isIsPassed());
        }

    }
}
