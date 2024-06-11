/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package trabalho.IU;

/**
 *
 * @author vitor
 */
public class IUPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form IUPrincipal
     */
    public IUPrincipal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MenuBar = new javax.swing.JMenuBar();
        Cadastros = new javax.swing.JMenu();
        Departamento = new javax.swing.JMenuItem();
        Tecnico = new javax.swing.JMenuItem();
        Docente_Subs = new javax.swing.JMenuItem();
        Docente_Efet = new javax.swing.JMenuItem();
        Relatorios = new javax.swing.JMenu();
        Geral = new javax.swing.JMenuItem();
        ResumoDeptos = new javax.swing.JMenuItem();
        DeptosFaixa = new javax.swing.JMenuItem();
        FuncsFaixa = new javax.swing.JMenuItem();
        TodosFuncs = new javax.swing.JMenuItem();
        TodosTecs = new javax.swing.JMenuItem();
        TodosDocs = new javax.swing.JMenuItem();
        TodosDocsSubs = new javax.swing.JMenuItem();
        TodosDocsEfet = new javax.swing.JMenuItem();
        BuscarDepto = new javax.swing.JMenuItem();
        BuscarFuncNome = new javax.swing.JMenuItem();
        BuscarFuncCode = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Cadastros.setText("Cadastros");

        Departamento.setText("Departamento");
        Departamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DepartamentoActionPerformed(evt);
            }
        });
        Cadastros.add(Departamento);

        Tecnico.setText("Técnico");
        Tecnico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TecnicoActionPerformed(evt);
            }
        });
        Cadastros.add(Tecnico);

        Docente_Subs.setText("Docente Substituto");
        Cadastros.add(Docente_Subs);

        Docente_Efet.setText("Docente Efetivo");
        Cadastros.add(Docente_Efet);

        MenuBar.add(Cadastros);

        Relatorios.setText("Relatórios");

        Geral.setText("Geral");
        Geral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GeralActionPerformed(evt);
            }
        });
        Relatorios.add(Geral);

        ResumoDeptos.setText("Resumo Deptos");
        ResumoDeptos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResumoDeptosActionPerformed(evt);
            }
        });
        Relatorios.add(ResumoDeptos);

        DeptosFaixa.setText("Resumo Deptos Faixa Específica");
        Relatorios.add(DeptosFaixa);

        FuncsFaixa.setText("Funcionários Faixa Específica");
        Relatorios.add(FuncsFaixa);

        TodosFuncs.setText("Todos Funcionários");
        Relatorios.add(TodosFuncs);

        TodosTecs.setText("Todos Técnicos");
        Relatorios.add(TodosTecs);

        TodosDocs.setText("Todos Docentes");
        TodosDocs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TodosDocsActionPerformed(evt);
            }
        });
        Relatorios.add(TodosDocs);

        TodosDocsSubs.setText("Todos Docentes Substitutos");
        Relatorios.add(TodosDocsSubs);

        TodosDocsEfet.setText("Todos Docentes Efetivos");
        Relatorios.add(TodosDocsEfet);

        BuscarDepto.setText("Buscar Departamento");
        Relatorios.add(BuscarDepto);

        BuscarFuncNome.setText("Buscar Funcionário Nome");
        Relatorios.add(BuscarFuncNome);

        BuscarFuncCode.setText("Buscar Funcionário Código");
        Relatorios.add(BuscarFuncCode);

        MenuBar.add(Relatorios);

        setJMenuBar(MenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 274, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DepartamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DepartamentoActionPerformed
        // TODO add your handling code here:
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                IUCadastroDepartamento dialog = new IUCadastroDepartamento(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        dialog.dispose();
                    }
                });
                dialog.setVisible(true);
            }
        });
    }//GEN-LAST:event_DepartamentoActionPerformed

    private void GeralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GeralActionPerformed
        // TODO add your handling code here:
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IURelatorioGeral().setVisible(true);
            }
        });
    }//GEN-LAST:event_GeralActionPerformed

    private void TecnicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TecnicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TecnicoActionPerformed

    private void ResumoDeptosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResumoDeptosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ResumoDeptosActionPerformed

    private void TodosDocsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TodosDocsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TodosDocsActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(IUPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IUPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IUPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IUPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IUPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem BuscarDepto;
    private javax.swing.JMenuItem BuscarFuncCode;
    private javax.swing.JMenuItem BuscarFuncNome;
    private javax.swing.JMenu Cadastros;
    private javax.swing.JMenuItem Departamento;
    private javax.swing.JMenuItem DeptosFaixa;
    private javax.swing.JMenuItem Docente_Efet;
    private javax.swing.JMenuItem Docente_Subs;
    private javax.swing.JMenuItem FuncsFaixa;
    private javax.swing.JMenuItem Geral;
    private javax.swing.JMenuBar MenuBar;
    private javax.swing.JMenu Relatorios;
    private javax.swing.JMenuItem ResumoDeptos;
    private javax.swing.JMenuItem Tecnico;
    private javax.swing.JMenuItem TodosDocs;
    private javax.swing.JMenuItem TodosDocsEfet;
    private javax.swing.JMenuItem TodosDocsSubs;
    private javax.swing.JMenuItem TodosFuncs;
    private javax.swing.JMenuItem TodosTecs;
    // End of variables declaration//GEN-END:variables
}
