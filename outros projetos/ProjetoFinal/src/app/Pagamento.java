package app;

import java.util.Scanner;

public class Pagamento {

	public Float CalculoCompra() {
		
		
		
		
		return null;
		
	}
	
	public char Paga() {
		
		char pgt ;
		
		Scanner leiaString = new Scanner(System.in);
		Scanner leiaValores = new Scanner(System.in);
		
		
		System.out.println("Selecione a forma de pagamento: ");
		System.out.println("        [1] Cartão              ");
		System.out.println("        [2] Pix                 ");
		System.out.println("        [3] Dinheiro            ");
		
		pgt = leiaString.next().charAt(0);
		
		switch (pgt) {
		
		case '1':
			
			System.out.println("=========== Cadastre o seu cartão ===========");
			System.out.println("Digite o seu nome igual como está no cartão: ");
			String nomecard = leiaString.next();
			System.out.println("Digite o número do cartão: ");
			int numcard = leiaString.nextInt();
			System.out.println("Digite o código de segurança do cartão: ");
			byte numcvv = leiaValores.nextByte();
			
		break;
		
		case '2':
			System.out.println("Digite sua chave pix: ");
			String pix = leiaString.next();
     
			
		break;
		
		case'3':
			System.out.println("Faça o pagamento direto ao entregador");
			
	
		break;
		
		}
		
		return pgt;
	
		
	}
}
