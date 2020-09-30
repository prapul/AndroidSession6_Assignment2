
Prime number using Java 

import java.util.*; 
class Test{ 
    public static boolean isPrime(int n) { 
    if (n%2==0) return false; 
    for(int i=3;i<=Math.sqrt(n);i+=2) { 
        if(n%i==0) 
            return false; 
    } 
    return true; 
} 
    public static void main(String[] args)  
    { 
         if(isPrime(19))  
         System.out.println(" true") ;  
         else 
         System.out.println(" false"); 
    } 
} 

