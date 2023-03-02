package model.entities;

import java.io.Serializable;
import java.util.Objects;

public class Menu implements Serializable{

	private static final long serialVersionUID = -3717315544166632033L;

	//objeto que vai ligar ususario com cardapio
	private Users user;

	public Menu() {
		//construtor vazio
	}
	
	private Integer id;
	private String nome;
	private String tipo;
	private String descricao;
	private double valor;

	public Menu(Users user, Integer id, String nome, String tipo, String descricao, double valor) {
		
		this.user = user;
		this.id = id;
		this.nome = nome;
		this.tipo = tipo;
		this.descricao = descricao;
		this.valor = valor;
	}

	public Users getUser() {
		return user;
	}

	public void setUser(Users user) {
		this.user = user;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	
	//Não acho que é necessário o hashcode e o equals, se eles forem apenas uma forma de 
	//comparação, aqui no menu não usariamos um insert,delete ou update, apenas select's...
	//igualmente o toString...
	@Override
	public int hashCode() {
		return Objects.hash(descricao, id, nome, tipo, user, valor);
	}

	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Menu other = (Menu) obj;
		return Objects.equals(descricao, other.descricao) && Objects.equals(id, other.id)
				&& Objects.equals(nome, other.nome) && Objects.equals(tipo, other.tipo)
				&& Objects.equals(user, other.user)
				&& Double.doubleToLongBits(valor) == Double.doubleToLongBits(other.valor);
	}
	
	
	@Override
	public String toString() {
		return "Usuário: " + user + "\nNúmero: " + id + "\nPedido:" + nome+"\t"+ tipo 
				+ "Valor do Pedido: " + valor + "\n";
	}
	
	
	
}
