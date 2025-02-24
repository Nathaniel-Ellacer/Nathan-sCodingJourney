package obj_class;

public class Car 
{
    //attributes
    String make;
    String color;
    String type;
    int model; //year
    int displacement;
    double fuelBurnRate; // liter per hour
    double fuelCapacity;

    void calculateDistance()
    {
        double distance;
        distance = fuelCapacity*fuelBurnRate;
        System.out.println("The Distance is " +distance);
        System.out.println("The Distance for " +this.make + " is " +distance);
    }
}
