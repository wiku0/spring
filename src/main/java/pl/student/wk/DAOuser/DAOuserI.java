package pl.student.wk.DAOuser;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import pl.student.wk.User;

@Repository
public class DAOuserI implements DAOuser{


	@Autowired
    SessionFactory sessionFactory;
 
	public DAOuserI(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
	
    public void addUser(User user) {
        sessionFactory.getCurrentSession().save(user);
    }
 
    public List<User> listUser() {
 
        return null;  // sessionFactory.getCurrentSession().createQuery("from User order by id").list();
    }
 
    public void removeUser(int id) {
        User user = (User) sessionFactory.getCurrentSession().load(
                User.class, id);
        if (null != user) {
            sessionFactory.getCurrentSession().delete(user);
        }
 
    }
    public User getUser(int id) {
    	
    	return (User)sessionFactory.getCurrentSession().get(User.class, id);
    }
    
  public void editUser(User user) {
    	
    	sessionFactory.getCurrentSession().update(user);
    }
	
}
