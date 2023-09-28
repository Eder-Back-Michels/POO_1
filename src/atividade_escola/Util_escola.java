package atividade_escola;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Util_escola {
	
	public static Aluno selecionaAluno (ArrayList<Aluno> lista) {
		String menuAl = "";
		int cont = 1;
		for (Aluno a : lista) {
			menuAl = cont + " - " + a.getNome()+"\n";
			cont ++;
		}
		int escolha = Integer.parseInt(JOptionPane.showInputDialog(menuAl));
		return lista.get(escolha-1);
	}
	
	public static Disciplina selecionaDisciplina (ArrayList<Disciplina> lista) {
		String menuD = "";
		int cont = 1;
		for (Disciplina d : lista) {
			menuD = cont + " - " + d.getNome()+"\n";
			cont ++;
		}
		int escolha = Integer.parseInt(JOptionPane.showInputDialog(menuD));
		return lista.get(escolha-1);
	}
	
	public static Professor selecionaProfessor (ArrayList<Professor> lista) {
		String menuPr = "";
		int cont = 1;
		for (Professor p : lista) {
			menuPr = cont + " - " + p.getNome()+"\n";
			cont ++;
		}
		int escolha = Integer.parseInt(JOptionPane.showInputDialog(menuPr));
		return lista.get(escolha-1);
	}

}