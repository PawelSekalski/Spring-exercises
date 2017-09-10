package app.niereaktor.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

public class contr {
	
	@GetMapping("/hello")
	public String hello() {
		return "hello";
	}
	
	@RequestMapping("/info")
	public String info() {
		return "info";
	}
}
