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

        jLabel1 = new javax.swing.JLabel();
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
        BuscarDeptoLista = new javax.swing.JMenuItem();
        BuscarDeptoCodigo = new javax.swing.JMenuItem();
        BuscarFuncNome = new javax.swing.JMenuItem();
        BuscarFuncCode = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Cantarell", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("<html><div style=\"text-align:center\"><p>Bem-vindo ao sistema de cadastro</p><p>e relatório da <strong>UniX</strong></p></div></html>");

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
        Docente_Subs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Docente_SubsActionPerformed(evt);
            }
        });
        Cadastros.add(Docente_Subs);

        Docente_Efet.setText("Docente Efetivo");
        Docente_Efet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Docente_EfetActionPerformed(evt);
            }
        });
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

        ResumoDeptos.setText("Resumo Departamentos");
        ResumoDeptos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResumoDeptosActionPerformed(evt);
            }
        });
        Relatorios.add(ResumoDeptos);

        DeptosFaixa.setText("Resumo Deptos Faixa Específica");
        DeptosFaixa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeptosFaixaActionPerformed(evt);
            }
        });
        Relatorios.add(DeptosFaixa);

        FuncsFaixa.setText("Funcionários Faixa Específica");
        FuncsFaixa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FuncsFaixaActionPerformed(evt);
            }
        });
        Relatorios.add(FuncsFaixa);

        TodosFuncs.setText("Todos Funcionários");
        TodosFuncs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TodosFuncsActionPerformed(evt);
            }
        });
        Relatorios.add(TodosFuncs);

        TodosTecs.setText("Todos Técnicos");
        TodosTecs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TodosTecsActionPerformed(evt);
            }
        });
        Relatorios.add(TodosTecs);

        TodosDocs.setText("Todos Docentes");
        TodosDocs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TodosDocsActionPerformed(evt);
            }
        });
        Relatorios.add(TodosDocs);

        TodosDocsSubs.setText("Todos Docentes Substitutos");
        TodosDocsSubs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TodosDocsSubsActionPerformed(evt);
            }
        });
        Relatorios.add(TodosDocsSubs);

        TodosDocsEfet.setText("Todos Docentes Efetivos");
        TodosDocsEfet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TodosDocsEfetActionPerformed(evt);
            }
        });
        Relatorios.add(TodosDocsEfet);

        BuscarDeptoLista.setText("Buscar Departamento Lista");
        BuscarDeptoLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarDeptoListaActionPerformed(evt);
            }
        });
        Relatorios.add(BuscarDeptoLista);

        BuscarDeptoCodigo.setText("Buscar Departamento Código");
        BuscarDeptoCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarDeptoCodigoActionPerformed(evt);
            }
        });
        Relatorios.add(BuscarDeptoCodigo);

        BuscarFuncNome.setText("Buscar Funcionário Nome");
        BuscarFuncNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarFuncNomeActionPerformed(evt);
            }
        });
        Relatorios.add(BuscarFuncNome);

        BuscarFuncCode.setText("Buscar Funcionário Código");
        BuscarFuncCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarFuncCodeActionPerformed(evt);
            }
        });
        Relatorios.add(BuscarFuncCode);

        MenuBar.add(Relatorios);

        setJMenuBar(MenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(156, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(73, Short.MAX_VALUE))
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
    }//GEN-LAST:event_GeralActionPerformed

    private void TecnicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TecnicoActionPerformed
        // TODO add your handling code here:
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                IUCadastroTecnico dialog = new IUCadastroTecnico(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        dialog.dispose();
                    }
                });
                dialog.setVisible(true);
            }
        });
    }//GEN-LAST:event_TecnicoActionPerformed

    private void ResumoDeptosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResumoDeptosActionPerformed
        // TODO add your handling code here:
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                IUResumoDeptos dialog = new IUResumoDeptos(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        dialog.dispose();
                    }
                });
                dialog.setVisible(true);
            }
        });
    }//GEN-LAST:event_ResumoDeptosActionPerformed

    private void TodosDocsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TodosDocsActionPerformed
        // TODO add your handling code here:
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                IURelatórioDocentes dialog = new IURelatórioDocentes(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        dialog.dispose();
                    }
                });
                dialog.setVisible(true);
            }
        });
    }//GEN-LAST:event_TodosDocsActionPerformed

    private void Docente_EfetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Docente_EfetActionPerformed
        // TODO add your handling code here:
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                IUCadastroDocenteEfetivo dialog = new IUCadastroDocenteEfetivo(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        dialog.dispose();
                    }
                });
                dialog.setVisible(true);
            }
        });
    }//GEN-LAST:event_Docente_EfetActionPerformed

    private void Docente_SubsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Docente_SubsActionPerformed
        // TODO add your handling code here:
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                IUCadastroDocenteSubstituto dialog = new IUCadastroDocenteSubstituto(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        dialog.dispose();
                    }
                });
                dialog.setVisible(true);
            }
        });
    }//GEN-LAST:event_Docente_SubsActionPerformed

    private void TodosTecsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TodosTecsActionPerformed
        // TODO add your handling code here:
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                IURelatórioTecnicos dialog = new IURelatórioTecnicos(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        dialog.dispose();
                    }
                });
                dialog.setVisible(true);
            }
        });
    }//GEN-LAST:event_TodosTecsActionPerformed

    private void TodosDocsEfetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TodosDocsEfetActionPerformed
        // TODO add your handling code here:
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                IURelatórioDocentesEfetivos dialog = new IURelatórioDocentesEfetivos(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        dialog.dispose();
                    }
                });
                dialog.setVisible(true);
            }
        });
    }//GEN-LAST:event_TodosDocsEfetActionPerformed

    private void TodosDocsSubsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TodosDocsSubsActionPerformed
        // TODO add your handling code here:
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                IURelatórioDocentesSubstitutos dialog = new IURelatórioDocentesSubstitutos(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        dialog.dispose();
                    }
                });
                dialog.setVisible(true);
            }
        });
    }//GEN-LAST:event_TodosDocsSubsActionPerformed

    private void TodosFuncsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TodosFuncsActionPerformed
        // TODO add your handling code here:
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                IURelatórioFuncionários dialog = new IURelatórioFuncionários(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        dialog.dispose();
                    }
                });
                dialog.setVisible(true);
            }
        });
    }//GEN-LAST:event_TodosFuncsActionPerformed

    private void BuscarFuncNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarFuncNomeActionPerformed
        // TODO add your handling code here:
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                IUBuscarFuncionarioNome dialog = new IUBuscarFuncionarioNome(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        dialog.dispose();
                    }
                });
                dialog.setVisible(true);
            }
        });
    }//GEN-LAST:event_BuscarFuncNomeActionPerformed

    private void BuscarFuncCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarFuncCodeActionPerformed
        // TODO add your handling code here:
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                IUBuscarFuncionarioCodigo dialog = new IUBuscarFuncionarioCodigo(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        dialog.dispose();
                    }
                });
                dialog.setVisible(true);
            }
        });
    }//GEN-LAST:event_BuscarFuncCodeActionPerformed

    private void FuncsFaixaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FuncsFaixaActionPerformed
        // TODO add your handling code here:
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                IUFuncsFaixaEspecifica dialog = new IUFuncsFaixaEspecifica(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        dialog.dispose();
                    }
                });
                dialog.setVisible(true);
            }
        });
    }//GEN-LAST:event_FuncsFaixaActionPerformed

    private void DeptosFaixaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeptosFaixaActionPerformed
        // TODO add your handling code here:
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                IUDeptosFaixaEspecifica dialog = new IUDeptosFaixaEspecifica(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        dialog.dispose();
                    }
                });
                dialog.setVisible(true);
            }
        });
    }//GEN-LAST:event_DeptosFaixaActionPerformed

    private void BuscarDeptoListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarDeptoListaActionPerformed
        // TODO add your handling code here:
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                IUBuscarDepartamentoLista dialog = new IUBuscarDepartamentoLista(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        dialog.dispose();
                    }
                });
                dialog.setVisible(true);
            }
        });
    }//GEN-LAST:event_BuscarDeptoListaActionPerformed

    private void BuscarDeptoCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarDeptoCodigoActionPerformed
        // TODO add your handling code here:
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                IUBuscarDepartamentoCódigo dialog = new IUBuscarDepartamentoCódigo(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        dialog.dispose();
                    }
                });
                dialog.setVisible(true);
            }
        });
    }//GEN-LAST:event_BuscarDeptoCodigoActionPerformed

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
    private javax.swing.JMenuItem BuscarDeptoCodigo;
    private javax.swing.JMenuItem BuscarDeptoLista;
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
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
