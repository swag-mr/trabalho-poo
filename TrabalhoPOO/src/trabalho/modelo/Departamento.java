/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalho.modelo;

import java.util.ArrayList;

/**
 *
 * @author vitor
 */
public class Departamento implements Cloneable {
    private String codigo;
    private String nome;
    private ArrayList<Funcionario> funcionarios;
    
    public Departamento(String codigo, String nome){
	this.codigo = codigo;
	this.nome = nome;
        funcionarios = new ArrayList<>();
    }
    
    public int getNumFuncionarios(){
        return funcionarios.size();
    }
    
    public String getCodigo(){
        return codigo;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void addTecnico(Tecnico t){
        funcionarios.add(t);
    }
    
    public void addDocenteEfetivo(Efetivo de){
        funcionarios.add(de);
    }
    
    public void addDocenteSubstituto(Substituto ds){
        funcionarios.add(ds);
    }
    
    public double getGastosTotais(){
        int gastoTotal = 0;
        for(int i=0; i < funcionarios.size(); i++){
            gastoTotal += funcionarios.get(i).calcularSalario();
        }
        
        return gastoTotal;
    }
    
    public ArrayList<Funcionario> getFuncionariosGastoEspecifico(int ini, int fim){
        ArrayList<Funcionario> funcsGastoEspecifico = new ArrayList<>();
        for(int i=0; i < funcionarios.size(); i++){
            if(ini <= funcionarios.get(i).calcularSalario() && funcionarios.get(i).calcularSalario() <= fim){
                funcsGastoEspecifico.add((Funcionario) funcionarios.get(i).clone());
            }
        }
        return funcsGastoEspecifico;
    }
    
    public ArrayList<Funcionario> getFuncionarios(){
        return (ArrayList<Funcionario>) funcionarios.clone();
    }
    
    public Funcionario buscarFuncCodigo(String codigo) {
        for(int i=0; i < funcionarios.size(); i++){
            if(funcionarios.get(i).getCodigo().equals(codigo)){
                return (Funcionario) funcionarios.get(i).clone();
            }
        }
        return null;
    }
    
    public Funcionario buscarFuncNome(String nome) {
        for(int i=0; i < funcionarios.size(); i++){
            if(funcionarios.get(i).getNome().equals(nome)){
                return (Funcionario) funcionarios.get(i).clone();
            }
        }
        return null;
    }
    
    @Override
    public Departamento clone() {
        try {
            return (Departamento) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("Erro\n");
            return null;
        } 
    }
}
