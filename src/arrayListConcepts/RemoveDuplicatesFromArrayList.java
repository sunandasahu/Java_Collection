package arrayListConcepts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicatesFromArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> number = new ArrayList<Integer>(Arrays.asList(1,2,3,1,4,5,3,6,7,2,8,7,9,5));
		
		//1.LinkedHashSet
		
		LinkedHashSet<Integer> ListWithoutDuplicates = new LinkedHashSet<Integer>(number);
		ArrayList<Integer> newArrayList = new ArrayList<Integer>(ListWithoutDuplicates);//without using this line also it is printing 
		System.out.println(newArrayList);                                               //no duplicate value
		System.out.println(ListWithoutDuplicates);
		
		//2. using stream method
		
		ArrayList<Integer> markList = new ArrayList<Integer>(Arrays.asList(1,2,3,1,4,5,4,3,6,7,2,8,7,9,5));
		
		List<Integer> newMarkList = markList.stream().distinct().collect(Collectors.toList());
		System.out.println(newMarkList);

	}

}
