package br.com.alura.alurator.reflexao;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ManipuladorConstrutor {

    private Constructor<?> constructor;

    public ManipuladorConstrutor(Constructor<?> construtor) {
        this.constructor = construtor;
    }

    public Object invoca() {
        try {
            return constructor.newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) { // Tratando a InvocationTargetException de forma diferente
            e.printStackTrace();
            throw new RuntimeException("Erro no contrutor", e.getTargetException());
        }
    }
}
