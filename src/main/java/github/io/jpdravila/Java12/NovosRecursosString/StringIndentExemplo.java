package github.io.jpdravila.Java12.NovosRecursosString;

public class StringIndentExemplo {
    public static void main(String[] args){
        String texto = " Olá Mundo!\n Este é o modulo";

        //Adicona quatro espaçoes em branco
        //texto = texto.indent(4);

        System.out.println(texto);

        //Remove um espaço em branco
        texto = texto.indent(-4);
    }


}
