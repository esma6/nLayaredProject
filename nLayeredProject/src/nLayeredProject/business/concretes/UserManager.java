package nLayeredProject.business.concretes;



import java.util.List;

import nLayeredProject.business.abstracts.UserService;
import nLayeredProject.core.utils.Validation;
import nLayeredProject.dataAccess.abstracts.UserDao;
import nLayeredProject.entities.concretes.User;


public class UserManager implements UserService {
	private UserDao userDao;
	
	public UserManager(UserDao userDao) {
		this.userDao=userDao;
		
	}

	@Override
	public void add(User user) {
	
     this.userDao.add(user);
			
		
	}

	@Override
	public void update(User user) {
		this.userDao.update(user);
		
	}

	@Override
	public void delete(User user) {
		this.userDao.delete(user);
		
	}

	@Override
	public List<User> getAll() {
		return this.userDao.getAll();
	}

	@Override
	public User getByEmail(String email) {
		return this.userDao.getByEmail(email);
	}	

}
