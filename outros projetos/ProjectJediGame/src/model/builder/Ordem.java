package model.builder;

public class Ordem {
	
	public String tipo;;
	
	public Ordem(String tipo) {
		this.tipo = tipo;
	 }

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) 
	{
		this.tipo = tipo;
		/*
		if(!tipo.equalsIgnoreCase("Nova Ordem") || !tipo.equalsIgnoreCase("Ordem")) {
			System.out.println("#######################");
			System.out.println("#  DEFINA SUA ORDEM!  #");
			System.out.println("#######################");
		} else {
			this.tipo = tipo;
		}*/
	}
	
	
	

}
