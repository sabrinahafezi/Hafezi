import java.util.ArrayList;
import java.math.BigDecimal;
import java.math.RoundingMode;

class Student {
    /**
     * A static member of a class creates a member variable that is common to all the instances of the class i.e. if you created 1000 students and asked all of them what the last student ID was they'd all say 10000
     * A class variable is created by using the static keyword.
     * Class variables are shared amongst all instance of a class.
     * If one instance changes it, then all instance will see that change.
     */
    private static int lastStudentId = 0; // Static ID generator

    /**
     * Member variable for holding the student ID
     */
    private int studentId;

    /**
     * Member variable for holding the student name
     */
    private String firstName;


    /**
     * Member variable for holding a list of course the student is taking.
     */
    private ArrayList<Course> courses;


    /**
     * Public constructor
     *
     */
    public Student(String fname) {
        studentId = ++lastStudentId;
        firstName = fname;
        courses = new ArrayList<>();
    }


    /**
     * Return a String representation of this class
     */
    public String toString() {
        return "Student ID: " + studentId + ", Name: " + firstName;
    }

    /**
     * To Do
     */
    public void addCourse(String subjectName, double studentGrade) {
        Course course = new Course(subjectName, studentGrade);
        courses.add(course);
    }

    /**
     * To do
     */
    public double getAverageGrade() {
        if (courses.isEmpty()) {
            return 0.0;
        }

        double totalGrade = 0.0;
        for (Course course : courses) {
            totalGrade += roundDoubleHalfUp(course.getStudentGrade(), 2);
        }

        return roundDoubleHalfUp(totalGrade / courses.size(), 2);
    }

    /**
     * To do
     */
    public void printCourses() {
        System.out.println("Courses for " + firstName + " (Student ID: " + studentId + "):");
        for (Course course : courses) {
            System.out.println(course);
        }
    }


    /**
     * Use RoundingMode.HALF_UP to round the passed double value
     *
     */
    public double roundDoubleHalfUp(double d, int precision)
    {
        BigDecimal bd = new BigDecimal(d+"");
        bd = bd.setScale(precision, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }
}