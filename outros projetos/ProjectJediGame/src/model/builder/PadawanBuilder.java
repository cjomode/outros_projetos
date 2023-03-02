package model.builder;

import java.util.Scanner;
import builder.builder.JediBuilder;

public class PadawanBuilder extends JediBuilder {

	@Override
	public String mostrarDados() {
		// TODO Auto-generated method stub
		return "Padawan\n" + jedi.toString();
	}
	
	
	
	@Override
	public int nivelForca() {
		jedi.setNivelForca(1);
		return jedi.getNivelForca();
	}

	@Override
	public int telecinese() {
		jedi.setTelecinese(1);
		return jedi.getTelecinese();
	}

	@Override
	public int persuasao() {
		jedi.setPersuasao(1);
		return jedi.getPersuasao();
	}

	@Override
	public int telepatia() {
		jedi.setTelepatia(1);
		return jedi.getTelepatia();
	}
	
	@Override
	public int visaoFuturo() {
		jedi.setVisaoFuturo(1);
		return jedi.getVisaoFuturo();
	}


	public String sabreLuz() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" _____________________________________ ");
		System.out.println("|  DEFINA A COR DO CRISTAL ENCONTRADO |");
		System.out.println("|        [1] - Azul                   |");
		System.out.println("|        [2] - Branco                 |");
		System.out.println("|        [3] - Verde                  |");
		System.out.println("|        [4] - Amarelo                |");
		System.out.println("|        [5] - Roxo                   |");
		System.out.println("|_____________________________________|");
		System.out.println("");
		System.out.print("::> ");
		
		byte op = sc.nextByte();
		String cor = null;
		
		switch(op) {
			case 1:
				cor = "Azul";
			break;
				case 2:
					cor = "Branco";
				break;
					case 3:
						cor = "Verde";
					break;
					case 4:
						cor = "Amarelo";
					break;
					case 5:
						cor = "Roxo";
			default: System.out.println("DEFINA A COR DE SEU SABRE!");
		}
		
		jedi.setSabreLuz(cor);
		return jedi.getSabreLuz();
	}


	
	

}
