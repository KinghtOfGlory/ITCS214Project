public class Course {
    private String courseNum;
    private String courseName;
    private int credits;
    private int section;

    public Course()
    {
        courseNum = "";
        courseName = "";
        credits = 0;
        section = 0;
    }

    public Course(String Num,String Name,int cred, int sec)
    {
        courseNum = Num;
        courseName = Name;
        credits = cred;
        section = sec;
    }

    public void setCourseNum(String Num)
    {courseNum = Num;}
    public String getCourseNum()
    {return courseNum;}

    public void setCourseName(String Name)
    {courseName = Name ;}
    public String getCourseName()
    {return courseName;}

    public void setCredits(int cred)
    {credits = cred;}
    public int getCredits()
    {return credits;}

    public void setSection(int sec)
    {section = sec;}
    public int getSection()
    {return section;}

    public boolean equals(Course set)
    {
        return set.getCourseNum().equalsIgnoreCase(courseNum) && set.getCourseName().equalsIgnoreCase(courseName)
                && set.getCredits() == credits && set.getSection() == section;
    }

    public String toString()
    {
        return "Course Number: " + courseNum
                + "\nCourse Name: " + courseName
                + "\nCredits: " + credits
                + "\nSection: " + section;
    }

}
