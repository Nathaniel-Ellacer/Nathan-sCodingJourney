package mainPackage;

import math.*;
public class MainProgram {
    
    public static void main(String[] args)
    {
        Arithmetic a=new Arithmetic();
        Arithmetic b=new Arithmetic();
        FixedValue fv=new FixedValue();
        FixedValue f=new FixedValue();

       int sum=a.add(6, 10);
       System.out.println(sum);

       System.out.println(a.sub(10, 2));
       System.out.println("Constant");

      // fv.PI=1000; //overides the value of PI in FixedValue unless final then error
       System.out.println("pi = "+fv.PI);
    }
}
