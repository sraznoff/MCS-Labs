
public class week1VariablesAndOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create a variable to hold the quantity of available plane seats left on a flight
		int availablePlaneSeats = 5;
		//create a variable to hold the total cost of groceries at a checkout;
		double groceryBill = 42.31;
		//create a variable to hold a person's middle initial
		char middleInitial = 'e';
		//create a variable to hold true if its hot outside and false if its cold outside
		boolean isHot = false;
		//create a variable to hold a person's first name
		String firstName = "Gerald";
		//create a variable to hold a street address
		String streetAddress = "1234 W. Franklin Blvd, Thermopolis, WY 59015";
		// print all variables to the console
		System.out.println(availablePlaneSeats);
		System.out.println(groceryBill);
		System.out.println(middleInitial);
		System.out.println(isHot);
		System.out.println(firstName);
		System.out.println(streetAddress);
		
		// a customer booked two plane seats, remove two seats from the available seats variable
		//availablePlaneSeats	= availablePlaneSeats - 2;
		availablePlaneSeats -= 2;
		//add 2.15 to grocery purchase
		groceryBill += 2.15;
		//change middle initial to something else
		middleInitial = 'j';
		//flip hot outside variable
		//isHot = true;
		isHot = !isHot;
		//concat the name
		String fullName = firstName + ' ' + middleInitial + " smith";
		System.out.println(fullName);
				
		//print an introduction
		System.out.println("This is " + fullName + " Who lives at " + streetAddress);
		
	}

}
