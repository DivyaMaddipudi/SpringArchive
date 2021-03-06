package org.divya;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.divya.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {
	
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView home() {
		ModelAndView modelAndView = new ModelAndView("userFormView");
		User user = new User();
		Map<String, String> genderMap = new HashMap<String, String>();
		genderMap.put("male", "Male");
		genderMap.put("female", "Female");
		
		Map<String, String> countryMap = new HashMap<String, String>();
		countryMap.put("India", "India");
		countryMap.put("USA", "The United States");
		countryMap.put("Japan", "Japan");
		countryMap.put("Russia", "Russia");
		
		modelAndView.addObject("countryMap", countryMap);
		modelAndView.addObject("genderMap", genderMap);
		modelAndView.addObject("user", user);
		return modelAndView;
	}
	
	@PostMapping("/displayUserInfo")
	public ModelAndView displayUserInfo(@ModelAttribute User user) {
		ModelAndView modelAndView = new ModelAndView("displayUserInfo");
		//System.out.println(user);
		modelAndView.addObject("user", user);
		return modelAndView;
		
		
	}

}
