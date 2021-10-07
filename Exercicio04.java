package br.com.generation.exercicios;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int[][] matriz = new int[3][3];
		int soma = 0, somaDiagonal;
		for(int i = 0; i < matriz.length; i++) {
			for(int c = 0; c < matriz[1].length; c++) {
				System.out.println("digite o valor de [" + (i +1)+ "] [" +
			(c + 1) + "] :");
			matriz[i][c] = leia.nextInt();
			soma += matriz[i][c];
			}
		}
		leia.close();
		somaDiagonal = matriz[0][0]+matriz[1][1]+matriz[2][2];
		System.out.println("___RESULTADOS___\nSoma total das matrizes: " + soma +
				"\nSoma da primeira diagonal: " + somaDiagonal);
	}

}
