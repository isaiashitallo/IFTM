package A6_HashsetEMAP.Ex01_AlunoEMatricula;

import java.util.HashSet; // Importa a classe HashSet
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Aluno> alunos = new HashSet<>(); // Cria um HashSet para armazenar os alunos

        while (true) {
            System.out.print("Matrícula: ");
            String matricula = sc.nextLine();

            if (matricula.equals("0")) break;

            System.out.print("Nome: ");
            String nome = sc.nextLine();

            alunos.add(new Aluno(matricula, nome)); // Adiciona o aluno ao HashSet -- classe aluno
        }

        System.out.println("\nAlunos:");
        for (Aluno a : alunos) {
            System.out.println(a.getNome());
        }
        sc.close();
    }
}

