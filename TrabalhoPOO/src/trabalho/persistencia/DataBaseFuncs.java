/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalho.persistencia;

import trabalho.modelo.Funcionario;
import trabalho.modelo.Constantes;
import java.util.ArrayList;

/**
 *
 * @author vitor
 */
public class DataBaseFuncs {
    private Funcionario funcionarios[];
    private static final int MAX = 100;
    private int cont;
    
    public DataBaseFuncs(){
        cont = 0;
        funcionarios = new Funcionario[MAX];
    }
    
    public void addFunc(Funcionario f){
        if(cont < MAX){
            funcionarios[cont] = f;
            cont++;
        }
    }
    
    public ArrayList<Funcionario> getFuncionariosGastoEspecifico(int ini, int fim){
        ArrayList<Funcionario> funcionariosGastoEspecifico = new ArrayList<>();
        for(int i=0; i < cont; i++){
            if(ini <= funcionarios[i].calcularSalario() && funcionarios[i].calcularSalario() <= fim){
                funcionariosGastoEspecifico.add(funcionarios[i].clone());
            }
        }
        return funcionariosGastoEspecifico;
    }
    
    public double getGastosTotais(){
        double gastosTotais = 0;
        for(int i=0; i < cont; i++){
            gastosTotais += funcionarios[i].calcularSalario();
        }
        return gastosTotais;
    }
    
    public ArrayList<Funcionario> getFuncionarios(){
        ArrayList<Funcionario> funcionariosList = new ArrayList<>();
        for(int i=0; i < cont; i++){
            funcionariosList.add(this.funcionarios[i].clone());
        }
        return funcionariosList;
    }
    
    public int getNumFuncionarios(){
        return cont;
    }
    
    public ArrayList<Funcionario> getTecnicos(){
        ArrayList<Funcionario> tecnicos = new ArrayList<>();
        for(int i=0; i < cont; i++){
            if(funcionarios[i].getTipo().equals(Constantes.TECNICO)){
                tecnicos.add(funcionarios[i].clone());
            }
        }
        
        return tecnicos;
    }
    
    public ArrayList<Funcionario> getDocentes(){
        ArrayList<Funcionario> docentes = new ArrayList<>();
        for(int i=0; i < cont; i++){
            if(funcionarios[i].getTipo().equals(Constantes.DOCENTE_EFETIVO) || funcionarios[i].getTipo().equals(Constantes.DOCENTE_SUBSTITUTO)){
                docentes.add(funcionarios[i].clone());
            }
        }
        return docentes;
    }
    
    public ArrayList<Funcionario> getDocentesEfetivos(){
        ArrayList<Funcionario> docentesEfetivos = new ArrayList<>();
        for(int i=0; i < cont; i++){
            if(funcionarios[i].getTipo().equals(Constantes.DOCENTE_EFETIVO)){
                docentesEfetivos.add(funcionarios[i].clone());
            }
        }
        return docentesEfetivos;
    }
    
    public ArrayList<Funcionario> getDocentesSubstitutos(){
        ArrayList<Funcionario> docentesSubstitutos = new ArrayList<>();
        for(int i=0; i < cont; i++){
            if(funcionarios[i].getTipo().equals(Constantes.DOCENTE_SUBSTITUTO)){
                docentesSubstitutos.add(funcionarios[i].clone());
            }
        }
        return docentesSubstitutos;
    }
    
    public Funcionario buscarFuncCodigo(String codigo){
        for(int i=0; i < cont ; i++){
            if(funcionarios[i].getCodigo().equals(codigo)){
                return funcionarios[i].clone();
            }
        }
        
        return null;
    }
    
    public Funcionario buscarFuncNome(String nome){
        for(int i=0; i < cont; i++){
            if(funcionarios[i].getNome().equals(nome)){
                return funcionarios[i].clone();
            }
        }
        
        return null;
    }
}
