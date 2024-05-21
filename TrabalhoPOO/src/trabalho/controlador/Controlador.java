/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalho.controlador;

import trabalho.modelo.Universidade;
import trabalho.modelo.Departamento;
import trabalho.modelo.Funcionario;
import java.util.ArrayList;

/**
 *
 * @author vitor
 */
public class Controlador {
    private Universidade universidade = new Universidade("UNESP");
    
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
    
    public ArrayList<Funcionario> getTodosFuncionarios(){
        return universidade.getTodosFuncionarios();
    }
    
    public ArrayList<Funcionario> getTodosTecnicos(){
        return universidade.getTodosTecnicos();
    }
    
    public ArrayList<Funcionario> getTodosDocentes(){
        return universidade.getTodosDocentes();
    }
    
    public ArrayList<Funcionario> getTodosDocentesEfetivos(){
        return universidade.getTodosDocentesEfetivos();
    }
    
    public ArrayList<Funcionario> getTodosDocentesSubstitutos(){
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
    
    public Funcionario buscarFuncNome(String nome){
        return universidade.buscarFuncNome(nome);
    }
    
    public ArrayList<Funcionario> getTodosFuncionariosGastoEspecifico(int ini, int fim){
        return universidade.getTodosFuncionariosGastoEspecifico(ini, fim);
    }
}
