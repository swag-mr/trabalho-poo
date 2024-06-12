/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalho.controlador;

import trabalho.modelo.Universidade;
import trabalho.modelo.Departamento;
import trabalho.modelo.Funcionario;
import java.util.ArrayList;
import trabalho.modelo.Docente;
import trabalho.modelo.Efetivo;
import trabalho.modelo.Substituto;
import trabalho.modelo.Tecnico;

/**
 *
 * @author vitor
 */
public class Controlador {
    private Universidade universidade = new Universidade();
    
    public void setNomeUniversidade(String nome){
        universidade.setNome(nome);
    }
    
    public String getNomeUniversidade(){
        return universidade.getNome();
    }
    
    public int getNumDeptos(){
        return universidade.getNumDeptos();
    }
    
    public void addDepto(String codigo, String nome){
        universidade.addDepto(codigo, nome);
    }
    
    public void addTecnico(String codigo, String nome, double salario, String nivel, String funcao, int indice){ 
        universidade.addTecnico(codigo, nome, salario, nivel, funcao, indice);
    }
    
    public void addDocenteEfetivo(String codigo, String nome, double salario, String nivel, String titulacao, String area, int indice){
        universidade.addDocenteEfetivo(codigo, nome, salario, nivel, titulacao, area, indice);
    }
    
    public void addDocenteSubstituto(String codigo, String nome, double salario, String nivel, String titulacao, int cargaHoraria, int indice){
        universidade.addDocenteSubstituto(codigo, nome, salario, nivel, titulacao, cargaHoraria, indice);
    }
    
    public ArrayList<Departamento> getDeptos(){
        return universidade.getDeptos();
    }
    
    public ArrayList<Departamento> getDeptoGastoEspecifico(double ini, double fim){
        return universidade.getDeptosFaixaEspecifica(ini, fim);
    }
    
    public ArrayList<Funcionario> getFuncsDepto(int indice){
        return universidade.getFuncsDepto(indice);
    }
    
    public ArrayList<Funcionario> getTodosFuncionarios(){
        return universidade.getTodosFuncionarios();
    }
    
    public ArrayList<Tecnico> getTodosTecnicos(){
        return universidade.getTodosTecnicos();
    }
    
    public ArrayList<Docente> getTodosDocentes(){
        return universidade.getTodosDocentes();
    }
    
    public ArrayList<Efetivo> getTodosDocentesEfetivos(){
        return universidade.getTodosDocentesEfetivos();
    }
    
    public ArrayList<Substituto> getTodosDocentesSubstitutos(){
        return universidade.getTodosDocentesSubstitutos();
    }
    
    public Departamento getDeptoIndice(int indice){
        return universidade.getDeptoIndice(indice);
    }
    
    public Departamento getDeptoCodigo(String codigo){
        return universidade.getDeptoCodigo(codigo);
    }
    
    public Funcionario buscarFuncCodigo(String codigo){
        return universidade.buscarFuncCodigo(codigo);
    }
    
    public ArrayList<Funcionario> buscarFuncNome(String nome){
        return universidade.buscarFuncNome(nome);
    }
    
    public ArrayList<Funcionario> getTodosFuncionariosGastoEspecifico(double ini, double fim){
        return universidade.getTodosFuncionariosGastoEspecifico(ini, fim);
    }
}
