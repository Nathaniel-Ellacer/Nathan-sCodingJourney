package ArrayOneDimensional;

public class ArrayCabinet 
{
    public static void main(String[] args)
    {
        String[] cabinet = new String[5];
        
        cabinet[0] = "socks";
        cabinet[1] = "underwear";
        cabinet[2] = "shirts";
        cabinet[3] = "polo";
        cabinet[4] = "sweater";
        
        //Can also be like
        // String[] cabinet = {"socks","underwear","shirts","polo","sweater"};

        System.out.println("The contents of the cabinet are: ");

        int i = 0;
        while (i < cabinet.length)
        {
            System.out.println(cabinet[i]);
            i++;
        }
    }
}
