package model.builder;

import builder.builder.JediBuilder;

public class YounglingBuilder extends JediBuilder {

	@Override
	public String mostrarDados() {
		// TODO Auto-generated method stub
		return "Youngling\n" + jedi.toString();
	}
	
	@Override
	public int nivelForca() {
		return 0;
	}

	@Override
	public int telecinese() {
		return 0;
	}

	@Override
	public int persuasao() {
		return 0;
	}

	@Override
	public int telepatia() {
		return 0;
	}

	@Override
	public int visaoFuturo() {
		return 0;
	}

	@Override
	public String sabreLuz() {
		 String sabre = "Comece seu treinamento para construir seu sabre de luz";
		return sabre;
	}


	
	

}
