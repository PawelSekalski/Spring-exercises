package app.niereaktor.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class controller1 {
		
	@RequestMapping("/omnie")
	public String omnie() {
		return "omnie";
	}
		
	@RequestMapping("/blog")
	public String blog() {
		return "blog";
	}
		
	@RequestMapping("/kontakt")
	public String kontakt() {
		return "kontakt";
	}
}
