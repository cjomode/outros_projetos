package app;

import java.util.Scanner;

import dao.DaoFactory;
import dao.DaoUser;
import model.entities.Users;

//import dao.DaoUser;
//import model.entities.Users;

public class TelaInicial {
	//colocar método com imagem inicial
	
	boolean confirmUser = false;
	//DaoUser currentUser = null;	
	// Users user = new Users();
	
	Scanner leiaString = new Scanner(System.in);
	Scanner leiaValores = new Scanner(System.in);
	
	public void OpcaoEntrada() {
		
		System.out.println("================== RESTAURANTE ==================\n");
		System.out.println("---------------- Seja bem vindo! ----------------\n "
						 + "Como deseja prosseguir?\n"
						 + "1 - Fazer seu cadastro\n"
						 + "2 - Entrar na sua conta\n");
		System.out.print("--> ");
		
							
					char cad = leiaString.next().charAt(0);
		
		if(cad == '1') {
			
			Cadastro();
			
		}
		
		if(cad == '2') {
			
			Login();
		}
		
		
		
	}
	
	public void Cadastro() {
		
		DaoUser userIn = DaoFactory.createUsers();
		
		Users userEntity = new Users();
		
		System.out.println("================== Cadastro ==================");
		System.out.println("");
		System.out.println("Digite seu nome: ");
		 String nome = leiaString.next();
		System.out.println("Digite seu sobrenome: ");
		String sobrenome = leiaString.next();
		System.out.println("Digite seu cpf: ");
		 String cpf = leiaString.next();
		System.out.println("Digite um usuário: ");
		 String  userName = leiaValores.next();
		System.out.println("Digite uma senha: ");
		   String password = leiaValores.next();
		System.out.println("");
		System.out.println("===========================================");
		
	//	int id = 6;
		
	//userEntity.setId(id);
		userEntity.setNome(nome);
		userEntity.setSobrenome(sobrenome);
		userEntity.setCpf(cpf);
		userEntity.setUserName(userName);
		userEntity.setPassword(password);
		userIn.insertUsers(userEntity);
	
		
	//aqui precisa chmar um insert into para cadastrar o novo usuario no DB
	//lembrar de mostrar logo em seguida que o usuario ganhou um cupom de desconto - ok
		
		//return null;
		
	}
	
	public String Login () {
		
		boolean confirmUser = false;
		DaoUser currentUser = null;	
		 Users user = new Users();
		
		//Enquanto o usuário e senha não forem encontrados solicita os dados de entrada
		while (confirmUser == false) {	
			
			currentUser = DaoFactory.createUsers();
		
		System.out.println("============ Login ============");
		   System.out.println("Digite seu Usuário: ");
		 String  userName = leiaValores.next();
		   System.out.println("Digite sua Senha: ");
		   String password = leiaValores.next();
		   System.out.println("============================");
		 //Verificando se o usuario e senha conferem com os da base de dados 
		   confirmUser =  currentUser.authUser(userName, password);		   
		   
		   if (confirmUser) {
			   
			   user =  currentUser.findUser_id(userName);
			
		
		   }
		   
		   	if(confirmUser == false) {
		   		System.out.println("Usuário não cadastrado!");
		   		
		   	}
		
		}
		return null  ;
		
	}
}


