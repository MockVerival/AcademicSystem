package academicSystem.library;

import java.util.List;

public interface BookInterface {
	
	public List<Book> getBooks();
	public void addBook(Book book);
	public void returnBook(Book book);
}
