package nLayeredProject.business.abstracts;

import nLayeredProject.entities.concretes.LoginDto;
import nLayeredProject.entities.concretes.User;

public interface AuthService {
	void login(LoginDto loginDto) throws Exception;
	void register(User user) throws Exception;

}
