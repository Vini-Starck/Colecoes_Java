package colecoesjava;

import java.util.ArrayList;

public class Curso {

    private String nome;
    private ArrayList<IDemanda> demandas;

    public Curso(String nome) {
        this.nome = nome;
        this.demandas = new ArrayList<>();
    }

    public String getNome() {
        return this.nome;
    }

    public void adicionarDemanda(IDemanda d) {
        this.demandas.add(d);
    }

    public void listaDemandas() {

        System.out.println("Curso: " + this.nome);

        for (IDemanda d : demandas) {
            d.getInfo();
        }
    }
}
