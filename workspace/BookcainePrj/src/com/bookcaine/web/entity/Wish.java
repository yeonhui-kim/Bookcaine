package com.bookcaine.web.entity;

public class Wish {
	String member_id;
	int book_id;
	
	public Wish() {
		// TODO Auto-generated constructor stub
	}
	
	public Wish(String member_id, int book_id) {
		super();
		this.member_id = member_id;
		this.book_id = book_id;
	}

	public String getMember_id() {
		return member_id;
	}
	public void setMember_id(String member_id) {
		this.member_id = member_id;
	}
	public int getBook_id() {
		return book_id;
	}
	public void setBook_id(int book_id) {
		this.book_id = book_id;
	}
	
	
}
