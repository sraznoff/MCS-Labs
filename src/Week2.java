
public class Week2 {
	public static void main(String[] args){
		// TODO Auto-generated method stub
		int age = 34;
		System.out.println(age >=16);
		if (age >= 16) {
			System.out.println("You can drive.");
			
		}else {
			System.out.println("you cannot drive.");
		}
		boolean hasLicense = false;
		if (age >= 16 && hasLicense) {
			System.out.println("You Can Drive");
		}else {
			System.out.println("You cannot drive.");
		}
		
		double costOfMilk = 1.99;
		int thirstLevel = 5;
		
		if (costOfMilk < 2.50 || thirstLevel > 6) {
			System.out.println("Milk Please");
		}else {
			System.out.println("No Thanks");
		}
		
		int numberOfChildren = 18;
		int numberOfCookies = 0014;
		int leftoverCookies = numberOfCookies % numberOfChildren;
		System.out.println(numberOfChildren);
		System.out.println(leftoverCookies);
		if (leftoverCookies == 0) {
			System.out.println("Sad Face");
		}else if (leftoverCookies < 1) {
			System.out.println("Yes");
		}else if (leftoverCookies < 5) {
			System.out.println("WooHoo!");
		}else {
			System.out.println("Jackpot.");
		}
		
		String loyaltyMemberStatus = "GOLD";
		double loyaltyMemberDiscount = 0.0;
		switch (loyaltyMemberStatus) {
		case "SILVER": 
			loyaltyMemberDiscount = 0.1;
			break;
		case "GOLD": 
			loyaltyMemberDiscount = 0.15;
			break;
		case "PLATINUM": 
			loyaltyMemberDiscount = 0.25;
			break;
		}
		
		double billTotal = 4005.48;
		double adjustedTotal = billTotal - (billTotal*loyaltyMemberDiscount);
		System.out.println(adjustedTotal );
		if (adjustedTotal > 500) {
			if (loyaltyMemberStatus == "SILVER") {
				loyaltyMemberStatus  = "GOLD";
			} else if (loyaltyMemberStatus == "GOLD") {
				loyaltyMemberStatus = "PLATINUM";
			}	
		}
		System.out.println(loyaltyMemberStatus);
		
		String username = "Tommy123";
		String password = "12345";
		
		if (username.equals("Tommy123") && password.equals("12345" )) {
			System.out.println("login successful");
		}
		else {
			System.out.println("Access denied");
		}
			
	}
}
