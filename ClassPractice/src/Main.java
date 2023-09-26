import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Grimace");
        s1.addCourse("Burger Making", 95);
        s1.addCourse("Chemistry", 67);
        s1.addCourse("The Basics of Milkshakes", 98);

        Student s2 = new Student("Pillsbury Doughboy");
        s2.addCourse("Cake Baking", 97);
        s2.addCourse("Intro to French Pastries", 90);
        s2.addCourse("Physics", 72);

        System.out.println(s1); // Print student1's information
        s1.printCourses(); // Print student1's courses
        System.out.println("Average Grade: " + s1.getAverageGrade());

        System.out.println();

        System.out.println(s2); // Print student2's information
        s2.printCourses(); // Print student2's courses
        System.out.println("Average Grade: " + s2.getAverageGrade());
    }
}
