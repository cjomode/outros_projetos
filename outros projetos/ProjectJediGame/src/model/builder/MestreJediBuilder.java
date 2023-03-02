package model.builder;

import builder.builder.JediBuilder;

public class MestreJediBuilder extends JediBuilder {

	

	@Override
	public String mostrarDados() {
		// TODO Auto-generated method stub
		return "Mestre Jedi\n" + jedi.toString();
	}
	
	@Override
	public int nivelForca() {
		jedi.setNivelForca(7);
		return jedi.getNivelForca();
	}

	@Override
	public int telecinese() {
		jedi.setTelecinese(7);
		return jedi.getTelecinese();
	}

	@Override
	public int persuasao() {
		jedi.setPersuasao(7);
		return jedi.getPersuasao();
	}

	@Override
	public int telepatia() {
		jedi.setTelepatia(7);
		return jedi.getTelepatia();
	}
	
	@Override
	public int visaoFuturo() {
		jedi.setVisaoFuturo(7);
		return jedi.getVisaoFuturo();
	}

	@Override
	public String sabreLuz() {
		return jedi.getSabreLuz();
	}


}
