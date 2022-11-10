package github.io.jpdravila.Java9.TryCatchRecursos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryCatchExemplo {
    public static void main(String[] args){
        try {
            TryCatchExemplo.lerArquivoBlocoTryCatchComRecurso("file.txt");
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    //Antes do Java 07 - "Modo tradicional"
    public static void lerArquivoComBlocoTryCatchFinally(String path) throws IOException {
        String linha = "";

        BufferedReader br = new BufferedReader(new FileReader(path));

        try{
            while((linha = br.readLine()) != null){
                System.out.println(linha);
            }
        }catch(IOException e){
            throw e;
        }
        finally {
            if(br != null){
                br.close();
            }
        }
    }
    //a partir do Java 09
    public static void lerArquivoBlocoTryCatchComRecurso(String path) throws IOException{
     String linha = "";

     BufferedReader br = new BufferedReader(new FileReader(path));

     try(br){
         while ((linha = br.readLine()) != null){
             System.out.println(linha);
         }
     }

    }

}
