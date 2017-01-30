package backend.dao;

import java.util.List;
import backend.model.User;

public interface UserDao {
void add(User user);
	
	void update(User user);
	
	void delete(User user);
	
	User getById(int userId);
	
	User getByUsername(String username);
	
	List<User> list();

}
