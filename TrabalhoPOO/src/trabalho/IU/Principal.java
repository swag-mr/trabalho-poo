/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalho.IU;

/**
 *
 * @author vitor
 */
public class Principal {
    public static void main(String[] args){
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {IUPrincipal principal = new IUPrincipal();
                principal.setVisible(true);
                principal.setTitle("Sistema de Cadastro de Produtos");
                principal.toFront();
            }
        });
    }
}
