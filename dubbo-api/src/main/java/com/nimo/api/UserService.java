package com.nimo.api;

import java.util.List;

public interface UserService{

	List<String> findAllUser();
	
	void save(String name);
	
}
