package br.com.xavecoding.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	/*
	@GetMapping("/")
	public String home()
	{
		return "home"; //retonra home.html
	}*/
	@GetMapping ("/")
	String homePage(Model model) {
	    model.addAttribute("pagename", "home");
	    return "home";
	}

}
