/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalho.modelo;

import java.util.ArrayList;
import trabalho.persistencia.DataBaseFuncs;

/**
 *
 * @author vitor
 */
public class Departamento implements Cloneable {
    private String codigo;
    private String nome;
    private DataBaseFuncs db = new DataBaseFuncs();
    
    public Departamento(String codigo, String nome){
	this.codigo = codigo;
	this.nome = nome;
    }
    
    public int getNumFuncionarios(){
        return db.getNumFuncionarios();
    }
    
    public String getCodigo(){
        return codigo;
    }
    
    public void addTecnico(String codigo, String nome, double salario, String nivel, String funcao){
        Funcionario t = new Tecnico(codigo, nome, salario, nivel, funcao);
        db.addFunc(t);
    }
    
    public void addDocenteEfetivo(String codigo, String nome, double salario, String nivel, String titulacao, String area){
        Funcionario de = new Efetivo(codigo, nome, salario, nivel, titulacao, area);
        db.addFunc(de);
    }
    
    public void addDocenteSubstituto(String codigo, String nome, double salario, String nivel, String titulacao, int cargaHoraria){
        Funcionario ds = new Substituto(codigo, nome, salario, nivel, titulacao, cargaHoraria);
        db.addFunc(ds);
    }
    
    public double getGastosTotais(){
        return db.getGastosTotais();
    }
    
    public ArrayList<Funcionario> getFuncionariosGastoEspecifico(int ini, int fim){
        return db.getFuncionariosGastoEspecifico(ini, fim);
    }
    
    public ArrayList<Funcionario> getFuncionarios(){
        return db.getFuncionarios();
    }
    
    public ArrayList<Funcionario> getTecnicos(){
        return db.getTecnicos();
    }
    
    public ArrayList<Funcionario> getDocentes(){
        return db.getDocentes();
    }
    
    public ArrayList<Funcionario> getDocentesSubstitutos(){
        return db.getDocentesSubstitutos();
    }
    
    public ArrayList<Funcionario> getDocentesEfetivos(){
        return db.getDocentesEfetivos();
    }
    
    public Funcionario buscarFuncCodigo(String codigo) {
        return db.buscarFuncCodigo(codigo);
    }
    
    public Funcionario buscarFuncNome(String nome) {
        return db.buscarFuncNome(nome);
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
