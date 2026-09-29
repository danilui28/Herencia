package com.krakedev.herencia.test;

import com.krakedev.herencia.Hija;

public class TestHerencia {

	public static void main(String[] args) {
		Hija hija =new Hija("Carlos",5, 10);

		hija.setDefectos(2);
		hija.setVirtudes(6);
		
		System.out.println("Virtudes: "+hija.getVirtudes());
		System.out.println("Defectos: "+hija.getDefectos());
		//
		Hija hija2 =new Hija("Jennifer",3, 7);

		hija2.setDefectos(10);
		hija2.setVirtudes(7);
		
		hija2.toString();
	}

}