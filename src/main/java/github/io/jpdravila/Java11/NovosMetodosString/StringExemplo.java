package github.io.jpdravila.Java11.NovosMetodosString;

import java.util.stream.Collectors;

public class StringExemplo {
    public static void main(String[] args){
        String str1 = " ";
        String str2 = "";
        String str3 = "Java Tópicos Avançados";

        //Avalia e devolve em valor booleano se está vazio.
        System.out.println(str1.isBlank());
        System.out.println(str2.isBlank());
        System.out.println(str3.isBlank());

        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

        String str4 = "Java\nTópicos\nAvançados";

        //Remove uma String sem nenhum tipo de quebra de linha;
        System.out.println(str4.lines().collect(Collectors.toList()));

        //Repete a string concatenado-oas com outras strings
        System.out.println(str3.repeat(5));
    }
}
