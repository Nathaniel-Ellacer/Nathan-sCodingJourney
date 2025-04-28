package obj_class;

public class Constructor
{
    public static void main(String[] args) 
    {
        Car manual = new Car("TOYOTA", "Gray", "SUV", 2014, 2500, 20.5, 45);
        
        manual.display(); 
        manual.calculateDistance();
        System.out.println();

        Car auto = new Car("SUZUKI", "Gray", "SEDAN", 2018, 1462, 16.7, 45);
        
        auto.display(); 
        auto.calculateDistance();
    }
}