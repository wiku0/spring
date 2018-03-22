package pl.student.wk.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pl.student.wk.User;
import pl.student.wk.DAOuser.DAOuser;

@Service
public class UserServiceI implements UserService{

	@Autowired
	DAOuser userDAO;
	
	
	public void addUser(User user) {
		userDAO.addUser(user);
	}
	
	
	public void editUser(User user) {
		userDAO.editUser(user);
	}

	
	public List<User> listUser() {
		
		return userDAO.listUser();
	}

	
	public void removeUser(int id) {
		userDAO.removeUser(id);
	}
	
	
	public User getUser(int id) {
		return userDAO.getUser(id);
	}
}
	

