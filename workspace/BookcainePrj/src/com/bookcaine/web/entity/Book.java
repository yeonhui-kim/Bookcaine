package com.bookcaine.web.entity;

public class Book {
	String title;
	String author;
	int pubYear;
	int readerNum;
	
	public Book() {
		
	}

	public Book(String title, String author, int pubYear, int readerNum) {
		super();
		this.title = title;
		this.author = author;
		this.pubYear = pubYear;
		this.readerNum = readerNum;
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

	public int getPubYear() {
		return pubYear;
	}

	public void setPubYear(int pubYear) {
		this.pubYear = pubYear;
	}

	public int getReaderNum() {
		return readerNum;
	}

	public void setReaderNum(int readerNum) {
		this.readerNum = readerNum;
	}

	@Override
	public String toString() {
		return "{\"title\":" + title + ", \"author\":" + author + ", \"pubYear\":" + pubYear + ", \"readerNum\":" + readerNum
				+ "\"}";
	}
	
	
}

	

