public class Course {
    private String courseNum; //course number
    private String courseName; //course name
    private int credits; //course credit hours value
    private int section; //course section

    //course class constructors
    public Course() //constructor without parameters
    {
        courseNum = "";
        courseName = "";
        credits = 0;
        section = 0;
    }
    public Course(String Num,String Name,int cred, int sec) //constructor with 4 parameters
    {
        courseNum = Num;
        courseName = Name;
        credits = cred;
        section = sec;
    }

    //course number methods
    public void setCourseNum(String Num) //setting course number string value
    {courseNum = Num;}
    public String getCourseNum() //getting a course number string value
    {return courseNum;}

    //course name methods
    public void setCourseName(String Name) //setting a course name string value
    {courseName = Name ;}
    public String getCourseName() //getting a course name string value
    {return courseName;}

    //credits methods
    public void setCredits(int cred) //setting credits integer value
    {credits = cred;}
    public int getCredits() //getting credits integer value
    {return credits;}

    //section methods
    public void setSection(int sec) //setting section integer value
    {section = sec;}
    public int getSection() //getting section integer value
    {return section;}

    public boolean equals(Course set) //comparing between two courses full data(Course Number/Name/credits/Section)
    {
        return set.getCourseNum().equalsIgnoreCase(courseNum) && set.getCourseName().equalsIgnoreCase(courseName)
                && set.getCredits() == credits && set.getSection() == section;
    }

    public String toString() //data used to convert from Course data type to String data type
    {
        return "Course Number: " + courseNum
                + "\nCourse Name: " + courseName
                + "\nCredits: " + credits
                + "\nSection: " + section
                +"\n" ;
    }

}
