package co.edureka.java.util;

public class Book {
	private int bookId;
	private String bookTitle;
	
	public Book() {	}

	public Book(int bookId, String bookTitle) {
		super();
		this.bookId = bookId;
		this.bookTitle = bookTitle;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getBookTitle() {
		return bookTitle;
	}

	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}

	@Override
	public String toString() {
		//return "Book [Book ID= " + bookId + " | Book Title= " + bookTitle +"]";
		return String.format("Book [%6d ---> %-22s]", bookId, bookTitle);
	}
}
