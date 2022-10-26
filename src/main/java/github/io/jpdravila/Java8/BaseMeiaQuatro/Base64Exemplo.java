package github.io.jpdravila.Java8.BaseMeiaQuatro;

import java.util.Base64;

public class Base64Exemplo {

    public static void main(String[] args){

        try {
            String texto = "A classe Base64 no Java 08";

            String textoCodificado = Base64.getEncoder().encodeToString(texto.getBytes("utf-8"));

            String textoDecodificado = new String(Base64.getDecoder().decode(textoCodificado),"utf-8");

            System.out.println(textoCodificado);
            System.out.println(textoDecodificado);

        } catch (Exception e){
            System.out.println("Error!");
        }
    }

}
