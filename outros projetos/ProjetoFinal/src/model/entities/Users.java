package model.entities;

import java.util.Objects;

public class Users {

	private static final long serialVersionUID = -19536109510504220L;
	
	private Integer id;
	private String cpf;
	private String nome;
	private String userName;
	private String password;
	private String sobrenome;
	

	public Users(Integer id, String cpf, String nome, String userName, String password, String sobrenome) {

		this.id = id;
		this.cpf = cpf;
		this.nome = nome;
		this.userName = userName;
		this.password = password;
		this.setSobrenome(sobrenome);
	}



	public Users(String nome,Integer id) {		
		this.nome = nome;
		
	}
	


	public Users() {
		// TODO Auto-generated constructor stub
	}

	


	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}




	public String getUserName() {
		return userName;
	}




	public void setUserName(String userName) {
		this.userName = userName;
	}




	public String getPassword() {
		return password;
	}




	public void setPassword(String password) {
		this.password = password;
	}




	public String getSobrenome() {
		return sobrenome;
	}



	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}



	@Override
	public String toString() {
		return "Users id:" + id +" cpf=" + cpf + ", nome=" + nome + ", userName=" + userName + ", password="
				+ password + ", sobrenome=" + sobrenome + "]";
	}



	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	@Override
	public int hashCode() {
		return Objects.hash(cpf, nome, password, sobrenome, userName);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Users other = (Users) obj;
		return Objects.equals(cpf, other.cpf) && Objects.equals(id, other.id) && Objects.equals(nome, other.nome)
				&& Objects.equals(password, other.password) && Objects.equals(sobrenome, other.sobrenome)
				&& Objects.equals(userName, other.userName);
	}

	

	
	

	
	
}
