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
import javax.swing.JOptionPane;

/**
 *
 * @author 10156
 */
public class CadProduto extends javax.swing.JFrame {
    /**
     * Creates new form CadProduto
     */
    public CadProduto() {
        initComponents();
        
        jtfId.setEnabled(false);
        
        proximoId();
        
        setLocationRelativeTo(null);
    }
    
    public void verificarDadosTemporarios(){
        if(Temp.tempObj != null){
            Produto p = (Produto) Temp.tempObj;
            
            jtfId.setText(String.valueOf(p.getId()));
            jtfDescricao.setText(p.getDescricao());
            jtfPreco.setText(String.valueOf(p.getPreco()));
            
            btnSalvar.setText("Alterar");
        }else{
            btnSalvar.setText("Salvar");
        }
    }
    
    private void proximoId(){
        try{
            jtfId.setText(String.valueOf(MemoryDatabase.listaProdutos.get(MemoryDatabase.listaProdutos.size() - 1).getId() + 1));
        }catch(IndexOutOfBoundsException e){
            jtfId.setText("0");
        }
    }
    
    private void cadastrar(String descricao, Double preco, ArrayList<Produto> lista){
        try{
            int id;
            try{
                //Pega o id do último item da lista e adiciona + 1
                id = lista.get(lista.size() - 1).getId() + 1;
            }catch(IndexOutOfBoundsException e){
                id = 0;
            }
            
            lista.add(new Produto(id, descricao, preco));
            JOptionPane.showMessageDialog(null, "Produto " + jtfDescricao.getText() + " cadastrado com sucesso.");
            jtfDescricao.setText("");
            jtfPreco.setText("");
            proximoId();
        }catch(NumberFormatException e){
            JOptionPane.showConfirmDialog(null, "O preço deve conter um valor numérico");
        }
    }
    
//    public static void alterar(ArrayList<Produto> listaProdutos){
//        try{
//            String descricao;
//            Double preco;
//
//            System.out.println("================================");
//            System.out.println("ALTERAÇÃO");
//            System.out.println("================================");
//
//            System.out.println("Qual produto deseja ALTERAR? (selecione pelo id)");
//            for(Object p : listaProdutos){
//                System.out.println(p.toString());
//            }
//
//            int idSelecionado = scanner.nextInt();
//            scanner.nextLine();
//    
//            Optional<Produto> prod = listaProdutos.stream().filter(p -> p.getId() == idSelecionado).findFirst();
//            System.out.println("Produto selecionado para alteração: " + prod.get().toString());
//
//            int index = listaProdutos.indexOf(prod.get());
//            
//            descricao = prod.get().getDescricao();
//            preco = prod.get().getPreco();
//            
//            System.out.println("Nova descrição: ");
//            String descAux = scanner.nextLine();
//            if(descAux.trim().length() > 0)
//                descricao = descAux;
//            
//            System.out.println("Novo valor: ");
//            String precoAux = scanner.nextLine();
//            if(precoAux.trim().length() > 0)
//                preco = Double.parseDouble(precoAux);
//
//            listaProdutos.set(index, new Produto(idSelecionado, descricao, preco));
//
//            System.out.println("Produto alterado com sucesso!");
//            System.out.println("================================");
//        }catch(NumberFormatException e){
//            System.err.println("O preço deve ser um valor numérico!");
//        }catch(NoSuchElementException e){
//            System.err.println("Produto não encontrado!");
//        }catch(Exception e){
//            System.err.println("Não foi possível alterar o produto!");
//        }
//    }
//    
//    public static void deletar(ArrayList<Produto> listaProdutos){
//        try{
//            System.out.println("================================");
//            System.out.println("REMOÇÃO");
//            System.out.println("================================");
//
//            System.out.println("Qual produto deseja REMOVER? (selecione pelo id)");
//            for(Object p : listaProdutos){
//                System.out.println(p.toString());
//            }
//
//            int idSelecionado = scanner.nextInt();
//            scanner.nextLine();
//
//            Optional<Produto> prod = listaProdutos.stream().filter(p -> p.getId() == idSelecionado).findFirst();
//            
//            System.out.println("Deseja realmente remover o produto: " + prod.get().toString() + "? (S/N)");
//            String opcao = scanner.nextLine();
//
//            if(opcao.toLowerCase().equals("s")){
//                listaProdutos.remove(prod.get());
//                System.err.println("Produto removido com sucesso!");
//            }else
//                System.out.println("Remoção cancelada.");
//            System.out.println("================================");
//        }catch(NoSuchElementException e){
//            System.err.println("Produto não encontrado!");
//        }catch(Exception e){
//            System.err.println("Não foi possível remover o produto!" + e);
//        }
//    }
//    
//    public static void listar(ArrayList<Produto> listaProdutos){
//        System.out.println("================================");
//        System.out.println("LISTAGEM");
//        System.out.println("================================");
//
//        for(Object p : listaProdutos){
//            System.out.println(p.toString());
//        }
//        System.out.println("================================");
//    };
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jtfId = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jtfDescricao = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jtfPreco = new javax.swing.JTextField();
        btnSalvar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtaProdutos = new javax.swing.JTextArea();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jLabel1.setText("ID");

        jLabel2.setText("Descrição");

        jLabel3.setText("Preço");

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        jLabel4.setText("Produtos cadastrados");

        jtaProdutos.setColumns(20);
        jtaProdutos.setRows(5);
        jScrollPane2.setViewportView(jtaProdutos);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 610, Short.MAX_VALUE)
                    .addComponent(jtfPreco)
                    .addComponent(jtfDescricao)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(jtfId, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtfId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtfDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtfPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 390, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSalvar)
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

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        try{
            cadastrar(jtfDescricao.getText(), Double.parseDouble(jtfPreco.getText().replace(",", ".")), MemoryDatabase.listaProdutos);
            
            jtaProdutos.setText("");
            for(Produto p : MemoryDatabase.listaProdutos){
                jtaProdutos.append(p.toString() + "\n");
            }
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "O preço deve conter um valor numérico");
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        Formularios.cadProduto = null;
    }//GEN-LAST:event_formWindowClosed

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
            java.util.logging.Logger.getLogger(CadProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadProduto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalvar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jtaProdutos;
    private javax.swing.JTextField jtfDescricao;
    private javax.swing.JTextField jtfId;
    private javax.swing.JTextField jtfPreco;
    // End of variables declaration//GEN-END:variables
}
