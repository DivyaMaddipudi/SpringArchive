package org.divya.controller;

import java.util.ArrayList;
import java.util.List;

import org.divya.DAO.AppDAOImpl;
import org.divya.config.AppConfig;
import org.divya.model.User;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class AppController {
	
	
	@RequestMapping("/")
	public ModelAndView home() {
		
		ModelAndView model = new ModelAndView("index");
		List<User> users = new ArrayList<User>();
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		AppDAOImpl DAO = context.getBean("DAOBean", AppDAOImpl.class);
		users = DAO.listUsers();
		model.addObject("users", users);
		
		context.close();
		return model;
		
		
	}
}
