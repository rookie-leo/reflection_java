package br.com.alura.alurator;

public class Alurator {

	private String pacoteBase;

	public Alurator(String pacoteBase) {
		this.pacoteBase = pacoteBase;
	}

	public Object executa(String url) {
		// TODO - processa a requisicao executando o metodo
		// da classe em questao

		String[] partesUrl = url.replaceFirst("/", "").split("/");

		String nomeController = Character.toUpperCase(partesUrl[0].charAt(0)) +
								partesUrl[0].substring(1) +
								"Controller";

		try {
			Class<?> classeControle = Class.forName(pacoteBase + nomeController);

			@SuppressWarnings("deprecation")
			Object instanciaControle = classeControle.newInstance();
			
			System.out.println(instanciaControle);

			return null;
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}

	}
}
