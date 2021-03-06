package org.divya.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.divya.model.User;

public class AppDAOImpl implements AppDAO {

	private DataSource dataSource;

	public AppDAOImpl(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	@Override
	public List<User> listUsers() {
		String SQL = "Select * from users";
		List<User> listUsers = new ArrayList<User>();
		Connection conn = null;
		
		try {
			conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(SQL);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				listUsers.add(new User(rs.getInt("user_id"), rs.getString("name"), rs.getString("email")));
			}
			
			rs.close();
			ps.close();
			return listUsers;
			
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		} finally {
			if(conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	public void addUser(User user) {
		String SQL = "Insert into users" + "(name, email) values (?, ?)";
		Connection conn = null;
		
		try {
			conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(SQL);
			ps.setString(1, user.getName());
			ps.setString(2, user.getEmail());
			
			ps.execute();
			ps.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		
		
	}

}
