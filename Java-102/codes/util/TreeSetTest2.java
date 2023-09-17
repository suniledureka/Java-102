package co.edureka.java.util;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest2 {

	public static void main(String[] args) {
		Set<Book> books = new TreeSet<Book>(new BooksComparator());
		
		Book bk1 = new Book(123, "Java");
		Book bk2 = new Book(101, "Python");
		Book bk3 = new Book(145, "React");
		Book bk4 = new Book(108, "Angular");
		Book bk5 = new Book(115, "Spring");
		
		books.add(bk1);
		books.add(bk2);
		books.add(bk3);
		books.add(bk4);
		books.add(bk5);
		
		Iterator<Book> it = books.iterator();
		while(it.hasNext()) {
			Book bk = it.next();
			System.out.println(bk);
		}
	}
}

class BooksComparator implements Comparator<Book>{

	@Override
	public int compare(Book o1, Book o2) {
		return o1.getBookId() - o2.getBookId();
	}
	
}
