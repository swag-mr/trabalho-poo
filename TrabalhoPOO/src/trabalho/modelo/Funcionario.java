/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalho.modelo;

/**
 *
 * @author vitor
 */
public abstract class Funcionario implements Cloneable {
    protected String codigo;
    protected String nome;
    protected double salario;
    protected String nivel;
    protected String tipo;
    
    public Funcionario(){
	codigo = "";
	nome = "";
	salario = 0;
	nivel = "";
	tipo = "";
    }
    
    public Funcionario(String codigo, String nome, double salario, String nivel, String tipo){
	this.codigo = codigo;
	this.nome = nome;
	this.salario = salario;
	this.nivel = nivel;
	this.tipo = tipo;
    }

    public String getCodigo() {
	return codigo;
    }

    public void setCodigo(String codigo) {
	this.codigo = codigo;
    }

    public String getNome() {
	return nome;
    }

    public void setNome(String nome) {
	this.nome = nome;
    }

    public double getSalario() {
	return salario;
    }

    public void setSalario(double salario) {
	this.salario = salario;
    }

    public String getNivel() {
	return nivel;
    }

    public void setNivel(String nivel) {
	this.nivel = nivel;
    }
    
    public String getTipo(){
	return tipo;
    }
    
    public void setTipo(String tipo){
	this.tipo = tipo;
    }
    
    public abstract double calcularSalario();
    
    @Override
    public Funcionario clone() {
        try {
            return (Funcionario) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("Erro\n");
            return null;
        }
    }
}
