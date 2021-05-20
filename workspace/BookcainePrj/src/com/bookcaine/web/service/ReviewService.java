package com.bookcaine.web.service;

import java.util.List;

import com.bookcaine.web.entity.Review;

public interface ReviewService {

	List<Review> getList(int bookId);
	int insert(Review review);
	
	
}
