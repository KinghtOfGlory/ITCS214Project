import java.util.ArrayList;

public class Student {

    private long idNum; //student's id number
    private String firstName; //student's first name
    private String lastName; //student's last name
    private char gender; //student's gender
    private String email; //student's email
    private ArrayList<Course> coursesRegistered; //student courses that are registered

    /** default constructor without parameters */
    public Student()
    {
        idNum = 0 ;
        firstName = "notAssigned";
        lastName = "notAssigned";
        gender = 'X';
        email = "notAssigned";
        coursesRegistered = new ArrayList<Course>();
    }

    /** constructor with 5 parameters */
    public Student(long idNum,char gender,String firstName,String lastName,String email)
    {
        this.idNum = idNum ;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.email = email;
        coursesRegistered = new ArrayList<Course>();
    }

    /** comparing between two id numbers */
    public boolean equals(Student set)
    {
        if(this.idNum==set.getIdNum())  return true;
        else return false;
    }

    /** getCoursesRegistered for getting a course registered */
    public ArrayList<Course> getCoursesRegistered()
    { return coursesRegistered; }

    /** printCoursesRegistered for printing all courses and their Details from class Course */
    public void printCoursesRegistered()
    {
        for (int i =0; i<coursesRegistered.size();i++)
        { System.out.println(coursesRegistered.get(i)); }

    }

    //-------------------Getters and setters-----------------------
    /** setting a firstName String Value */
    public void setFirstName(String fName)
    {firstName = fName;}

    /** getting a firstName String Value */
    public String getFirstName()
    { return firstName; }

    /** setting a lastName String Value */
    public void setLastName(String lName)
    {lastName =lName;}

    /** getting a lastName String value */
    public String getLastName()
    {return lastName;}

    /** setting a gender char value (character) */
    public void setGender(char Gen)
    {gender = Gen;}

    /** getting a gender char value (character) */
    public char getGender()
    {return gender;}

    /** setting email string value */
    public void setEmail(String elecMail)
    {email = elecMail;}

    /** getting email string value */
    public String getEmail()
    {return email;}

    /** setting id number integer value */
    public void setIdNum (long IdNo)
    {idNum = IdNo;}

    /** getting id number integer value */
    public long getIdNum(){ return idNum; }

}
