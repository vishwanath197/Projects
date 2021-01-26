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

package collections.Book;

public class Book {
	
	private int bookId;
	private String Name, Author,publisher;
	private float cost;
	private static int idGen = 101;
	
	public Book() {
		bookId = idGen++;
	}

	public Book(String name, String author, String publisher, float cost) {
		this();
		Name = name;
		Author = author;
		this.publisher = publisher;
		this.cost = cost;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getAuthor() {
		return Author;
	}

	public void setAuthor(String author) {
		Author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public float getCost() {
		return cost;
	}

	public void setCost(float cost) {
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", Name=" + Name + ", Author=" + Author + ", publisher=" + publisher
				+ ", cost=" + cost + "]";
	}
	
	

}

package collections.Book;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class BookDetails {

	public static void main(String[] args) {

		Book b1 = new Book("Harry Potter", "JK Rowling", "Bloomsburry", 2000);
		Book b2 = new Book("Avengers", "Stanlee", "Marvel", 1500);
		Book b3 = new Book("The Richest Man in Babylon", "S Clason", "Fingerprint Classics", 150);
		Book b4 = new Book("Three Mistakes of My Life", "Chethan Bhagat", "Indian Publishications", 500);
		Book b5 = new Book("Houn of Baskervilla", "Conan ", "George", 900);

		List<Book> bookList = new ArrayList<Book>();
		bookList.add(b1);
		bookList.add(b2);
		bookList.add(b3);
		bookList.add(b4);
		bookList.add(b5);

	/*	for (Book b : bookList) {
			System.out.println(b);
		}

		System.out.println("------------------------------------------------");

		// cost > 500 ,print id, Name
		for (Book b : bookList) {

			if (b.getCost() > 500)
				System.out.println(b.getBookId() + "    " + b.getName());
		}
		// Comparable or Comparator
		Collections.sort(bookList, new CostComparator());

		System.out.println("------------------------------------------------");

		for (Book b : bookList) {
			System.out.println(b);
		}

		AuthorComparator a = new AuthorComparator();

		Collections.sort(bookList, new AuthorComparator());

		System.out.println("------------------------------------------------");*/
		
		Iterator<Book> i = bookList.iterator();
		
		while(i.hasNext()) {
			Book b = i.next(); // id,Name,Author, Publisher,cost
			if(b.getCost() < 500)
				i.remove();
			
		}
		
		for(Book b : bookList) {
			System.out.println(b);
		}
		

	}
}

package collections.Book;
import java.util.*;
public class BookDetailsSet {
	public static void main(String[] args) {
		Set<Book> bookSet = new HashSet<Book>();
		bookSet.add(new Book ("Harry Potter","JK Rowling","Bloomsburry",2000));
		bookSet.add(new Book ("Avengers","Stanlee","Marvel",1500));
		bookSet.add(new Book("The Richest Man in Babylon","S Clason","Fingerprint Classics",150));
		bookSet.add(new Book("Three Mistakes of My Life","Chethan Bhagat","Indian Publishications",500));
		bookSet.add(new Book("Houn of Baskervilla","Conan ","George",900));
		
		
		for(Book b : bookSet) {
			System.out.println(b);
		}
		
		
		Set<Book> bookTreeSet = new TreeSet<Book>(new AuthorComparator());
		bookTreeSet.addAll(bookSet);
		
		System.out.println("-------------------------------------------------------------");
		for(Book b : bookTreeSet) {
			System.out.println(b);
		}
		
		
		
	}

}

package collections.Book;

import java.util.Comparator;

public class CostComparator implements Comparator<Book>{

	/*
	 * 		Negative -1
	 * 		0
	 * 		positive 1
	 * 
	 */
	
	
	
	@Override
	public int compare(Book s1, Book s2) {
		if(s1.getCost() > s2.getCost())
			return 1;
		else if(s1.getCost() < s2.getCost())
			return -1;
		
		
		return 0;
	}

}
