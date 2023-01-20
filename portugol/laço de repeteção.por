programa
{
	
	funcao inicio()
	{
	inteiro tab, i=1, resultado
	
	          escreva ("digite um numero entre 1 e 10 para saber a sua tabuada")
			leia(tab)
			
		enquanto(tab <1 ou tab >10 ) {

			escreva ("digite um numero entre 1 e 10 para saber a sua tabuada")
			leia(tab)
			}
			faca {
				resultado = tab * i 
				escreva ("\n", tab, "X", i, "=", resultado)
				i++
				}enquanto(i<=10)

programa
{
    funcao inicio()
    {
        inteiro somaPar=0,somaImpar=0
        inteiro num


        para(inteiro x=1;x<=10;x++)
        {

            escreva("\nDigite o ",x,"° numero: " )
            leia(num)

            se(num%2==0)
                somaPar++
            senao
                somaImpar++


        }
            escreva("\nVocê digitou ",somaImpar," numero(s) impares")
            escreva("\nVocê digitou ",somaPar," numero(s) pares")
    }

}
			
		}
			
	}

	

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 865; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */