
public class Example1 {

	public static void main(String[] args) {
		// Part 1: Create a variable named age and assign it a value of '14'
		
				int age = 14;
				
				// print the boolean expression age >= 16 to the console
				System.out.println(age >= 16);
				// Output after running code shows 'false'

				// change the value of age to 18 and run it again
				// Alternate solution is leave age = 14 above
				// Run current code. Initialize age to 18 and then sysout again
				age = 15;
				System.out.println(age >= 20);

				
				boolean hasLicense = false;
				
				if (age >= 16 && hasLicense) {
					System.out.println("You can drive");
				 } else {
				 	System.out.println("You cannot drive");
				 }
				
				// create costOfMilk and thirstLevel
				double costOfMilk = 4;
				int thirstLevel = 5;
				
				if (costOfMilk < 3 || thirstLevel > 6) {
					System.out.println("Milk Please!");
				} else {
					System.out.println("No Thanks!");
				}
			
				// Cookies and Children Example
				int numberOfCookies = 45;
				int numberOfChildren = 10;
				int numberCookiesLeft = numberOfCookies/numberOfChildren;
				
				System.out.println(numberCookiesLeft);
				
				if (numberOfCookies % numberOfChildren == 0) {
					System.out.println("Sad Face");
				} else if (numberOfCookies % numberOfChildren < 3){
					System.out.println("Yes!");
				} else if (numberOfCookies % numberOfChildren < 5) {
					System.out.println("Whoohoooo!");
				} else
					System.out.println("Jackpot!");
				}

	}


