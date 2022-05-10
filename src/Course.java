import java.awt.desktop.PreferencesEvent;

public class Course {
    /**course number*/
    private String courseNum;

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

    /** compares between two courses courseNum */
    public boolean equals(Course set)
    {
        return set.getCourseNum().equalsIgnoreCase(courseNum);
    }

    /** converts Course data to String */
    public String toString()
    {
        String result = courseNum;
        while (true){
            if (result.length() == 12)result = result.concat(courseName);
            else if (result.length() == 44)result = result.concat(credits + "H");
            else if (result.length() == 50) {
                result = result.concat("Sec" + section);
                return result;
            }else result = result.concat(" ");

        }

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
