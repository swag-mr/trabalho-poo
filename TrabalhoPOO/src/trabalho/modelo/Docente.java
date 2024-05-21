/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalho.modelo;

/**
 *
 * @author vitor
 */
public abstract class Docente extends Funcionario {
    protected String titulacao;
    
    public Docente(){
	super();
	titulacao = "";
    }
    
    public Docente(String codigo, String nome, double salario, String nivel, String tipo, String titulacao){
	super(codigo, nome, salario, nivel, tipo);
	this.titulacao = titulacao;
    }

    public String getTitulacao() {
	return titulacao;
    }

    public void setTitulacao(String titulacao) {
	this.titulacao = titulacao;
    }
    
    @Override
    public abstract double calcularSalario();
}
