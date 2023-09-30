package atividade_condominio;

import javax.swing.JOptionPane;

public class Apartamento {

	private int num;
	private char bloco;
	private Double tam;
	private String propri;
	private Double val_fix;
	
	public Apartamento() {
		cadastra();
	}
	
	void cadastra() {
		setNum(Integer.parseInt(JOptionPane.showInputDialog(null,"Qual o número do apartamento")));
		setBloco(JOptionPane.showInputDialog("informe o bloco do apartamento(letra)").toUpperCase().charAt(0));
		setTam(Double.parseDouble(JOptionPane.showInputDialog(null,"Qual o tamanho do apartamento(metro quadrado")));
		setPropri(JOptionPane.showInputDialog(null,"Qual o nome do proprietario"));
		setVal_fix(tam*5);
	}


	public int getNum() {
		return num;
	}


	public void setNum(int num) {
		this.num = num;
	}


	public char getBloco() {
		return bloco;
	}


	public void setBloco(char bloco) {
		this.bloco = bloco;
	}


	public Double getTam() {
		return tam;
	}


	public void setTam(Double tam) {
		this.tam = tam;
	}


	public String getPropri() {
		return propri;
	}


	public void setPropri(String propri) {
		this.propri = propri;
	}


	public Double getVal_fix() {
		return val_fix;
	}


	public void setVal_fix(Double val_fix) {
		this.val_fix = val_fix;
	}
	
}
