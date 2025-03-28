package ex04_api;

public class Book {
	String title;
	String name;
	
	public Book(String title, String name) {
		this.name = name;
		this.title = title;
	}
	
	@Override
	public String toString() {
		String str = "책 제목: " + this.title+ ", " + "저자: " + this.name;
		return str;

	}
}
