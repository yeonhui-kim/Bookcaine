package com.bookcaine.web.service;

import java.util.List;

import com.bookcaine.web.entity.Book;
import com.bookcaine.web.entity.Gathering;

public interface ProfileService {
	
	List<Gathering> getGatheringList(String memberId);
	List<Book> getBookList(String memberId);
	
	int getFollowerCount(String memberId);
	int getFollowingCount(String memberId);
	

}
