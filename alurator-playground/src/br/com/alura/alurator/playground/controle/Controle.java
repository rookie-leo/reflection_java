package br.com.alura.alurator.playground.controle;

import java.util.List;

public class Controle {
	private List<String> lista = List.of("item 1", "item 2", "item 3");
	
	public List<String> getLista() {
		return lista;
	}
	
	public Controle() {}
	
	public Controle(String s) {}
	
	private Controle(String s, String t) {}

	private void metodoControle1() {}

	public void metodoControle2(String s1) {
		System.out.println("Controle.metodoControle2(String s1, String s2)");
		System.out.println("Parametro 1 obtido " + s1);
	}

	public void metodoControle2(String s1, String s2) {
		System.out.println("Controle.metodoControle2(String s1, String s2)");
		System.out.println("Parametro 1 obtido " + s1);
		System.out.println("Parametro 2 obtido " + s2);
	}

	public void metodoControle2(String s1, Integer i1) {
		System.out.println("Controle.metodoControle2(String s1, Integer i1)");
		System.out.println("Parametro 1 obtido " + s1);
		System.out.println("Parametro 2 obtido " + i1);
	}
}
