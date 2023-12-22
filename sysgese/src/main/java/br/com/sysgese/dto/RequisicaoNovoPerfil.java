package br.com.sysgese.dto;

import java.sql.Date;

import org.springframework.format.annotation.DateTimeFormat;

import br.com.sysgese.models.Perfil;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class RequisicaoNovoPerfil {
	
	private Integer id;
			
	public String Descricao;
	
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	public Date Data_Cad;
	
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	public Date Data_Alt;
	
	@Column(name = "STATUS", nullable = true)
	public Boolean Status;

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
	
	public Perfil toPerfil()
	{
		Perfil perfil = new Perfil();
		perfil.setDescricao(this.Descricao);
		perfil.setStatus(this.Status);
		perfil.setData_Cad(this.Data_Cad);
		perfil.setData_Alt(this.Data_Alt);
		
		
		return perfil;
		
	}
	

}
