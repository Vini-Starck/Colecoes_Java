package colecoesjava;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Aluno> listaAlunos = new ArrayList<>();
        listaAlunos.add(new Aluno("Mariana Lori", "F", 1));
        listaAlunos.add(new Aluno("Caio", "M", 2));
        listaAlunos.add(new Aluno("Alana", "F", 3));
        listaAlunos.add(new Aluno("João", "M", 4));

        Oferta o = new Oferta("POO", listaAlunos);

        //o.adicionaAluno(new Aluno("Mariana Lori","F",1));
        //o.adicionaAluno(new Aluno("Caio","M",2));
        //o.adicionaAluno(new Aluno("Alana","F",3));
        //o.adicionaAluno(new Aluno("João","M",4));
        //o.listaAlunos();
        //o.editarAluno(2, "Caio Abud", "M");
        //o.listaAlunos();
        //o.removerAluno("Alana","F");
        //o.listaAlunos();
        Curso c = new Curso("Sistemas de Informação");
        c.adicionarDemanda(o);
        c.adicionarDemanda(new Chamado(new Aluno("João", "M", 4), "Quero voltar no próximo semestre"));
        c.adicionarDemanda(new Chamado(new Aluno("Poliana", "F", 5), "Ajustar minha nota do PI"));

        c.listaDemandas();

    }

}
