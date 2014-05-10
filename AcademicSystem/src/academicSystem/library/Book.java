package academicSystem.library;

public class Book {
	private long id;
	private int code;
	private String title;
	private String author;
	private String status;
	private Library library;

	public Book(Library library) {
		this.library = library;
	}
	
	public long getId() {
		return id;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Library getLibrary() {
		return library;
	}
}
