
public class Week3LabArraysandMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1
		int values[]= {1,5,2,8,13,6};
		//2
		System.out.println(values[0]);
		//3
		System.out.println(values[values.length-1]);
		//4 (out of bounds error)
		//System.out.println(values[6]);
		//5 (out of bounds error)
		//System.out.println(values[-1]);
		//6
		for (int i=0;i<values.length;i++) {
			System.out.println(values[i]);
		}
		//7
		for (int number : values) {
			System.out.println(number);
		}
		//8
		int sum=0;
		for (int i=0;i<values.length;i++) {
			sum+=values[i];
		}
		//9
		for (int number : values) {
			if (number%2==1)
				System.out.println(number);
		}
		//10
		String[] names= {"Sam","Sally","Thomas","Robert"};
		//11
		int sum2=0;
		for (int i=0;i<names.length;i++) {
			sum2=names[i].length();
		}
		//12
		greeting("Marlon");
		//13
		//14
		StringLongerThanInt("Burrito",5);
		//15
		existsInArry(names[], "Pretty");
		//16
		smallestNumber(values[]);
		//17
		double math[]= {5.7,6.9,7.7};
		average(math[]);
		
		}
		public static void greeting (String word) {
			System.out.println("Hello "+ word);
		}
		public static boolean StringLongerThanInt (String word,int num) {
			if(word.lenth()>num)
				return true;
			else
				return false;
		}
		public static boolean existsInArry(String[] words, String letters) {
			for (int i=0;i<words.length;i++) {
				if (words[i]==letters)
					return true;
				else 
					return false;
			}
		}
		public static int smallestNumber(int numbers[]){
			int num=numbers[0];
			for (int i=0;i<numbers.length;i++){
				if (num>numbers[i])
					num=numbers[i];
			}
			return num;
		}
		public static double average(double numbers[]) {
			double avg=0.0;
			for(int i=0; i<numbers.length; i++) {
				avg+=numbers[i];
			}
			return avg/numbers.length;
		}
	}
	


