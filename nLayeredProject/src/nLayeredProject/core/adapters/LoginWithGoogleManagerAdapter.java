package nLayeredProject.core.adapters;

import Google.LoginWithGoogleManager;
import nLayeredProject.core.abstracts.LoginWithDifferentAccount;

public class LoginWithGoogleManagerAdapter implements LoginWithDifferentAccount {

	@Override
	public void loginWith(String message) {

		LoginWithGoogleManager google=new LoginWithGoogleManager();
		google.googleLogin(message);
		
	}

}
