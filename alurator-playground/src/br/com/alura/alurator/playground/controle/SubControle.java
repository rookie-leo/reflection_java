package br.com.alura.alurator.playground.controle;

import java.io.IOException;

public class SubControle extends Controle {

	public SubControle() throws IOException{}
	
	private SubControle(String x) {}

	public void metodoSubControle1() {
		System.out.println("Executando métodoSubcontrole1()");
	}

	private String metodoSubControle2() {
		System.out.println("Executando métodoSubControle2()");

		return "Retorno do método metodoSubControle2()";
	}

}
