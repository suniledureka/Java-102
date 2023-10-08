package co.edureka.java.streams;

import java.util.List;
import java.util.stream.Collectors;

public class MapTest {

	   static int n = 1;
	   
		public static void main(String[] args) {
			BooksDAO dao = new BooksDAO();			
			List<Book> books = dao.getAllBooks();
			
			// get the title of all the books
			List<String> bookTitles = books.stream().map(book -> book.getBookTitle()).collect(Collectors.toList());
			
			System.out.println("================ Book Titles ================");
			for(String title : bookTitles) {
				System.out.println("\t---> " + title);
			}
			System.out.println();
			
			books.stream().map(book -> book.getBookTitle()).forEach(title -> System.out.println(n++ +". "+ title));
		}


}
