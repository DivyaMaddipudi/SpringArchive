package org.divya.DAO;

import java.util.List;

import org.divya.model.User;

public interface AppDAO {
	
	public List<User> listUsers();
	
	public void addUser(User user);

}
