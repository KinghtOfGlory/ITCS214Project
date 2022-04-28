public class Course {
    private String courseNum; //course number
    private String courseName; //course name
    private int credits; //course credit hours value
    private int section; //course section

    /** default constructor without parameters */
    public Course()
    {
        courseNum = "notAssigned";
        courseName = "notAssigned";
        credits = 0;
        section = 0;
    }

    /** constructor with 4 parameters */
    public Course(String Num,String Name,int cred, int sec)
    {
        courseNum = Num;
        courseName = Name;
        credits = cred;
        section = sec;
    }

    /** compares between two courses full data(Course Number/Name/credits/Section) */
    public boolean equals(Course set)
    {
        return set.getCourseNum().equalsIgnoreCase(courseNum) && set.getCourseName().equalsIgnoreCase(courseName)
                && set.getCredits() == credits && set.getSection() == section;
    }

    /**converts from Course data type to String data type */
    public String toString()
    {
        return "Course Number: " + courseNum
                + "\nCourse Name: " + courseName
                + "\nCredits: " + credits
                + "\nSection: " + section
                +"\n" ;
    }

    //-------------------Getters and setters-----------------------
    /** setting course number string value */
    public void setCourseNum(String Num)
    {courseNum = Num;}

    /** getting a course number string value */
    public String getCourseNum()
    {return courseNum;}

    /** setting a course name string value */
    public void setCourseName(String Name)
    {courseName = Name ;}

    /** getting a course name string value */
    public String getCourseName()
    {return courseName;}

    /** setting credits integer value */
    public void setCredits(int cred)
    {credits = cred;}

    /** getting credits integer value */
    public int getCredits()
    {return credits;}

    /** setting section integer value */
    public void setSection(int sec)
    {section = sec;}

    /** getting section integer value */
    public int getSection()
    {return section;}


}
