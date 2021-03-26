package arrayListConcepts;

import java.util.ArrayList;
import java.util.Arrays;

public class addAll_arrayList {

	public static void main(String[] args) {
	   ArrayList<String> ar1 = new ArrayList<String>();
	   ar1.add("Java");
	   ar1.add("Python");
	   ar1.add("Ruby");
	   ar1.add("JavaScript");
	   ar1.add("C++");
	   
	   ArrayList<String> ar2 = new ArrayList<String>();
	   
	   ar2.add("Manual");
	   ar2.add("Automation");
	   
//	   ar1.addAll(ar2);// Combining two arraylist 
//	   ar1.addAll(2,ar2);//combining two aalist in a specific index.
//       System.out.println(ar1);
	   
//	   ar1.clear();// to clear all elements in an array
//	   System.out.println(ar1);
	   
//	   ArrayList<String>cloneList = (ArrayList<String>)ar1.clone();
//	   System.out.println(cloneList);
	   
	   System.out.println(ar1.contains("Java"));// it returns a boolean value to know whether an element is present or not
	   System.out.println(ar1.indexOf("Ruby"));// this method to know the index of an element
	   
	   ArrayList<String> List1 = new ArrayList<String>(Arrays.asList("Tom","Herry","Tom", "Sunita","Tom","Deepti"));
	   System.out.println(List1);
	   int i = List1.lastIndexOf("Tom");// to know the last index of an element 
	   System.out.println(i);
	   
	   List1.remove(2);// remove the element in the specified index
	   System.out.println(List1);
	   
	   List1.remove("Deepti");//remove the specific element
	   System.out.println(List1);
	   

	}

}
