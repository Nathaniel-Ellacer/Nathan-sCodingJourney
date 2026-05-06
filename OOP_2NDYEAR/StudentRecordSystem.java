import java.io.*;
import java.util.*;

public class StudentRecordSystem {
    private static final String FILENAME = "students.txt";

    // Add a student record
    public static void addStudent(String id, String name, double grade) {
        try (BufferedWriter writer = new BufferedWriter(
                new FileWriter(FILENAME, true))) {

            writer.write(id + "," + name + "," + grade);
            writer.newLine();
            System.out.println("Student added successfully!");
        } catch (IOException e) {
            System.out.println("Error adding student: " + e.getMessage());
        }
    }

    // Display all student records
    public static void displayAllStudents() {
        try (BufferedReader reader = new BufferedReader(
                new FileReader(FILENAME))) {

            System.out.println("\n=== Student Records ===");
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                System.out.println("ID: " + parts[0] + ", Name: " + 
                        parts[1] + ", Grade: " + parts[2]);
            }
        } catch (FileNotFoundException e) {
            System.out.println("No records found. File doesn't exist yet.");
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }

    // Search for a student by ID
    public static void searchStudent(String searchId) {
        try (BufferedReader reader = new BufferedReader(
                new FileReader(FILENAME))) {

            String line;
            boolean found = false;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts[0].equals(searchId)) {
                    System.out.println("Found: ID=" + parts[0] + 
                            ", Name=" + parts[1] + ", Grade=" + parts[2]);
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println("Student with ID " + searchId + " not found.");
            }
        } catch (FileNotFoundException e) {
            System.out.println("No records file found.");
        } catch (IOException e) {
            System.out.println("Error searching: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== Student Record System ===");
            System.out.println("1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Search Student");
            System.out.println("4. Exit");
            System.out.print("Choose option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter ID: ");
                    String id = scanner.nextLine();
                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Grade: ");
                    double grade = scanner.nextDouble();
                    addStudent(id, name, grade);
                    break;
                case 2:
                    displayAllStudents();
                    break;
                case 3:
                    System.out.print("Enter ID to search: ");
                    String searchId = scanner.nextLine();
                    searchStudent(searchId);
                    break;
                case 4:
                    System.out.println("Goodbye!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}