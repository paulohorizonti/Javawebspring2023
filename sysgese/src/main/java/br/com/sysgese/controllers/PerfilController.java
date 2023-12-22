package br.com.sysgese.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.sysgese.models.Perfil;
import br.com.sysgese.repositorys.PerfilRepository;




@Controller
public class PerfilController {

	@Autowired
	private PerfilRepository perfilRepository;
	
	
	@GetMapping("/perfis")
	public ModelAndView Index() 
	{
		System.out.println("PASSOU AQUI - INDEX");
		List<Perfil> perfis = this.perfilRepository.findAll();
		
		ModelAndView mv = new ModelAndView("perfis/index");
		
		mv.addObject("perfis",perfis);
		return mv;
		
		
	}
	//INSERIR UM NOVO REGISTRO
	@GetMapping("/perfil/new")
	public ModelAndView novo()
	{
		System.out.println("PASSOU AQUI - NEW");
		ModelAndView mv = new ModelAndView("perfis/novo");

		
		return mv;
				
	}
	
}
