package br.com.fiap.model;
/***
 * 
 * @author Wesley
 *
 */

public class Cliente extends Cadastro{

	private String nome;
	private String numCel;
	private String numCpf;
	
	public Cliente() {
		
	}
	public Cliente(String nome, String numCel, String numCpf, String email, String senha, String enderecoEntrega, int numCasa) {
		super (email, senha, enderecoEntrega, numCasa );
		this.nome = nome;
		this.numCel = numCel;
		this.numCpf = numCpf;
	}
	public String getNome() {
		return nome;
	}
	public String getNumCel() {
		return numCel;
	}
	public String getNumCpf() {
		return numCpf;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setNumCel(String numCel) {
		this.numCel = numCel;
		
	}
	public void setNumCpf(String numCpf) {
		this.numCpf = numCpf;
		
	}
	
}
