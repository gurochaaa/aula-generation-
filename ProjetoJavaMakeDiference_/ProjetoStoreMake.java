package ProjetoJava;

import java.util.Scanner;

import DesenvolvimentoJava.Cliente;
import DesenvolvimentoJava.Produto;

public class ProjetoStoreMake {

	public static void main(String[] args) {

		 int categ = 0, subcateg;
	        Scanner leia = new Scanner(System.in);

	        Cliente cliente = Acoes.dadosCliente();
	        Produto[][] prod = Acoes.inicializaProdutos();
	        
	        System.out.println("======================PROMOÇÃO======================\nEm compras acima de R$ 99,00 você sera premiado \ncom um CUPOM de 10% na proxima compra ! ");
	        
	        while(categ != 4) {
	            System.out.println("\n****************************************************");
	            System.out.print("1 - Realce seus Labios\n"	//Categorias
	                    + "2 - Encante com o olhar\n"
	                    + "3 - Make perfeita, pele perfeita\n"
	                    + "4 - Finalizar a Compra\n"
	                    + "Qual categoria voce deseja ver? ");
	            categ = leia.nextInt();
	            System.out.println("****************************************************");

	            if(categ > 0 && categ < 4) {
	            		//Opções de produtos
	                System.out.print("\n1 -" + prod[categ-1][0].getNome() + " (R$ "+ prod[categ-1][0].getValor()+")\n" + prod[categ-1][0].getDescricao()+"\n"
	                        + "\n2 -"+ prod[categ-1][1].getNome() + " (R$ "+ prod[categ-1][1].getValor()+")\n" + prod[categ-1][1].getDescricao()+"\n"
	                        + "\n3 -"+ prod[categ-1][2].getNome() + " (R$ "+ prod[categ-1][2].getValor()+")\n" + prod[categ-1][2].getDescricao()+"\n"
	                        + "\n4 - Menu Anterior\n"
	                        + "\nQual produto voce deseja comprar? ");
	                subcateg = leia.nextInt();

	                if(subcateg > 0 && subcateg < 4) { 
	                    System.out.print("Quantidade? ");
	                    prod[categ-1][subcateg-1].setQtde(leia.nextInt());
	                } else if (subcateg == 4){ 
	                    continue;
	                } else {
	                    System.out.println("Código inválido");
	                }
	            }
	            else if(categ == 4) {
	                break;
	            }
	            else {
	                System.out.println("Opcao invalida!");
	            }
	        }
	        Acoes.imprimeCompra(cliente, prod);
	    }
	}


