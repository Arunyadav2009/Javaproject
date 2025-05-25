package Studentscourseselection;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String studentId;
    private String name;
    private List<Course> selectedCourses;

    public Student(String studentId, String name) {
        this.studentId = studentId;
        this.name = name;
        this.selectedCourses = new ArrayList<>();
    }

    public void selectCourse(Course course) {
        selectedCourses.add(course);
        System.out.println("Course added: " + course.getCourseName());
    }

    public void displaySelectedCourses() {
        System.out.println("Courses selected by " + name + ":");
        for (Course course : selectedCourses) {
            System.out.println(course);
        }
    }

    public String getName() {
        return name;
    }
}