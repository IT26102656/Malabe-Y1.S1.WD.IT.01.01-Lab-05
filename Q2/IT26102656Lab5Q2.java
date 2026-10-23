import java.util.Scanner;

public class IT26102656Lab5Q2{
	public static void main(String[]args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the number of new members introduced: ");
		int noOfMembers = input.nextInt();
		
		if (noOfMembers<0){
			System.out.println("Input must be a number 0 or greater");
			return;
		}
		
		System.out.println();
		
		switch(noOfMembers){
			case 0:
				System.out.println("No Prize");
				break;
			case 1:
				System.out.println("Prize is a : Pen");
				break;
			case 2:
				System.out.println("Prize is a : Umberella");
				break;
			case 3:
				System.out.println("Prize is a : Bag");
				break;
			case 4:
				System.out.println("Prize is a : Travelling Chair");
				break;
			default:
				System.out.println("Prize is a : Headphone");
				break;
		} 
	}
}