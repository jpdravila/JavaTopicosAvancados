package github.io.jpdravila.Java9.FactoryMethodDeColecoes;

import java.util.List;

public class FactoryMethodListExemplo {

    public static void main(String[] args){
        List<String> lista = List.of("Banana", "Maça", "Pera", "Abacate");

        for(String listas : lista){
        System.out.println(listas);
        }

    }
}
