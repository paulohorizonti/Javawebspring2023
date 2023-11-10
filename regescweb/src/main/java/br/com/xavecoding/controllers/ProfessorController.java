package br.com.xavecoding.controllers;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.xavecoding.models.Professor;
import br.com.xavecoding.models.StatusProfessor;

@Controller
public class ProfessorController {
	
	@GetMapping("/professores")
	public ModelAndView Index()
	{
		//OBJETO DO TIPO PROFESSOR
		Professor batman = new Professor("Batman", new BigDecimal(5000.00), StatusProfessor.ATIVO);
		Professor coringa = new Professor("Coringa", new BigDecimal(15000.00), StatusProfessor.APOSENTADO);
		Professor mmaravilha = new Professor("Mulher Maravilha", new BigDecimal(25000.00), StatusProfessor.INATIVO);
		
		batman.setId(1L);
		coringa.setId(2L);
		mmaravilha.setId(3L);
		
		List<Professor> professores = Arrays.asList(batman, coringa, mmaravilha);
		
		ModelAndView mv = new ModelAndView("professores/index");
		
		mv.addObject("professores",professores);
		return mv;
		
	}

}
