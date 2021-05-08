package nLayeredProject.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import nLayeredProject.dataAccess.abstracts.UserDao;
import nLayeredProject.entities.concretes.User;

public class InMemoryUserDao implements UserDao{
	
	public List<User> users;
	
	public InMemoryUserDao() {
		
		this.users = new ArrayList<User>();
		
	}

	@Override
	public void add(User user) {
		
		this.users.add(user);
		System.out.println("Kullanýcý eklendi :" +user.getFirstName()+""+user.getLastName());
	}



	@Override
	public List<User> getAll() {
		return this.users;
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public User getByEmail(String email) {
		User user = null;
		for (User item : users) {
			if(item.getMail().equals(email))
			{
				user = item;
			}
		}
		return user;
	}

	

}
