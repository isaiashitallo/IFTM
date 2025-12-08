public class Aluno extends Pessoa{
    private String curso;

    public Aluno(String curso, String nome) {
        super(nome);
        this.curso = curso;        
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

}
