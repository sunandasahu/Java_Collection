package arrayListConcepts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayList_PrintEvenNumbers {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
		numbers.removeIf(num-> num%2==1);
		System.out.println(numbers);
		// for singleton element, it returns only the specified element
		ArrayList<String> nameList = new ArrayList<String>(Arrays.asList("Tom","Herry","Tom", "Sunita","Tom","Deepti"));
		nameList.retainAll(Collections.singleton("Tom"));
		System.out.println(nameList);
		
		// Creating a Sublist from an arraylist
		ArrayList<Integer> numberList = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15));
		ArrayList<Integer> subList =new ArrayList<Integer> (numberList.subList(1, 5));//specifing from which index to which , we want the sublist to
		System.out.println(subList);
		
		//Convert to Array
		ArrayList<String> newnameList = new ArrayList<String>(Arrays.asList("Tom","Herry","Tom", "Sunita","Tom","Deepti"));
		Object arr[]=newnameList.toArray();
		System.out.println(Arrays.toString(arr));
		for(Object o:arr) {
			System.out.println((String)o);
		}
		
		

	}

}
