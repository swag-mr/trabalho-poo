/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalho.modelo;

/**
 *
 * @author vitor
 */
public class Efetivo extends Docente {
    private String area;
    
    public Efetivo(){
	super();
	area = "";
    }
    
    public Efetivo(String codigo, String nome, double salario, String nivel, String titulacao, String area){
	super(codigo, nome, salario, nivel, Constantes.DOCENTE_EFETIVO, titulacao);
	this.area = area;
    }
    
    @Override
    public double calcularSalario(){
	if(nivel.equals(Constantes.D1)){
	    return salario + salario * Constantes.D1_AUMENTO;
	}
	
	if(nivel.equals(Constantes.D2)){
	    return salario + salario * Constantes.D2_AUMENTO;
	}
	
	if(nivel.equals(Constantes.D3)){
	    return salario + salario * Constantes.D3_AUMENTO;
	}
	
	return -1; // Caso de exceção, pois funcionario nao tem Nivel (impossivel)
    }
}
