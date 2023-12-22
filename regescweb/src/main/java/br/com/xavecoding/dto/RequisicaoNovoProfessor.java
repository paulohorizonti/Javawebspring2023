package br.com.xavecoding.dto;

import java.math.BigDecimal;

import br.com.xavecoding.models.Professor;
import br.com.xavecoding.models.StatusProfessor;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;


//como se fosse uma viewmodel
//é uma classe DTO

public class RequisicaoNovoProfessor {
	//nao pode ser branco nem nulo
	@NotBlank
	@NotNull
	private String nome;
	private StatusProfessor statusProfessor;
	
	@NotNull
	@DecimalMin("0.0")
	private BigDecimal salario;
	
	public BigDecimal getSalario() {
		return salario;
	}

	public void setSalario(BigDecimal salario) {
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	
	public StatusProfessor getStatusProfessor() {
		return statusProfessor;
	}

	public void setStatusProfessor(StatusProfessor statusProfessor) {
		this.statusProfessor = statusProfessor;
	}
	
	public Professor toProfessor()
	{
		Professor professor = new Professor();
		professor.setNome(this.nome);
		professor.setSalario(this.salario);
		professor.setStatusProfessor(this.statusProfessor);
		
		return professor;
		
	}

	@Override
	public String toString() {
		return "RequisicaoNovoProfessor [nome=" + nome + ", statusProfessor=" + statusProfessor + ", salario=" + salario + "]";
	}
	
	
	
	
	
}
