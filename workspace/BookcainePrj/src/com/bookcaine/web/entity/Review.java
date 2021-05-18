package com.bookcaine.web.entity;

import java.util.Date;

public class Review {
	int id;
	int memberId;
	int bookId;
	String content;
	Date regDate;

	public Review() {

	}

	public Review(int id, int memberId, int bookId, String content, Date regDate) {
		super();
		this.id = id;
		this.memberId = memberId;
		this.bookId = bookId;
		this.content = content;
		this.regDate = regDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

	@Override
	public String toString() {
		return "{\"id=\":" + id + ", \"memberId\":\"" + memberId + "\", \"bookId\":\"" + bookId
				+ "\", \"content\":\"" + content + "\", \"regDate\":\"" + regDate + "\"}";
	}

}
