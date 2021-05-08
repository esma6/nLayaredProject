package nLayeredProject.business.concretes;

import nLayeredProject.business.abstracts.AuthService;
import nLayeredProject.business.abstracts.UserService;
import nLayeredProject.core.utils.Validation;
import nLayeredProject.entities.concretes.LoginDto;
import nLayeredProject.entities.concretes.User;

public class AuthManager implements AuthService {
	private  UserService userService;

	public AuthManager(final UserService userService) {
		this.userService = userService;
	}

	@Override
	public void login(LoginDto loginDto) throws Exception {
		Validation.validateFieldsEmpty(loginDto.getEmail(), loginDto.getPassword());

		System.out.println(loginDto.getEmail() + " giriþ baþarýlý.");
		
	}

	@Override
	public void register(User user) throws Exception{
		checkFirstNameAndLastName(user.getFirstName(), user.getLastName());
		checkUserExists(user.getMail());
		checkPasswordStrong(user.getPassword());
		Validation.validateEmail(user.getMail());
		
		userService.add(user);

		System.out.println(user.getMail() + " kaydedildi.");
		
	}
	
	public void checkFirstNameAndLastName( String firstName,  String lastName) throws Exception {
		 boolean result = firstName.length() >= 2 && lastName.length() >= 2;
		if (!result)
			throw new Exception("Ad ve Soyad iki karakterden fazla olmalýdýr.");
	}

	public void checkPasswordStrong( String password) throws Exception {
		 boolean result = password.length() >= 6;
		if (!result)
			throw new Exception("Parola 6 karakterden fazla olmalýdýr. ");
	}

	public void checkUserExists( String email) throws Exception {
		 boolean result = false;
		if (result)
			throw new Exception("Bu E-maile ait kullanýcý zaten var.");
	}
	
	public void sendVerificationEmail( String email) {
		System.out.println("Verification email has been sent to " + email + ".");
	}

	public void verifyVerificationEmail( LoginDto loginDto) {
		System.out.println(loginDto.getEmail() + " email successfully verified ");
	}

}
