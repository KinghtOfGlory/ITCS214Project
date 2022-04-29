public class main {

    public static void main(String[]args)
    {
        /**Course Methods*/
        /**First Class & Data Check*/
        Course c1 = new Course();
        System.out.println("Course No.\tCourse Name\tCredits\tSection");
        System.out.println(c1.getCourseNum()+"\t"+ c1.getCourseName()
                +"\t" + c1.getCredits() +"\t" +c1.getSection());

        /**Setters and Getters*/
        c1.setCourseNum("ITCS214");
        c1.setCourseName("Data Structure");
        c1.setCredits(3);
        c1.setSection(2);
        System.out.println(c1.toString());

        /**Second Class & Data Check*/
        Course c2 = new Course("Hrlc107","Human Rights",2,1);
        System.out.println(c2.toString());

        /**equals*/
        System.out.println("\nis the ITCS214 equal to the Hrlc107 class: "+c1.equals(c2));

        /**Third Class & Data Check*/
        Course c3 = c2 ;
        System.out.println("If there was a class that had data similar to the Hrlc107 Course the answer " +
                "would have been: "+c2.equals(c3));


        /**Student Methods*/
        /**First Class & Data Check*/
        System.out.println("\nStudent Methods:-");
        Student s1 = new Student();
        System.out.println("ID Number\tFirst Name\tLast Name\tGender\tEmail");
        System.out.println(s1.getIdNum()+"\t"+ s1.getFirstName() +"\t"
                +s1.getLastName() +"\t"+s1.getGender() +"\t"+s1.getEmail());

        /**Setters and Getters*/
        s1.setIdNum(20190001);
        s1.setFirstName("Khawla");
        s1.setLastName("Isa");
        s1.setGender('F');
        s1.setEmail("KhawJesus177@Outlook.com");

        System.out.println(s1.getIdNum()+"\t"+ s1.getFirstName() +"\t"
                +s1.getLastName() +"\t"+s1.getGender() +"\t"+s1.getEmail());

        /**Second Class & Data Check*/
        Student s2 = new Student(20190002,"Abdulla","Mohammed",'M'
                ,"AbdolMoh008@Outlook.com");

        System.out.println(s2.getIdNum()+"\t"+ s2.getFirstName() +"\t"
                +s2.getLastName() +"\t"+s2.getGender() +"\t"+s2.getEmail());

        /**Student Course-like Methods*/
        s1.addCourse(c1);
        s1.addCourse(c2);

        /**Print coursesRegistered*/
        System.out.println("\nStudent 1 Courses:- \nCourse No.\tCourse Name\tCredits\tSection");
        s1.printCoursesRegistered();

        s2.addCourse(c2);
        System.out.println("\nStudent 1 and Student 2 both share one course\n"+s2.getCoursesRegistered());

        /**equals*/
        System.out.println("Is the Id of Student 1 equal to student 2: "+s1.equals(s2));
        System.out.println("if there was a student with the same id the result would have been: "+c1.equals(c1));





    }
}
