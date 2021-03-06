package nLayeredProject.business.abstracts;


import java.util.List;

import nLayeredProject.entities.concretes.User;

public interface UserService {
	
	void add(User user);
	void update(User user);
	void delete(User user);
	User getByEmail(String email);
	List<User> getAll();

}
