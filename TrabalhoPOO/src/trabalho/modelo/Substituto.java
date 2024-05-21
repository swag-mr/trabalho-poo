/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalho.modelo;

/**
 *
 * @author vitor
 */
public class Substituto extends Docente {
    private int cargaHoraria;
    
    public Substituto(){
	super();
	cargaHoraria = 0;
    }
    
    public Substituto(String codigo, String nome, double salario, String nivel, String titulacao, int cargaHoraria){
	super(codigo, nome, salario, nivel, Constantes.DOCENTE_SUBSTITUTO, titulacao);
	this.cargaHoraria = cargaHoraria;
    }
    
    @Override
    public double calcularSalario(){
	if(nivel.equals(Constantes.S1)){
	    return salario + salario * Constantes.S1_AUMENTO;
	}
	
	if(nivel.equals(Constantes.S2)){
	    return salario + salario * Constantes.S2_AUMENTO;
	}
	
	return -1; // Caso de exceção, pois funcionario nao tem Nivel (impossivel)
    }
}
