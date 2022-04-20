import java.util.ArrayList;

public class Student {

    private long idNum;
    private String firstName;
    private String lastName;
    private char gender;
    private String email;
    private ArrayList<Course> coursesRegistered;

    public Student()
    {
        idNum = 0 ;
        firstName = "";
        lastName = "";
        gender = 'X';
        email = "";
        coursesRegistered = new ArrayList<Course>(6);
    }
    public Student(long idNum,String firstName,String lastName,char gender,String email)
    {
        this.idNum = idNum ;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.email = email;
        coursesRegistered = new ArrayList<Course>(6);
    }


    public void setfirstName(String fName)
    {firstName = fName;}
    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lName)
    {lastName =lName;}
    public String getLastName() {
        return lastName;
    }

    public void setGender(char Gen)
    {gender = Gen;}
    public char getGender() {
        return gender;
    }

    public void setEmail(String elecMail)
    {email = elecMail;}
    public String getEmail() {
        return email;
    }

    public void setIdNum (long IdNo)
    {idNum = IdNo;}
    public long getIdNum(){ return idNum; }

   /* public boolean equals(Student set)
    {
        if(idNum==set.getIdNum())  return true;
    }*/

    public ArrayList<Course> getCoursesRegistered()
    { return coursesRegistered; }
    public void printCoursesRegistered()
    {

    }



}
