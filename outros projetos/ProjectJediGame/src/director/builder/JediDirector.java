package director.builder;

import builder.builder.JediBuilder;
import model.builder.Jedi;

public class JediDirector {
	
	protected JediBuilder jedibuild;
	
	public JediDirector(JediBuilder jedibuild) {
		this.jedibuild = jedibuild;
	}
	
	public int makeTelecinese() {
		return jedibuild.telecinese();
		
	}
	
	public int makeTelepatia() {
		return jedibuild.telepatia();
	}
	
	public int makePersuasao() {
		return jedibuild.persuasao();
	}
	
	public int makeVisaoFuturo() {
		return jedibuild.visaoFuturo();
	}
	
	public String makeSabreLuz() {
		return jedibuild.sabreLuz();
	}
	
	public Jedi getJediBuilder() {
		return jedibuild.getJedi();	
	}
	
	public String mostrarDados() {
		
		return jedibuild.mostrarDados();
		
	}
	
	
}
