package Database;

import Models.Student;
import Models.Class;
import java.util.ArrayList;
import java.util.List;

public class Data {

    private List<Student> students;
    private List<Class> listClass;

    public Data(){
        this.students = new ArrayList<Student>();
        this.listClass = new ArrayList<Class>();
        for (int i = 0; i <= 10; i++) {
           this.students.add(new Student(i, "Neyver"+i , "Fulguera"+i));
        }
        for (int i = 1; i <= 10; i++) {
           this.listClass.add(new Class(i, "programcion"+i , "programacion detail"+i));
        }
    }
    public List students() {
        return this.students;
    }

    public List listClass() {
        return this.listClass;
    }
    
    public void addStudent(Student newStudent) {
        this.students.add(newStudent);
    }
}
