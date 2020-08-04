package org.divya;

import java.util.HashMap;
import java.util.Map;

import javax.validation.Valid;

import org.divya.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView userInfo() {
		
		ModelAndView modelAndView = new ModelAndView("userInfo");
		User user = new User();
		
		Map<String, String> genderMap = new HashMap<String, String>();
		genderMap.put("male", "Male");
		genderMap.put("female", "Female");
		
		
		modelAndView.addObject("genderMap", genderMap);
		modelAndView.addObject("user", user);
		return modelAndView;

	}
	
	@PostMapping("displayname")
	public ModelAndView displayInfo(@Valid User user, BindingResult result) {
		
		ModelAndView modelAndView = new ModelAndView("displayInfo");
		
		if(result.hasErrors()) {
			System.out.println("Has errors!");
		}
		return modelAndView;
	}
	
}
