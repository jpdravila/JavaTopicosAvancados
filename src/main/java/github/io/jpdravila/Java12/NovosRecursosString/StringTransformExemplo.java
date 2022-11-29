package github.io.jpdravila.Java12.NovosRecursosString;

public class StringTransformExemplo {
    public static void main(String[] main){
        String texto = " Olá Mundo!\n Este é o modulo";

        String textoInvertido = texto.transform(s -> new StringBuilder(s).reverse().toString());

        System.out.println(textoInvertido);
    }
}
