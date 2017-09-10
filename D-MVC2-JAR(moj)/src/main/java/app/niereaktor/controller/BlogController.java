package app.niereaktor.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import app.niereaktor.model.Kontakt;
import app.niereaktor.model.Post;

@Controller
public class BlogController {
	
	@RequestMapping("/")
	public String omnie() {
		return "omnie";
	}
		
	@PostMapping("/blog")
	public String blog(Model model) {
		model.addAttribute("post", new Post());
		return "blog";
	}
	
	@PostMapping("/dodaj")
	public String dodaj(@ModelAttribute Post post, Model model) {
		model.addAttribute("post", post);
		return "dodaj";
	}
		
	@RequestMapping("/kontakt")
	public String kontakt(Model model) {
		model.addAttribute("k", new Kontakt());
		return "kontakt";
	}
	
	@PostMapping("/sukces")
	public String sukces(@ModelAttribute Kontakt k, Model model) {
		model.addAttribute("k", k);
		return "sukces";
	}
	
	@PostMapping("/dodaj")
	public String add() {
		
		return "dodaj";
	}
	
}
