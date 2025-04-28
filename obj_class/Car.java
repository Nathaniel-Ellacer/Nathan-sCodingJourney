package obj_class;

public class Car 
{
    // attributes
    String make;
    String color;
    private String type; 
    int model; // year
    int displacement;
    double fuelBurnRate; // liters per hour
    double fuelCapacity;

    // Constructor
    public Car(String make, String color, String type, int model, int displacement, double fuelBurnRate, double fuelCapacity)
    {
        this.make = make;
        this.color = color;
        this.type = type;
        this.model = model;
        this.displacement = displacement;
        this.fuelBurnRate = fuelBurnRate;
        this.fuelCapacity = fuelCapacity;
    }

    // Getters
    public String getType()
    {
        return type;
    }

    // Setters
    public void setType(String type)
    {
        if (type.equals("SUV") || type.equals("SEDAN") || type.equals("PICKUP"))
        {
            this.type = type;
        }
        else
        {
            this.type = "Unknown Type";
        }
    }

    public void display()
    {
        System.out.println("Name: " + this.make);
        System.out.println("Color: " + this.color);
        System.out.println("Model Year: " + this.model);
        System.out.println("Displacement: " + this.displacement);
        System.out.println("Type: " + this.type);
        System.out.println("Fuel Capacity: " + this.fuelCapacity);
        System.out.println("Fuel Burn Rate: " + this.fuelBurnRate);
    }

    public void calculateDistance()
    {
        double distance = fuelCapacity / fuelBurnRate; // Fixed calculation
        System.out.println("The Distance for " + this.make + " is " + distance + " km");
    }
}