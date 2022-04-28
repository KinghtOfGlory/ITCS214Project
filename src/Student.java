import java.util.ArrayList;

public class Student {

    private long idNum; // student id number
    private String firstName; // student first name
    private String lastName; //student last name
    private char gender; //student gender
    private String email; //student email
    private ArrayList<Course> coursesRegistered; //student courses that were/got registered


    //Student Class Constructor
    public Student() //constructor without parameters
    {
        idNum = 0 ;
        firstName = "notAssigned";
        lastName = "notAssigned";
        gender = 'X';
        email = "notAssigned";
        coursesRegistered = new ArrayList<Course>();
    }
    public Student(long idNum,String firstName,String lastName,char gender,String email) //constructor with 5 parameters
    {
        this.idNum = idNum ;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.email = email;
        coursesRegistered = new ArrayList<Course>();
    }

    //firstName methods
    public void setFirstName(String fName) //setting a firstName String Value
    {firstName = fName;}
    public String getFirstName() {
        return firstName;
    } //getting a firstName String Value

    //lastName methods
    public void setLastName(String lName) //setting a lastName String Value
    {lastName =lName;}
    public String getLastName() {
        return lastName;
    } //getting a lastName String value

    //gender methods
    public void setGender(char Gen) ///setting a gender char value (character)
    {gender = Gen;}
    public char getGender() {
        return gender;
    } //getting a gender char value (character)

    //email methods
    public void setEmail(String elecMail) //setting email string value
    {email = elecMail;}
    public String getEmail() {
        return email;
    }  //getting email string value

    //id number methods
    public void setIdNum (long IdNo) //setting id number integer value
    {idNum = IdNo;}
    public long getIdNum(){ return idNum; } //getting id number integer value

    //comparing between two id numbers
    public boolean equals(Student set)
    {
        if(idNum==set.getIdNum())  return true;
        else return false;
    }


// coursesRegistered Methods
    public void addCourse(Course course) //addCourse for setCoursesRegistered or adding a course in short
    { coursesRegistered.add(course); }
    public ArrayList<Course> getCoursesRegistered() //getCoursesRegistered for getting a course registered
    { return coursesRegistered; }
    public void printCoursesRegistered() //printCoursesRegistered for printing all courses and their Details from class Course
    {
        for (int i =0; i<coursesRegistered.size();i++)
        { System.out.println(coursesRegistered.get(i)); }

    }

    // an outer Example to test the work of the program
    public static void main(String[]args)
    {
        //course class constructors
        Course c1 = new Course("ITCS214","Data Structures",3,2);
        Course c2 = new Course("Hrlc107","Human Rights",2,1);

        //student class constructor & methods
        Student a1 = new Student();
        a1.addCourse(c1);
        a1.addCourse(c2);
        a1.printCoursesRegistered();

    }


}
