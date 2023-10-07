package atividade_banco;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Conta {
	protected int num,agen;
	protected String corre;
	protected Double sald;

	/*	CADASTRAR
	 * -------------------------------------------------------------------------------------*/
	public void cadastra(ArrayList <Conta> contas){
		int nume = (Integer.parseInt(JOptionPane.showInputDialog(null,"Qual o número da conta:")));
		int agenc =(Integer.parseInt(JOptionPane.showInputDialog(null,"Qual o número da agencia:")));
		setCorre(JOptionPane.showInputDialog(null,"Qual o nome do correntista:"));
		if (!validar(contas, nume, agenc)) {
			JOptionPane.showMessageDialog(null,"Lamento Cadastre novamente");
			cadastra(contas);
		}
		setNum(nume);
		setAgen(agenc);
		setSald(0.00);
	}
	/* -----------------------------------------------------------------------------------------*/

	
	/*	FAZER DEPÓSITO
	 * -------------------------------------------------------------------------------------*/
	public void Deposito(Double val) {
		setSald(sald+=val );
		JOptionPane.showMessageDialog(null,"Deposito concluido");
	}
	/* -----------------------------------------------------------------------------------------*/

	/*	FAZER SAQUE
	 * -------------------------------------------------------------------------------------*/
	public void Saque (Double val) {
		if (sald < val) {
			JOptionPane.showMessageDialog(null,"Saldo Insuficiente");
		}
		else {
			setSald(sald -=val);
		}
	}	
	/* -----------------------------------------------------------------------------------------*/

	/*	VALIDAR DADOS
	 * -------------------------------------------------------------------------------------*/
	private boolean validar(ArrayList <Conta> contas,int nume,int agenc) {
		for (Conta c:contas) {
			if (nume == c.num && agenc == c.agen) {
				JOptionPane.showMessageDialog(null,"Conta invalida");
				return false;
			}
		}
		return true;
	}
	/* -----------------------------------------------------------------------------------------*/

	
	/*	EXIBIR EXTRATO
	 * -------------------------------------------------------------------------------------*/
	public void Exibir() {
		JOptionPane.showMessageDialog(null, "conta "+num+" agencia "+agen+"\n"+"saldo: "+sald);
	}
	/* -----------------------------------------------------------------------------------------*/
	
	/*	GETTERS E SETTERS
	 * -------------------------------------------------------------------------------------*/
	public int getNum() {
		return num;
	}


	public void setNum(int num) {
		this.num = num;
	}


	public int getAgen() {
		return agen;
	}


	public void setAgen(int agen) {
		this.agen = agen;
	}


	public String getCorre() {
		return corre;
	}


	public void setCorre(String corre) {
		this.corre = corre;
	}


	public Double getSald() {
		return sald;
	}


	public void setSald(Double sald) {
		this.sald = sald;
	}
	/* -----------------------------------------------------------------------------------------*/
}
