package A6_HashsetEMAP.Ex01_AlunoEMatricula;

import java.util.Objects; // Importa a classe Objects para equals e hashCode

public class Aluno {
    private String matricula; // Atributo matrícula
    private String nome; // Atributo nome

    public Aluno(String matricula, String nome) {
        this.matricula = matricula;
        this.nome = nome;
    }

    public String getMatricula() { // Getter para matrícula
        return matricula;
    }

    public String getNome() { // Getter para nome
        return nome;
    }

    @Override // Sobrescreve o método equals para comparar alunos pela matrícula
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return Objects.equals(matricula, aluno.matricula);
    }

    @Override
    public int hashCode() {
        return Objects.hash(matricula);
    }
}

