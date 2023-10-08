package co.edureka.java.streams;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SearchBook {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in); 
		
		List<Book> books = new BooksDAO().getAllBooks();
		
		System.out.print("search a book with title contains: ");
		String searchString = sc.next();
		
		/*
		Optional<Book> opt = books.stream().filter(book -> book.getBookTitle().toLowerCase().indexOf(searchString.toLowerCase()) >= 0).findAny();
		if(opt.isPresent())	{
			Book bk = opt.get();
			System.out.println(bk);
		}else {
			System.out.println("no book with title contains: " + searchString);
		}
		*/
		
		//Book bk = books.stream().filter(book -> book.getBookTitle().toLowerCase().indexOf(searchString.toLowerCase()) >= 0).findAny().orElse(new Book());
		//Book bk = books.stream().filter(book -> book.getBookTitle().toLowerCase().indexOf(searchString.toLowerCase()) >= 0).findAny().orElseThrow(); //If a value is present, returns the value, otherwise throws NoSuchElementException.
		//Book bk = books.stream().filter(book -> book.getBookTitle().toLowerCase().indexOf(searchString.toLowerCase()) >= 0).findAny().orElseThrow(() -> new RuntimeException("no book found!"));
		
		//System.out.println(bk);
	}
}
