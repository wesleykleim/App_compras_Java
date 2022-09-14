package br.com.fiap.view;
/***
 * 
 * @author Wesley
 *
 */

import java.util.Scanner;

import br.com.fiap.model.Cadastro;
import br.com.fiap.model.Cliente;
import br.com.fiap.model.Produto;

public class App {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Bem vindo ao Super mercado G10");
		
		
		System.out.println("J� possui cadastro em nossa plataforma?");
		String resp = sc.next();
		
		
	
		if (resp.equals("n�o")) {
		
			boolean  perguntar  = true;
				while (perguntar == true) {
					System.out.println("Digite seu email: ");
					String email = sc.next();
				
					System.out.println("Digite uma senha para cadastrar: ");
					String senha  = sc.next();
					
					System.out.println("Digite seu endere�o, para entregarmos os produtos: ");
					sc.nextLine();
					String endereco = sc.nextLine();
					
					System.out.println("Digite o n�mero residencial: ");
					int numCasa = sc.nextInt();
					
					
				
			
					System.out.println("Digite seu nome: ");
					sc.nextLine();
					String nome = sc.nextLine();
					
					System.out.println("Digite seu numero de celular: ");
					String numCel = sc.next();
					System.out.println("Digite o numerodo seu CPF: ");
					String numCpf = sc.next();
					System.out.println("\n");
					
					
					Cliente cliente = new Cliente(nome,numCel,numCpf, email, senha, endereco, numCasa);
					//Cadastro cadastro = new Cadastro(email, senha, endereco, numCasa);
					System.out.println("Confira se seus dados est�o corretos: ");
					System.out.println(cliente.getNome() + "\n"+ cliente.getNumCel()+ "\n"+ cliente.getNumCpf());
					System.out.println(cliente.getEmail() + "\n"+ cliente.getSenha() + "\n" + cliente.getEnderecoEntrega() + "\n"+ cliente.getNumCasa()) ;
					System.out.println("Seus dados est�o corretos? ('sim/n�o'");
					String resposta = sc.next();
					if (resposta.equals("sim")) {
						perguntar = false;
					}
					
					System.out.println("\n");
				}
		
		}
			
		
		System.out.println("Digite a quantidade de produtos que vai comprar ");
		int quantidade = sc.nextInt();
		Produto[] produtos = new Produto[quantidade];
		double soma = 0;
		for (int i = 0; i < quantidade; i++) {
			
			System.out.println("Digite o nome do produto ");
			sc.nextLine();
			String nome = sc.nextLine();
			
			System.out.println("Digite a quantidade do produto");
			int quantProd  = sc.nextInt();
			
			
			System.out.println("Digite o valor do produto");
			double valor = sc.nextDouble();
			
			System.out.println("Digite o valor do cupom de desconto: ");
			int cupom = sc.nextInt();
	
			
			Produto produto = new Produto(nome, quantProd, valor, cupom);
			produtos[i] = produto;
			
			if (produto.cupomDesconto() != soma)
				soma = (soma + produto.cupomDesconto());
			
			System.out.println(produto.cupomDesconto());
			System.out.println(soma);	
			}
			
				
		
		
		
			
			
			
		
		
		
		
		
		
 		
		
		sc.close();
	}
}
