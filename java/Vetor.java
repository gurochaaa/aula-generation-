package PacoteJava;

import java.util.Scanner;

public class Vetor {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int num[]= new int [10];
		int x,somaNum=0;
		float mediaNum;
		
		for(x=0;x<10;x++)
		{
			System.out.println("\nEntre com um numero...: ");
			num[x] = leia.nextInt();
			somaNum += num[x];
		}	
		mediaNum = somaNum /10;
		for(x=0;x<10;x++){
			if(num[x] % 2 == 1) {
				System.out.println("\nElementos de indece impar..."+num[x]);
				
			}
		}
		for(x=0;x<10;x++){
			if(num[x] % 2 == 0) {
				System.out.println("\nNumeros pares..."+num[x]);
			}
		}
		System.out.println("\nTotal...: "+somaNum);
		System.out.println("\nMedia total é...: "+mediaNum);

	
	}
	
}
