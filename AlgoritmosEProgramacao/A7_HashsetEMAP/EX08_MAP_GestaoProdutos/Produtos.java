package A6_HashsetEMAP.EX08_MAP_GestaoProdutos;

public class Produtos {
    private String id;
    private String nome;

    // Construtor
    public Produtos(String id, String nome) {
        this.id = id;
        this.nome = nome;
    }


    //Getters
    public String getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    
    @Override // Sobrescreve o método toString para exibir as informações do produto
    public String toString() {// Retorna uma representação em string do produto
        return id + ": " + nome;
    }
}
