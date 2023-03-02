package app;

import model.entities.Menu;
import model.entities.Users;

public class App {

	public static void main(String[] args) {
	
		
		/*
		 * Feitos: model.entities,
		 *  fazer um metodo que coloque um switch case,
		 *   com as opçoes de pagamento, detalhando o cartao...
		 *   model.dao, db, daoFactory
		 *   
		 *   Fazer: calculo da compra
		 *   Não consegui fazer com que o usuario fosse adicionado na tabela
		 */
		
		
		Users usersEntity  = null;
		Menu menuEntity = null;
		
		TelaInicial telaInicial = new TelaInicial();
	
		telaInicial.OpcaoEntrada();
		
	
		MenuCardapio menu = new MenuCardapio();
		
		menu.Cardapio1();
		
		Pagamento pagamento = new Pagamento();
		
		pagamento.Paga();		
		
	}
}
