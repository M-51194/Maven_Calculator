package com.mnk.mavencalculator;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
	static double ans=0;
	
    public static void main( String[] args )
    {
       double a=0, b=0;
       int c,i = 0;
       
       Scanner myNum = new Scanner(System.in);
       
       System.out.println("Enter first value");
       a = myNum.nextDouble();
       
       System.out.println("Enter second value");
       b = myNum.nextDouble();
       
      // System.out.println("First = " + a + " , Second = " + b + "\n");
       
       do {
    	
    	   	System.out.println("\nChoose any one option below:");
    	   	System.out.println("-------------------------------");
    	   	System.out.println("1. Addition (+)");
    	   	System.out.println("2. Substracation (-)");
    	   	System.out.println("3. Division (/)");
    	   	System.out.println("4. Multiplication (*)");
    	   	System.out.println("5. Modulus (%)");
    	   	System.out.println("6. Exit\n");
       
    	   	c = myNum.nextInt();
    
    	   	switch(c) {
      				case 1:
      					addition(a,b);
      					break;
        	  		
      				case 2:
      					substracation(a, b);
      					break;
        	  		
      				case 3:
      					multiplication(a, b);
      					break;
        	  		
      				case 4:
      					diivision(a, b);
      					break;
        	  		
      				case 5:
      					modulus(a, b);
      					break;
      			
      				default:
      					System.out.println("\nThank you");
      					break;
    	   		}//switch end
    	   	
       	} while (c < 8);//while end
      
    }//main end
    
    public  static double addition(double x, double y) {
    	ans = x + y;
  		System.out.println("\nAddition = " + ans);
  		return ans;
    }
    
    public static double substracation(double x, double y) {
    	ans = x - y;
  		System.out.println("\nSubstracation = " + ans);
  		return ans;
    }
    
    public static double multiplication(double x, double y) {
    	ans = x * y;
  		System.out.println("\nMultiplication = " + ans);
  		return ans;
    }
    
    public static double diivision(double x, double y) {
    	ans = x / y;
  		System.out.println("\nDivision= " + ans);
  		return ans;
    }
    
    public static double modulus(double x, double y) {
    	ans = x % y;
  		System.out.println("\nModulus= " + ans);
  		return ans;
    }
   
}
