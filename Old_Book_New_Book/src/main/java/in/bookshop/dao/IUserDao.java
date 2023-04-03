package in.bookshop.dao;

import in.bookshop.dto.userdto;

public interface IUserDao {
	
	// operations to be implemented
	public String addUser(userdto user);

	public String loginUser(userdto user);

	//public Student searchStudent(Integer sid);

	//public String updateStudent(Student student);

	//public String deleteStudent(Integer sid);

}

