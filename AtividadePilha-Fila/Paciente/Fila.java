package Paciente;

import java.util.Scanner;

public class Fila 
{	
	public static void main(String[] args) 
	{
		Scanner scTeclado       = new Scanner(System.in);
		Paciente[] regPacientes = new Paciente[20];
		
		int iOpcao = 0;
		
		while(iOpcao != 3)
		{
			System.out.println("=================================");
			System.out.println("1. Incluir Paciente");
			System.out.println("2. Atender Paciente");
			System.out.println("3. Sair");
			System.out.println("=================================");
			iOpcao = scTeclado.nextInt();
			
			switch (iOpcao) 
			{
				case 1: 
				{
					regPacientes = incluirPaciente(scTeclado, regPacientes);
					break;
				}
				
				case 2: 
				{
					String sNomeCliente;
					
					System.out.println("Informe seu nome: ");
					sNomeCliente = scTeclado.next();					
				
					regPacientes = AtenderPaciente(sNomeCliente, scTeclado, regPacientes);
				
					break;
				}
				default:
					System.out.println("Opção Invalida.");
					break;
			}
		}
		
		scTeclado.close();
	}
	
	public static Paciente[] incluirPaciente(Scanner scTeclado, Paciente[] pacientes) 
	{
		if(pacientes[pacientes.length - 1] == null) 
		{
			Paciente paciente = new Paciente();
			
			scTeclado.nextLine();
			
			System.out.println("Nome: ");
			paciente.setNome(scTeclado.nextLine());
			
			System.out.println("Idade: ");
			paciente.setIdade(scTeclado.nextInt());
			
			scTeclado.nextLine();
			
			System.out.println("Descrição: ");
			paciente.setDescricao(scTeclado.nextLine());
			
			for (int idxPacientes = 0; idxPacientes < pacientes.length; ++idxPacientes) 
			{
				if(pacientes[idxPacientes] == null) 
				{
					pacientes[idxPacientes] = paciente;
					break;
				}
			}
		}
		else 
			System.out.println("Fila de atendimento está cheia!");
		
		return pacientes;
	}

	public static Paciente[] AtenderPaciente(String sNome, Scanner scTeclado, Paciente[] pacientes) 
	{
		
		if(sNome != "") 
		{
			for (int idxPacientes = 0; idxPacientes < pacientes.length; ++idxPacientes) 
			{
				if(pacientes[idxPacientes] != null) 
				{
					if(pacientes[idxPacientes].getNome().equals(sNome)) 
					{
						pacientes[idxPacientes] = null;
						System.out.println("Cliente atendido!");
						break;
					}
				}
			}
			
		}
		else 
		{
			System.out.println("Nome do cliente não preenchido!");
		}
		
		return reposicionaFila(pacientes);
	}

	public static Paciente[] reposicionaFila(Paciente[] pacientes) 
	{
		for (int idxPaciente = 0; idxPaciente < pacientes.length; ++idxPaciente) 
		{
			if(pacientes[idxPaciente] == null && (idxPaciente + 1) < pacientes.length) 
			{
				for (int idxReposicao = idxPaciente; idxReposicao < pacientes.length - 1; ++idxReposicao) 
				{
					Paciente paciente           = pacientes[idxReposicao];
					pacientes[idxReposicao]     = pacientes[idxReposicao + 1];
					pacientes[idxReposicao + 1] = paciente;
				}
			}
		}
		
		return pacientes;
	}

}
