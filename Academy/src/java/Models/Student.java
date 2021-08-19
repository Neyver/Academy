package Models;

public class Student {

    public int id;
    public String lastname;
    public String firstname;

    public Student(int id, String firstName, String lastName) {
        this.firstname = firstName;
        this.lastname = lastName;
        this.id = id;
    }

    public Student() {
        this.firstname = "new";
        this.lastname = "new";
        this.id = 100;
    }

    public int getId() {
        return this.id;
    }

    public String getLastname() {
        return this.lastname;
    }

    public String getFirstname() {
        return this.firstname;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setFirstname(String firstname) {
        this.firstname =firstname;
    }
}
