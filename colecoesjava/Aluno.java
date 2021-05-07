package colecoesjava;

public class Aluno {

    private String nome;
    private String genero;
    private int id;

    public Aluno(String n, String g, int id) {
        this.nome = n;
        this.genero = g;
        this.id = id;
    }

    public String getNome() {
        return this.nome;
    }

    public String getGenero() {
        return this.genero;
    }

    public void setNome(String n) {
        this.nome = n;
    }

    public void setGenero(String g) {
        this.genero = g;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }
}
