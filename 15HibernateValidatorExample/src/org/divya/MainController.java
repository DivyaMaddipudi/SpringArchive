package org.divya;

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
	public ModelAndView userInfo() {
		
		ModelAndView modelAndView = new ModelAndView("userInfo");
		User user = new User();
		
		modelAndView.addObject("user", user);
		return modelAndView;

	}
	
	@PostMapping("displayname")
	public ModelAndView displayInfo(@Valid User user, BindingResult result) {
		
		ModelAndView modelAndView = new ModelAndView("displayInfo");
		modelAndView.addObject("user", user);
		if(result.hasErrors()) {
			ModelAndView repopulateModelAndView = new ModelAndView("userInfo");
			
			repopulateModelAndView.addObject("user", user);
			System.out.println("Has errors!");
			return repopulateModelAndView;
			
		} else {
			System.out.println("all good");
			return modelAndView;	
		}
		
	}
	
}
