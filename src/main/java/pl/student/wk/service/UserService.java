package pl.student.wk.service;

import java.util.List;

import pl.student.wk.User;

public interface UserService {

	public void addUser(User user);
	public void editUser(User user);
	public List<User> listUser();
	public void removeUser (int id);
	public User getUser(int id);
	
}
