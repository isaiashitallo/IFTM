package A6_HashsetEMAP.EX08_MAP_GestaoProdutos;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        HashMap<String, Produtos> produtos = new HashMap<>();  // Mapa para armazenar produtos com ID como chave

        while (true) {
            System.out.println("\n=== MENU ===");
            System.out.println("1 - Adicionar produto");
            System.out.println("2 - Buscar produto por ID");
            System.out.println("3 - Remover produto por ID");
            System.out.println("4 - Listar todos os produtos");
            System.out.println("5 - Sair");
            System.out.print("Escolha: ");

            String opcao = sc.nextLine();

            switch (opcao) {
                case "1":
                    System.out.print("ID do produto: ");
                    String id = sc.nextLine();

                    System.out.print("Nome do produto: ");
                    String nome = sc.nextLine();

                    produtos.put(id, new Produtos(id, nome)); // Adiciona o produto ao mapa
                    System.out.println("Produto adicionado com sucesso!");
                    break;

                case "2":
                    System.out.print("ID para busca: ");
                    String buscaId = sc.nextLine();

                    Produtos encontrado = produtos.get(buscaId); // Busca o produto pelo ID, criando a variável encontrado

                    if (encontrado != null) {
                        System.out.println("Encontrado: " + encontrado);
                    } else {
                        System.out.println("Nenhum produto com esse ID.");
                    }
                    break;

                case "3":
                    System.out.print("ID para remover: ");
                    String removeId = sc.nextLine();  // Lê o ID do produto a ser removido

                    if (produtos.remove(removeId) != null) { // Remove o produto pelo ID e verifica se foi removido
                        System.out.println("Produto removido!");
                    } else {
                        System.out.println("Nenhum produto com esse ID.");
                    }
                    break;

                case "4":
                    if (produtos.isEmpty()) { // Verifica se o mapa está vazio
                        System.out.println("Nenhum produto cadastrado.");
                    } else {
                        System.out.println("\n--- TODOS OS PRODUTOS ---");
                        for (Map.Entry<String, Produtos> entry : produtos.entrySet()) { // Itera sobre as entradas do mapa
                            System.out.println(entry.getValue());
                        }
                    }
                    break;

                case "5":
                    return; // Sai do programa

                default:
                    System.out.println("Opção inválida.");
            }

        }

    }
}