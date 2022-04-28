public class main {

    public static void main(String[]args)
    {

        Course c1 = new Course("ITCS214","Data Structures",3,2);
        Course c2 = new Course("Hrlc107","Human Rights",2,1);

        Student a1 = new Student();
        a1.addCourse(c1);
        a1.addCourse(c2);
        a1.printCoursesRegistered();

    }
}
