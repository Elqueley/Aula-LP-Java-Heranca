package atv1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList <Pessoa> p = new ArrayList();
		
		System.out.println("----------------CADASTRO---------------------");
		System.out.println("1 - para cadastrar um Advogado");
		System.out.println("2 - para cadastrar alguem da Limpeza");
		int op = sc.nextInt();
		
		switch (op) {
		case 1:
			sc.nextLine();
			
			System.out.println("Nome:");
			String nome = sc.nextLine();
			
			System.out.println("cpf:");
			String cpf = sc.nextLine();
			
			System.out.println("Data Nascimento:");
			String datan = sc.nextLine();
			
			System.out.println("Endereco:");
			String endereco = sc.nextLine();
			
			System.out.println("Mei:");
			String mei = sc.nextLine();	
			
			Limpeza limpeza = new Limpeza (nome, cpf, datan, endereco, mei);
			p.add(limpeza);
			
			break;
			
		case 2:
			
			sc.nextLine();
			
			System.out.println("Nome:");
			nome = sc.nextLine();
			
			System.out.println("cpf:");
			cpf = sc.nextLine();
			
			System.out.println("Data Nascimento:");
			datan = sc.nextLine();
			
			System.out.println("Endereco:");
			endereco = sc.nextLine();
			
			System.out.println("OAB:");
			String oab = sc.nextLine();	
			
			Advogado advogado = new Advogado (nome, cpf, datan, endereco, oab);
			p.add(advogado);
			
			break;
			
			
		default:
			break;
		}
		
		
	}

}
