
import java.util.ArrayList;

public class Student {
    /** Student's id number */
    private long idNum;
    /** Student's first name */
    private String firstName;
    /** Student's last name */
    private String lastName;
    /** Student's gender */
    private char gender;
    /** Student's email */
    private String email;
    /** courses that are registered to Student */
    private ArrayList<Course> coursesRegistered;

    /** Default constructor without parameters. */
    public Student()
    {
        this(0, 'X', "notAssigned", "notAssigned", "notAssigned");
    }

    /** Constructor with 5 parameters.
     * @param idNum ID number */
    public Student(long idNum,char gender,String firstName,String lastName,String email)
    {
        this.idNum = idNum ;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.email = email;
        coursesRegistered = new ArrayList<>();
    }

    /** Compares between two students id numbers and returns true if they are equal.
     * @param set Student to be compared with*/
    public boolean equals(Student set)
    {
        return this.idNum == set.getIdNum();
    }

    /** Returns coursesRegistered array. */
    public ArrayList<Course> getCoursesRegistered()
    { return coursesRegistered; }

    /** Prints all courses in coursesRegistered array. */
    public void printCoursesRegistered()
    {
        for (Course course : coursesRegistered) {
            System.out.println(course);
        }

    }

    //-------------------Getters and setters-----------------------
    /** Sets first name to new value provided.
     * @param fName new value*/
    public void setFirstName(String fName)
    {firstName = fName;}

    /** returns first name. */
    public String getFirstName()
    { return firstName; }

    /** Sets lastName to new value provided.
     * @param lName new value*/
    public void setLastName(String lName)
    {lastName =lName;}

    /** Returns last name. */
    public String getLastName()
    {return lastName;}

    /** Sets gender to new value provided.
     * @param Gen new value */
    public void setGender(char Gen)
    {gender = Gen;}

    /** Returns gender. */
    public char getGender()
    {return gender;}

    /** Sets email to new value provided.
     * @param nMail new value */
    public void setEmail(String nMail)
    {email = nMail;}

    /** Returns email. */
    public String getEmail()
    {return email;}

    /** Sets id number to new value provided.
     * @param IdNo new value */
    public void setIdNum (long IdNo)
    {idNum = IdNo;}

    /** Returns id number. */
    public long getIdNum(){ return idNum; }

}
