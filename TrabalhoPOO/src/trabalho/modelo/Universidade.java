/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalho.modelo;

import trabalho.persistencia.DataBase;
import java.util.ArrayList;

/**
 *
 * @author vitor
 */
public class Universidade {
    private static String nome;
    private DataBase db = DataBase.getInstance();
    
    public Universidade(){
        this.nome = "UNESP";
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
        return db.getDeptos();
    }
    
    public ArrayList<Funcionario> getTodosFuncionarios(){
        return db.getTodosFuncionarios();
    }
    
    public ArrayList<Tecnico> getTodosTecnicos(){
        return db.getTodosTecnicos();
    }
    
    public ArrayList<Docente> getTodosDocentes(){
        return db.getTodosDocentes();
    }
    
    public ArrayList<Efetivo> getTodosDocentesEfetivos(){
        return db.getTodosDocentesEfetivos();
    }
    
    public ArrayList<Substituto> getTodosDocentesSubstitutos(){
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
    
    public ArrayList<Funcionario> buscarFuncNome(String nome){
        return db.buscarFuncNome(nome);
    }
    
    public ArrayList<Funcionario> getFuncsDepto(int indice){
        return db.getFuncsDepto(indice);
    }
    
    public ArrayList<Funcionario> getTodosFuncionariosGastoEspecifico(double ini, double fim){
        return db.getTodosFuncionariosGastoEspecifico(ini, fim);
    }
    
    public ArrayList<Departamento> getDeptosFaixaEspecifica(double ini, double fim){
        return db.getDeptosFaixaEspecifica(ini, fim);
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
