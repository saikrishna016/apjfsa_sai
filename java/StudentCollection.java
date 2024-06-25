package anudip.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

 class Student implements Comparable<Student> {
    int studentId;         // Student ID
    String studentName;    // Student Name
    String qualification;  // Student Qualification

    // Constructor with parameters to initialize student properties
    public Student(int studentId, String studentName, String qualification) {
        this.studentId = studentId;          // Set student ID
        this.studentName = studentName;      // Set student name
        this.qualification = qualification;  // Set student qualification
    }

    // Override toString method to provide a string representation of the student object
    @Override
    public String toString() {
        return "Student ID: " + studentId + ", Name: " + studentName + ", Qualification: " + qualification;
    }

    @Override
    public int compareTo(Student o) {
        // Corrected the compareTo method to return -1, 0, or 1 based on the comparison
        return this.studentName.compareTo(o.studentName);
    }
}

public class StudentCollection {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<Student>();

        list.add(new Student(124, "Deepa", "BSC"));
        list.add(new Student(211, "Arya", "Bcom"));
        list.add(new Student(100, "Sam", "Btech"));
        list.add(new Student(432, "Divya", "BE"));

        Student s = new Student(411, "Fizal", "BCA");
        list.add(s);

        System.out.println("Before sorting:");
        for (Student s1 : list) {
            System.out.println(s1);
        }

        Collections.sort(list);

        System.out.println("After sorting:");
        for (Student s1 : list) {
            System.out.println(s1);
        }
    }
}