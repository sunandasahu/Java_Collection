package arrayListConcepts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CompareArrayLists {

	public static void main(String[] args) {
		ArrayList<String> l1 = new ArrayList<String>(Arrays.asList("C","D","A","B","F"));
		ArrayList<String> l2 = new ArrayList<String>(Arrays.asList("E","D","A","B","F"));
		ArrayList<String> l3 = new ArrayList<String>(Arrays.asList("A","D","C","B","F"));
		Collections.sort(l1);
		Collections.sort(l2);
		Collections.sort(l3);
		System.out.println(l1.equals(l2));
		System.out.println(l1.equals(l3));
		
		//2.compare arraylist---findout additional element
		ArrayList<String> l4 = new ArrayList<String>(Arrays.asList("C","D","A","B","F","G"));
		ArrayList<String> l5 = new ArrayList<String>(Arrays.asList("C","D","A","B","F","H"));
		Collections.sort(l4);
		Collections.sort(l5);
		l4.removeAll(l5);
		System.out.println(l4);
		
		//3. findout missing element
		
		ArrayList<String> l6 = new ArrayList<String>(Arrays.asList("C","D","A","B","F","G","I"));
		ArrayList<String> l7 = new ArrayList<String>(Arrays.asList("C","D","A","B","F","G","E"));
		l7.removeAll(l6);
		System.out.println(l7);
		//Find common element
		
		ArrayList<String> l8 = new ArrayList<String>(Arrays.asList("Java","Python","C","Ruby"));
		ArrayList<String> l9 = new ArrayList<String>(Arrays.asList("Java","Python","C","Ruby", "JavaScript"));
		l8.retainAll(l9);
		System.out.println(l8);
		
		
		
		
		

	}

}
