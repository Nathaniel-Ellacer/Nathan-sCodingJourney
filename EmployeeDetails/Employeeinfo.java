package EmployeeDetails;

public class Employeeinfo {
    public String name;
    public String designation;
    public String AcademicPosition;

    public Employeeinfo(String name, String designation, String AcademicPosition) {
        this.name = name;
        this.designation = designation;
        this.AcademicPosition = AcademicPosition;
    }

    public void display_Employee() {
        System.out.println("EMPLOYEE'S DETAILS");
        System.out.println("Employee Name: \t\t\t" + name);
        System.out.println("Designation: \t\t\t" + designation);
        System.out.println("Academic Position: \t\t" + AcademicPosition);
        System.out.println();
    }
}