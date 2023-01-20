package ProjetoJava;

import java.util.Scanner;

import DesenvolvimentoJava.Cliente;
import DesenvolvimentoJava.Produto;

public class Acoes {
	public static Cliente dadosCliente(){
        Scanner leia = new Scanner(System.in);
        Cliente cliente = new Cliente();

        System.out.println("==========Bem Vindes a StoreMakeDiference!==========");//Menu de apresentação
        System.out.println("================Digite seus dados===================\n****************************************************");

        System.out.print("Nome completo: ");
        cliente.setNome(leia.nextLine());

        System.out.print("Data de Nascimento: ");
        cliente.setDataNasc(leia.nextLine());

        System.out.print("Genero: ");
        cliente.setGen(leia.nextLine());

        System.out.print("CPF: ");
        cliente.setCpf(leia.nextLine());

        System.out.print("Endereco: ");
        cliente.setEnd(leia.nextLine());

        return cliente;
    }

    public static Produto[][] inicializaProdutos(){
        Produto[][] produtos = new Produto[3][3];
        //Matriz com os produtos e preços
        produtos[0][0] = new Produto(1,24,0,"Batom Liquido","Possui acabamento confortavel e alta pigmentacaoo. deixa seus labios extremamente macios e com cor vibrante! Foi desenvolvido pensando no conforto e durabilidade que se espera de um perfeito batom.");
        produtos[0][1] = new Produto(1, 22.50,0,"Gloss","O Glossy foi desenvolvido para a verdadeira Diva: voce! A formula e refrescante, com brilho perfeito e durabilidade fantastica!");
        produtos[0][2] = new Produto(1,29.50,0,"Lip Tint","Boca Rosa Tint by Payot e um batom corante vermelho para ser usado nos labios e bochechas. Sua cor com alta fixacao e transparencia permanece por todo o dia, dando um aspecto de saude e naturalidade a pele. Boca Rosa Tint by Payot e você naturalmente linda.");

        produtos[1][0] = new Produto(2,9.50,0,"Lapis Kajal","E altamente pigmentado, com textura super macia, cremosa e secagem rapida.");
        produtos[1][1] = new Produto(2,10.50,0,"Mascara de cilios","A Mascara para Cilios Define e Alonga, foi criada especialmente para definir e alongar cilios, com seu exclusivo aplicador ela ira proporcionar um acabamento surpreendente e natural.");
        produtos[1][2] = new Produto(2,24.50,0,"Paleta de Sombras","Sao tons de azul, rosa, neutros, dourado, preto, muitas opcoes e infinitas combinacoes para destacar o seu olhar. Alem disso, as sombras sao pigmentadas e macias e sua embalagem e compacta.");

        produtos[2][0] = new Produto(3,60,0,"Base Mate","A Base Mate Boca Rosa Beauty by Payot e uma base de alta cobertura que proporciona um acabamento mate sem deixar a pele ressecada ou craquelada. Desliza facilmente na pele e proporciona uma cobertura perfeita, longa duracao e resistente a agua");
        produtos[2][1] = new Produto(3,35,0,"Corretivo Facial","O corretivo liquido possui maxima cobertura, proporciona efeito mate sem craquelar, de facil aplicacao e permite a construcao de varias camadas.");
        produtos[2][2] = new Produto(3,69.50,0,"Paleta de Blush","O produto realca as macas do rosto, colorindo de forma natural. Atribui aparencia saudavel, caracteristica " +
                "indispensavel para a maquiagem perfeita. Todos os blushes da paleta conferem cores incriveis com aplicação simples e efeito impecavel. Adere perfeitamente a pele, " +
                "revelando cores que se mantem durante todo o dia e com efeito fantastico. Sua formula perfeitamente pigmentada e micronizada desliza com suavidade. Seu uso oferece na " +
                "medida certa o toque especial para maquiagens perfeitas para qualquer ocasiao. Importante escolher o pincel apropriado.");

        return produtos;
    }

    public static void imprimeCompra(Cliente cliente, Produto[][] prod) {
        double valorTotalCompra = 0.0;

        System.out.println("\n\n=========================== Obrigado por comprar conosco ===========================");
        System.out.println("Dados do Cliente\n");
        System.out.println("Nome: "+cliente.getNome());
        System.out.println("Data de Nasc: "+cliente.getDataNasc());
        System.out.println("Genero: "+cliente.getGen());
        System.out.println("Cpf: "+cliente.getCpf());
        System.out.println("Endereco: "+cliente.getEnd());
        System.out.println("=====================================================================================");
        //Imprimi dados do cliente ao final da compra
        
        for(int i=0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if(prod[i][j].getQtde() != 0) {
                    System.out.println("Produto: " + prod[i][j].getNome());//imprimi os dados da compra
                    System.out.println("Valor unitário: " + prod[i][j].getValor()); 
                    System.out.println("Qtde : " + prod[i][j].getQtde());

                    valorTotalCompra += (prod[i][j].getValor() * prod[i][j].getQtde());
                    System.out.println("Valor: R$" + prod[i][j].getValor() * prod[i][j].getQtde());
                    System.out.println("=====================================================================================");
                }
            }
        }
        
        System.out.println("Valor Total: R$"+ valorTotalCompra); //Soma de todos os produtos
        if(valorTotalCompra>=99.01){
            System.out.println("Parabéns, você ganhou um CUPOM de 10% de desconto na sua próxima compra,"
            		+ " e \nestará disponível na sua caixa de e-mail em até 24h após a confirmação do pagamento!");
            }else {
            	System.out.println("Em compras acima de R$99,00 você ira ganhar 10% de desconto em sua próxima compra!");
            }
    }
}

