package br.com.alura.alurator.playground.reflexao;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class TesteInvocaMetodoSemParametro {

    public static void main(String... args) throws Exception {
        Class<?> subControleClasse = Class.forName("br.com.alura.alurator.playground.controle.SubControle");

        Constructor<?> construtorPadrao = subControleClasse.getDeclaredConstructor();
        construtorPadrao.setAccessible(true);

        Object subControle = construtorPadrao.newInstance();

        /*getMethods(). Com ele, iremos recuperar todos os métodos públicos (e somente eles)
         referentes à classe em questão que estivermos parametrizando na classe Class<T>,
         e também aos métodos da superclasse dela ou das interfaces que a nossa classe implemente.*/
        for (Method m : subControleClasse.getMethods()) {
            System.out.println(m);
        }

        System.out.println();

        /*
        * getDeclaredMethods(), que retornará todos os métodos públicos,
        *  privados ou quaisquer forem os modificadores de acesso que eles tenham.
        *  No entanto, diferentemente dos anteriores, ele só levará em consideração os
        *  métodos da nossa própria classe - ou seja,
        *  não irá considerar alguma possível superclasse nem interfaces que a nossa classe implemente.
        * */
        for (Method m : subControleClasse.getDeclaredMethods()) {
            System.out.println(m);
        }

        Method m = subControleClasse.getDeclaredMethod("metodoSubControle2");
        m.setAccessible(true);
        Object retorno = m.invoke(subControle);

        System.out.println();
        System.out.println(retorno);

        Method m2 = subControleClasse.getDeclaredMethod("metodoSubControle1");
        retorno = m2.invoke(subControle);

        System.out.println();
        System.out.println(retorno);
    }

}
