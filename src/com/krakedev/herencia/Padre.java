package com.krakedev.herencia;

public class Padre {

	private int virtudes;
	private int defectos;
	
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
	

	public Padre(int virtudes, int defectos) {
		this.virtudes = virtudes;
		this.defectos = defectos;
	}
	
	
	public String toString() {
		return "virtudes= " + virtudes + ", defectos= " + defectos;
	}

}
