package co.edureka.java.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {
		List<Integer> marks = Arrays.asList(65, 82, 76, 60, 92, 81, 50);
		
		Stream<Integer> st = marks.stream();
		System.out.println("no of subjects = " + st.count()); //7
		System.out.println();
		
		List<Book> books = new BooksDAO().getAllBooks();
		
		int maxBookId = books.stream().max(Comparator.comparingInt(Book::getBookId)).get().getBookId();
		System.out.println("maximum bookid: " + maxBookId);
		System.out.println();
		
		Book maxBook = books.stream().max(Comparator.comparingInt(Book::getBookId)).get();
		System.out.println("book with highest book id = " + maxBook);
	}
}
