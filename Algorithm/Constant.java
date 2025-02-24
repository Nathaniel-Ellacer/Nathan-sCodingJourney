import java.io.*;

public class Constant {
    public static final int ARRAY_LENGTH = 10;

    public static void main(String[] args) { 
        int[] cubes = new int[ARRAY_LENGTH]; 

        for (int index = 0; index < ARRAY_LENGTH; index++) { 
            cubes[index] = index * index * index; 
        } 

        System.out.print("Cubes Array: "); 
        for (int index = 0; index < ARRAY_LENGTH; index++) { 
            System.out.print(cubes[index] + " "); 
        } 
        System.out.println(); 
    } 
}