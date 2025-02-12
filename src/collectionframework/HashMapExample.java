package collectionframework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapExample {

	public static void main(String[] args) {

		HashMap<String, Integer> hashMap = new HashMap<String, Integer>();

		hashMap.put("Akshay", 45);
		hashMap.put("Ram", 23);
		hashMap.put("Sham", 78);
		hashMap.put("Sam", 12);
		System.out.println(hashMap);

		// get all keys
		System.out.println(hashMap.keySet());

		// get all values
		System.out.println(hashMap.values());

		// get both
		System.out.println(hashMap.entrySet());

		// finding the key contains or not
		if (hashMap.containsKey("Ram")) {
			System.out.println("Yes Contains this Key.............");
		} else {
			System.out.println("Does not Contains this Key............");
		}

		// finding the Value is contain or not
		if (hashMap.containsValue(23))
			System.out.println("Yes Contains this value.............");
		else
			System.out.println("Does not Contains this Key............");

		// size of hash map
		System.out.println(hashMap.size());

		// iterate hash map
		Iterator<Map.Entry<String, Integer>> iterator = hashMap.entrySet().iterator();

		while (iterator.hasNext()) {
			Map.Entry<String, Integer> entry = iterator.next();
			System.out.println("Key=>" + entry.getKey() + " value=>" + entry.getValue());
		}

		// remove all data
		hashMap.clear();
		System.out.println(hashMap);
	}

}
