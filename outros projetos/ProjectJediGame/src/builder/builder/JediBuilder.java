package builder.builder;

import model.builder.Jedi;

public abstract class JediBuilder {
	
	protected Jedi jedi;
	
	public JediBuilder() {
		jedi = new Jedi();
	}

	public Jedi getJedi() {
		return this.jedi;
	}
	
	
	public abstract String mostrarDados();
	
	public abstract int nivelForca();
	public abstract int telecinese();
	public abstract int persuasao();
	public abstract int telepatia();
	public abstract int visaoFuturo();
	public abstract String sabreLuz();
	
}
