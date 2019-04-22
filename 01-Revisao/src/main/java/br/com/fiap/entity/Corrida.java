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
@Table(name="T_CORRIDA")
@SequenceGenerator(name="corrida",sequenceName="SQ_T_CORRIDA")
public class Corrida {
	
	@Id
	@Column(name="cd_corrida")
	@GeneratedValue(generator="corrida",strategy=GenerationType.SEQUENCE)
	private Long id;
	
	
	@Column(name="ds_origem",length=150)
	private String origem;
	
	
	@Column(name="ds_destino")
	private String destino;
	
	
	@Column(name="dt_corrida")
	private Calendar dataCorrida;
	
	@Column(name="vl_corrida")		
	private Double valorCorrida;
	
	public Corrida() {
		
	}

	public Corrida(Long id, String origem, String destino, Calendar dataCorrida, Double valorCorrida) {
		this.id = id;
		this.origem = origem;
		this.destino = destino;
		this.dataCorrida = dataCorrida;
		this.valorCorrida = valorCorrida;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getOrigem() {
		return origem;
	}

	public void setOrigem(String origem) {
		this.origem = origem;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public Calendar getDataCorrida() {
		return dataCorrida;
	}

	public void setDataCorrida(Calendar dataCorrida) {
		this.dataCorrida = dataCorrida;
	}

	public Double getValorCorrida() {
		return valorCorrida;
	}

	public void setValorCorrida(Double valorCorrida) {
		this.valorCorrida = valorCorrida;
	}
	
	
	
}
