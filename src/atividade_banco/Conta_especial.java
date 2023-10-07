package atividade_banco;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Conta_especial extends Conta {
	
	Double saldes;
	
	/*	CADASTRAR
	 * -------------------------------------------------------------------------------------*/
	public void cadastra(ArrayList <Conta> contas){
		int nume = (Integer.parseInt(JOptionPane.showInputDialog(null,"Qual o número da conta:")));
		int agenc =(Integer.parseInt(JOptionPane.showInputDialog(null,"Qual o número da agencia:")));
		setCorre(JOptionPane.showInputDialog(null,"Qual o nome do correntista:"));
		cadastrasald();
		if (!validar(contas, nume, agenc)) {
			JOptionPane.showMessageDialog(null,"Lamento Cadastre novamente");
			cadastra(contas);
		}
		setNum(nume);
		setAgen(agenc);
		setSald(0.00);
	}
	/* -----------------------------------------------------------------------------------------*/
	
	/*	CADASTRAR O CRÉDITO ESPECIAL
	 * -------------------------------------------------------------------------------------*/
	public void cadastrasald(){
		setSaldes(Double.parseDouble(JOptionPane.showInputDialog(null,"Qual o limite de crédito")));
	}
	public void Saque (Double val) {
		if (sald >= val){
			setSald(sald -=val);
		}
		if (saldes >= val){
			setSaldes(saldes -=val);
		}
		else {
			JOptionPane.showMessageDialog(null,"Saldo Insuficiente");
		}
	}	
	/* -----------------------------------------------------------------------------------------*/

	/*	EXIBIR EXTRATO
	 * -------------------------------------------------------------------------------------*/
	public void Exibir() {
		JOptionPane.showMessageDialog(null, "conta "+num+" agencia "+agen+"\n"+"saldo: "+sald+"\n"+"saldo especial: "+saldes);
	}
	/* -----------------------------------------------------------------------------------------*/
	
	/*	VALIDAR DADOS
	 * -------------------------------------------------------------------------------------*/
	private boolean validar(ArrayList <Conta> contas,int nume,int agenc) {
		for (Conta c:contas) {
			if (nume == c.num) {
				JOptionPane.showMessageDialog(null,"Conta invalida");
				return false;
			}
			if(agenc == c.agen) {
				JOptionPane.showMessageDialog(null,"Agencia invalida");
				return false;
			}
		}
		return true;
	}
	/* -----------------------------------------------------------------------------------------*/
	
	/*	GETTERS E SETTERS
	 * -------------------------------------------------------------------------------------*/
	public Double getSaldes() {
		return saldes;
	}
	public void setSaldes(Double saldes) {
		this.saldes = saldes;
	}
	/* -----------------------------------------------------------------------------------------*/

}
