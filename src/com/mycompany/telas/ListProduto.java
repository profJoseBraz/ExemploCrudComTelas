/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.telas;

import com.mycompany.bd.MemoryDatabase;
import com.mycompany.outros.Formularios;
import com.mycompany.outros.Temp;
import com.mycompany.produto.Produto;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 10156
 */
public class ListProduto extends javax.swing.JFrame {

    /**
     * Creates new form ListProduto
     */
    public ListProduto() {
        initComponents();
        
        setLocationRelativeTo(null);
        
        listar(MemoryDatabase.listaProdutos);
        
        verificarOpcaoFiltro();
    }

    public void listar(ArrayList<Produto> lista){
        DefaultTableModel defaultTableModel = (DefaultTableModel) tableProdutos.getModel();
        
        //tableProdutos.setModel(defaultTableModel);
        
        defaultTableModel.setRowCount(0);
        for(Produto p : lista){
            defaultTableModel.addRow(new Object[]{p.getId(), p.getDescricao(), p.getPreco()});
        }
    };
    
    private void verificarOpcaoFiltro(){
        if(jcbFiltro.getSelectedIndex() == 0){
            jtfFiltro.setEnabled(false);
            jtfFiltro.setText("");
        }else{
            jtfFiltro.setEnabled(true);
        }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jtfFiltro = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jcbFiltro = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableProdutos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Listagem de produtos");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jButton1.setText("Filtrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jcbFiltro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TODOS", "ID", "DESCRIÇÃO", "PREÇO MAIOR OU IGUAL A", "PREÇO MENOR OU IGUAL A" }));
        jcbFiltro.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcbFiltroItemStateChanged(evt);
            }
        });

        tableProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "DESCRIÇÃO", "PREÇO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableProdutos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableProdutosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tableProdutos);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jcbFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfFiltro, javax.swing.GroupLayout.DEFAULT_SIZE, 439, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(jcbFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 469, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        Formularios.listProduto = null;
    }//GEN-LAST:event_formWindowClosed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        List<Produto> produtosFiltrados = null; 
        
        try{
            switch (jcbFiltro.getSelectedIndex()) {
                case 0:
                    produtosFiltrados = MemoryDatabase.listaProdutos;
                    break;
                case 1:
                    produtosFiltrados = MemoryDatabase.listaProdutos.stream()
                        .filter(p -> p.getId() == Integer.parseInt(jtfFiltro.getText()))
                        .collect(Collectors.toList());
                    break;
                case 2:
                    produtosFiltrados = MemoryDatabase.listaProdutos.stream()
                        .filter(p -> p.getDescricao().toLowerCase().contains(jtfFiltro.getText().toLowerCase()))
                        .collect(Collectors.toList());
                    break;
                case 3:
                    produtosFiltrados = MemoryDatabase.listaProdutos.stream()
                        .filter(p -> p.getPreco() >= Double.parseDouble(jtfFiltro.getText()))
                        .collect(Collectors.toList());
                    break;
                case 4:
                    produtosFiltrados = MemoryDatabase.listaProdutos.stream()
                        .filter(p -> p.getPreco() <= Double.parseDouble(jtfFiltro.getText()))
                        .collect(Collectors.toList());
                    break;
            }
            
            ArrayList<Produto> prodFilt = new ArrayList<>(produtosFiltrados);
            listar(prodFilt);
        }catch(NoSuchElementException e){
            JOptionPane.showMessageDialog(null, "Elemento não encontrado.");
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Digite um valor numérico.");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tableProdutosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableProdutosMouseClicked
        if (evt.getClickCount() == 2){
            Produto produto = new Produto();

            produto.setId(Integer.parseInt(String.valueOf(tableProdutos.getValueAt(tableProdutos.getSelectedRow(), 0))));
            produto.setDescricao(String.valueOf(tableProdutos.getValueAt(tableProdutos.getSelectedRow(), 1)));
            produto.setPreco(Double.valueOf(String.valueOf(tableProdutos.getValueAt(tableProdutos.getSelectedRow(), 2))));

            Temp.tempObj = produto;

            if(Formularios.cadProduto == null)
                Formularios.cadProduto = new CadProduto();
                
            ((CadProduto) Formularios.cadProduto).verificarDadosTemporarios();
            Formularios.cadProduto.setVisible(true);
            Formularios.cadProduto.setExtendedState(JFrame.NORMAL);
        }
    }//GEN-LAST:event_tableProdutosMouseClicked

    private void jcbFiltroItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcbFiltroItemStateChanged
        verificarOpcaoFiltro();
    }//GEN-LAST:event_jcbFiltroItemStateChanged

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
            java.util.logging.Logger.getLogger(ListProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListProduto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox<String> jcbFiltro;
    private javax.swing.JTextField jtfFiltro;
    private javax.swing.JTable tableProdutos;
    // End of variables declaration//GEN-END:variables
}
