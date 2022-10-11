package github.io.jpdravila.exemplo01;

interface Figura{
    void desenha();
}

public class Exemplo01 {
    public static void main(String[] args){
        Figura figUm = new Figura() {
            @Override
            public void desenha() {
                System.out.println("Desenha figura um!");
            }
        };
        figUm.desenha();

        Figura figDois = () -> System.out.println("Desenha figura dois!");
        figDois.desenha();
    }

}
