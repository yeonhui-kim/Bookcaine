package com.bookcaine.web.service;

import java.util.List;

import com.bookcaine.web.entity.Member;

public interface MemberService {

	List<Member> getList();
	int insert(Member member);
	
}
