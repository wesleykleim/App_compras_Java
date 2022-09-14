package br.com.fiap.model;

/***
 * 
 * @author Wesley
 *
 */

public class Cadastro {
	
	private String email;
	private String senha;
	private String enderecoEntrega;
	private int numCasa;

	public Cadastro() {
		
	}
	public Cadastro(String email, String senha, String enderecoEntrega, int numCasa) {
		
		this.email = email;
		this.senha = senha;
		this.enderecoEntrega = enderecoEntrega;
		this.numCasa = numCasa;
	}
	public String getEmail() {
		return email;
	}
	public String getSenha() {
		return senha;
	}
	public String getEnderecoEntrega() {
		return enderecoEntrega;
	}
	public int getNumCasa() {
		return numCasa;
	}
	
	
	public void setNome(String email) {
		this.email = email;
		
	}
	public void setSenha(String senha) {
		this.senha = senha;
		
	}
	public void setEnderecoEntrega(String enderecoEntrega) {
		this.enderecoEntrega = enderecoEntrega;
		
	}
	public void setNumCasa(int numCasa) {
		this.numCasa = numCasa;
		
	}
	
	




}

