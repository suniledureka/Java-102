package co.edureka.java.lambdas;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BookService {
	public List<Book> getBooksInOrderOfBookId(){
		List<Book> books = new BookDAO().getAllBooks();
		
		//Collections.sort(books, (Book o1, Book o2) -> o1.getBookId()-o2.getBookId());
		Collections.sort(books, (newBook, existingBook) -> newBook.getBookId()-existingBook.getBookId());
		
		return books;
	}
}
