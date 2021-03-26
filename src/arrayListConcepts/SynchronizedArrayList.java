package arrayListConcepts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class SynchronizedArrayList {
      // 1. Collections.synchronizedList();
	public static void main(String[] args) {
		// creating a list
		List<String> names = Collections.synchronizedList(new ArrayList<String>());
		names.add("Tom");
		names.add("Sunanda");
		names.add("Arushi");
		names.add("Arya");
		
		//To add or remove we do not need explicit synchronized
		
		// to fetch/traverse the value we need explicit synchronization
		
		synchronized (names) {
			Iterator <String> it = names.iterator();
					while(it.hasNext()) {
						System.out.println(it.next());
						
						
					}
		}
		System.out.println("------------------");
		// 2 . CopyOnWriteArrayList class---- Already thread safe
		CopyOnWriteArrayList<String> empList = new CopyOnWriteArrayList<String>();
		empList.add("Java");
		empList.add("Python");
		empList.add("Ruby");
		empList.add("Pearl");
		Iterator<String> itr= empList.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
		
		

	}

}
