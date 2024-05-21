/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalho.modelo;

import trabalho.persistencia.DataBaseDeptos;
import java.util.ArrayList;

/**
 *
 * @author vitor
 */
public class Universidade {
    private static String nome;
    private DataBaseDeptos db = new DataBaseDeptos();
    
    public Universidade(){
        this.nome = "Unesp";
    }
    
    public Universidade(String nome){
	this.nome = nome;
    }

    public static String getNome() {
        return nome;
    }

    public static void setNome(String nome) {
        Universidade.nome = nome;
    }
    
    public void addDepto(String codigo, String nome){
        Departamento d = new Departamento(codigo, nome);
        db.addDepto(d);
    }
    
    public ArrayList<Departamento> getDeptos(){
        ArrayList<Departamento> departamentos = new ArrayList<Departamento>();
        departamentos = db.getDeptos();
        return departamentos;
    }
    
    public ArrayList<Funcionario> getTodosFuncionarios(){
        return db.getTodosFuncionarios();
    }
    
    public ArrayList<Funcionario> getTodosTecnicos(){
        return db.getTodosTecnicos();
    }
    
    public ArrayList<Funcionario> getTodosDocentes(){
        return db.getTodosDocentes();
    }
    
    public ArrayList<Funcionario> getTodosDocentesEfetivos(){
        return db.getTodosDocentesEfetivos();
    }
    
    public ArrayList<Funcionario> getTodosDocentesSubstitutos(){
        return db.getTodosDocentesSubstitutos();
    }
    
    public Departamento getDeptoIndice(int indice){
        return db.getDeptoIndice(indice);
    }
    
    public Departamento getDeptoCodigo(String codigo){
        return db.getDeptoCodigo(codigo);
    }
    
    public Funcionario buscarFuncCodigo(String codigo){
        return db.buscarFuncCodigo(codigo);
    }
    
    public Funcionario buscarFuncNome(String nome){
        return db.buscarFuncNome(nome);
    }
    
    public ArrayList<Funcionario> getTodosFuncionariosGastoEspecifico(int ini, int fim){
        return db.getTodosFuncionariosGastoEspecifico(ini, fim);
    }
    
    public ArrayList<Departamento> getDeptosFaixaEspecifica(int ini, int fim){
        ArrayList<Departamento> departamentos = new ArrayList<>();
        departamentos = db.getDeptosFaixaEspecifica(ini, fim);
        return departamentos;
    }
    
    public void addTecnico(String codigo, String nome, double salario, String nivel, String funcao, int indice){
        db.addTecnico(codigo, nome, salario, nivel, funcao, indice);
    }
    
    public void addDocenteEfetivo(String codigo, String nome, double salario, String nivel, String titulacao, String area, int indice){
        db.addDocenteEfetivo(codigo, nome, salario, nivel, titulacao, area, indice);
    }
    
    public void addDocenteSubstituto(String codigo, String nome, double salario, String nivel, String titulacao, int cargaHoraria, int indice){
        db.addDocenteSubstituto(codigo, nome, salario, nivel, titulacao, cargaHoraria, indice);
    }
}
