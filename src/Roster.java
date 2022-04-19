import java.sql.ClientInfoStatus;
import java.util.ArrayList;
import java.util.LinkedList;

public class Roster {

    private LinkedList<Student> studentsList;
    private int size;

    /** Sets data members to default values. */
    public Roster(){
        studentsList = new LinkedList<Student>();
        size = 0;
    }

    /** Adds Student object provided to studentList if not already existed.
     * If object was added returns true, else returns false. */
    public boolean addStudent(Student st){
        if (studentsList.contains(st))return false;
        else return studentsList.add(st);

    }

    /** Deletes Student object from studentList according to provided idNum.
     *  If object was deleted returns true, else returns false. */
    public boolean deleteStudent(long id){
        int i = searchStudent(id);
        if (i == -1)return false;
        else {
            studentsList.remove(i);
            return true;
        }
    }

    /** test */

    /** returns index of specified Student object in studentList according to provided idNum.
     * If object is not found returns -1. */
    public int searchStudent(long id){
        for (int i = 0;i < size;i++){
            Student st = studentsList.get(i);
            if (st.getIdNum() == id)return i;
        }
        return -1;
    }

    /** returns true if studentList is empty, else returns false */
    public boolean isEmpty(){
        return size == 0;
    }

    /**  Returns instance variable size */
    public int listSize() { return size; }

    /** Returns Student object in provided index from StudentList */
    public Student getStudent(int i){
        return studentsList.get(i);
    }

    /** Adds Course object provided to certain Student object in studentList according to idNum provided if and only if:
     * (a)	Student object with the provided idNum exists in the studentsList.
     * (b)	Course object provided does not exist in the coursesRegistered list for the Student.
     * (c)	After adding the Course object, the number of credits, do not exceed 18.
     *
     * If Course object is added returns true, else returns false. */
    public boolean addCourse(Course c, long id){
        int i = searchStudent(id);
        if (i == -1)return false;
        ArrayList<Course> cList = studentsList.get(i).getCoursesRegistered();
        if (cList.contains(c))return false;
        int sum = c.getCredits();
        for (int j = 0;j <cList.size();j++){
            sum += cList.get(i).getCredits();
        }
        if (sum > 18)return false;
        return cList.add(c);
    }

    /** Deletes Course object from certain Student object in studentList if and only if:
     * (a) Student object with provided idNum exists in studentList.
     * (b) Course object provided exists in Student object selected.
     *
     * if Course object is deleted returns true, else returns false. */
    public boolean deleteCourse(Course c, long id){
        int i = searchStudent(id);
        if (i == -1)return false;
        ArrayList<Course> cList = studentsList.get(i).getCoursesRegistered();
        if (!cList.contains(c))return false;
        return cList.add(c);
    }

    /** prints all student details and courses */
    public void printStudentDetails(long id){
        int i = searchStudent(id);
        if (i == -1) System.out.println("Student not found");
        else {
            Student st = studentsList.get(i);
            System.out.println("---Student details---\nID number:" + st.getIdNum()
                    + "\nName: " + st.getFirstName() + " " + st.getLastName()
                    + "\nGender: " + st.getGender()
                    + "\nEmail: " + st.getEmail());
            st.printCoursesRegistered();
        }
    }
}
