package github.io.jpdravila.Java11.VarParametroLambda;


import java.util.function.Function;

public class VarParametroLambdaExemplo {
    public static void main(String[] args){

        //Function<String, String> concatena = (String s) -> s + ". ";
        Function<String, String> concatena = (var s) -> s + ". ";

    }
}
