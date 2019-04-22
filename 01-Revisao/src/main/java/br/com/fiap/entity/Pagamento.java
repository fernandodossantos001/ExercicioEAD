package br.com.fiap.entity;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name="T_PAGAMENTO")
@SequenceGenerator(name="pagamento",sequenceName="SQ_T_PAGAMENTO",allocationSize=1)
public class Pagamento {
	
	@Id
	@Column(name="cd_pagamento")
	@GeneratedValue(generator="pagamento",strategy=GenerationType.SEQUENCE)
	private Long id;
	
	@CreationTimestamp
	@Temporal(TemporalType.DATE)
	@Column(name="dt_pagamento",nullable=false)
	private Calendar dataPagamento;
	
	
	@Column(name="vl_pagamento",nullable=false)
	private Double valorPagamento;
	
	
	@Column(name="ds_forma_pagamento",nullable=false)
	@Enumerated(EnumType.STRING)
	private FormaPagamento formaPagamento;
	
	public Pagamento() {
		
	}

	public Pagamento(Long id, Calendar dataPagamento, Double valorPagamento, FormaPagamento formaPagamento) {
		this.id = id;
		this.dataPagamento = dataPagamento;
		this.valorPagamento = valorPagamento;
		this.formaPagamento = formaPagamento;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Calendar getDataPagamento() {
		return dataPagamento;
	}

	public void setDataPagamento(Calendar dataPagamento) {
		this.dataPagamento = dataPagamento;
	}

	public Double getValorPagamento() {
		return valorPagamento;
	}

	public void setValorPagamento(Double valorPagamento) {
		this.valorPagamento = valorPagamento;
	}

	public FormaPagamento getFormaPagamento() {
		return formaPagamento;
	}

	public void setFormaPagamento(FormaPagamento formaPagamento) {
		this.formaPagamento = formaPagamento;
	}
	
	
	
}
