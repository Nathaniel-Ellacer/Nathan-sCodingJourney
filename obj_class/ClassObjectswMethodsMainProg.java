package obj_class;
public class ClassObjectswMethodsMainProg
{
    public static void main(String[] args) 
    {
        Car manual =new Car();
        
        Car auto =new Car();

        manual.make="LAMBORGHINI";
        manual.color="Blue";
        manual.model=2012; //year
        manual.displacement=6498;
        manual.type="AVENTADOR";
        manual.fuelCapacity=90;
        manual.fuelBurnRate= 20.5; // liter per hour

        System.out.println(manual.make);
        System.out.println(manual.color);
        System.out.println(manual.model);
        System.out.println(manual.displacement);
        System.out.println(manual.type);
        System.out.println(manual.fuelCapacity);
        System.out.println(manual.fuelBurnRate);
        manual.calculateDistance();
        System.out.println();

        auto.make="SUZUKI";
        auto.color="Gray";
        auto.model=2018; //year
        auto.displacement=1462;
        auto.type="ERTIGA";
        auto.fuelCapacity=45;
        auto.fuelBurnRate= 16.7; // liter per hour

        System.out.println(auto.make);
        System.out.println(auto.color);
        System.out.println(auto.model);
        System.out.println(auto.displacement);
        System.out.println(auto.type);
        System.out.println(auto.fuelCapacity);
        System.out.println(auto.fuelBurnRate);
        auto.calculateDistance();
        System.out.println();
    }
}
