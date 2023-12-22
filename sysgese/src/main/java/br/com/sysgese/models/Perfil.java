package br.com.sysgese.models;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "PERFIL")
public class Perfil {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
		
	@Column(name = "DESCRICAO", nullable = false)
	public String Descricao;
	
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	@Column(name = "DATA_CAD", nullable = true)
	public Date Data_Cad;
	
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	@Column(name = "DATA_ALT", nullable = true)
	public Date Data_Alt;
	
	@Column(name = "STATUS", nullable = true)
	public Boolean Status;

	
	//Contrutor
	public Perfil() {
		
	}
	
	
	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescricao() {
		return Descricao;
	}

	public void setDescricao(String descricao) {
		Descricao = descricao;
	}

	public Date getData_Cad() {
		return Data_Cad;
	}

	public void setData_Cad(Date data_Cad) {
		Data_Cad = data_Cad;
	}

	public Date getData_Alt() {
		return Data_Alt;
	}

	public void setData_Alt(Date data_Alt) {
		Data_Alt = data_Alt;
	}

	public Boolean getStatus() {
		return Status;
	}

	public void setStatus(Boolean status) {
		Status = status;
	}
	/*
	
	 @ManyToOne
	 private List<Acesso> acessos;
*/
	
	
}
