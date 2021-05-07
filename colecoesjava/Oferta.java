package colecoesjava;

import java.util.ArrayList;

public class Oferta implements IDemanda {

    private String disciplina;
    private ArrayList<Aluno> alunos;

    public Oferta(String d) {
        this.disciplina = d;
        this.alunos = new ArrayList<>();
    }

    public Oferta(String d, ArrayList<Aluno> alunos) {
        this.disciplina = d;
        this.alunos = alunos;
    }

    public String getDisciplina() {
        return this.disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    //métodos para manipular a coleção
    public void adicionaAluno(Aluno a) {
        this.alunos.add(a);
    }

    public void listaAlunos() {
        for (Aluno a : this.alunos) {
            System.out.println("ID: " + a.getId());
            System.out.println("Nome: " + a.getNome());
            System.out.println("Genero: " + a.getGenero());
            System.out.println();
        }
    }

    public void editarAluno(int id, String nome, String genero) {
        for (Aluno a : this.alunos) {
            if (a.getId() == id) {
                a.setNome(nome);
                a.setGenero(genero);
                System.out.println("Alterado");
                return;
            }
        }
        System.out.println("Não encontrado");
    }

    public void removerAluno(int id) {
        for (Aluno a : this.alunos) {
            if (a.getId() == id) {
                this.alunos.remove(a);
                System.out.println("Removido");
                return;
            }
        }
        System.out.println("Não encontrado");
    }

    public void removerAluno(String nome, String genero) {
        for (Aluno a : this.alunos) {
            if (a.getNome().equals(nome) && a.getGenero().equals(genero)) {
                this.alunos.remove(a);
                System.out.println("Removido");
                return;
            }
        }
        System.out.println("Não encontrado");
    }

    public void removerTodosAlunos() {
        this.alunos.clear();
    }

    public void getInfo() {
        System.out.println("Disciplina: " + this.getDisciplina());
        this.listaAlunos();
    }

}
