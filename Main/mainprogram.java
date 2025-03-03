package Main;

import EmployeeDetails.Employeeinfo;
import StudentDetails.Acadinfo;
import StudentDetails.Studentinfo;

public class mainprogram {
    public static void main(String[] args){
        Studentinfo Student1Info = new Studentinfo(
                "Nathaniel Ellacer",
                18,
                'M',
                "PALAYAN",
                271606041,
                "Mr.Angelo Ellacer",
                "Mrs.Debbie Ellacer"
        );
        Employeeinfo Employee1Info = new Employeeinfo(
                "Marc Laureta",
                "Faculty",
                "Professor"
        );

        Acadinfo Acad1Info = new Acadinfo(
                11367,
                90,
                90,
                100,
                95,
                1
        );


        Studentinfo Student2Info = new Studentinfo(
                "Nico Anjelo Ellacer",
                21,
                'M',
                "PALAYAN",
                9320756,
                "Mr.Angelo Ellacer",
                "Mrs.Debbie Ellacer"
        );
        Employeeinfo Employee2Info = new Employeeinfo(
                "Marc Laureta",
                "Faculty",
                "Professor"
        );

        Acadinfo Acad2Info = new Acadinfo(
                13891,
                80,
                80,
                85,
                90,
                0.98
        );

        Student1Info.diplay_student();
        Employee1Info.display_Employee();
        Acad1Info.displayEducDetails();

        System.out.println("NEXT STUDENT\n");

        Student2Info.diplay_student();
        Employee2Info.display_Employee();
        Acad2Info.displayEducDetails();
    }
}
