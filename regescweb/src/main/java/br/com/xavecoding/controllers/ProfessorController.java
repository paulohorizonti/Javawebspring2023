package br.com.xavecoding.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.xavecoding.dto.RequisicaoNovoProfessor;
import br.com.xavecoding.models.Professor;
import br.com.xavecoding.models.StatusProfessor;
import br.com.xavecoding.repositories.ProfessorRepository;
import jakarta.validation.Valid;

@Controller
public class ProfessorController {
		//injeção de dependncia
		@Autowired
		private ProfessorRepository professorRepository;
		
		
	//MOSTRAR TODOS OS REGISTROS
	@GetMapping("/professores")
	public ModelAndView Index(Model model)
	{
		model.addAttribute("pagename", "professores");
		List<Professor> professores = this.professorRepository.findAll();
		
		ModelAndView mv = new ModelAndView("professores/index");
		
		mv.addObject("professores",professores);
	    
		
		
		return mv;
		
	}
	
	//INSERIR UM NOVO REGISTRO
	@GetMapping("/professores/new")
	public ModelAndView nnew(RequisicaoNovoProfessor requisicao, Model model)
	{
		model.addAttribute("pagename", "novoprofessor");
		ModelAndView mv = new ModelAndView("professores/new");
		//passa o enum inteiro, ou seja os valores do enum para o mv
		mv.addObject("statusProfessor", StatusProfessor.values());
		return mv;
				
	}
	
	//quando houve a submissao ele vai cair exatamente nessa action
	@PostMapping("/professores")
	public ModelAndView create(@Valid RequisicaoNovoProfessor requisicao, BindingResult bindResult)
	{
		
		if(bindResult.hasErrors())
		{
			System.out.println("TEM ERROS");
			ModelAndView mv = new ModelAndView("professores/new");
			mv.addObject("statusProfessor", StatusProfessor.values());
			return mv;
		}else {
			Professor professor = requisicao.toProfessor();
			
			//salvar
			this.professorRepository.save(professor);
			return new ModelAndView("redirect:/professores");
		}
		}
		

}
