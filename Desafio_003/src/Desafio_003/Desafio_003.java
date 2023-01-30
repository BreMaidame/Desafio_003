package Desafio_003;

import java.util.Scanner;

public class Desafio_003 {

	public static void main(String[] args) {
		
		System.out.println("Notas Escolares Ubuntu 1.0");
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Quantos alunos você deseja inserir: ");
		int numAlunos = scan.nextInt();
		
		String alunoComMaiorNota = "";
		float maiorNota = 0;
		
		for (int i = 1; i <= numAlunos; i++) {
			System.out.println("Digite o nome do aluno: " + i);
			String nome = scan.next();
			
			System.out.println("Digite a nota desse aluno: " + i);
			float nota = scan.nextFloat();
			
			if (nota > maiorNota) {
				alunoComMaiorNota = nome;
				maiorNota = nota;
				
			}
			
		}
		
		System.out.println("O aluno com a maior nota é " + alunoComMaiorNota + " com uma nota de: " + maiorNota + "pontos");
		System.out.println("Obrigado por usar o Notas Escolares Ubuntu 1.0");

}
}