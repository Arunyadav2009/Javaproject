package Studentscourseselection;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Predefined course list
        List<Course> availableCourses = new ArrayList<>();
        availableCourses.add(new Course("C101", "Data Structures"));
        availableCourses.add(new Course("C102", "Digital Logic Design"));
        availableCourses.add(new Course("C103", "OOP in Java"));

        // Create a student
        System.out.print("Enter Student ID: ");
        String studentId = scanner.nextLine();

        System.out.print("Enter Student Name: ");
        String studentName = scanner.nextLine();

        Student student = new Student(studentId, studentName);

        boolean running = true;
        while (running) {
            System.out.println("\nAvailable Courses:");
            for (int i = 0; i < availableCourses.size(); i++) {
                System.out.println((i + 1) + ". " + availableCourses.get(i));
            }

            System.out.print("\nSelect course number to add (0 to exit): ");
            int choice = scanner.nextInt();

            if (choice == 0) {
                running = false;
            } else if (choice > 0 && choice <= availableCourses.size()) {
                student.selectCourse(availableCourses.get(choice - 1));
            } else {
                System.out.println("Invalid choice.");
            }
        }

        // Display selected courses
        System.out.println("\n--- Final Course Selection ---");
        student.displaySelectedCourses();

        scanner.close();
    }
}