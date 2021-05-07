package colecoesjava;

public class Chamado implements IDemanda {

    private Aluno aluno;
    private String mensagem;

    public Chamado(Aluno a, String msg) {
        this.aluno = a;
        this.mensagem = msg;
    }

    public String getMensagem() {
        return this.mensagem;
    }

    public Aluno getAluno() {
        return this.aluno;
    }

    public void getInfo() {
        System.out.println("Chamado");
        System.out.println("Aluno: " + this.aluno.getNome());
        System.out.println("Mensagem: " + this.mensagem);
        System.out.println();
    }
}
