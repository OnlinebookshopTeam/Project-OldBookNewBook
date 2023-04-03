package in.bookshop.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


import in.bookshop.dto.userdto;
import in.bookshop.util.JdbcUtil;



//Persistence logic using JDBC API
public class UserDaoImpl implements IUserDao {

	Connection connection = null;
	PreparedStatement pstmt = null;
	ResultSet resultSet = null;

	@Override
	public String addUser(userdto user) {
		System.out.println("in user dao imp");
		String sqlInsertQuery = "insert into user(`email`,`password`,`firstname`,`lastname`,`email_verified`,`created_at`,`status`)values(?,?,?,?,?,?,?)";
		long millis=System.currentTimeMillis();
		java.sql.Date date=new java.sql.Date(millis);
		
		System.out.println(user.getEmail());
		System.out.println(user.getEmailverified());
		System.out.println(user.getFirstname());
		System.out.println(user.getLastname());
		System.out.println(user.getPassword());
		System.out.println(date);
		System.out.println(user.getStatus());
		
		try {
			connection = JdbcUtil.getJdbcConnection();
			System.out.println("connection successfull"+connection.toString());
			if (connection != null)
				pstmt = connection.prepareStatement(sqlInsertQuery);

			if (pstmt != null) {

				pstmt.setString(1, user.getEmail());
				pstmt.setString(2, user.getPassword());
				pstmt.setString(3, user.getFirstname());
				pstmt.setString(4, user.getLastname());
				pstmt.setString(5, user.getEmailverified());
				
				pstmt.setDate(6, date);
				pstmt.setString(7, user.getStatus());

				int rowAffected = pstmt.executeUpdate();
				System.out.println(rowAffected);
				if (rowAffected == 1) {
					return "success";
				}
			}
		} catch (SQLException | IOException e) {
			if("java.sql.SQLIntegrityConstraintViolationException".equals(e)) {
				System.out.println("exception match");
				return "userexist";
			}
		}

		return "failure";
	}
/*
	@Override
	public Student searchStudent(Integer sid) {
		String sqlSelectQuery = "select sid,sname,sage,saddress from student where sid = ?";
		Student student = null;

		try {
			connection = JdbcUtil.getJdbcConnection();

			if (connection != null)
				pstmt = connection.prepareStatement(sqlSelectQuery);

			if (pstmt != null)
				pstmt.setInt(1, sid);

			if (pstmt != null) {
				resultSet = pstmt.executeQuery();
			}

			if (resultSet != null) {

				if (resultSet.next()) {
					student = new Student();

					// copy resultSet data to student object
					student.setSid(resultSet.getInt(1));
					student.setSname(resultSet.getString(2));
					student.setSage(resultSet.getInt(3));
					student.setSaddress(resultSet.getString(4));

					return student;
				}

			}

		} catch (SQLException | IOException e) {
			e.printStackTrace();
		}

		return student;
	}


	@Override
	public String deleteStudent(Integer sid) {
		String sqlDeleteQuery = "delete from student where sid = ?";
		try {
			connection = JdbcUtil.getJdbcConnection();

			if (connection != null)
				pstmt = connection.prepareStatement(sqlDeleteQuery);

			if (pstmt != null) {

				pstmt.setInt(1, sid);

				int rowAffected = pstmt.executeUpdate();
				if (rowAffected == 1) {
					return "success";
				} else {
					return "not found";
				}
			}
		} catch (SQLException | IOException e) {
			e.printStackTrace();
			return "failure";
		}
		return "failure";

	}

	@Override
	public String updateStudent(Student student) {
		String sqlUpdateQuery = "update student set sname=?,sage=?,saddress=? where sid=?";
		try {
			connection = JdbcUtil.getJdbcConnection();

			if (connection != null)
				pstmt = connection.prepareStatement(sqlUpdateQuery);

			if (pstmt != null) {

				pstmt.setString(1, student.getSname());
				pstmt.setInt(2, student.getSage());
				pstmt.setString(3, student.getSaddress());
				pstmt.setInt(4, student.getSid());

				int rowAffected = pstmt.executeUpdate();
				if (rowAffected == 1) {
					return "success";
				}
			}
		} catch (SQLException | IOException e) {
			e.printStackTrace();
		}

		return "failure";
	}
*/

	@Override
	public String loginUser(userdto user) {
		System.out.println("in login servlet");
		String sqlSelectQuery = "select * from user where password = ? and email = ?";
		//userdto userData = null;
		System.out.println("problem in q");
		System.out.println(user.getEmail());
		System.out.println(user.getPassword());
		String msg = "success";
		try {
			connection = JdbcUtil.getJdbcConnection();

			if (connection != null)
				pstmt = connection.prepareStatement(sqlSelectQuery);

			if (pstmt != null)
				pstmt.setString(1, user.getPassword());
			pstmt.setString(2, user.getEmail());

			if (pstmt != null) {
				resultSet = pstmt.executeQuery();
			}

			if (resultSet != null) {

				if (resultSet.next()) {
					return msg;
				}

			}

		} catch (SQLException | IOException e) {
			e.printStackTrace();
		}

		

		return "failure";
	}
}


