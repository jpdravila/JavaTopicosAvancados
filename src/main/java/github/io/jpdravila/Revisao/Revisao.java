package github.io.jpdravila.Revisao;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

class Carro{
    private int ano;
    private String modelo;
    private String marca;

    public Carro(int ano, String modelo, String marca) {
        this.ano = ano;
        this.modelo = modelo;
        this.marca = marca;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}

public class Revisao {

    public static void main(String[] args) {
        List<Carro> lista = new ArrayList<>();
        lista.add(new Carro(2001, "Fiesta", "Fiat"));
        lista.add(new Carro(2019, "Ranger", "Volkswagen"));
        lista.add(new Carro(2022, "Corolla Cross", "Toyota Japones"));

        lista.forEach((p) -> System.out.println(p.getModelo() + "|" + p.getMarca() + "|" + p.getAno()));

    }

}
