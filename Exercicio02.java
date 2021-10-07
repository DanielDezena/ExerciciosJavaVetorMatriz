package br.com.generation.exercicios;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int[] lance = new int[10];
		int maiorLance = 0, quantidade = 0;
		double soma =0.0, media;
		
		for(int i = 0; i < lance.length; i ++) {
			System.out.println("digite o valor do "+ (i + 1) +" dado: ");
			lance[i] = leia.nextInt();
			if(lance[i] <= 0 || lance[i] > 6) {
				System.out.println("valor inválido!");
				i--;
			}else {
				soma+=lance[i];
				if(lance[i] == maiorLance) {
					quantidade++;
				}else if(maiorLance < lance[i]) {
					maiorLance = lance[i];
					quantidade = 1;
				}
			}
		}
		leia.close();
		media = soma / lance.length;
		System.out.println("___RESULTADOS___\nMédia aritimética dos lances: " 
				+ media + "\nMaior valor registrado: " + maiorLance +
				"\nTotal de vezes onde o maior valor foi repetido: " + quantidade);

	}

}
