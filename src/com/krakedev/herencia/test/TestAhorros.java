package com.krakedev.herencia.test;

import com.krakedev.herencia.Hijo;
import com.krakedev.herencia.Hija;
import com.krakedev.herencia.Padre;

public class TestAhorros {

	public static void main(String[] args) {
		Padre padre = new Padre("Carlos", 5, 2);
		padre.ahorrar(1000);
		System.out.println("Padre: " + padre);

		Hija hija = new Hija("Maria", 5, 2);
		hija.ahorrar(1000);
		System.out.println("Hija: " + hija);
		
		Hijo hijo = new Hijo("Juan", 5, 2, 10);
		hijo.ahorrar(1000);
		System.out.println("Hijo: " + hijo);

	}

}
