
public class Week2ConditionsandLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//part1
		int age = 14;
		System.out.println(age>=16);
		
		age=18;
		System.out.println(age>=16);
		Boolean hasLicense= true;
		
		if (age>16 && hasLicense) {
			System.out.println("You can drive");
		} else {
			System.out.println("You cannot drive");
		}
		
		//part2
		double costOfMilk=2.67;
		int thirstLevel=2;
		
		if (costOfMilk <2.50 || thirstLevel >6) {
			System.out.println("Milk Please");
		} else {
			System.out.println("No Thanks");
		}
		
		//part3
		int numberOfCookies=5;
		int numberOfChildren=5;
		numberOfCookies %= numberOfChildren;
		if(numberOfCookies==0) {
			System.out.println("Sad Face");
		}
		if(numberOfCookies<=2) {
			System.out.println("Yes!");
		}
		if(numberOfCookies<=5) {
			System.out.println("WhooHoooo");
		}
		if(numberOfCookies>=5) {
			System.out.println("Jackpot!");
		}
		
		//part4
		String loyaltyMemberStatus="SILVER";
		double loyaltyMemberDiscount=0.0;
		switch(loyaltyMemberStatus) {
			case "SILVER":
					loyaltyMemberDiscount=.1;
					break;
			case "GOLD":
					loyaltyMemberDiscount=.15;
					break;
			case "PLATNIUM":
					loyaltyMemberDiscount=.25;
					break;
		}
		
		double billTotal=72.33;
		double adjustedTotal=(1+loyaltyMemberDiscount)*billTotal;
		if(adjustedTotal>500) {
			if(loyaltyMemberStatus=="SILVER") {
				loyaltyMemberStatus="GOLD";
			}else if(loyaltyMemberStatus=="GOLD") {
				loyaltyMemberStatus="PLATIUM";
			}
			
			
			}
		
		//part5
		String username="Tommy123";
		String password="123456";
		
		if(username=="Tommy123" && password=="123456") {
			System.out.println("Login Successful");
		} else{
			System.out.println("Access Denied");
		}
		
		//part6
		for(int i=0;i<=9;i++) {
			System.out.print(i+ " ");
		}
		for(int i=10;i>=0;i--) {
			System.out.print(i+" ");
		}
		for(int i=0;i<=100;i+=2) {
			System.out.print(i+ " ");
		}
		for(int i=0;i<=100;i++) {
			if(i%2==0) {
				System.out.print("EVEN ");
			}else {
				System.out.print("ODD ");
			}
		}
		int j=100;
		while(j >0) {
			System.out.print(j%3+ " ");
			j--;
		}
		
		
	}

}
