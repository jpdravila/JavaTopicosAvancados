package github.io.jpdravila.Java9.FactoryMethodDeColecoes;

import java.util.Set;

public class FactoryMethodSetExemplo {
    public static void main(String[] args){
        Set<String> lista = Set.of("Banana", "Maça", "Pera");
        //Cuidado com MAP ou SET, pois não pode ser repetido elementos
        //e os mesmo não serão impressos em ordem nas que foram escritos

        for(String s : lista){
            System.out.println(s);
        }
    }

}