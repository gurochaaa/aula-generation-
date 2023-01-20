package JavaGeneration;
import java.util.Scanner;
public class ImparPar {

	public static void main(String[] args) {
		Scanner ler  = new Scanner (System.in);
		int num, x=1, contPar=0,contImpar=0;
		
		while (x<=10) {
			System.out.println("\nEntre com qualquer número");
			num = ler.nextInt();
			
			if(num % 2 == 0) {
				contPar++;
				System.out.println("\nEsse número é par");
			}
			else 
			{
				contImpar++;
				System.out.println("\nEsse número é impar");
			}
			x++;
		}
		System.out.printf("\nQuantidade de números pares foi de: " +contPar);
		System.out.printf("\nQuatidade de números impares foi de: " +contImpar);
		{
			
		}
	}
}