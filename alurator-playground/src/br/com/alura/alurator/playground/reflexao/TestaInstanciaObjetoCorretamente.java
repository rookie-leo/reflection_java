package br.com.alura.alurator.playground.reflexao;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import br.com.alura.alurator.playground.controle.SubControle;

public class TestaInstanciaObjetoCorretamente {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException,
													InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
		Class<SubControle> subControleClasse1 = SubControle.class;
		
		Class<?> subControle2 = Class.forName("br.com.alura.alurator.playground.controle.SubControle");
		
		Class<?> controleClasse1 = Class.forName("br.com.alura.alurator.playground.controle.Controle"); 
		
//		try {
//			controleClasse1.getDeclaredConstructor().newInstance();
//		} catch (InvocationTargetException e) {
//			e.printStackTrace();
//		}
				
//		Constructor<SubControle> construtorSubControle = subControleClasse1.getConstructor();// Retorna construtores publicos da classe SubControle 
		Constructor<SubControle> construtorSubControle = subControleClasse1.getDeclaredConstructor(String.class);// Retorna construtores privados da classe SubControle
		System.out.println(construtorSubControle);
		
		construtorSubControle.setAccessible(true);//Trocando a acessibilidade do construtor privado para public
		Object subControle = construtorSubControle.newInstance("Hello");
		System.out.println(subControle);
		
		
		
	}
	
}
