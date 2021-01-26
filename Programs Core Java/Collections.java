package collections;

import java.util.*;

public class IteratorDemo {

	public static void main(String[] args) {

		List<Integer> l1 = new ArrayList<Integer>();
		l1.add(56);
		l1.add(12);
		l1.add(89);
		l1.add(45);
		l1.add(78);
		l1.add(96);

		Iterator<Integer> i1 = l1.iterator();

		/*
		 * hasNext() -- check next element in the collection is prsnt or not 
		 * next () ---get Current element
		 *  remove () -- remove the current element
		 * 
		 * 
		 */

		while (i1.hasNext()) {
			System.out.println(i1.next());
		}

	}
}

package collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
/*
 *		Wrapper class  
 * 	String -- Class
 * 
 * 	Integer  : parseInt()
 * 	Float  : parseFloat()
 *  Double
 *  Character
 *  Long
 *  Short
 *  Boolean
 *  Byte
 * 
 */

public class ListDemo {
	public static void main(String[] args) {
		ArrayList<Integer> l1 = new ArrayList<Integer>();
		l1.add(23);
		l1.add(56);
		l1.add(78);
		l1.add(23);

		System.out.println(l1);
		System.out.println(l1.get(2));

		l1.add(2, 84);
		l1.set(1, 65);

		System.out.println(l1);
		System.out.println(l1.contains(84));
		// System.out.println(l1.remove(2));
		System.out.println(l1.isEmpty());

		System.out.println(l1);
		System.out.println(l1.subList(1, 4));

		LinkedList<Integer> l2 = new LinkedList<Integer>();
		l2.add(12); // node 12 , C23
		l2.add(63);
		l2.add(13);
		l2.add(44);
		l2.add(84);
		
		System.out.println("-----------------------------------------------");
		System.out.println(" l1 : " + l1);
		System.out.println("l2 : " +  l2.get(4));
		
		l2.addAll(2,l1);
		System.out.println(l2);
		
		
		
		Collections.sort(l1);
		System.out.println(l1);
		
		Collections.sort(l2,Collections.reverseOrder());
		System.out.println(l2);
		
	}
}

package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetDemo {
	public static void main(String[] args) {
		// Unorderd data
		HashSet<Integer> s1 = new HashSet<Integer>();
		s1.add(450);
		s1.add(7854);
		s1.add(74123);
		s1.add(12);
		s1.add(78);
		s1.add(78);
		System.out.println(s1);
		System.out.println(s1.contains(12));
		
		TreeSet<Integer> s4 = new TreeSet<Integer>();
		s4.addAll(s1);
		System.out.println(s4);
		
		// Ascending Order
		TreeSet<Integer> s2 = new TreeSet<Integer>();

		s2.add(74);
		s2.add(852);
		s2.add(13);
		s2.add(54);
		System.out.println(s2);
		// InsertionOrder
		LinkedHashSet<Float> s3 = new LinkedHashSet<Float>();
		s3.add(87.2f);
		s3.add(9630.00f);
		s3.add(156.32f);
		s3.add(4.345f);
		System.out.println(s3);
		
		
		
		
	}

}
