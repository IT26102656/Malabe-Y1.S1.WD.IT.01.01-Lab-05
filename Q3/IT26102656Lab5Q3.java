import java.util.Scanner;

public class IT26102656Lab5Q3{
	public static void main(String[]args){
		
		final double chargesPerDay = 48000.00;
        final int discount_10 = 10;
        final int discount_20 = 20;
		
		int noOfDaysReserved;
		double finalAmount, amountToBePaid, discount;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter Start Date (1-31): ");
		int startDate = input.nextInt();
		
		System.out.print("Enter End Date (1-31): ");
		int endDate = input.nextInt();
		
		
		if (startDate >= endDate){
			System.out.print("Error: Start Date must be less than End Date");
			return;
		}
		
		if (startDate<1 || startDate>31 || endDate<1 || endDate>31){
			System.out.print("Error: Days must be less than 1 and 31");
			return;
		}
		
		noOfDaysReserved = endDate - startDate;
		
		if (noOfDaysReserved < 3){
			discount = 0;
		}else if (noOfDaysReserved <= 4){
			discount = discount_10;
		}else{
			discount = discount_20;
		}
		
		amountToBePaid = chargesPerDay * noOfDaysReserved;
		finalAmount = amountToBePaid - (amountToBePaid * discount / 100);
		
		System.out.println();
		System.out.println("Room Charges Per Day: Rs. "+chargesPerDay+"/=");
		System.out.println("Number of Days Reserved: "+noOfDaysReserved);
		System.out.println("Total Amount to be Paid: "+finalAmount);
		
	}
}