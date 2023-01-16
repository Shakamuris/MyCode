package javaPractice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FindDupeStrings {

	public static void main(String[] args) {
		// 1. by comparing the elements in array - worst solution

		String languages[] = { "java", "C++", "C", "Ruby", "Python", "JS", "Perl", "C++", "Python" };

		for (int i = 0; i < languages.length; i++) {
			for (int j = i + 1; j < languages.length; j++) {
				if (languages[i].equals(languages[j])) {
					System.out.println("Duplicate element is: " + languages[i]);
				}
			}
		}
		System.out.println("********");
		// 2. By using Hash set
		Set<String> store = new HashSet<String>();

		for (String lang : languages) {
			if (store.add(lang) == false) {
				System.out.println("Duplicate element is: " + lang);
			}
		}
		System.out.println("********");
		// 3. by Using hash Map

		Map<String, Integer> mapList = new HashMap<String, Integer>();
		for (String lang : languages) {
			Integer count = mapList.get(lang);
			if (count == null) {
				mapList.put(lang, 1);
			} else {
				mapList.put(lang, ++count);
			}
		}
		Set<Entry<String, Integer>> entryset = mapList.entrySet();
		for (Entry<String, Integer> entry : entryset) {
			if (entry.getValue() > 1) {
				System.out.println("Duplicate element is: " + entry.getKey());
			}
		}

	}

}
