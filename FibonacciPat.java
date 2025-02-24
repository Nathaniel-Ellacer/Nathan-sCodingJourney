public class FibonacciPat { 
  
       public static int number(int n) { 
           if (n <= 1) { 
               return  n; 
           } 
           else { 
            return number(n - 1) + number(n-2); 
           } 
       } 
        
       public static int[] sequence(int n) { 
           int[] numbers = new int[n]; 
           if (n <= 1) { 
               numbers[0] = n; 
           }  
           else { 
               numbers[0] = 0; 
               numbers[1] = 1; 
                
            for (int i = 2; i < n; i++) { 
                    numbers[i] = numbers[i - 1] + numbers[i - 2]; 
            } 
           } 
           return numbers; 
       } 
        
       public static int sequence02(int n) { 
           if (n == 0) { 
               return 1;  
           } 
           if (n == 1) { 
               return 1;  
           } else { 
               return sequence02(n - 1) + sequence02(n - 2); 
           } 
       } 
    
       public static void sequence2(int n) { 
           for (int i = 0; i < n; i++) { 
               System.out.print(sequence02(i) + " "); 
           } 
       } 
    
       public static void main(String[] args) { 
         
           System.out.println(number(10));  
           int[] sequence = sequence(7); 
           for (int num : sequence) { 
               System.out.print(num + " ");  
           } 
           System.out.println(); 
           sequence2(10); 
       } 
   }