package br.com.generation.exercicios;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int[] valor = new int [5];
		int maiorValor = 0;
		for(int i = 0; i < valor.length; i ++) {
			System.out.println("insira o " + (i + 1) + "º valor: ");
			valor[i] = leia.nextInt();
			if(valor[i] > maiorValor){
				maiorValor=valor[i];
			}
		}
		leia.close();
		System.out.println("o maior valor foi de:" + maiorValor);
		

	}

}
