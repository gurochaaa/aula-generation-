programa
{
    //Exercício 1
    funcao inicio()
    {
        inteiro vet[]={2, 5, 1, 3, 4, 9, 7, 8, 10, 6}
        inteiro x, y, aux
        para(x=0;x<10;x++){
            escreva(" ",vet[x])
        }
        escreva("\n")

        para(x=0;x<10;x++){
            para(y=0;y<10;y++){
                se(vet[x]>vet[y]){

                    aux=vet[x]
                    vet[x]=vet[y]
                    vet[y]=aux
                }
            }

        }
        para(x=0;x<10;x++){
        escreva(" ",vet[x])
        }
    }
}
    //Exercício 2
    funcao inicio()
    {
        inteiro numeros[3][3],soma=0,linha,coluna,diagonal=0

        para(linha=0;linha<3;linha++)
        {
            para(coluna=0;coluna<2;coluna++)
            {
                escreva("\nEntre com um número: ")
                leia(numeros[linha][coluna])
                se(numeros[linha][coluna] > 20)
                {
                    soma += numeros[linha][coluna]
                }
                se(linha == coluna)
                {
                    diagonal += numeros[linha][coluna]
                }
            }
        }
        escreva("\nSomatório: ",soma)
        escreva("\nSomatório da diagonal principal: ",diagonal)
        escreva("\nValor da linha 2 coluna 1: ",numeros[2][1])

    }
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1306; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */