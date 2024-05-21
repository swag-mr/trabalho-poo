/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalho.modelo;

/**
 *
 * @author vitor
 */
public class Tecnico extends Funcionario {
    private String funcao;
    
    public Tecnico(){
	super();
	funcao = "";
    }
    
    public Tecnico(String codigo, String nome, double salario, String nivel, String funcao){
	super(codigo, nome, salario, nivel, Constantes.TECNICO);
	this.funcao = funcao;
    }
    
    @Override
    public double calcularSalario(){
	if(nivel.equals(Constantes.T1)){
	    return salario + salario * Constantes.T1_AUMENTO;
	}
	
	if(nivel.equals(Constantes.T2)){
	    return salario + salario * Constantes.T2_AUMENTO;
	}
	
	return -1; // Caso de exceção, pois funcionario nao tem Nivel (impossivel)
    }
}
