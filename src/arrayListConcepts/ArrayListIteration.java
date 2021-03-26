package arrayListConcepts;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIteration {

	public static void main(String[] args) {
		ArrayList<String> std = new ArrayList<String>();
		std.add("Lisa");
		std.add("sunanda");
		std.add("herry"); 
		std.add("tom");
		//for loop
		for (int i=0; i<std.size();i++) {
			System.out.println(std.get(i));	
		}
		System.out.println("---------");
		// For each loop
		
		for(String s : std) {
			System.out.println(s);
			
		}
		System.out.println("---------");
		//Stream with lambda
		std.stream().forEach(ele -> System.out.println(ele));
		
		System.out.println("---------");
		// iterator method
		
		Iterator<String> it= std.iterator();
		while (it.hasNext()) {
		System.out.println(it.next());
		}
	}

}
