package github.io.jpdravila.Java14.NullPointException;

class Aluno{
    private String nome = null;

    public Aluno(){

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}

public class NullPointExceptionExemplo {
    public static void main(String[] args) {
        Aluno a = new Aluno();

        a.getNome().substring(0, 1);

        //Ajuda na debugação de códigos com a JVM
    }
}
