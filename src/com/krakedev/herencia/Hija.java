package com.krakedev.herencia;

public class Hija extends Padre {

	public Hija(String nombre, int virtudes, int defectos) {
		super(nombre, virtudes, defectos);
	}
	
	public void escucharBadBunny() {
		System.out.println("Escuchando esta musica increible");
	}

	@Override
	public String toString() {
		return super.toString();
	}

}
