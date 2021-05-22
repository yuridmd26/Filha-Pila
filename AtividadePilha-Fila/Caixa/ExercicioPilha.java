package Caixa;

import java.util.Scanner;

public class ExercicioPilha 
{
	public static void main(String[] args) 
	{
		regCaixa[] regCaixas = new regCaixa[10];
		Scanner scTeclado = new Scanner(System.in);
		
		int iOpcao = 0;
	
		while(iOpcao != 3)
		{
			System.out.println("==================================");
			System.out.println("1. Empilhar Caixa"                 );
			System.out.println("2. Desimpilhar Caixa"              );
			System.out.println("3. Sair"                           );
			System.out.println("==================================");
			iOpcao = scTeclado.nextInt();
		
			switch (iOpcao) 
			{
				case 1: 
				{
					if(regCaixas[0] == null) 
						CadastrarCaixas(scTeclado, regCaixas);
					else
						System.out.println("Pilha está cheia!");
			
					break;
				}
				case 2:
				{
					regCaixas = desempilhar(regCaixas);
					break;
				}
				default:
					System.out.println("Opção Invalida.");
					break;
			}
		}
	
		scTeclado.close();
	}
	
	public static void CadastrarCaixas(Scanner scTeclado, regCaixa[] regCaixas) 
	{
		regCaixa regCaixa = new regCaixa();
		
		System.out.println("Informe o identificador da caixa: ");
		regCaixa.setIdentificador(scTeclado.next());
		
		System.out.println("Informe a altura da caixa: ");
		regCaixa.setAltura(scTeclado.nextDouble());
		
		System.out.println("Informe a largura da caixa: ");
		regCaixa.setLargura(scTeclado.nextDouble());
		
		System.out.println("Informe a profundidade da caixa: ");
		regCaixa.setProfundidade(scTeclado.nextDouble());
		
		System.out.println("Essa caixa possui conteúdo frágil? ");
		char fragil = scTeclado.next().charAt(0);
		
		if(fragil == 'S' || fragil == 's') 
			regCaixa.setFragil(true);
		else 
			regCaixa.setFragil(false);
		
		regCaixas = empilhar(regCaixa, regCaixas);
	}
	
	public static regCaixa[] empilhar(regCaixa regCaixa, regCaixa[] regCaixas)
	{
		for (int idxCaixa = regCaixas.length - 1; idxCaixa >= 0; --idxCaixa) 
		{
			if(regCaixas[idxCaixa] == null) 
			{
				regCaixas[idxCaixa] = regCaixa;
				break;
			}
			
			if(idxCaixa == 0) 
				System.out.println("A pilha está cheia!");
		}
		return regCaixas;
	}
	
	public static regCaixa[] desempilhar(regCaixa[] regCaixas)
	{
		for (int idxCaixa = 0; idxCaixa < regCaixas.length; ++idxCaixa)
		{
			if(regCaixas[idxCaixa] != null)
			{
				regCaixas[idxCaixa] = null;
				System.out.println("Caixa retirada da pilha");
				break;
			}
			
			if(idxCaixa == regCaixas.length - 1)
				System.out.println("A pilha esta vazia");
		}
		
		return regCaixas;
	}
}
