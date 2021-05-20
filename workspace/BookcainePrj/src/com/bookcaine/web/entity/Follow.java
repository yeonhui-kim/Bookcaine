package com.bookcaine.web.entity;

public class Follow {
	private int followingMember;
	private int followedMember;
	
	
	public Follow() {
		
	}
	@Override
	public String toString() {
		return "Follow [followingMember=" + followingMember + ", followedMember=" + followedMember + "]";
	}
	
	public int getFollowingMember() {
		return followingMember;
	}
	
	public void setFollowingMember(int followingMember) {
		this.followingMember = followingMember;
	}
	
	public int getFollowedMember() {
		return followedMember;
	}
	
	public void setFollowedMember(int followedMember) {
		this.followedMember = followedMember;
	}
	
	
}
