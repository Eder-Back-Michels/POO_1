package atividade_escola;


import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Disciplina {
	
	private String nome;
	private int cargaHoraria;
	private Professor professor;
	
	public Disciplina(ArrayList<Professor> professores) {
		cadastrar(professores);
	}
	public void cadastrar(ArrayList<Professor> professores) {
		
		setNome(JOptionPane.showInputDialog("Nome da disc."));
		setCargaHoraria(Integer.parseInt(JOptionPane.showInputDialog("Carga horária")));
		
		Professor p = Util_escola.selecionaProfessor(professores);
		setProfessor(p);}
		
	public String exibirDados() {
		return getNome()+"("+getCargaHoraria()+ ") - " + getProfessor().exibirDados();
	}
	public String getNome() {
		return nome;
	}
	public Professor getProfessor() {
		return professor;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getCargaHoraria() {
		return cargaHoraria;
	}
	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
}