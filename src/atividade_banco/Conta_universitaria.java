package atividade_banco;

import javax.swing.JOptionPane;

public class Conta_universitaria extends Conta {
	/*	FAZER DEPÓSITO
	 * -------------------------------------------------------------------------------------*/
	public void Deposito(Double val) {
		if (sald + val == 2000) {
			JOptionPane.showMessageDialog(null,"Lamento Saldo maximo atingido");
		}else {
		setSald(sald+=val );
		JOptionPane.showMessageDialog(null,"Deposito concluido");
		}
	}
	/* -----------------------------------------------------------------------------------------*/
}
