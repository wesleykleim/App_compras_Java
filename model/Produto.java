package br.com.fiap.model;
/***
 * 
 * @author Wesley
 *
 */
public class Produto {

	private String nomeProd;
	private int quantidade;
	private double preco;
	private double cupom;
	private double vlDesconto;
	
	
	public Produto() {
		
	}
	public Produto(String nomeProd, int quantidade, double preco, double cupom) {
		
		this.nomeProd = nomeProd;
		this.quantidade = quantidade;
		this.preco = preco;
		this.cupom = cupom;
	
	}
	
	public String getNomeProd() {
		return nomeProd;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public double getPreco() {
		return preco;
	}
	public double getCupom() {
		return cupom;
	}
	//public double getVlDesconto() {
	//	return vlDesconto;
	//}
	
	public void setNomeProd(String nomeProd) {
		this.nomeProd = nomeProd;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public void setCupom(double cupom) {
		this.cupom = cupom;
	}
	//public void setVlDesconto(double vlDesconto) {
	//	this.vlDesconto = vlDesconto;
	//}
	
	public double cupomDesconto() {
		return quantidade * (preco - (preco*cupom/100));
	}

	public double vlDesconto() {
		return preco*cupom/100;
	}
}
