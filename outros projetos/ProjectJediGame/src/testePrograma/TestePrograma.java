package testePrograma;


import java.util.Scanner;

import builder.builder.JediBuilder;
import director.builder.JediDirector;
import model.builder.Jedi;
import model.builder.PadawanBuilder;
import model.builder.YounglingBuilder;
import observer.Intuicao;
import principal.Comeco;
import treinamento.Treino;

public class TestePrograma {
	
	public static void perfil(String nome, JediBuilder jedi) {
		
		JediDirector director = new JediDirector(jedi);
		
	
		System.out.println("");
		System.out.print("Perfil do jogador: \n"
								+"Nome: " +  nome
								+ "\nIdade: 13 \n"
								+ "Hierarquia: " );
					director.mostrarDados();
		
	}

	
	public static void main(String[] args) {
		
	Comeco.escolha();
	Comeco.intro2();
	
	Scanner leia = new Scanner(System.in);
	
	System.out.println("");
	System.out.println("Para começar, digite seu nome: ");
	String nome = leia.next();
	System.out.println("");
	System.out.println(nome + ",você esta sendo recrutado pela Nova Ordem Jedi");

	
	//JediBuilder jd1 = new YounglingBuilder();
	//JediDirector Youngling = new JediDirector(jd1);
	
	perfil(nome, new YounglingBuilder());
	
	Comeco.usuario();
	
	perfil(nome, new PadawanBuilder());
	
	System.out.println("");
	System.out.println("Para começar seu treinamento você precisa de Mestre ");
	System.out.println("Este é o Mestre Alus");
	System.out.println("");
	System.out.println("Seu primeiro treinamento será a meditação,feche os olhos e concentre-se,....");
	System.out.println("");
	Treino.treinamento2();
	
	
	System.out.println("");
	System.out.println(" Agora você deve procurar o cristal Kyber para construir seu sabre.");
	System.out.println("");
	
	
	Treino.treinamento();
	
	
	System.out.println("==================================================");
	
		JediBuilder jd2 = new PadawanBuilder();
	
	JediDirector padawan = new JediDirector(jd2);
	
	
	padawan.makeSabreLuz();
	
	
	System.out.println("");
	System.out.println("Chegou a grande hora de montar seu sabre, isso apenas você poderá fazer...");
	System.out.println("");
	
	Treino.treinamento();
	
	
	System.out.println("Apos um tempo de treinamento,"
				+ " o jovem padawan adquiriu importantes habilidades para a combate,"
				+ " a mais importante delas é ter aprendido a usar a força a seu favor");
	
	
	try {
		Thread.sleep(7000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		System.out.println("\n ...");
		e.printStackTrace();
		
	}
	
	
	
	System.out.println("");
	System.out.println("==================================================");
	System.out.println("");
	System.out.println(" Você está pronto para sua primeira missão, iremos sair agora, prepare-se...\n\n");
	
	Treino.treinamento();
		
	
	  System.out.println("	.                            .                      .         ");
	  System.out.println(".                  .             -)------+====+       .               ");
	  System.out.println("                     -)----====    ,'   ,'   .                 .  ");
	  System.out.println("        .                  `.  `.,;___,'                .         ");
	  System.out.println("                             `, |____l_\\                          ");
	  System.out.println("              _,.....------c==]\"\"______ |,,,,,,.....____ _  ");
	  System.out.println(".      .       \"-:______________  |____l_|]'''''''''''       .     .");
	  System.out.println("                            ,'\"\",'.   `.                          ");
	  System.out.println("   .                 -)-----====   `.   `.              LS        ");
	  System.out.println("               .            -)-------+====+       .            .  ");
	  System.out.println("       .                               .                    ");
	  System.out.println("       .               .                .                 .   \n\n ---- em Koronath ---- \n\n");

	  
	  System.out.println("Fique atento....");
	  //comeco observer
		Intuicao in = new Intuicao();
	
		in.add(new Jedi());
		in.setStatus(true);
	
	System.out.println("\t ***** O mestre e o Padawan entraram em uma floresta e"
			+ " percebem que estão sendo seguidos por flores terriveis que se chamam Saava *****");
		

	
	
	
	
	
	
	
	
	}

}
