package ar.edu.unju.fi.model;

import java.time.LocalDate;

public class Beca {
private int codigo;
private String curso;
private LocalDate inicio;
private LocalDate fin;
private String estado;


public Beca () {
	
}


public int getCodigo() {
	return codigo;
}


public void setCodigo(int codigo) {
	this.codigo = codigo;
}


public String getCurso() {
	return curso;
}


public void setCurso(String curso) {
	this.curso = curso;
}


public LocalDate getInicio() {
	return inicio;
}


public void setInicio(LocalDate inicio) {
	this.inicio = inicio;
}


public LocalDate getFin() {
	return fin;
}


public void setFin(LocalDate fin) {
	this.fin = fin;
}


public String getEstado() {
	return estado;
}


public void setEstado(String estado) {
	this.estado = estado;
}





}
