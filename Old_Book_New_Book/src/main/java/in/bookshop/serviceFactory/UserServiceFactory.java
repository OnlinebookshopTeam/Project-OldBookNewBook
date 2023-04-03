package in.bookshop.serviceFactory;

import in.bookshop.service.IUserService;
import in.bookshop.service.UserServiceImpl;


//Abstraction logic of implementation
public class UserServiceFactory {

	//make constuctor private to avoid object creation
	private UserServiceFactory() {

	}

	private static IUserService userService = null;

	public static IUserService getUserService() {
		
		//singleton pattern code
		if (userService == null) {
			userService = new UserServiceImpl();
		}
		return userService;
	}

}

