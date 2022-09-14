package br.com.fiap.model;
/***
 * 
 * @author Wesley
 *
 */

public class Pagamento {
	private int numCred;
	private int cvPixNum;
	private String cvPixEmail;
	private char cvPixAle;
	
	public Pagamento() {
		
	}
	public Pagamento(int numCred, int cvPixNum, String cvPixEmail, char cvPixAle ) {
		this.numCred = numCred;
		this.cvPixNum = cvPixNum;
		this.cvPixEmail = cvPixEmail;
		this.cvPixAle = cvPixAle;
		
	}
	public int getNumCred() {
		return numCred;
	}
	public int getCvPixNum() {
		return cvPixNum;
	}
	public String getCvPixEmail() {
		return cvPixEmail;
	}
	public char getCvPixAle() {
		return cvPixAle;
	}
	
	public void setNumCred( int numCred) {
		this.numCred = numCred;
	}
	public void setCvPixNum(int cvPixNum) {
		this.cvPixNum = cvPixNum;
	}
	public void setCvPixEmail(String cvPixEmail) {
		this.cvPixEmail =cvPixEmail;
	}
	public void setCvPixAle(char cvPixAle) {
		this.cvPixAle = cvPixAle;
	}
	
	

}
