import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Week4CollectionsLab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1
		/*String cannot be alter without redefining it in our program
		String builder allows us to modify the string by adding a deleting sections of the
		String builder
		If we need to modify the string in anyway a string builder would the moist efficient datatype*/
		
		//2
		StringBuilder builder= new StringBuilder();
		for(int i=0; i<10; i++) {
			builder.append(i);
			if(i != 9) {
				builder.append("-");
			}
		}
		System.out.println(builder.toString());
		
		//3
		List<String> listOfStrings= new ArrayList<String>();
		listOfStrings.add("Tooth");
		listOfStrings.add("Speaker");
		listOfStrings.add("TV");
		listOfStrings.add("Book");
		listOfStrings.add("Monster");
		
		//4
		System.out.println(shortestString(listOfStrings));
		
		//5
		System.out.println(firstToLast(listOfStrings));
		
		//6
		System.out.println(concatenated(listOfStrings));
		
		//7
		System.out.println(search(listOfStrings, "oo"));
		
		//8
		List<Integer> numbers=  new ArrayList<Integer>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);
		numbers.add(6);
		numbers.add(7);
		numbers.add(8);
		System.out.println(divisable(numbers)); 
	
		//9
		System.out.println(lengthOfString(listOfStrings));
		
		//10
		Set<String> set = new HashSet<String>();
		set.add("Phone");
		set.add("Ear");
		set.add("Brush");
		set.add("Glass");
		set.add("Paper");
		
		//11
		System.out.println(startsWith(set, 'B'));

		//12
		System.out.println(toList(set));
		
		//13
		Set<Integer> intSet = new HashSet<Integer>();
		intSet.add(23);
		intSet.add(45);
		intSet.add(20);
		intSet.add(17);
		intSet.add(11);
		
		System.out.println(evens(intSet));
		
		//14
		Map<String,String> dictionary = new HashMap<String,String>();
		dictionary.put("learn", "gain or acquire knowledge of or skill in (something) by study, experience, or being taught.");
		dictionary.put("notification","the action of notifying someone or something." );
		dictionary.put("palindrome","a word, phrase, or sequence that reads the same backward as forward,");

		//15
		System.out.println(valueOfKey(dictionary,"learn"));
		
		//16
		System.out.println(returnMap(listOfStrings));
		
	}

	
	public static Map<Character, Integer> returnMap(List<String> listOfStrings) {
		Map<Character, Integer> returned = new HashMap<Character, Integer>();
		for(String string: listOfStrings) {
			char letter = string.charAt(0);
			if (returned.get(letter) == null) {
				returned.put(letter,1);
			}
			else {
				returned.put(letter,returned.get(letter)+1);
			}
			
		}
		return returned;
	}


	public static String valueOfKey(Map<String, String> dictionary, String string) {
		String value="Not Avalilable";
		for (String key: dictionary.keySet()) {
			if(key==string) {
				value=dictionary.get(key);
			}
		}
		return value;
	}


	public static Set<Integer> evens(Set<Integer> intSet) {
		Set<Integer> set = new HashSet<Integer>();
		for(int num: intSet) {
			if (num%2==0) {
				set.add(num);
			}
		}
		
		return set;
	}


	public static List<String> toList(Set<String> set) {
		List<String> returned = new ArrayList<String>();
		for( String string: set) {
			returned.add(string);
		}
		return returned;
	}


	public static Set<String> startsWith(Set<String> set, char letter) {
		Set <String> returned = new HashSet<String>();
		
		for (String string: set) {
			if (string.charAt(0)==letter){
				returned.add(string);
			}
		}
		return returned;
	}


	public static List<Integer> lengthOfString(List<String> listOfStrings) {
		List<Integer> numbers= new ArrayList<Integer>();
		for (String string: listOfStrings) {
			numbers.add(string.length());
		}
		return numbers;
	}


	public static List<List<Integer>> divisable(List<Integer> numbers) {	
		List<List<Integer>> returned = new ArrayList<List<Integer>>();
		returned.add(new ArrayList<Integer>());
		returned.add(new ArrayList<Integer>());
		returned.add(new ArrayList<Integer>());
		returned.add(new ArrayList<Integer>());
		
		for(int num: numbers) {
			if(num %2==0) {
				returned.get(0).add(num);	
			}
			if(num%3==0) {
				returned.get(1).add(num);
			}
			if(num%5==0) {
				returned.get(2).add(num);
			}
			if(num %2==0 && num%3==0 && num%5==0) {
				returned.get(3).add(num);
			}
		}
		return returned;
	}


	public static List<String> search(List<String> listOfStrings, String string) {
		List<String> returned = new ArrayList<String>();
		for(String word: listOfStrings) {
			if(word.contains(string)) {
				returned.add(word);
			}
		}
		return returned;
	}


	public static StringBuilder concatenated(List<String> listOfStrings) {
		StringBuilder combined= new StringBuilder();
		for(String string: listOfStrings) {
			combined.append(string+", ");
			
		}
		return combined;
		
	}
	
	public static List<String> firstToLast(List<String> listOfStrings) {
			String a=listOfStrings.get(0);
			String b=listOfStrings.get(listOfStrings.size()-1);
			listOfStrings.set(0, b);
			listOfStrings.set(listOfStrings.size()-1, a);
			return listOfStrings;
				
				
			}

	public static String shortestString (List<String> listOfStrings) {
		String small =listOfStrings.get(0);
		for(String string:listOfStrings) {
			if (small.length() > string.length()) {
				small=string;
			}
		}
		return small;
		
	}
	

}
