package academicSystem.library;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Library {
	@Id
	@GeneratedValue
	private long id;
	@OneToMany
	private List<Book> books = new ArrayList<>();;

	public Library() {

	}

	public long getId() {
		return id;
	}

	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}
}
