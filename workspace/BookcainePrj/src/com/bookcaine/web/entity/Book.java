package com.bookcaine.web.entity;

public class Book {
	int id;
	String title;
	String author;
	String yn;
	String details;
	
	public Book() {
		// TODO Auto-generated constructor stub
	}

	public Book(int id, String title, String author, String yn, String details) {
		super();
		this.id = id;
		this.title = title;
		this.author = author;
		this.yn = yn;
		this.details = details;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getYn() {
		return yn;
	}

	public void setYn(String yn) {
		this.yn = yn;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", author=" + author + ", yn=" + yn + ", details=" + details
				+ "]";
	}
	
	
	

}

	

