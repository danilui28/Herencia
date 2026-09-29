package com.krakedev.herencia;

public class Padre {

	private int virtudes;
	private int defectos;
	private double totalAhorrado;
	private String nombre;
	
	public int getVirtudes() {
		return virtudes;
	}

	public void setVirtudes(int virtudes) {
		this.virtudes = virtudes;
	}

	public int getDefectos() {
		return defectos;
	}

	public void setDefectos(int defectos) {
		this.defectos = defectos;
	}
	

	public double getTotalAhorrado() {
		return totalAhorrado;
	}

	public void setTotalAhorrado(double totalAhorrado) {
		this.totalAhorrado = totalAhorrado;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Padre(String nombre, int virtudes, int defectos) {
		this.nombre = nombre;
		this.virtudes = virtudes;
		this.defectos = defectos;
		this.totalAhorrado = 0;
	}
	
	public void ahorrar(double monto){
		totalAhorrado += monto;
	}
	
	public String toString() {
		return "nombre= " + nombre + ", virtudes= " + virtudes + ", defectos= " + defectos + ", total ahorrado= " + totalAhorrado;
	}

}
