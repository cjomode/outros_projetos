package app;

import java.util.Scanner;

import dao.DaoFactory;
import dao.DaoMenu;
import dao.DaoUser;
import model.entities.Menu;
import model.entities.Users;



public class MenuCardapio {


	Scanner leiaString = new Scanner(System.in);
	Scanner leiaValores = new Scanner(System.in);
	
	char pedidofim = 'o';
	
	public String Cardapio1() {
		
		System.out.println("==================================== Cardápio ==================================\n\n");
		System.out.println(" ____________________\t\t       ____________________ \t\t     ____________________");
		System.out.println("|                    |\t\t     |                    |\t\t    |                    | "); 
		System.out.println("|   [1] Hamburguers  |\t\t     |     [2] Pizzas     |\t\t    |    [3] Salgados    |  ");
		System.out.println("|____________________|\t\t     |____________________|\t\t    |____________________| ");
		System.out.println("");
		System.out.println(" X-Egg           \t\t        Pizza de Mussarela   	 \t     Salgado de Frango  ");
		System.out.println(" Vegano          \t\t        Pizza de Calabresa      \t     Pastel de Carne    ");
		System.out.println(" Especial Inglês \t\t        Pizza de Frango         \t     Pão de queijo      ");
		System.out.println(" Mix porco       \t\t        Pizza Nordestina                                ");
		System.out.println(" Double Carne    \t\t        Pizza Portuguesa                                ");
		System.out.println(" Chicago Burguer \t\t        Pizza Marguerita                                ");
		System.out.println("");
		System.out.print("--> ");
		
		char opcardp = leiaString.next().charAt(0);
				
		
		if(opcardp == '1') {
			
			
			System.out.println("               __________________________________                  ");
			System.out.println("              |:                          ``::%H|                  ");
			System.out.println("              |%:.        Hamburguers        `:%|                  ");
			System.out.println("              |H%::..__________________________:|                  ");
			System.out.println("");
			System.out.println(" 1 - X-Egg.....................................................8.99");
			System.out.println("Pão, hamburguer bovino, ovo, queijo cheddar, alface, tomate e molho");
			System.out.println(" 2 - Vegano....................................................9.90");
			System.out.println("Pão, Hamburguer de grão-de-bico, alface, tomate e molho de ervas");
			System.out.println(" 3 - Especial Inglês............................................8.50");
			System.out.println("Pão, hamburguer, cebola caramelizada, cheddar cremoso e molho inglês");
			System.out.println(" 4 - Mix porco................................................10.99 ");
			System.out.println("Pão, hamburguer de frango com bacon e calabresa em pedaços, alface e maionese especial");
			System.out.println(" 5 - Double Carne...............................................9.99 ");
			System.out.println(" Pão,2 hamburguers bovinos, 2 fatias de cheddar, cebola roxa e molho ");
			System.out.println(" 6 - Chicago Burguer.............................................12.90");
			System.out.println("Pão, hamburguer bovino, costela desfiada, cebola roxa e molho barbecue");
			System.out.println("");
			System.out.print("--> ");
			
			char opcao = leiaValores.next().charAt(0);	
			
			DaoMenu menuIn = DaoFactory.createMenu();
			
			Menu menuEntity = new Menu();
			
			Integer id = null ;
			menuEntity = menuIn.findById(id);
			System.out.println(menuEntity.toString());
			
			
		//	userIn.insertUsers(userEntity);
			
			System.out.println("Deseja finalizar seu pedido? ");
			System.out.println(" 1 - Sim"
					  	 	 + " 2 - Não");
			 pedidofim = leiaValores.next().charAt(0);
		
			leiaValores.nextLine();
			
			while(pedidofim != '2') {
				
				if (pedidofim == '1') {
			
					Pagamento pgt = new Pagamento();
					
					pgt.CalculoCompra();
			
				}
				
				System.out.println("==================================== Cardápio ==================================\n\n");
				System.out.println(" ____________________\t\t       ____________________ \t\t     ____________________");
				System.out.println("|                    |\t\t     |                    |\t\t    |                    | "); 
				System.out.println("|   [1] Hamburguers  |\t\t     |     [2] Pizzas     |\t\t    |    [3] Salgados    |  ");
				System.out.println("|____________________|\t\t     |____________________|\t\t    |____________________| ");
				System.out.println("");
				System.out.println("       X-Egg          \t\t        Pizza de Mussarela   	 \t     Salgado de Frango  ");
				System.out.println("      Vegano          \t\t        Pizza de Calabresa     \t     Pastel de Carne    ");
				System.out.println("  Especial Inglês     \t\t        Pizza de Frango        \t     Pão de queijo      ");
				System.out.println("     Mix porco        \t\t        Pizza Nordestina                                ");
				System.out.println("    Double Carne      \t\t        Pizza Portuguesa                                ");
				System.out.println("  Chicago Burguer     \t\t        Pizza Marguerita                                ");
				System.out.println("");
				System.out.print("--> ");
				
				char pedidofim = leiaString.next().charAt(0);
				
				//Cardapio1();
						
			}
		}
		
		if(opcardp == '2') {
			
			System.out.println("       __________________________________  ");
			System.out.println("      |:                          ``::%H| ");
			System.out.println("      |%:.          Pizzas           `:%| ");
			System.out.println("      |H%::..__________________________:| ");
			System.out.println("");
			System.out.println(" 1 - Pizza de Mussarela......................44.90 ");
			System.out.println("Pizza de Mussarela com tomates, orégano e azeitonas");
			System.out.println(" 2 - Pizza de Calabresa.......................45.90");
			System.out.println("Pizza de mussarela com recheio calabresa e cebolas ");
			System.out.println(" 3 - Pizza de Frango..........................49.90");
			System.out.println("Pizza de Mussarela com frango desfiado e milho verde");
			System.out.println(" 4 - Pizza Nordestina.........................50.00");
			System.out.println("Pizza de mussarela com charque desfiada e cebolas");
			System.out.println(" 5 - Pizza Portuguesa.........................53.90");
			System.out.println("Pizza de mussarela com pedaços de ovos, presunto e ervilha");
			System.out.println(" 6 - Pizza Marguerita.........................55.99");
			System.out.println("Pizza de Mussarela com tomates e folhas de majericão");
			System.out.println("");
			System.out.print("--> ");
			
			char opcao = leiaValores.next().charAt(0);	
			
			DaoMenu menuIn = DaoFactory.createMenu();
			
			Menu menuEntity = new Menu();
			
			Integer id = null ;
			menuEntity = menuIn.findById(id);
			System.out.println(menuEntity.toString());
			
			
		//	userIn.insertUsers(userEntity);
			
			System.out.println("Deseja finalizar seu pedido? ");
			System.out.println(" 1 - Sim"
					  	 	 + " 2 - Não");
			 pedidofim = leiaValores.next().charAt(0);
		
			leiaValores.nextLine();
			
			while(pedidofim != '2') {
				
				if (pedidofim == '1') {
			
					Pagamento pgt = new Pagamento();
					
					pgt.CalculoCompra();
			
				}
				System.out.println("==================================== Cardápio ==================================\n\n");
				System.out.println(" ____________________\t\t       ____________________ \t\t     ____________________");
				System.out.println("|                    |\t\t     |                    |\t\t    |                    | "); 
				System.out.println("|   [1] Hamburguers  |\t\t     |     [2] Pizzas     |\t\t    |    [3] Salgados    |  ");
				System.out.println("|____________________|\t\t     |____________________|\t\t    |____________________| ");
				System.out.println("");
				System.out.println("       X-Egg          \t\t        Pizza de Mussarela   	 \t     Salgado de Frango  ");
				System.out.println("      Vegano          \t\t        Pizza de Calabresa     \t     Pastel de Carne    ");
				System.out.println("  Especial Inglês     \t\t        Pizza de Frango        \t     Pão de queijo      ");
				System.out.println("     Mix porco        \t\t        Pizza Nordestina                                ");
				System.out.println("    Double Carne      \t\t        Pizza Portuguesa                                ");
				System.out.println("  Chicago Burguer     \t\t        Pizza Marguerita                                ");
				System.out.println("");
				System.out.print("--> ");
				
				char pedidofim = leiaString.next().charAt(0);
				
			}
		}
		
		if(opcardp == '3') {
			
			System.out.println("__________________________________  ");
			System.out.println("|:                          ``::%H| ");
			System.out.println("|%:.          Salgados         `:%| ");
			System.out.println("|H%::..__________________________:| ");
			System.out.println("");
			System.out.println(" 1 - Salgado de Frango.............3.99");
			System.out.println(" 2 - Pastel de Carne...............4.50");
			System.out.println(" 3 - Pão de queijo.................5.00");
			System.out.println("Porção com 6 unidades");
			System.out.println("");
			
			char opcao = leiaValores.next().charAt(0);	
			
			DaoMenu menuIn = DaoFactory.createMenu();
			
			Menu menuEntity = new Menu();
			
			Integer id = null ;
			menuEntity = menuIn.findById(id);
			System.out.println(menuEntity.toString());
			
			
		//	userIn.insertUsers(userEntity);
			
			System.out.println("Deseja finalizar seu pedido? ");
			System.out.println(" 1 - Sim"
					  	 	 + " 2 - Não");
			 pedidofim = leiaValores.next().charAt(0);
		
			leiaValores.nextLine();
			
			while(pedidofim != '2') {
				
				if (pedidofim == '1') {
			
					Pagamento pgt = new Pagamento();
					
					pgt.CalculoCompra();
			
				}
				System.out.println("==================================== Cardápio ==================================\n\n");
				System.out.println(" ____________________\t\t       ____________________ \t\t     ____________________");
				System.out.println("|                    |\t\t     |                    |\t\t    |                    | "); 
				System.out.println("|   [1] Hamburguers  |\t\t     |     [2] Pizzas     |\t\t    |    [3] Salgados    |  ");
				System.out.println("|____________________|\t\t     |____________________|\t\t    |____________________| ");
				System.out.println("");
				System.out.println("       X-Egg          \t\t        Pizza de Mussarela   	 \t     Salgado de Frango  ");
				System.out.println("      Vegano          \t\t        Pizza de Calabresa     \t     Pastel de Carne    ");
				System.out.println("  Especial Inglês     \t\t        Pizza de Frango        \t     Pão de queijo      ");
				System.out.println("     Mix porco        \t\t        Pizza Nordestina                                ");
				System.out.println("    Double Carne      \t\t        Pizza Portuguesa                                ");
				System.out.println("  Chicago Burguer     \t\t        Pizza Marguerita                                ");
				System.out.println("");
				System.out.print("--> ");
				
				char pedidofim = leiaString.next().charAt(0);
				
			}

		
	}
	
		return null;	
	
	}
}
