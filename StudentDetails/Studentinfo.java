package StudentDetails;

public class Studentinfo {
    public String name;
    public int age;
    public char gender;
    public String address;
    public long number;
    public String father;
    public String mother;

    public Studentinfo(String name,int age, char gender, String address, long number, String father, String mother) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.number = number;
        this.father = father;
        this.mother = mother;
    }

    public void diplay_student(){
        System.out.println("STUDENT DETAILS");
        System.out.println("Student Name: \t\t\t" + name);
        System.out.println("Age: \t\t\t\t" + age);
        System.out.println("Student Gender: \t\t" + gender);
        System.out.println("Student Address: \t\t" + address);
        System.out.println("Contact Number: \t\t" + number);
        System.out.println("Father's Name: \t\t\t" + father);
        System.out.println("Mother's Name: \t\t\t" + mother);
        System.out.println();
    }
}