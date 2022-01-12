package com.camila.domain;

import java.time.LocalDateTime;
import java.util.Objects;
import org.springframework.data.jpa.convert.threetenbp.ThreeTenBackPortJpaConverters.LocalDateConverter;

import enuns.Prioridade;
import enuns.Status;

public class os {
private Integer id;
private LocalDateTime dataAbertura;
private LocalDateTime dataFechamento;
private Integer prioridade;
private String observacoes;
private Integer status;
private Tecnico tecnico;



public os(Integer id, Prioridade prioridade, String observacoes,
		Status status, Tecnico tecnico) {
	super();
	this.id = id;
	this.dataAbertura = (LocalDateTime.now());
	this.prioridade = (prioridade==null)?0:prioridade.getCod();
	this.observacoes = observacoes;
	this.status = (status==null)?0:status.getCod();
	this.tecnico = tecnico;
}
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public LocalDateTime getDataAbertura() {
	return dataAbertura;
}
public void setDataAbertura(LocalDateTime dataAbertura) {
	this.dataAbertura = dataAbertura;
}
public LocalDateTime getDataFechamento() {
	return dataFechamento;
}
public void setDataFechamento(LocalDateTime dataFechamento) {
	this.dataFechamento = dataFechamento;
}
public Prioridade getPrioridade() {
	return Prioridade.toEnum(this.prioridade);
}
public void setPrioridade(Prioridade prioridade) {
	this.prioridade = prioridade.getCod();
}
public String getObservacoes() {
	return observacoes;
}
public void setObservacoes(String observacoes) {
	this.observacoes = observacoes;
}
public Status getStatus() {
	return Status.toEnum(this.status);
}
public void setStatus(Status status) {
	this.status = status.getCod();
}
public Tecnico getTecnico() {
	return tecnico;
}
public void setTecnico(Tecnico tecnico) {
	this.tecnico = tecnico;
}
public os() {
	super();
this.setDataAbertura(LocalDateTime.now());

this.setPrioridade(Prioridade.BAIXA);
this.setStatus(Status.ABERTO);
}
@Override
public int hashCode() {
	return Objects.hash(id);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	os other = (os) obj;
	return Objects.equals(id, other.id);
}


}