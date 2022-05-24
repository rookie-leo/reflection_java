package br.com.alura.alurator;

import br.com.alura.alurator.protocolo.Request;
import br.com.alura.alurator.reflexao.Reflexao;

public class Alurator {

    private String pacoteBase;

    public Alurator(String pacoteBase) {
        this.pacoteBase = pacoteBase;
    }

    public Object executa(String url) {
        // TODO - processa a requisicao executando o metodo
        // da classe em questao

        Request request = new Request(url);
        String nomeController = request.getNomeController();
        String nomeMetodo = request.getNomeMetodo();


//        Object instanciaController = new Reflexao()
//                .refleteClasse(pacoteBase + nomeController)
//                .getConstrutorPadrao()
//                .invoca();

        Object retorno = new Reflexao()
                        .refleteClasse(pacoteBase + nomeController)
                        .criaInstancia()
                        .getMetodo(nomeMetodo)
                        .invoca();

        System.out.println(retorno);

        return retorno;
    }
}
