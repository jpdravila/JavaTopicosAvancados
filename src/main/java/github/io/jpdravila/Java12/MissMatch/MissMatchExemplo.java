package github.io.jpdravila.Java12.MissMatch;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class MissMatchExemplo {
    public static void main(String[] args) {
        File f1 = new File("textoUm.txt");

        File f2 = new File("textoDois.txt");

        try {
            long resultado = Files.mismatch(f1.toPath(), f2.toPath());

            System.out.println(resultado);
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
