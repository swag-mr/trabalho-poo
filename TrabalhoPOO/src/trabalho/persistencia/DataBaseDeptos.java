/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalho.persistencia;

import trabalho.modelo.Departamento;
import java.util.ArrayList;
import trabalho.modelo.Funcionario;

/**
 *
 * @author vitor
 */
public class DataBaseDeptos {
    private Departamento departamentos[];
    private static final int MAX = 100;
    private int cont;
    
    public DataBaseDeptos(){
        cont = 0;
        departamentos = new Departamento[MAX];
    }
    
    public void addDepto(Departamento d){
        if(cont < MAX){
            departamentos[cont] = d;
            cont++;
        }
    }
    
    public ArrayList<Departamento> getDeptos(){
        ArrayList<Departamento> departamentosList = new ArrayList<>();
        for(int i=0; i < cont; i++){
            departamentosList.add(departamentos[i].clone());
        }
        return departamentosList;
    }
    
    public int getNumDeptos(){
        return cont;
    }
    
    public void addTecnico(String codigo, String nome, double salario, String nivel, String funcao, int indice){
        departamentos[indice].addTecnico(codigo, nome, salario, nivel, funcao);
    }
    
    public void addDocenteEfetivo(String codigo, String nome, double salario, String nivel, String titulacao, String area, int indice){
        departamentos[indice].addDocenteEfetivo(codigo, nome, salario, nivel, titulacao, area);
    }
    
    public void addDocenteSubstituto(String codigo, String nome, double salario, String nivel, String titulacao, int cargaHoraria, int indice){
        departamentos[indice].addDocenteSubstituto(codigo, nome, salario, nivel, titulacao, cargaHoraria);
    }
    
    public ArrayList<Departamento> getDeptosFaixaEspecifica(int ini, int fim){
        ArrayList<Departamento> departamentosFaixaEspecifica = new ArrayList<>();
        for(int i=0; i < cont; i++){
            if(ini <= departamentos[i].getGastosTotais() && departamentos[i].getGastosTotais() <= fim){
                departamentosFaixaEspecifica.add(departamentos[i].clone());
            }
        }
        return departamentosFaixaEspecifica;
    }
    
    public ArrayList<Funcionario> getTodosFuncionarios(){
        ArrayList<Funcionario> allFuncs = new ArrayList<>();
        for(int i=0; i < cont; i++){
            allFuncs.addAll(departamentos[i].getFuncionarios()); // Pega de todos os deptos
        }
        return allFuncs;
    }
    
    public ArrayList<Funcionario> getTodosTecnicos(){
        ArrayList<Funcionario> allTecnicos = new ArrayList<>();
        for(int i=0; i < cont; i++){
            allTecnicos.addAll(departamentos[i].getTecnicos()); // Pega de todos os deptos
        }
        return allTecnicos;
    }
    
    public ArrayList<Funcionario> getTodosDocentes(){
        ArrayList<Funcionario> allDocentes = new ArrayList<>();
        for(int i=0; i < cont; i++){
            allDocentes.addAll(departamentos[i].getDocentes()); // Pega de todos os deptos
        }
        return allDocentes;
    }
    
    public ArrayList<Funcionario> getTodosDocentesEfetivos(){
        ArrayList<Funcionario> allDocentesEfetivos = new ArrayList<>();
        for(int i=0; i < cont; i++){
            allDocentesEfetivos.addAll(departamentos[i].getDocentesEfetivos()); // Pega de todos os deptos
        }
        return allDocentesEfetivos;
    }
    
    public ArrayList<Funcionario> getTodosDocentesSubstitutos(){
        ArrayList<Funcionario> allDocentesSubstitutos = new ArrayList<>();
        for(int i=0; i < cont; i++){
            allDocentesSubstitutos.addAll(departamentos[i].getDocentesSubstitutos()); // Pega de todos os deptos
        }
        return allDocentesSubstitutos;
    }
    
    public Departamento getDeptoIndice(int indice){
        return departamentos[indice].clone();
    }
    
    public Departamento getDeptoCodigo(String codigo){
        for(int i=0; i < cont; i++){
            if(departamentos[i].getCodigo().equals(codigo)){
                return departamentos[i].clone();
            }
        }
        return null;
    }
    
    public Funcionario buscarFuncCodigo(String codigo){
        for(int i=0; i < cont; i++){
            if(departamentos[i].buscarFuncCodigo(codigo) != null){
                return departamentos[i].buscarFuncCodigo(codigo); // Achou o codigo em algum depto
            }
        }
        return null; // Não achou o codigo em nenhum depto
    }
    
    public Funcionario buscarFuncNome(String nome){
        for(int i=0; i < cont; i++){
            if(departamentos[i].buscarFuncNome(nome) != null){
                return departamentos[i].buscarFuncNome(nome); // Achou o nome em algum depto
            }
        }
        return null; // Não achou o nome em nenhum depto
    }
    
    public ArrayList<Funcionario> getTodosFuncionariosGastoEspecifico(int ini, int fim){
        ArrayList<Funcionario> allFuncsGastoEspecifico = new ArrayList<>();
        for(int i=0; i < cont; i++){
            allFuncsGastoEspecifico.addAll(departamentos[i].getFuncionariosGastoEspecifico(ini, fim));
        }
        return allFuncsGastoEspecifico;
    }
}
