package app.niereaktor.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//zawsze dodać klasę kontrolera!!!!!
@Controller
public class HelloController {
	
	//@GetMapping("adres")
	@RequestMapping("/hello")
	public String hello() {
		return "hello";
	}
	
	@RequestMapping("/info")
	public String info() {
		return "info";
	}
	
	@RequestMapping("/x")
	public String x() {
		return "x";
	}
	
	@RequestMapping("/gohome")
	public String gohome() {
		return "gohome";
	}
	
}
