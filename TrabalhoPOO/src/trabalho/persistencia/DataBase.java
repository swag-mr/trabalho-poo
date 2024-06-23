/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalho.persistencia;

import trabalho.modelo.Departamento;
import java.util.ArrayList;
import trabalho.modelo.Constantes;
import trabalho.modelo.Docente;
import trabalho.modelo.Efetivo;
import trabalho.modelo.Funcionario;
import trabalho.modelo.Substituto;
import trabalho.modelo.Tecnico;

/**
 *
 * @author vitor
 */
public class DataBase {
    private ArrayList<Funcionario> funcionarios;
    private Departamento departamentos[];
    private static final int MAX = 50;
    private int cont;
    public static DataBase instance = null;
    
    public DataBase(){
        cont = 0;
        departamentos = new Departamento[MAX];
        funcionarios = new ArrayList<>();
    }
    
    public static DataBase getInstance(){
        if(instance == null){
            instance = new DataBase();
        }
        return instance;
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
        Tecnico t = new Tecnico(codigo, nome, salario, nivel, funcao);
        funcionarios.add(t);
        departamentos[indice].addTecnico(t);
    }
    
    public void addDocenteEfetivo(String codigo, String nome, double salario, String nivel, String titulacao, String area, int indice){
        Efetivo de = new Efetivo(codigo, nome, salario, nivel, titulacao, area);
        funcionarios.add(de);
        departamentos[indice].addDocenteEfetivo(de);
    }
    
    public void addDocenteSubstituto(String codigo, String nome, double salario, String nivel, String titulacao, int cargaHoraria, int indice){
        Substituto ds = new Substituto(codigo, nome, salario, nivel, titulacao, cargaHoraria);
        funcionarios.add(ds);
        departamentos[indice].addDocenteSubstituto(ds);
    }
    
    public ArrayList<Departamento> getDeptosFaixaEspecifica(double ini, double fim){
        ArrayList<Departamento> departamentosFaixaEspecifica = new ArrayList<>();
        for(int i=0; i < cont; i++){
            if(ini <= departamentos[i].getGastosTotais() && departamentos[i].getGastosTotais() <= fim){
                departamentosFaixaEspecifica.add(departamentos[i].clone());
            }
        }
        return departamentosFaixaEspecifica;
    }
    
    public ArrayList<Funcionario> getFuncsDepto(int indice){
        return (ArrayList<Funcionario>) departamentos[indice].getFuncionarios();
    }
    
    public ArrayList<Funcionario> getTodosFuncionarios(){
        return (ArrayList<Funcionario>) funcionarios.clone();
    }
    
    public ArrayList<Tecnico> getTodosTecnicos(){
        ArrayList<Tecnico> allTecnicos = new ArrayList<>();
        for(int i=0; i < funcionarios.size(); i++){
            if(funcionarios.get(i).getTipo().equals(Constantes.TECNICO)){
                allTecnicos.add((Tecnico) funcionarios.get(i).clone());
            }
        }
        return allTecnicos;
    }
    
    public ArrayList<Docente> getTodosDocentes(){
        ArrayList<Docente> allDocentes = new ArrayList<>();
        for(int i=0; i < funcionarios.size(); i++){
            if(funcionarios.get(i).getTipo().equals(Constantes.DOCENTE_EFETIVO) || funcionarios.get(i).getTipo().equals(Constantes.DOCENTE_SUBSTITUTO)){
                allDocentes.add((Docente) funcionarios.get(i).clone());
            }
        }
        return allDocentes;
    }
    
    public ArrayList<Efetivo> getTodosDocentesEfetivos(){
        ArrayList<Efetivo> allDocentesEfetivos = new ArrayList<>();
        for(int i=0; i < funcionarios.size(); i++){
            if(funcionarios.get(i).getTipo().equals(Constantes.DOCENTE_EFETIVO)){
                allDocentesEfetivos.add((Efetivo) funcionarios.get(i).clone());
            }
        }
        return allDocentesEfetivos;
    }
    
    public ArrayList<Substituto> getTodosDocentesSubstitutos(){
        ArrayList<Substituto> allDocentesSubstitutos = new ArrayList<>();
        for(int i=0; i < funcionarios.size(); i++){
            if(funcionarios.get(i).getTipo().equals(Constantes.DOCENTE_SUBSTITUTO)){
                allDocentesSubstitutos.add((Substituto) funcionarios.get(i).clone());
            }
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
        for(int i=0; i < funcionarios.size(); i++){
            if(funcionarios.get(i).getCodigo().equals(codigo)){
                return (Funcionario) funcionarios.get(i).clone();
            }
        }
        return null;
    }
    
    public ArrayList<Funcionario> buscarFuncNome(String nome){
        ArrayList<Funcionario> funcsNome = new ArrayList<>();
        for(int i=0; i < funcionarios.size(); i++){
            if(funcionarios.get(i).getNome().toLowerCase().equals(nome)){
                funcsNome.add((Funcionario) funcionarios.get(i).clone());
            }
        }
        return funcsNome;
    }
    
    public ArrayList<Funcionario> getTodosFuncionariosGastoEspecifico(double ini, double fim){
        ArrayList<Funcionario> allFuncsGastoEspecifico = new ArrayList<>();
        for(int i=0; i < funcionarios.size(); i++){
            if(ini <= funcionarios.get(i).calcularSalario() && funcionarios.get(i).calcularSalario() <= fim){
                allFuncsGastoEspecifico.add((Funcionario) funcionarios.get(i).clone());
            }
        }
        return allFuncsGastoEspecifico;
    }
}
