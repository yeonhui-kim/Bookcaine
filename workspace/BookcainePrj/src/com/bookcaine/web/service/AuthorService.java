package com.bookcaine.web.service;

import java.sql.SQLException;

import com.bookcaine.web.entity.Author;

public interface AuthorService {

	Author get (int id) throws ClassNotFoundException, SQLException;
}
