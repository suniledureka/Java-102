package co.edureka.java.lambdas;

import java.util.List;

public class Library {

	public static void main(String[] args) throws InterruptedException {
		BookService libService = new BookService();
		
		List<Book> books = libService.getBooksInOrderOfBookId();
		/*
		for(Book bk : books) {
			System.out.println(bk);
			Thread.sleep(1000);
		}
		*/
		books.forEach(bk -> System.out.println(bk));
	}

}
