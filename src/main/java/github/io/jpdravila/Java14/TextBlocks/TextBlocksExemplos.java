package github.io.jpdravila.Java14.TextBlocks;

public class TextBlocksExemplos {

    /*JEP 368*/

    public static void main(String[] args) {
        String textoTextBlock =
                """
                Olá \s\s\s\s\s\s\s\s mundo! \
                Este é o módulo Java 14 \
                Curso Java - Tópicos Avançados \
                """;

        /*
            " \ " usado para não se quebrar linhas
            " \s " usado para abrir espaço nos textos
         */

        System.out.println(textoTextBlock);
    }
}
