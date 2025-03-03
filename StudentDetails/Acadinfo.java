package StudentDetails;

import java.text.DecimalFormat;

public class Acadinfo {
    private static DecimalFormat avarageFormat = new DecimalFormat("#.00");
    private static DecimalFormat percentFormat = new DecimalFormat("#%");
    public long number;
    public int GradeAverage;

    public float Quiz1;
    public float Quiz2;
    public float Midterm;
    public float Finals;

    public double Attendance;

    public Acadinfo(long number, float quiz1, float quiz2, float midterm, float finals, double attendance ) {
        this.number = number;
        this.Quiz1 = quiz1;
        this.Quiz2 = quiz2;
        this.Midterm = midterm;
        this.Finals = finals;
        this.GradeAverage = (int)(quiz1 + quiz2 + midterm + finals) / 4;
        this.Attendance = attendance;
    }

    public void displayEducDetails(){
        System.out.println("STUDENT EDUCATIONAL DETAILS");
        System.out.println("Student Number: \t\t" + this.number);
        System.out.println("Grade Average: \t\t\t" + avarageFormat.format(GradeAverage));
        System.out.println("Student Attendance: \t\t" + percentFormat.format(Attendance));
        System.out.println();
    }
}