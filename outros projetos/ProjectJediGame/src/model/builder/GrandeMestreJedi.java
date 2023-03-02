package model.builder;

import builder.builder.JediBuilder;

public class GrandeMestreJedi extends JediBuilder {
	
	
	@Override
	public String mostrarDados() {
		// TODO Auto-generated method stub
		return "Grande Mestre Jedi\n" + jedi.toString();
	}


	@Override
	public int nivelForca() {
		jedi.setNivelForca(10);
		return jedi.getNivelForca();
	}

	@Override
	public int telecinese() {
		jedi.setTelecinese(10);
		return jedi.getTelecinese();
	}

	@Override
	public int persuasao() {
		jedi.setPersuasao(10);
		return jedi.getPersuasao();
	}

	@Override
	public int telepatia() {
		jedi.setTelepatia(10);
		return jedi.getTelepatia();
	}
	
	@Override
	public int visaoFuturo() {
		jedi.setVisaoFuturo(10);
		return jedi.getVisaoFuturo();
	}

	@Override
	public String sabreLuz() {
		return jedi.getSabreLuz();
	}

	
}