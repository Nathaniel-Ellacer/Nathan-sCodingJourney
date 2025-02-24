package math;

public class Arithmetic 
{
   public static int add(int num1, int num2)
    {
        return num1+num2;
    }
    public static int sub(int num1, int num2)
    {
        int diff;
        diff=num1-num2;
        return diff;
    }
}

//method-access modifier-method-type-returning datatype-methodName(parameters)

//controls where you can access the methods, variables and classes

//Access modifier (for class)
//default - same package
// public - anywhere as long as it is imported

//Access modifier (for method and variables)
//default - same package
//public - anywhere as long as it is imported
//private - own class
//protected - same package and sub classes

//NON-Access modifier (for methods and Variables)
//final - variable can't be assigned
//static - keyword/ Ex: Arithmetic.add or Arithmetic.sub

//abstract
//transient
//synchronized
//volatile
