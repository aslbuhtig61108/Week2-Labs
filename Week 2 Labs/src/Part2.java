
public class Part2 {

	public static void main(String[] args) {
		// create a variables with the following values
		// then using a switch, set the value of the loyaltyMemberDiscount as follows:
		// SILVER is 0.10, GOLD is 0.15 and PLATINUM is 0.25
				
		String loyaltyMemberStatus = "GOLD";
		double loyaltyMemberDiscount = 0.0;
		
		switch (loyaltyMemberStatus) {
		case "SILVER":
			loyaltyMemberDiscount = 0.10;
			break;
		case "GOLD":
			loyaltyMemberDiscount = 0.15;
			break;
		case "PLATINUM":
			loyaltyMemberDiscount = 0.25;
			break;
		}
		System.out.println("Your membership status is : " + loyaltyMemberStatus);
		System.out.println("Your discount is :" + loyaltyMemberDiscount);

		// create a variable called billTotal and assign a value
		// create a variable called adjustedTotal and assign it 
						
		double billTotal = 800.00;
		double adjTotal =  billTotal - (loyaltyMemberDiscount * billTotal);
		
			if (adjTotal > 500.00) {
				if (loyaltyMemberStatus == "SILVER") {
						loyaltyMemberStatus = "GOLD";		
				} else if (loyaltyMemberStatus == "GOLD"){
						loyaltyMemberStatus = "PLATINUM";
				}
			System.out.println("Your adjusted total is :" + adjTotal);		
			System.out.println("You have been upgraded to the : " + loyaltyMemberStatus);	
			} 
				
		// Create two variables username and password
		// Create conditional that prints "Login successful!", if the username is "Tommy123" and the password is 12345
		// Otherwise, print "login denied."
		String usrName = "Tommy123";
		String pssWerd = "12345";
		
		if (usrName.equals("Tommy123")  && pssWerd.equals("12345")) {
			System.out.println("Login successful!");
		} else {
			System.out.println("Access denied!");
		}		
		
		
		// write a for loop that prints out each number from 0 to 9
		for (int m = 0; m <10; m++) {
			System.out.println(m);
		}
		
		
		// write a for loop that prints out each number from 10 to 0 backwards
		for (int m = 10; m >= 0; m--) {
			System.out.println(m);
		}
		
		
		// write a for loop that prints out every other number from 0 to 100 backwards
		for (int q = 0; q <= 100; q++) {
			System.out.println(q++);
		}
		
		
		// write a for loop that iterates from 0 to 100 and prints "EVEN" if the number is even and "ODD" if the number is odd
		for (int m = 0; m <= 100; m++) {
			if (m % 2 == 0) {
				System.out.println("The number " + m + " is EVEN!");
			} else {
				System.out.println("The number " + m + " is ODD!");
			}
		}
		
		
		// write a while loop that starts at 100 and iterates backwards by 1 until it reaches 0
		// divide each number 3 and print the remainder to the console
		int g = 100;
		int remainder;
			while (g > 0) {
				remainder = g % 3;
				System.out.println(g + " ==> " + remainder);
				g--;
			}
		
		
		
	}

}
