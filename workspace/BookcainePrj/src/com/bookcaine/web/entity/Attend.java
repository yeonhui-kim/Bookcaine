package com.bookcaine.web.entity;

public class Attend {
	String member_id;
	int gathering_id;
	
	public Attend() {
		// TODO Auto-generated constructor stub
	}
	
	public Attend(String member_id, int gathering_id) {
		super();
		this.member_id = member_id;
		this.gathering_id = gathering_id;
	}

	public String getMember_id() {
		return member_id;
	}
	public void setMember_id(String member_id) {
		this.member_id = member_id;
	}
	public int getGathering_id() {
		return gathering_id;
	}
	public void setGathering_id(int gathering_id) {
		this.gathering_id = gathering_id;
	}
	
	
}
