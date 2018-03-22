package pl.student.wk.DAOuser;

import java.util.List;

import pl.student.wk.User;;

public interface DAOuser {
	
	public void addUser(User user);
	public List<User> listUser();
	public void removeUser (int id);
	public User getUser(int id);
	public void editUser(User user);

}
