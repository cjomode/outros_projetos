package principal;

import java.util.Scanner;

import model.builder.Ordem;

public class Comeco {

	public static void escolha() {
		
System.out.println("================================================================");
System.out.println("================================================================");		
System.out.println("               8888888888  888    88888       ");
System.out.println("              88     88   88 88   88  88      ");
System.out.println("               8888  88  88   88  88888       ");
System.out.println("                  88 88 888888888 88   88     ");           
System.out.println("           88888888  88 88     88 88    888888");    
System.out.println("");
System.out.println("           88  88  88   888    88888    888888");    
System.out.println("           88 8888 88 88   88  88888    8888  ");    
System.out.println("            888  888 888888888 88   88     88 ");
System.out.println("             88  88  88     88 88    8888888  ");
System.out.println("=======================================================================");
System.out.println(":::::::::::::::::: ESCOLHA A ORDEM QUE DESEJA TRILHAR :::::::::::::::::");
System.out.println("=======================================================================");

System.out.println("___________________________________  ___________________________________ ");
System.out.println("|:                           ``::%H| |:                           ``::%H|");
System.out.println("|%:.          1.Ordem           `:%| |%:.         2.Nova Ordem       `:%|");
System.out.println("|H%::..___________________________:| |H%::..___________________________:|");
System.out.println("");System.out.print("==> ");
boolean escolha = false;

	do {
			
	Scanner sc = new Scanner(System.in);
	byte opcao = sc.nextByte();
	Ordem ordem;

	switch (opcao) {
	case 1:
		ordem = new Ordem("Ordem");
		System.out.println("PARABÉNS! VOCÊ ESCOLHEU:::::");
		System.out.println("___________________________________ ");
		System.out.println("|:                           ``::%H|");
		System.out.println("|%:.         Ordem              `:%|");
		System.out.println("|H%::..___________________________:|");
			break;
		case 2:
			ordem = new Ordem("Nova Ordem");
		System.out.println("PARABÉNS! VOCÊ ESCOLHEU:::::");
		System.out.println("___________________________________ ");
		System.out.println("|:                           ``::%H|");
		System.out.println("|%:.         Nova Ordem         `:%|");
		System.out.println("|H%::..___________________________:|");
			break;	

		default: 
			System.out.println("___________________________________ ");
			System.out.println("|:                           ``::%H|");
			System.out.println("|%:.    Escolha uma Ordem       `:%|");
			System.out.println("|H%::..___________________________:|");
			escolha = true;
			break;
		 }

		} while(escolha);
			
		System.out.println("\n\n");
		
		
		
		
		
		
	}
	
	
	
	
	
	public static void intro1() {
		
		System.out.println("			Ha muito tempo, em uma galaxia muito, muito distante...\n\n 					");
		System.out.println("		A turbulência tomou conta da Republica Galactica. A tributacao das rotas			 ");			
		System.out.println("		comerciais para sistemas estelares desembolsados estao em disputa.					");
		System.out.println("		Na esperanca de resolver o assunto com um bloqueio de navios de guerra 				");
		System.out.println("		mortais, a gananciosa Federacao de Comercio parou todos os envios para o			 ");
		System.out.println("					pequeno planeta de Naboo.\n										");
		System.out.println("	Enquanto o Congresso da Republica debate incessantemente essa alarmante cadeia			 ");
		System.out.println("			de eventos, o Supremo Chanceler despachou secretamente dois Cavaleiros Jedi,	");
		System.out.println("		os guardioes da paz e da justica na galaxia, para resolver o conflito.....		");
		
		
		System.out.println("\n\n");
	}
	
	public static void intro2() {	
		System.out.println("			Ha muito tempo, em uma galaxia muito, muito distante...\n\n 					");
		System.out.println("					Luke Skywalker está desaparecido.										");
		System.out.println("	 Em sua ausência,a sinistra PRIMEIRA ORDEM se ergue das cinzas do Império e 			");
		System.out.println("			nao irá descansar até que Skywalker, o último Jedi, seja destruído.				");
		System.out.println("  	 Com o apoio da REPÚBLICA, a General Leia Organa lidera uma corajosa RESISTÊNCIA.		");
		System.out.println(" 		Ela está desesperada para encontrar seu irmão Luke e obter sua ajuda 			    ");
		System.out.println("                   para restaurar a paz e a justiça na galáxia.								");
		System.out.println("");
		System.out.println("          Leia enviou seu mais audacionso piloto em uma missão secreta a Jakku,      		");
		System.out.println("           onde um antigo aliado descobriu uma pista do paradeiro de Luke...				");
	
		System.out.println("\n\n");
	}
	
	public static void usuario() {
		
		Scanner leia = new Scanner(System.in);
		
	
		
		System.out.println("");
		System.out.println("Deseja começar seu treinamento? ");
		String choice = leia.next();
		
		if (choice.equalsIgnoreCase("Sim")) {
			
		}
	
		//new padawan

	}
	
	
	
	
	
	
	
	
	
	
}
