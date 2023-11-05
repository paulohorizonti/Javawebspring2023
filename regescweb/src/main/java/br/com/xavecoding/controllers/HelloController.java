package br.com.xavecoding.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
//Anotação que indica que a classe é uma controller
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class HelloController {
	
		@GetMapping("/hello-model-view") //anotacao que indica o caminho que sera colocado no navegador para chegar a essa action
		public ModelAndView Hello()
		{
			ModelAndView mv = new ModelAndView("hello"); //chama a apagina direta
			mv.addObject("nome", "Luizinho");
			return mv;
					
			
		}
		
	
		@GetMapping("/hello-model") //anotacao que indica o caminho que sera colocado no navegador para chegar a essa action
		public String Hello(Model model)
		{
			//setar um parametro para requisição
			model.addAttribute("nome", "Zezinho");
			
			
			//quando acessar a /hello no navegador ele vai exibir essa html que no caso esta em templates
			return "hello";
			
		}
		
		@GetMapping("/hello-servlet") //anotacao que indica o caminho que sera colocado no navegador para chegar a essa action
		public String Hello(HttpServletRequest request)
		{
			//setar um parametro para requisição
			request.setAttribute("nome","Samuka");
			
			//quando acessar a /hello no navegador ele vai exibir essa html que no caso esta em templates
			return "hello";
			
		}
}
