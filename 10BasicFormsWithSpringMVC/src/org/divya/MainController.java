package org.divya;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String hello() {
		return "hello";
	}
	
	@RequestMapping("displayname")
	public String displayName(HttpServletRequest request) {
		String name = request.getParameter("name");
		request.setAttribute("name", name);
		return "displayName";
	}

}
