package app.niereaktor.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import app.niereaktor.model.Credit;

@Controller
public class CreditController {
	
	@RequestMapping("/")
	public String home(Model model) {
		model.addAttribute("cred", new Credit());
		return "calc";
		}
	
	@PostMapping("/result")
		public String result(@ModelAttribute Credit cred, Model model) {
		model.addAttribute("cred", cred);
		
		if(cred.getKwotaKredytu() >= 10000) {
			cred.setP(0.08);
		}
		return "result";
	}
}
