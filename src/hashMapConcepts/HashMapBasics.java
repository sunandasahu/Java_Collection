package hashMapConcepts;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapBasics {

	public static void main(String[] args) {
		//HashMap Implements Map Interface. It does not maintain insertion order
		// It stores value in key:value pair
		//Key can not be duplicate.Because it give the new value.
		//If a key is not present it will give a null value
		//It can have only one null Key but multiple null values
		//HashMap is not thread safe. It is unsynchronized
		
		
		//Create a hashmap
		HashMap<String, String> capitalMap = new HashMap<String, String>();	
		capitalMap.put("INDIA","New Delhi");
		capitalMap.put("USA","Washington DC");
		capitalMap.put("UK","London");
		capitalMap.put(null,"ABC");
		capitalMap.put(null,"new value");
		capitalMap.put("Pakistan",null);
		capitalMap.put("japan",null);
		//Remove () to remove a key value
		//
		capitalMap.remove("Pakistan");
		
		System.out.println(capitalMap.get("INDIA"));
		System.out.println(capitalMap.get("Jermany"));
		System.out.println(capitalMap.get(null));
		System.out.println(capitalMap.get("Pakistan"));
		
		//How to iterate the hashmap?
		//Iterator method: over keyset
		Iterator<String> it = capitalMap.keySet().iterator();
		while (it.hasNext()) {
			String key = it.next();
			String value = capitalMap.get(key);
			System.out.println("Key : " + key + "   Value: "+ value);
			}
		System.out.println("--------------------------");
		//Iterator: over the set by using entrySet
		Iterator<Entry<String, String>> it1 = capitalMap.entrySet().iterator();
		while(it1.hasNext()){
			Entry<String, String> entry = it1.next();
			System.out.println("key: "+ entry.getKey() +"  Value: "+ entry.getValue() );
			}
		System.out.println("--------------------------");
		
		//Iterate hashmap using Java 8 foreach and lambda
		
		capitalMap.forEach((k,v) -> System.out.println("Key:  "+ k + "  Value:  "+ v));
	

	}

}
