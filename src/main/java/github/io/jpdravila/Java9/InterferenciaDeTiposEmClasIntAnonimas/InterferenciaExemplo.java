package github.io.jpdravila.Java9.InterferenciaDeTiposEmClasIntAnonimas;

public class InterferenciaExemplo {
    public static void main(String[] args){

        //Classe interna anônima
        var somaString = new SomaTudo<String>() {
            @Override
            public String soma(String a, String b) {
                return a + b;
            }
        };
        System.out.println(somaString.soma("Olá ", "mundo"));
    }

}
