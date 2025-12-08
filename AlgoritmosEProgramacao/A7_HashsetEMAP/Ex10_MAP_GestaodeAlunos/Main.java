package A7_HashsetEMAP.Ex10_MAP_GestaodeAlunos;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        HashMap<String, Aluno> alunos = new HashMap<>();
        HashMap<String, ArrayList<Double>> notas = new HashMap<>(); // Mapa para armazenar as notas dos alunos, usando arraylists

        while (true) {
            System.out.println("\n=== MENU ===");
            System.out.println("1 - Adicionar aluno");
            System.out.println("2 - Adicionar nota a um aluno");
            System.out.println("3 - Calcular média de todos os alunos");
            System.out.println("4 - Imprimir dados dos alunos");
            System.out.println("5 - Sair");
            System.out.print("Escolha: ");

            int opcao = sc.nextInt();
            sc.nextLine(); // limpar buffer

            switch (opcao) {

                case 1:
                    System.out.print("Matrícula: ");
                    String mat = sc.nextLine();

                    System.out.print("Nome: ");
                    String nome = sc.nextLine();

                    System.out.print("CPF: ");
                    String cpf = sc.nextLine();

                    alunos.put(mat, new Aluno(mat, nome, cpf));
                    notas.put(mat, new ArrayList<>());
                    System.out.println("Aluno adicionado!");
                    break;

                case 2:
                    System.out.print("Matrícula do aluno: ");
                    String m = sc.nextLine(); //matricula

                    if (!alunos.containsKey(m)) { // Verifica se o aluno existe
                        System.out.println("Aluno não encontrado!");
                        break;
                    }

                    System.out.print("Nota: ");
                    double nota = sc.nextDouble();
                    sc.nextLine();

                    notas.get(m).add(nota);
                    System.out.println("Nota adicionada!");
                    break;

                case 3:
                    double soma = 0;
                    int count = 0;

                    for (ArrayList<Double> lista : notas.values()) { // Percorre todas as listas de notas
                        for (double n : lista) {
                            soma += n;// Soma todas as notas
                            count++;// Conta quantas notas foram somadas
                        }
                    }

                    if (count == 0) {
                        System.out.println("Nenhuma nota cadastrada!");
                    } else {
                        System.out.println("Média = " + (soma / count));
                    }
                    break;

                case 4:
                    for (String chave : alunos.keySet()) {
                        Aluno a = alunos.get(chave);
                        System.out.println("\nAluno:");
                        System.out.println("Matrícula: " + a.getMatricula());  // Usando os métodos getters da classe Aluno 
                        System.out.println("Nome: " + a.getNome());// Usando os métodos getters da classe Aluno 
                        System.out.println("CPF: " + a.getCpf());// Usando os métodos getters da classe Aluno
                        System.out.println("Notas: " + notas.get(chave));// Imprime as notas do aluno
                    }
                    break;

                case 5:
                    return;

                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
}
