package br.com.erickfreire.saidanoformatodetabela;

/**
 * Crie um programa em Java que mostra calculos em formato de uma tabela
 * @author Erick Freire
 * @version 1 - Criado em 09-04-2021 as 17:54
 */

public class SaidaNoFormatoDeTabela {
	public static void main(String[] args) {
		int contador = 1;
		
		System.out.printf("N\t10*N\t100*N\t1000*N%n");
		
		while(contador <= 5) {
			
			System.out.printf("%d\t%d\t%d\t%d\t%n", contador, contador * 10, contador * 100, contador * 1000);
			
			contador++;
		}
		
		
		
	}


}
