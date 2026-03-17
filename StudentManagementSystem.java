package com.student;

import java.util.ArrayList;
import java.util.Scanner;

class Student {
    int id;
    String name;
    int marks;

    Student(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }
}

public class StudentManagementSystem {
	 static ArrayList<Student> students = new ArrayList<>();
	    static Scanner sc = new Scanner(System.in);

	    public static void main(String[] args) {

	        while (true) {
	            System.out.println("\n===== Student Management System =====");
	            System.out.println("1. Add Student");
	            System.out.println("2. View Students");
	            System.out.println("3. Delete Student");
	            System.out.println("4. Exit");

	            System.out.print("Enter choice: ");
	            int choice = sc.nextInt();

	            switch (choice) {
	                case 1:
	                    addStudent();
	                    break;
	                case 2:
	                    viewStudents();
	                    break;
	                case 3:
	                    deleteStudent();
	                    break;
	                case 4:
	                    System.out.println("Exiting...");
	                    return;
	                default:
	                    System.out.println("Invalid choice!");
	            }
	        }
}
	    static void addStudent() {
	        System.out.print("Enter ID: ");
	        int id = sc.nextInt();
	        sc.nextLine(); // consume newline

	        System.out.print("Enter Name: ");
	        String name = sc.nextLine();

	        System.out.print("Enter Marks: ");
	        int marks = sc.nextInt();

	        students.add(new Student(id, name, marks));
	        System.out.println("✅ Student Added!");
	    }

	    static void viewStudents() {
	        if (students.isEmpty()) {
	            System.out.println("⚠ No students found.");
	            return;
	        }

	        System.out.println("\n--- Student List ---");
	        for (Student s : students) {
	            System.out.println("ID: " + s.id + 
	                               ", Name: " + s.name + 
	                               ", Marks: " + s.marks);
	        }
	    }

	    static void deleteStudent() {
	        System.out.print("Enter ID to delete: ");
	        int id = sc.nextInt();

	        for (int i = 0; i < students.size(); i++) {
	            if (students.get(i).id == id) {
	                students.remove(i);
	                System.out.println("✅ Student Deleted!");
	                return;
	            }
	        }

	        System.out.println("❌ Student not found.");
	    }
	}
