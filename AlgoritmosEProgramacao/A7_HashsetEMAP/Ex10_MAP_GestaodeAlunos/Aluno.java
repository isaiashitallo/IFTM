package A6_HashsetEMAP.Ex10_MAP_GestaodeAlunos;

public class Aluno {
    private String matricula;
    private String nome;
    private String cpf;

    public Aluno(String matricula, String nome, String cpf) {// Construtor da classe Aluno
        this.matricula = matricula;
        this.nome = nome;
        this.cpf = cpf;
    }


    //Getters
    public String getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }
}
