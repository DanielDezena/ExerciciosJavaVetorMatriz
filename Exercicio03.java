package br.com.generation.exercicios;

import java.util.Scanner;

public class Exercicio03 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double[][] m1 = new double[2][3];
		double[][] m2 = new double[2][3];
		double[][] n1 = new double[2][3];
		double[][] n2 = new double[2][3];
		
		for(int i = 0; i < m1.length; i++) {
			for(int c = 0; c < m1[1].length;c++) {
				System.out.println("digte o valor para as coordenadas [" + (i + 1)+ "][" +
				(c + 1) + "] de N1 : " );
				n1[i][c] = ler.nextDouble();
			}
		}
		for(int i = 0; i < m2.length; i++) {
			for(int c = 0; c < m2[1].length; c++) {
				System.out.println("digte o valor para as coordenadas [" + (i + 1)+ "][" +
						(c + 1) + "] de N2 : " );
						n2[i][c] = ler.nextDouble();
			}
		}
		ler.close();
		System.out.printf("\n\nResultados de m1\n");
		for(int i = 0; i < m2.length; i++) {
			for(int c = 0; c < m2[1].length; c++) {
				m1[i][c] = n1[i][c] + n2[i][c];
				if(m1[i][c] < 10) {
					System.out.printf("[ " + m1[i][c] + " ]");
				}else {
					System.out.printf("[" + m1[i][c] + " ]");
				}
			}
			System.out.printf("\n");
		}
		System.out.printf("\n\nResultados de m2\n");
		for(int i = 0; i < m2.length; i++) {
			for(int c = 0; c < m2[1].length; c++) {
				m2[i][c] = n1[i][c] - n2[i][c];
				if(m2[i][c] < 10) {
					System.out.printf("[ " + m2[i][c] + " ]");
				}else {
					System.out.printf("[" + m2[i][c] + " ]");
				}
			}
			System.out.printf("\n");
		}
		
		
		
	}

}
