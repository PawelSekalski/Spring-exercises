package app.niereaktor.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String home() {
		return "home";
	}
	
	@RequestMapping ("/secured")
	public String secured() {
		return "secured";
		
	}
	
	@RequestMapping ("/SuperSecured")
	public String supersecured() {
		return "SuperSecured";
		
	}
	
	@RequestMapping ("/SuperSuperSecured")
	public String supersupersecured() {
		return "SuperSuperSecured";
		
	}
	
	@RequestMapping ("/loginForm")
	public String loginform() {
		return "loginForm";
	}
	
}
