package com.krakedev.herencia.test;

import java.util.ArrayList;

import com.krakedev.herencia.Hija;

public class TestArrayList {

	public static void main(String[] args) {
		ArrayList<Hija> listaDeHijas = new ArrayList<Hija>();

		Hija hija1 = new Hija("Ali",2,3);
		hija1.setDefectos(1);
		hija1.setVirtudes(4);
		
		listaDeHijas.add(hija1);
		
		Hija hija2 = new Hija("Sari",6,1);
		hija2.setDefectos(6);
		hija2.setVirtudes(1);
		
		listaDeHijas.add(hija2);
		
		Hija hija3 = new Hija("Ayni",6, 1);
		hija3.setDefectos(6);
		hija3.setVirtudes(1);
		
		listaDeHijas.add(hija3);
		
		System.out.println(listaDeHijas);
	}

}