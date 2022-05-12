
public class Course {
    /** Course number */
    private String courseNum;
    /** Course name */
    private String courseName;
    /** Course credit hours value */
    private int credits;
    /** Course section */
    private int section;

    /** Default constructor without parameters */
    public Course()
    {
        courseNum = "notAssigned";
        courseName = "notAssigned";
        credits = 0;
        section = 0;
    }

    /** Constructor with 4 parameters
     * @param Num course number
     * @param Name course name
     * @param cred credit hours
     * @param sec section*/
    public Course(String Num,String Name,int cred, int sec)
    {
        courseNum = Num;
        courseName = Name;
        credits = cred;
        section = sec;
    }

    /** Compares between two courses courseNum.
     * @param set Course to be compared with*/
    public boolean equals(Course set)
    {
        return set.getCourseNum().equalsIgnoreCase(courseNum);
    }

    /** Converts Course data to String */
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
    /** sets course number to new value provided.
     * @param Num new value */
    public void setCourseNum(String Num)
    {courseNum = Num;}

    /** Returns course number. */
    public String getCourseNum()
    {return courseNum;}

    /** Sets course name to new value provided.
     * @param Name new value */
    public void setCourseName(String Name)
    {courseName = Name ;}

    /** Returns course name. */
    public String getCourseName()
    {return courseName;}

    /** Sets credit hours to new value provided.
     * @param cred new value */
    public void setCredits(int cred)
    {credits = cred;}

    /** Return credit hours. */
    public int getCredits()
    {return credits;}

    /** Sets section number to new value provided.
     * @param sec new value */
    public void setSection(int sec)
    {section = sec;}

    /** Returns section number. */
    public int getSection()
    {return section;}


}
