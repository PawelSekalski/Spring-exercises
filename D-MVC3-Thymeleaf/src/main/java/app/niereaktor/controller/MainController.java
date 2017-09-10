package app.niereaktor.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import app.niereaktor.model.Register;

@Controller
public class MainController {
	
	@RequestMapping("/")
		public String home(Model model) {
			model.addAttribute("reg", new Register());
			return "home";
	}
	
	//result rejestrowania i zapętlenie, jeśli ilość znaków jest mniejsza niż 5
	@PostMapping("/result")
	public String result(@ModelAttribute Register reg, Model model) {
		model.addAttribute("reg", reg);
		reg.setLogin(reg.getLogin());
		if(reg.getLogin().length() >= 5){
			return "result";
		} else {
			return "redirect:/";
		}
	}
	
}
