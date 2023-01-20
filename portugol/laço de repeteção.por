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
			
		}
			
	}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 284; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */