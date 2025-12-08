public class Cliente {
    private String nome;
    private int numero;
    //construtores
    public Cliente(String nome, int numero) {
        this.nome = nome;
        this.numero = numero;
    }
    public Cliente(){}

    //getters and setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }


}
