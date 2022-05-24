package br.com.alura.alurator.reflexao;

import java.lang.reflect.Method;

public class  ManipuladorObjeto {

    private Object instancia;

    public ManipuladorObjeto(Object instancia) {
        this.instancia = instancia;
    }

    public ManipuladorMetodo getMetodo(String nomeMetodo) {
        Method metodo = null;
        try {
            metodo = instancia.getClass().getDeclaredMethod(nomeMetodo);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
        return new ManipuladorMetodo(instancia, metodo);
    }
}
