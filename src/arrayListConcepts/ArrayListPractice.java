package arrayListConcepts;

import java.util.ArrayList;

public class ArrayListPractice {
	
	public static void main(String[] args) {
		//Arrays
//		int a[] = new int[4];//int array
//		a[0] = 100;
//		a[1] = 10;
//		a[2] = 20;
//		a[3]= 30;
//		System.out.println(a[1]);
		
//		String a[]=new String [2];// String array
//		a[0]= "abc";
//		a[1]= "efg";
//		System.out.println(a[1]);
		
		
		// Default generic arraylist
//		ArrayList ar = new ArrayList ();
//		ar.add(10);
//		ar.add("abc");
//		ar.add(10.55);
//		System.out.println(ar);
		
		
		
		//integer arraylist: we are specifying what kind of data we want to store
		
//		ArrayList<Integer> number = new ArrayList<Integer> ();
//		number.add(5);
//		number.add(200);
//		number.add(20);
//		System.out.println(number);
		
		ArrayList<Object> obj = new ArrayList<Object> ();
		obj.add(5);
		obj.add("ijk");
		obj.add(20.55);
		obj.add(75);
		obj.add("testing");
		System.out.println(obj);
		System.out.println(obj.get(2));
		System.out.println(obj.size());
		System.out.println("LI is : "+ 0);
		System.out.println("HI is : " + (obj.size()-1));
			
	}

}
