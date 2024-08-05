package aplication;

import java.util.Locale;
import java.util.Scanner;
import entities.Cliente;


public class Program {  

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Cliente conta = new Cliente();
		
		System.out.print("Enter account holder: "); //Nome
		String holder = sc.nextLine();
		
		System.out.print("Enter account number: "); //n° conta
		int account = sc.nextInt();
		
		System.out.println("Is there an initial deposit: (y - Yes) / (n - No)"); //Irá fazer um deposito inicial
		char response = sc.next().charAt(0);
		if(response == 'y') {
			System.out.println("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			conta = new Cliente(holder, account, initialDeposit);	
		}
		else{ 
			conta = new Cliente(holder, account);
		}
		
		System.out.println();
		System.out.println("Account data: ");
		System.out.println(conta);
		
		System.out.println();
		
		
		System.out.print("Enter a deposit value: ");
		double depositValue = sc.nextDouble();
		conta.deposito(depositValue);
		System.out.println("Update account data: ");
		System.out.println(conta);
		

		System.out.print("Enter a withdraw value: "); //saque
		double saqueValue = sc.nextDouble();
		conta.saque(saqueValue);
		System.out.println("Update account data: ");
		System.out.println(conta);
	
		sc.close();	
	}
}
