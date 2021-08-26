package Assignment_26_08_21;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

//Accept a string and count each word how many times its repeating



public class StringAssignment {
	
	public static void countOccurances(String str) {
		String a[] = str.split(" ");
		Map<String, Integer> result = new HashMap<>();
		for (int i = 0; i < a.length; i++) {
			int count = 0;
			String word = a[i];
			for (int j = 0; j < a.length; j++) {
				if (word.equals(a[j]))
			        count++;
			}
			result.put(word, count);
		}
		
		System.out.println(result);
	}

	public static void main(String[] args) {
		String str;
		System.out.println("Enter a sentence to count words:");
		str = Read.sc.nextLine();
		StringAssignment.countOccurances(str);
//		Seashells. She sells sea shells by the sea shore. The shells she sells are surely seashells. So if she sells shells on the seashore, 
//		I'm sure she sells seashore shells.
	}
}
