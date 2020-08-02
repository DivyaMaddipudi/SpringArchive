package org.divya;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String hello() {
		return "hello";
	}
	
	
	@GetMapping("displayname")
	public ModelAndView displayName(@RequestParam("name") String name) {
		ModelAndView modelAndView = new ModelAndView("displayname");
		Date date = new Date();
		List<String> names = new ArrayList<>();
		names.add("divya");
		names.add("satya");
		names.add("john");
		names.add("mike");
		
		modelAndView.addObject("date", date);
		modelAndView.addObject("name", name);
		modelAndView.addObject("team", names);
		return modelAndView;
	}
}
