
import java.util.Scanner;

public class Registration {
    private static final Course[] coursesAvailable = {
            new Course("ITCS214", "Data Structures", 3, 0)
            , new Course("ENGL219", "Technical Report Writing", 3, 0)
            , new Course("STAT273", "Probability and Statistics", 3, 0)
            , new Course("ITSE201", "Intro. to Software Engineering", 3, 0)
            , new Course("PHYCS102", "General Physics II ", 4, 0)
            , new Course("MATHS102", "Calculus II", 3, 0
            )
    };
    private static final Scanner read = new Scanner(System.in);
    private static final Roster stList = new Roster();

    public static void main(String[] args) {

        //--------------Menu-driven System--------------
        System.out.println("\n-------Starting menu-driven system-------");
        String gender;
        char g = 'X';
        boolean end = false, home, exampleUsed = false;
        long id;
        while (!end){
            System.out.println("""
                    
                    
                    Welcome to the student registration system home, please choose one of the options below.(0 always returns home)
                    (1) Add new student.
                    (2) Edit existing student.
                    (3) Print student's details.
                    (4) View all students.
                    (5) Print example of all functions.(meant to be used once)
                    (6) Quit.""");
            switch (read.nextInt()){
                default -> System.out.println("Invalid number, choose from given.");
                case 0 -> System.out.println("You are already in home menu");
                case 1 -> {
                    System.out.print("Enter student's ID number:");
                    id = read.nextLong();
                    if (id == 0)break;

                    if (stList.searchStudent(id) != -1){
                        System.out.println("Student exists");
                    }else {
                        System.out.println("""
                            Enter student's information in order.
                            (Gender M or F) (First and last name) (Email)""");
                        while (true) {
                            gender = read.next();
                            if (gender.equalsIgnoreCase("m")) {
                                g = 'M';
                                break;
                            } else if (gender.equalsIgnoreCase("f")) {
                                g = 'F';
                                break;
                            } else System.out.println("Invalid gender, choose M or F");
                        }
                        if (stList.addStudent(new Student(id, g, read.next(), read.next(), read.next()))) {
                            System.out.println("""
                                    Student added, choose next action.
                                    (1) Add courses.
                                    (0) Home.""");
                            home = false;
                            while (!home) {
                                switch (read.nextInt()) {
                                    default -> System.out.println("Invalid number, use given.");
                                    case 1 -> {
                                        addCourses(id);
                                        home = true;
                                    }
                                    case 0 -> home = true;
                                }
                            }
                        }
                    }
                }
                case 2 -> {
                    home = false;
                    if (stList.isEmpty()){
                        System.out.println("There are no students to edit.");
                        home = true;
                    }
                    while (!home){
                        System.out.print("Enter student's ID number: ");
                        id = read.nextLong();
                        if (id == 0)home = true;
                        else if (stList.searchStudent(id) == -1) System.out.println("Student does not exist.");
                        else {
                            while (!home){
                                System.out.println("""
                                    Choose option.
                                    (1) Edit student's information.
                                    (2) Edit student's courses.
                                    (3) Delete student.
                                    (0) Home.""");
                                switch (read.nextInt()){
                                    default -> System.out.println("Invalid number, choose from given.");
                                    case 1 -> {
                                        System.out.println("""
                                                Choose data to change.
                                                (1) ID number.
                                                (2) Gender.
                                                (3) Full name.
                                                (4) Email.
                                                (0) Home.""");
                                        boolean back = false;
                                        while (!back){
                                            switch (read.nextInt()){
                                                default -> System.out.println("Invalid number, choose from given.");
                                                case 1 -> {
                                                    System.out.print("Enter new ID number: ");
                                                    Student st = stList.getStudent(stList.searchStudent(id));
                                                    id = read.nextLong();
                                                    st.setIdNum(id);
                                                    System.out.println("ID number changed");
                                                    back = true;
                                                }
                                                case 2 -> {
                                                    System.out.print("Enter new gender (M or F): ");
                                                    while (true){
                                                        gender = read.next();
                                                        if (gender.equalsIgnoreCase("m")){
                                                            g = 'M';break;
                                                        }
                                                        else if (gender.equalsIgnoreCase("f")){
                                                            g = 'F';break;
                                                        }else System.out.println("Invalid key, choose M or F");

                                                        stList.getStudent(stList.searchStudent(id)).setGender(g);
                                                        System.out.println("Gender changed.");
                                                        back = true;
                                                    }
                                                }
                                                case 3 -> {
                                                    System.out.print("Enter new name: ");
                                                    stList.getStudent(stList.searchStudent(id)).setFirstName(read.next());
                                                    stList.getStudent(stList.searchStudent(id)).setLastName(read.next());
                                                    System.out.println("Name changed.");
                                                    back = true;
                                                }
                                                case 4 -> {
                                                    System.out.print("Enter new email: ");
                                                    stList.getStudent(stList.searchStudent(id)).setEmail(read.next());
                                                    System.out.println("Email changed.");
                                                    back = true;
                                                }
                                                case 0 -> {
                                                    back = true;
                                                    home = true;
                                                }
                                            }
                                        }

                                    }
                                    case 2 -> {
                                        addCourses(id);
                                        home = true;
                                    }
                                    case 3 -> {
                                        stList.deleteStudent(id);
                                        System.out.println("Student deleted.");
                                        home = true;
                                    }
                                    case 0 -> home = true;
                                }
                            }

                        }

                    }
                }
                case 3 -> {
                    System.out.print("Enter student's ID number: ");
                    stList.printStudentDetails(read.nextLong());
                }
                case 4 -> {

                    for (int i = 0; i < stList.listSize();i++){
                        String result = "";
                        Student st = stList.getStudent(i);
                        result = result.concat("(" + (i + 1) + ")" + st.getIdNum());
                        while (true){
                            if (result.length() == 14)result = result.concat(String.valueOf(st.getGender()));
                            else if (result.length() == 17)result = result.concat(st.getFirstName() + " " + st.getLastName());
                            else if (result.length() == 40) {
                                result = result.concat(st.getEmail());
                                break;
                            }
                            else result = result.concat(" ");
                        }
                        System.out.println(result);
                    }

                }
                case 5 -> {
                      if(!exampleUsed) {
                          example();
                          exampleUsed = true;
                      }
                      else
                        System.out.println("the example data were printed once, please pick another option");

                }

                case 6 -> end = true;
            }
        }


    }

    /** Adds courses to Student with id provided */
    public static void addCourses(long id) {
        System.out.println("""
                Choose a course to add, -1 to delete courses.
                (1) ITCS214     Data Structures                 3H
                (2) ENGL219     Technical Report Writing        3H
                (3) STAT273     Probability and Statistics      3H
                (4) ITSE201     Intro. to Software Engineering  3H
                (5) PHYCS102    General Physics II              4H
                (6) MATHS102    Calculus II                     3H""");
        while (true) {
            int cNum = read.nextInt();
            if (cNum > 6 || cNum < -1) System.out.println("Invalid number, use given.");
            else if (cNum == 0) break;
            else if (cNum == -1) {
                System.out.println("Switched to deleting mode, -1 to add courses.");
                deleteCourses(id);
                break;
            } else {
                if (stList.addCourse(coursesAvailable[cNum - 1], id)) {
                    System.out.print("Choose section: ");
                    stList.getStudent(stList.searchStudent(id)).getCoursesRegistered().get(stList.getStudent(stList
                            .searchStudent(id)).getCoursesRegistered().size() - 1).setSection(read.nextInt());
                    System.out.println("Course added successfully, choose next action.");
                }
            }
        }
    }

    /** deletes courses from Student with id provided */
    public static void deleteCourses(long id) {
        while (true) {
            int cNum = read.nextInt();
            if (cNum > 6 || cNum < -1) System.out.println("Invalid number, use given.");
            else if (cNum == 0) break;
            else if (cNum == -1) {
                addCourses(id);
                break;
            } else {
                if (stList.deleteCourse(coursesAvailable[cNum - 1], id))
                    System.out.println("Course deleted successfully, choose next action");

            }
        }
    }

    public static void example(){
        System.out.println("\n-------Example of data printed using this program-------");

        Course c1 = new Course();
        System.out.println("Course No.\tCourse Name\t\t\t\t\tCredits\tSection");
        System.out.println(c1.getCourseNum()+"\t"+ c1.getCourseName()
                +"\t\t\t\t\t\t" + c1.getCredits() +"\t  Sec" +c1.getSection());

        //Setters and Getters
        c1.setCourseNum("ITCS214");
        c1.setCourseName("Data Structure");
        c1.setCredits(3);
        c1.setSection(2);
        System.out.println(c1.toString());

        //Second Class & Data Check
        Course c2 = new Course("ENGL219","Technical Report Writing",3,1);
        System.out.println(c2.toString());
        Course c3 = new Course("ENGL219","Technical Report Writing",3,7) ;
        System.out.println(c3.toString());

        //equals
        System.out.println("\nis the Course1 equal to the course2? "+c1.equals(c2));

        //Third Class & Data Check
        System.out.println("\nis the Course2 equal to the course3? " + c2.equals(c3));


        //Student Methods
        //First Class & Data Check
        System.out.println("\nStudent Methods:-");
        Student s1 = new Student();
        System.out.println("ID Number\tFirst Name\tLast Name\tGender\tEmail");
        System.out.println(s1.getIdNum()+"\t\t\t"+ s1.getFirstName() +"\t"
                +s1.getLastName() +"\t"+s1.getGender() +"\t\t"+s1.getEmail());

        //Setters and Getters
        s1.setIdNum(20190001);
        s1.setFirstName("Khawla");
        s1.setLastName("Isa");
        s1.setGender('F');
        s1.setEmail("KhawIsa177@Outlook.com");

        System.out.println(s1.getIdNum()+"\t"+ s1.getFirstName() +"\t\t"
                +s1.getLastName() +"\t\t\t"+s1.getGender() +"\t\t"+s1.getEmail());

        //Second Class & Data Check
        Student s2 = new Student(20190002,'M',"Abdulla","Mohammed"
                ,"AbdolMoh008@Outlook.com");

        System.out.println(s2.getIdNum()+"\t"+ s2.getFirstName() +"\t\t"
                +s2.getLastName() +"\t"+s2.getGender() +"\t\t"+s2.getEmail());

        //Student Course-like Methods
        stList.addStudent(s1);
        stList.addCourse(c1, 20190001);
        stList.addCourse(c2, 20190001);

        //Print coursesRegistered
        System.out.println("\nStudent 1 Courses:- \nCourse No.\tCourse Name\t\t\t\t\tCredits\tSection");
        s1.printCoursesRegistered();

        stList.addStudent(s2);
        stList.addCourse(c2, 20190002);

        //equals
        System.out.println("Is the Id of Student1 equal to student2: "+ s1.equals(s2));

    }
}
