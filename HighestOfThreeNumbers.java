package HighestofThree;

import java.util.Scanner;

public class HighestOfThreeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x, y, z;
	      System.out.println("Enter three numbers ");
	      Scanner in = new Scanner(System.in);// Input from the user 
	 
	      x = in.nextInt();//Saving the input in the variable X, Y AND Z
	      y = in.nextInt();
	      z = in.nextInt();
	 
	      if ( x > y && x > z ) //Comparing the variables and displaying the highest number
	         System.out.println("First number is highest.");
	      else if ( y > x && y > z )
	         System.out.println("Second number is highest.");
	      else if ( z > x && z > y )
	         System.out.println("Third number is highest.");
	      else   
	         System.out.println("Entered numbers are not distinct.");
	}

}
