package org.divya;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String hello1() {
		return "hello";
	}
	
	@RequestMapping("displayname")
	public String displayName(@RequestParam("name") String name, Model model) {
		model.addAttribute("name", name);
		
		return "displayName";
	}
}
