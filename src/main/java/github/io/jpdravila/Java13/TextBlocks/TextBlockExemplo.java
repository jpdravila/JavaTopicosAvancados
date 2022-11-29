package github.io.jpdravila.Java13.TextBlocks;

public class TextBlockExemplo {

    public static void main(String[] args){
        String text = "Olá mundo!\n"
                + "Esse é o módulo quebra de linha\n"
                + "Java 13";

        String textBlock =
                """
                Olá mundo!
                Esse é o modulo quebra de linha
                Java 13
                """;


        System.out.println("-=-=-=-=-=MODO TRADICIONAL-=-=-=-=-=");
        System.out.println(text);
        System.out.println("-=-=-=-=-=MODO TEXT BLOCS-=-=-=-=-=");
        System.out.println(textBlock);
    }

}
