package br.com.fiap.entity;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="T_PASSAGEIRO")
@SequenceGenerator(name="passageiro",sequenceName="SQ_T_PASSAGEIRO",allocationSize=1)
public class Passageiro {
	
	@Id
	@GeneratedValue(generator="passageiro",strategy=GenerationType.SEQUENCE)
	@Column(name="cd_passageiro")
	private Long id;
	
	
	@Column(name="nm_passageiro",nullable=false,length=100)
	private String nomePassageiro;
	
	
	@Column(name="dt_nascimento")
	private Calendar dataNascimento;

	@Column(name="ds_genero")
	private String genero;
	
	public Passageiro() {
		
	}

	public Passageiro(Long id, String nomePassageiro, Calendar dataNascimento, String genero) {
		this.id = id;
		this.nomePassageiro = nomePassageiro;
		this.dataNascimento = dataNascimento;
		this.genero = genero;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomePassageiro() {
		return nomePassageiro;
	}

	public void setNomePassageiro(String nomePassageiro) {
		this.nomePassageiro = nomePassageiro;
	}

	public Calendar getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Calendar dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	
	
}
