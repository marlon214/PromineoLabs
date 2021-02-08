
public class week1VariablesAndOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//Part 1
	int availablePlaneSeats=8;
	double costOfGroceries= 213.63;
	char middleInitial='H';
	boolean isHotOutside=true;
	String customerFirstName="Jimmy";
	String streetAddress="1234 Gravel Rd";
	
	System.out.println("There are " +availablePlaneSeats+ " available plane seats");
	System.out.println("The cost of groceries is $" + costOfGroceries);
	System.out.println("The middle initial is " + middleInitial);
	System.out.println("It is hot outside: " + isHotOutside);
	System.out.println("The customer's first name is " + customerFirstName);
	System.out.println(streetAddress +" is their street address");
	System.out.println("");
	
	//Part 2
	System.out.println("You booked 2 plane seats!");
	availablePlaneSeats-=2;
	System.out.println("There are " +availablePlaneSeats+ " available plane seats");
	System.out.println("You added a candy bar to your groceries for $2.15");
	costOfGroceries+=2.15;
	System.out.println("The cost of groceries is $" + costOfGroceries);
	System.out.println("The birth certificate was wrong!");
	middleInitial='T';
	System.out.println("The actual middle initial is " + middleInitial);
	System.out.println("The season changed!");
	isHotOutside= false;
	System.out.println("It is hot outside: " + isHotOutside);
	String fullName= customerFirstName+" "+middleInitial+" Anderson";
	System.out.println(fullName);
	System.out.println("Hi, my name is "+fullName+" and my address is "+streetAddress);


	

	
	
	
	
	
	}

}
