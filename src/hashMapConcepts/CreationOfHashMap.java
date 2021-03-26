package hashMapConcepts;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CreationOfHashMap {
	//1. Create hashmap using static block
	static Map<String,Integer> map1;
	static {
		map1 =  new HashMap<String,Integer>();
		map1.put("A", 100);
		map1.put("B", 200);
	}
	

	public static void main(String[] args) {
		//2.Create Hashmap using hashmap class
		Map<String,Integer> map2 = new HashMap<String,Integer>();
		HashMap<String,Integer> map3 = new HashMap<>();
		map3.put("AAA", 111);
		map3.put("BBB", 222);
		System.out.println(map3.get("AAA"));
		System.out.println(map1.get("B"));
		
	//3.Immutable hashmap using singletonmap
		Map<String,Integer> map4 = Collections.singletonMap("Maths",150);
		System.out.println(map4.get("Maths"));
		//map4.put("Science", 75);This gives a UnsupportedOperationException,becoz it is singletonMap,single entry
		
		//4.JDK 8 Creating a 2D array of string using Streams and collecting in the form of Map
		
		Map<String,String> map5 = Stream.of(new String[][] {
			{"TOM", "Java"},
			{"Herry", "python"},
		}).collect(Collectors.toMap(data -> data[0], data -> data[1]));
		System.out.println(map5.get("TOM"));
		
		//5.Using simpleEntry: MutableMap
		Map<String,String> map6 = Stream.of(
				new AbstractMap.SimpleEntry<>("Sunanda", "Testing"),
				new AbstractMap.SimpleEntry<>("Arushi","Student"))
				.collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue));
		System.out.println(map6.get("Sunanda"));
		map6.put("Arya", "Baby");
		System.out.println(map6.get("Arya"));
				
		//6.Using simpleEntry: ImmutableMap
		
		Map<String,String> map7 = Stream.of(
				new AbstractMap.SimpleImmutableEntry<>("Nick", "Engineer"),
				new AbstractMap.SimpleImmutableEntry<>("VIjay","Doctor"))
				.collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue));
		System.out.println(map7.get("Nick"));
		map6.put("Arya", "Baby");// After declairation we can not add more values to the map
		System.out.println(map7.get("Arya"));//It will return null 
		
		//JDK 1.9
		//Create an empty map
		Map<String, String>emptymap = Map.of();
//		emptymap.put("ABC", "DEF");              // We can not add any object to an empty map
//		System.out.println(emptymap.get("ABC"));// So we are getting  UnsupportedOperationException 
		
		//SingletonMap
		Map<String,String> singletonMap = Map.of("k1","v1");
		System.out.println(singletonMap.get("k1"));
		//singletonMap.put("K2", "V2");UnsupportedOperationException
		
		//multivalue map
		Map<String,String> multiMap = Map.of("k1","v1","K2","V2","K3","V3");
		System.out.println(multiMap.get("K3"));
		
	
		
		
		
		}
		
		
		
	

}
