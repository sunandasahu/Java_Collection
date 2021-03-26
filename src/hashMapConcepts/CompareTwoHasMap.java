package hashMapConcepts;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class CompareTwoHasMap {

	public static void main(String[] args) {
		HashMap<Integer,String> map1 = new HashMap<Integer,String>();
		map1.put(1, "A");
		map1.put(2, "B");
		map1.put(3, "C");
		
		HashMap<Integer,String> map2 = new HashMap<Integer,String>();
		map2.put(1, "A");
		map2.put(2, "B");
		map2.put(3, "C");
		map2.put(3, "C");
		
		HashMap<Integer,String> map3 = new HashMap<Integer,String>();
		map3.put(1, "A");
		map3.put(2, "B");
		map3.put(3, "C");
		map3.put(4, "D");
		//1.Compare hashmap using equals method
		
		System.out.println(map1.equals(map2));//true
		System.out.println(map1.equals(map3));//false
		
		//2.Compair hashmap using same keyset
		
		System.out.println(map1.keySet().equals(map2.keySet()));//true
		System.out.println(map2.keySet().equals(map3.keySet()));//false
		
		//3.Find extra key value pair by combining keys from both maps in HashSet
		HashSet<Integer> combinekeys = new HashSet<Integer>(map1.keySet());//created a hashset using map1 keys
		combinekeys.addAll(map3.keySet());//Added all keys from map3 with the hashSet which has map1 keys
		combinekeys.removeAll(map1.keySet());//removing all keys present in map1
		System.out.println(combinekeys);// Printing only the extra key present in the combined hashset
		
		//4.Compair hashmap by value
		HashMap<Integer,String> map4 = new HashMap<Integer,String>();
		map4.put(1, "E");
		map4.put(2, "F");
		map4.put(3, "G");
		
		HashMap<Integer,String> map5 = new HashMap<Integer,String>();
		map5.put(4, "E");
		map5.put(5, "F");
		map5.put(6, "G");
		
		HashMap<Integer,String> map6 = new HashMap<Integer,String>();
		map6.put(1, "E");
		map6.put(2, "F");
		map6.put(3, "G");
		map6.put(4, "G");
		
		
		
		//If duplicates are not allowed --> we create ArrayList
	System.out.println(new ArrayList<>(map4.values()).equals(new ArrayList<>(map5.values())));//true
	System.out.println(new ArrayList<>(map4.values()).equals(new ArrayList<>(map6.values())));//false
	
	//If duplicates are allowed we will create a hashSet
	System.out.println(new HashSet<>(map4.values()).equals(new HashSet<>(map5.values())));//true
	System.out.println(new HashSet<>(map4.values()).equals(new HashSet<>(map6.values())));//true,because it s ignoring the duplicate

	}

}
