package org.divya;

import java.util.HashMap;
import java.util.Map;

import javax.validation.Valid;

import org.divya.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String userInfo(ModelMap map) {
		
		User user = new User();
		
		Map<String, String> genderMap = new HashMap<String, String>();
		genderMap.put("male", "Male");
		genderMap.put("female", "Female");
		
		Map<String, String> countryMap = new HashMap<String, String>();
		countryMap.put("India", "India");
		countryMap.put("USA", "The United States");
		countryMap.put("Japan", "Japan");
		countryMap.put("Russia", "Russia");

		map.addAttribute("countryMap", countryMap);
		map.addAttribute("genderMap", genderMap);
		map.addAttribute("user", user);
		return "userInfo";

	}
	
	@PostMapping("displayname")
	public ModelAndView displayInfo(@Valid User user, BindingResult result) {
		
		ModelAndView modelAndView = new ModelAndView("displayInfo");
		modelAndView.addObject("user", user);
		if(result.hasErrors()) {
			ModelAndView repopulateModelAndView = new ModelAndView("userInfo");

			Map<String, String> genderMap = new HashMap<String, String>();
			genderMap.put("male", "Male");
			genderMap.put("female", "Female");
			
			Map<String, String> countryMap = new HashMap<String, String>();
			countryMap.put("India", "India");
			countryMap.put("USA", "The United States");
			countryMap.put("Japan", "Japan");
			countryMap.put("Russia", "Russia");
			
			repopulateModelAndView.addObject("countryMap", countryMap);
			repopulateModelAndView.addObject("genderMap", genderMap);
			repopulateModelAndView.addObject("user", user);
			System.out.println("Has errors!");
			return repopulateModelAndView;
			
		} else {
			System.out.println("all good");
			return modelAndView;	
		}
		
	}
	
}
