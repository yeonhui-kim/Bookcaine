package com.bookcaine.web.entity;

import java.util.Date;

public class Review {
	int id;
	String writerId;
	int bookId;
	String content;
	Date regDate;
	String nickname;

	public Review() {

	}

	public Review(int id, String writerId, int bookId, String content, Date regDate, String nickname) {
		super();
		this.id = id;
		this.writerId = writerId;
		this.bookId = bookId;
		this.content = content;
		this.regDate = regDate;
		this.nickname = nickname;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getWriterId() {
		return writerId;
	}

	public void setWriterId(String writerId) {
		this.writerId = writerId;
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
	
	public String getNickname() {
		return nickname;
	}
	
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	@Override
	public String toString() {
		return "{\"id=\":" + id + ", \"writerId\":\"" + writerId + "\", \"bookId\":\"" + bookId
				+ "\", \"content\":\"" + content + "\", \"regDate\":\"" + regDate + "\", \"nickname\":\"" + nickname + "\"}";
	}

}
