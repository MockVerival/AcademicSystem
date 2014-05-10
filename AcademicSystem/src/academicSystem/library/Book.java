package academicSystem.library;

public class Book {
	private long id;
	private int code;
	private String title;
	private String author;

	public Book() {

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
}
