import java.util.Scanner;

public class IT26102656Lab5Q1{
	public static void main(String[]args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the first integer: ");
		int firstDigit = input.nextInt();
		
		System.out.print("Enter the second integer: ");
		int secondDigit = input.nextInt();
		
		System.out.print("Enter the third integer: ");
		int thirdDigit = input.nextInt();
		
		int smallest = firstDigit;
		int largest = firstDigit;
		
		//Finding the smallest number
		if (secondDigit < smallest){
			smallest = secondDigit;
		}
		if (thirdDigit < smallest){
			smallest = thirdDigit;
		}
		
		//Finding the largest number
		if (secondDigit > largest){
			largest = secondDigit;
		}
		if (thirdDigit > largest){
			largest = thirdDigit;
		}
		
		//Displat the result
		System.out.println();
		System.out.println("User entered numbers are : "+firstDigit+" "+secondDigit+" "+thirdDigit);
		System.out.println("The Smallest number is: "+smallest);
		System.out.println("The Largest number is: "+largest);
	}
}