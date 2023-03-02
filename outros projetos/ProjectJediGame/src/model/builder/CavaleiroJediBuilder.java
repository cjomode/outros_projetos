package model.builder;

import builder.builder.JediBuilder;

public class CavaleiroJediBuilder extends JediBuilder {


	@Override
	public String mostrarDados() {
		// TODO Auto-generated method stub
			return "Cavaleiro Jedi\n"+ jedi.toString();
	}
	
	
	@Override
	public int nivelForca() {
		jedi.setNivelForca(5);
		return jedi.getNivelForca();
	}

	@Override
	public int telecinese() {
		jedi.setTelecinese(5);
		return jedi.getTelecinese();
	}

	@Override
	public int persuasao() {
		jedi.setPersuasao(5);
		return jedi.getPersuasao();
	}

	@Override
	public int telepatia() {
		jedi.setTelepatia(5);
		return jedi.getTelepatia();
	}
	
	@Override
	public int visaoFuturo() {
		jedi.setVisaoFuturo(5);
		return jedi.getVisaoFuturo();
	}

	@Override
	public String sabreLuz() {
		return jedi.getSabreLuz();
	}

	

}
