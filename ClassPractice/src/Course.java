/**
 * Course class allow for keeping track of a course name along with a grade for it.
 * A recipe for creating objects with different properties
 */
class Course {

    /**
     * Member Variable for holding the course/subject name.
     */
    private String subjectName;

    /**
     * Member Variable for holding the student grade
     */
    private double studentGrade;

    /**
     * Public Constructor (the constructor of any class is a special type of method, where the method name matches the name of the class)
     * Responsible for allowing you to create an instance of the class, and (optionally) asking you for certain parameters that could be used to initialize the member variables
     */
    public Course(String name, double grade) {
        subjectName = name; // initialize the subjectName variable
        studentGrade = grade; // initialize the studentGrade variable
    }

    /**
     * Return the grade for this course
     * Must be public, so you can access the student grade
     * Not void, so the type of variable returned is declared
     */
    public double getStudentGrade() {
        return studentGrade;
    }

    /**
     * Return the grade for this course
     * Void because it returns nothing
     */
    public void setStudentGrade(double d) {
        studentGrade = d;
    }

    /**
     * Return the name for this course
     * Public, so you can get and set the values of an instance of this class in other classes
     */
    public String getSubjectName() {
        return subjectName;
    }

    /**
     * Return the grade for this course
     */
    public void setSubjectName(String s) {
        subjectName = s;
    }

    /**
     * Return a String representation of this class (don't use the built-in toString method from the object class...will print funky stuff)
     */
    public String toString() {
        return subjectName;
    }

}