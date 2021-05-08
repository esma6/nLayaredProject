package nLayeredProject.consoleUI;

import nLayeredProject.business.abstracts.AuthService;
import nLayeredProject.business.abstracts.UserService;
import nLayeredProject.business.concretes.AuthManager;
import nLayeredProject.business.concretes.UserManager;
import nLayeredProject.core.abstracts.LoginWithDifferentAccount;
import nLayeredProject.core.adapters.LoginWithGoogleManagerAdapter;
import nLayeredProject.dataAccess.abstracts.UserDao;
import nLayeredProject.dataAccess.concretes.InMemoryUserDao;
import nLayeredProject.entities.concretes.LoginDto;
import nLayeredProject.entities.concretes.User;

public class Main {

	public static void main(String[] args) throws Exception  {
		 UserDao userDao = new InMemoryUserDao();
		 UserService userService = new UserManager(userDao);
		 AuthService authService = new AuthManager(userService);
		 LoginWithDifferentAccount google=new LoginWithGoogleManagerAdapter();
		 google.loginWith("Esma");
		
		User esma = new User(1,"esma","karagülle","esma@gmail.com","1234567");
		authService.register(esma);
		
		LoginDto login=new LoginDto("esma@gmail.com","1234567");
		authService.login(login);
		

	}

}
