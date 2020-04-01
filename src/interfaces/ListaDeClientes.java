/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import classes.Pessoas;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.table.DefaultTableModel;
import persistencia.ConexaoSql;

/**
 *
 * @author fernando
 */
public class ListaDeClientes extends javax.swing.JInternalFrame {
   

    /**
     * Creates new form ListaDeClientes
     */
    public ListaDeClientes() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jtTabela = new javax.swing.JTable();
        jbtnAtualizar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);

        jtTabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "Celular", "Telefone", "Email", "Assunto", "Numero de Processo", "Data de cadastro"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, true, false, true, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtTabela.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jScrollPane1.setViewportView(jtTabela);

        jbtnAtualizar.setText("Atualizar");
        jbtnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAtualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1033, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbtnAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(jbtnAtualizar)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAtualizarActionPerformed
        // TODO add your handling code here:
        
        ConexaoSql conexao = new ConexaoSql();
        DefaultTableModel dtmTabela = (DefaultTableModel) jtTabela.getModel(); 
        dtmTabela.setRowCount(0);
        Pessoas pessoas= new Pessoas();
        ArrayList<String> listaDePessoas= new ArrayList<String>();
      
        ResultSet resultSet = null;
        Statement statement = null;
        conexao.conectar();
        String query = "SELECT * FROM dados_cadastrais2";
        statement = conexao.criarStatement();
        
        try{
           resultSet=statement.executeQuery(query);
        
           while(resultSet.next()){
                listaDePessoas.add(Integer.toString(resultSet.getInt("cod")));
                listaDePessoas.add(resultSet.getString("nome"));
                listaDePessoas.add(resultSet.getString("celular"));
                listaDePessoas.add(resultSet.getString("telefone"));
                listaDePessoas.add(resultSet.getString("email"));
                listaDePessoas.add(resultSet.getString("assunto"));
                listaDePessoas.add(resultSet.getString("numero_de_processo"));
                listaDePessoas.add(resultSet.getString("data_de_cadastro"));
                
               dtmTabela.addRow(listaDePessoas.toArray());
               listaDePessoas.clear();
                
                
                
               
           }
           //Object[] t= (listaDePessoas.toArray());
          // for (int c=0;c<listaDePessoas.size();c++){
         //      dtmTabela.addRow(t);
          // }
          
        }
        catch(SQLException e){
            
            
            System.out.println(e.getMessage());
          
            
            
        }
        
        finally{
            try {
     
                resultSet.close();
            
                statement.close();
                conexao.desconectar();
            }
        catch(SQLException e){
                System.out.println(e.getMessage());;}}
    }//GEN-LAST:event_jbtnAtualizarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtnAtualizar;
    private javax.swing.JTable jtTabela;
    // End of variables declaration//GEN-END:variables
}