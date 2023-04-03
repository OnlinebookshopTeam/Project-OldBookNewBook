package in.bookshop.daofactory;

import in.bookshop.dao.IUserDao;

import in.bookshop.dao.UserDaoImpl;

public class UserDaoFactory {

	private UserDaoFactory() {}

	private static IUserDao user = null;

	public static IUserDao getUserDao() {
		if (user == null) {
			user = (IUserDao) new UserDaoImpl();
		}
		return user;
	}
}
