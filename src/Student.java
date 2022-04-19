import java.util.ArrayList;

public class Student {

    private long idNum;
    private String firstName;
    private String lastName;
    private char gender;
    private String email;
    private ArrayList<Course> coursesRegistered;

    public void printCoursesRegistered(){}

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public char getGender() {
        return gender;
    }

    public String getEmail() {
        return email;
    }

    public long getIdNum(){ return idNum; }
    public ArrayList<Course> getCoursesRegistered(){ return coursesRegistered; }
}
