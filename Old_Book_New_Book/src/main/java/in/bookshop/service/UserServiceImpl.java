package in.bookshop.service;
import in.bookshop.dao.IUserDao;
import in.bookshop.daofactory.UserDaoFactory;
import in.bookshop.dto.userdto;



//service layer logic
public class UserServiceImpl implements IUserService {

	private IUserDao userDao;


	@Override
	public String addUser(userdto user) {
		userDao = UserDaoFactory.getUserDao();
		return userDao.addUser(user);
	}


	@Override
	public String loginUser(userdto user) {
		userDao = UserDaoFactory.getUserDao();
		return userDao.loginUser(user);
		
	}
	
	/*

	@Override
	public Student searchStudent(Integer sid) {
		stdDao = StudentDaoFactory.getStudentDao();
		return stdDao.searchStudent(sid);
	}

	@Override
	public String updateStudent(Student student) {
		stdDao = StudentDaoFactory.getStudentDao();
		return stdDao.updateStudent(student);
	}

	@Override
	public String deleteStudent(Integer sid) {
		stdDao = StudentDaoFactory.getStudentDao();
		return stdDao.deleteStudent(sid);
	}
	*/
}

