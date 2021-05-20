package com.bookcaine.web.service;

public interface Mng_bookDetailService {

	String getCategory(int bookId);
	String getBookYN(int bookId); // yn 가져오기
	int getRatingCount(int bookId);
	int getReviewCount(int bookId);
	int getGatheringCount (int bookId);
	int getGatheringCount (int bookId, int memberId);
	
	String getBookDetails (int bookId);
	String getAuthorDetails (int bookId);
	
}
