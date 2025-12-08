package A6_HashsetEMAP.Ex05_ListadeConvidados;

import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        HashSet<String> convidados = new HashSet<>();

        int opcao = -1; // Inicializa com um valor inválido

        while (opcao != 0) {

            System.out.println("\n====== MENU DE CONVIDADOS ======");
            System.out.println("1 - Adicionar convidado");
            System.out.println("2 - Remover convidado");
            System.out.println("3 - Verificar convidado");
            System.out.println("4 - Exibir todos os convidados");
            System.out.println("5 - Quantidade de convidados");
            System.out.println("6 - Apagar todos os convidados");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine(); // limpar buffer

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do convidado a ser adicionado: ");
                    String nomeConvidado = sc.nextLine();

                    // Esse if serve para verificar se o convidado já tá na lista
                    if (convidados.add(nomeConvidado)) {
                        System.out.println("Convidado adicionado com sucesso.");
                    } else {
                        System.out.println("Convidado já está na lista.");

                    }
                    break;

                case 2:
                    System.out.print("Digite o nome do convidado a ser removido: ");
                    String nomeRemover = sc.nextLine();

                    // if de verificação se o nome está no hashset
                    if (convidados.remove(nomeRemover)) {
                        System.out.println("Convidado removido com sucesso.");
                    } else {
                        System.out.println("Convidado não encontrado na lista.");
                    }
                    break;

                case 3:
                    System.out.print("Digite o nome do convidado a ser verificado: ");
                    String nomeVerificar = sc.nextLine();

                    if (convidados.contains(nomeVerificar)) {
                        System.out.println("O convidado está na lista.");
                    } else {
                        System.out.println("O convidado não está na lista.");
                    }
                    break;

                case 4:
                    System.out.println("Lista de convidados:");
                    for (String convidado : convidados) {
                        System.out.println("- " + convidado);
                    }
                    break;

                case 5:
                    System.out.println("Quantidade de convidados: " + convidados.size()); // size() retorna o número de elementos no hashset, NÃO LENGTH
                    break;

                case 6:
                    convidados.clear(); // limpa todo o hashset
                    System.out.println("Todos os convidados foram removidos.");
                    break;

                case 0:
                    break;

                default:
                    break;
            }
        }

        sc.close();
    }

}
