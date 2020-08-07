package org.divya.config;

import javax.sql.DataSource;

import org.divya.DAO.AppDAOImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class AppConfig {
	
	@Bean
	public DataSource getDataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/springdb");
		dataSource.setUsername("student");
		dataSource.setPassword("student");
		
		return dataSource;
	}
	
	@Bean(name="DAOBean")
	public AppDAOImpl AppDAO() {
		return new AppDAOImpl(getDataSource());
	}
}
