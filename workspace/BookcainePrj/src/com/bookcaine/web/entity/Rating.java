package com.bookcaine.web.entity;

public class Rating {
	String member_id;
	int book_id;
	int star;
	
	public Rating() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Rating(String member_id, int book_id, int star) {
		super();
		this.member_id = member_id;
		this.book_id = book_id;
		this.star = star;
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
	public int getStar() {
		return star;
	}
	public void setStar(int star) {
		this.star = star;
	}
	@Override
	public String toString() {
		return "Rating [member_id=" + member_id + ", book_id=" + book_id + ", star=" + star + "]";
	}
	
	
}
