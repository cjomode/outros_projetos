package model.builder;

import observer.Observer;

public class Jedi implements Observer {

	private boolean forca;
	private int nivelForca;
	private int telecinese;
	private int persuasao;
	private int visaoFuturo;
	private int telepatia;
	private String sabreLuz; 
	private Ordem ordem;
	
	/* Construtor */
	public Jedi() { }
	
	public Jedi(boolean forca, int nivelForca) {
		this.forca = false;
		this.nivelForca = 0;
	}
	
	
	public boolean isForca() {
		return forca;
	}
	
	public void setForça(boolean forca) {
		this.forca = forca;
	}
	
	public int getNivelForca() {
		return this.nivelForca;
	}
	
    protected void setNivelForca(int nivelForca) {
    	this.nivelForca = nivelForca;
    }
	
	public int getTelecinese() {
		return telecinese;
	}
	
	public void setTelecinese(int telecinese) {
		this.telecinese = telecinese;
	}
	
	public int getPersuasao() {
		return persuasao;
	}
	
	public void setPersuasao(int persuasao) {
		this.persuasao = persuasao;
	}
	
	public int getVisaoFuturo() {
		return visaoFuturo;
	}
	
	public void setVisaoFuturo(int visaoFuturo) {
		this.visaoFuturo = visaoFuturo;
	}
	
	public int getTelepatia() {
		return telepatia;
	}
	
	public void setTelepatia(int telepatia) {
		this.telepatia = telepatia;
	}
	
	public String getSabreLuz() {
		return sabreLuz;
	}
	
	public void setSabreLuz(String sabreLuz) {
		this.sabreLuz = sabreLuz;
	}
	
	public Ordem getOrdem() {
		return ordem;
	}
	
	public void setOrdem(Ordem ordem) {
		this.ordem = ordem;
	}
	
	public void puloDaForca(int nivelForca) {
		System.out.println("#########################");
		System.out.println("# PULO DA FORÇA ATIVADO #");
		System.out.println("PULO NIVEL: " + nivelForca );
		System.out.println("#########################");
	}
	
	public void velocidadeDaForca(int nivelForca) {
		System.out.println("###############################");
		System.out.println("# VELOCIDADE DA FORÇA ATIVADO #");
		System.out.println("VELOCIDADE NIVEL: " + nivelForca );
		System.out.println("###############################");
	}

	public String toString() {
		return ":::[ JEDI ]::: " + "\n" +
				"FORÇA: " + forca + "\n" +
				"NIVEL DE FORÇA: " + nivelForca + "\n" +
				"PERSUASÃO: " + persuasao + "\n" +
				"TELEPATIA: " + telepatia + "\n" +
				"TELECINESE: " + telecinese + "\n" +
				"VISÃO FUTURA: " + visaoFuturo + "\n" +
				"SABRE-LUZ: " + sabreLuz + "\n" ;

				//"ORDEM: " + ordem.tipo + "\n";
	}

	@Override
	public void update(boolean status) {
		// TODO Auto-generated method stub
		if(status) {
			System.out.println("Sinto algo estranho");
		}
	}
	

	
}
