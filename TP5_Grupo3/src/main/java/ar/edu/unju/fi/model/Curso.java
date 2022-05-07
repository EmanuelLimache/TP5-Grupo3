package ar.edu.unju.fi.model;

public class Curso {
private int codigo;
private String titulo;
private String categoria;
private String inicio;
private String fin;
private int cantidadhrs;
private String modalidad;
private String docente;

public Curso() {
			
}

public int getCodigo() {
	return codigo;
}

public void setCodigo(int codigo) {
	this.codigo = codigo;
}

public String getTitulo() {
	return titulo;
}

public void setTitulo(String titulo) {
	this.titulo = titulo;
}

public String getCategoria() {
	return categoria;
}

public void setCategoria(String categoria) {
	this.categoria = categoria;
}

public String getInicio() {
	return inicio;
}

public void setInicio(String inicio) {
	this.inicio = inicio;
}

public String getFin() {
	return fin;
}

public void setFin(String fin) {
	this.fin = fin;
}

public int getCantidadhrs() {
	return cantidadhrs;
}

public void setCantidadhrs(int cantidadhrs) {
	this.cantidadhrs = cantidadhrs;
}

public String getModalidad() {
	return modalidad;
}

public void setModalidad(String modalidad) {
	this.modalidad = modalidad;
}

public String getDocente() {
	return docente;
}

public void setDocente(String docente) {
	this.docente = docente;
}






}