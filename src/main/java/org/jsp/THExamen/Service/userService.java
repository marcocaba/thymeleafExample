package org.jsp.THExamen.Service;

import java.util.List;

import org.jsp.THExamen.Entity.User;


public interface userService {
	
	public List<User> findAll();
	
	public User findById(int theId);
	
	public void save(User theContact);
	
	public void deleteById(int theId);

}
