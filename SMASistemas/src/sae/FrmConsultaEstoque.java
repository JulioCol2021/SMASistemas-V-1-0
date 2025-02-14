/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/*
 * FrmUsuario.java
 *
 * Created on 02/01/2010, 13:07:26
 */
package sae;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import Classes.claAcessoDados;
import Classes.claVariaveis;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import Classes.claVariaveis;
import Classes.claAcessoDados;
import javax.swing.table.DefaultTableCellRenderer;
import java.util.Collections;
import Classes.claFuncoes;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;
import javax.*;
import java.lang.Exception;
import java.text.DecimalFormat;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Thiago
 */
public class FrmConsultaEstoque extends javax.swing.JDialog {
    claVariaveis variaveis = new claVariaveis();
    claAcessoDados AcessoDados = new claAcessoDados();
    claFuncoes funcoes = new claFuncoes();
    private ResultSet rs, rsUnidade;

    /** Creates new form FrmUsuario */
    public FrmConsultaEstoque(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        HashSet conj = new HashSet(this.getFocusTraversalKeys(KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS));
        conj.add(AWTKeyStroke.getAWTKeyStroke(KeyEvent.VK_ENTER, 0));
        this.setFocusTraversalKeys(KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS, conj);
        txtUnidadeMedida.setVisible(false);
        lbID.setVisible(false);
        funcoes.F_AtribuirClasse(rootPane);
       
    }
    
    private void registraEnterNoBotao(JButton b) {
        b.registerKeyboardAction(
                b.getActionForKeyStroke(
                KeyStroke.getKeyStroke(KeyEvent.VK_SPACE, 0, false)),
                KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, false),
                JComponent.WHEN_FOCUSED);

        b.registerKeyboardAction(
                b.getActionForKeyStroke(
                KeyStroke.getKeyStroke(KeyEvent.VK_SPACE, 0, true)),
                KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, true),
                JComponent.WHEN_FOCUSED);
    }
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        tbPai = new javax.swing.JTabbedPane();
        pnlDados = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        txtEstoqueMinimo = new javax.swing.JLabel();
        txtEstoqueMaximo = new javax.swing.JLabel();
        txtEstoqueAtual = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        lbVenda = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        grVendas = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        grLotes = new javax.swing.JTable();
        txtCodigoProduto = new javax.swing.JTextField();
        txtDescricao = new javax.swing.JTextField();
        txtUM = new javax.swing.JTextField();
        jPanel10 = new javax.swing.JPanel();
        btnPesquisar = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        txtUnidadeMedida = new javax.swing.JTextField();
        lbID = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Consulta Estoque");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jToolBar1.setFloatable(false);
        jToolBar1.setRollover(true);

        tbPai.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N

        pnlDados.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel4.setText("Código Produto :");

        jLabel9.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel9.setText("UM:");

        jLabel22.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel22.setText("Estoque Mínimo :");

        jLabel19.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel19.setText("Estoque Atual :");

        jLabel23.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel23.setText("Estoque Máximo :");

        txtEstoqueMinimo.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        txtEstoqueMinimo.setForeground(new java.awt.Color(204, 0, 0));
        txtEstoqueMinimo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        txtEstoqueMinimo.setText("0");

        txtEstoqueMaximo.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        txtEstoqueMaximo.setForeground(new java.awt.Color(0, 51, 204));
        txtEstoqueMaximo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        txtEstoqueMaximo.setText("0");

        txtEstoqueAtual.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        txtEstoqueAtual.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        txtEstoqueAtual.setText("0");

        jLabel24.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel24.setText("Preço de Venda:");

        lbVenda.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lbVenda.setForeground(new java.awt.Color(0, 51, 204));
        lbVenda.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbVenda.setText("0,00");

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Histórico de Vendas (5 Últimas)", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 12))); // NOI18N

        grVendas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Data", "Pedido", "Cliente", "Quantidade", "Valor Unitário"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(grVendas);
        grVendas.getColumnModel().getColumn(0).setPreferredWidth(60);
        grVendas.getColumnModel().getColumn(1).setPreferredWidth(40);
        grVendas.getColumnModel().getColumn(2).setPreferredWidth(300);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Histórico de Vendas (5 Últimas)", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 12))); // NOI18N

        grLotes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Número Lote", "Qtde."
            }
        ));
        jScrollPane1.setViewportView(grLotes);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addContainerGap())
        );

        txtCodigoProduto.setEditable(false);
        txtCodigoProduto.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N

        txtDescricao.setEditable(false);
        txtDescricao.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N

        txtUM.setEditable(false);
        txtUM.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N

        javax.swing.GroupLayout pnlDadosLayout = new javax.swing.GroupLayout(pnlDados);
        pnlDados.setLayout(pnlDadosLayout);
        pnlDadosLayout.setHorizontalGroup(
            pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDadosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlDadosLayout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel23))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtEstoqueAtual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtEstoqueMinimo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtEstoqueMaximo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDadosLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCodigoProduto, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtUM, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        pnlDadosLayout.setVerticalGroup(
            pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDadosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtCodigoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9)
                        .addComponent(txtUM, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlDadosLayout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtEstoqueAtual)
                            .addComponent(jLabel19))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel22)
                            .addComponent(txtEstoqueMinimo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel23)
                            .addComponent(txtEstoqueMaximo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel24)
                            .addComponent(lbVenda))
                        .addGap(21, 21, 21))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDadosLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        tbPai.addTab("Dados do Produto", pnlDados);

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));

        btnPesquisar.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        btnPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Localizar.gif"))); // NOI18N
        btnPesquisar.setBorderPainted(false);
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        btnSair.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Sair.gif"))); // NOI18N
        btnSair.setBorderPainted(false);
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        txtUnidadeMedida.setToolTipText("F3 - Pesquisa");
        txtUnidadeMedida.setEnabled(false);
        txtUnidadeMedida.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtUnidadeMedidaFocusLost(evt);
            }
        });
        txtUnidadeMedida.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUnidadeMedidaKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtUnidadeMedidaKeyReleased(evt);
            }
        });

        lbID.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lbID.setText("0");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(233, 233, 233)
                .addComponent(txtUnidadeMedida, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbID)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtUnidadeMedida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbID)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(tbPai)
            .addComponent(jToolBar1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tbPai, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    public void limpaCampos(){
        lbID.setText("0");
        txtDescricao.setText(null);
        txtCodigoProduto.setText(null);

        txtUnidadeMedida.setText(null);
        txtEstoqueMinimo.setText("0");
        txtEstoqueMaximo.setText("0");
        txtEstoqueAtual.setText("0");
        txtUM.setText(null);

        DefaultTableModel tableModel =(DefaultTableModel) grLotes.getModel();
        tableModel.setNumRows(0);

    }
    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
    
    }//GEN-LAST:event_formWindowActivated

    private void txtUnidadeMedidaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUnidadeMedidaKeyReleased
        // TODO add your handling code here:
      
    }//GEN-LAST:event_txtUnidadeMedidaKeyReleased

    private void txtUnidadeMedidaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUnidadeMedidaFocusLost
        // TODO add your handling code here:
       if(!txtUnidadeMedida.getText().equals(""))
       {
          String vmCampos = "*";
          String vmCondicao_Consulta = " WHERE unid_codigo_id = " + txtUnidadeMedida.getText();
          try
        {
        rsUnidade = AcessoDados.Selecao("unidade_de_medida", vmCampos, vmCondicao_Consulta);
        if (!rsUnidade.next())
        {
            JOptionPane.showMessageDialog(null,"Unidade de Medida não cadastrada no sistema");
            txtUnidadeMedida.setText(null);
            txtUM.setText(null);
            txtUnidadeMedida.requestFocus();
            return;
        }
        txtUM.setText(rsUnidade.getString("unid_unidade"));
        rsUnidade.close();
          }catch (Exception e) {
           e.printStackTrace();
        }

       }
       else
          txtUM.setText(null);

    }//GEN-LAST:event_txtUnidadeMedidaFocusLost

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        // TODO add your handling code here:
       limpaCampos();
         variaveis.xColuna1 = "prod_codigo_id";
         variaveis.xColuna2 = "prod_codigo_produto";
         variaveis.xColuna3 = "prod_descricao";
         variaveis.xColuna4 = "prod_descricao_generica";
         variaveis.xColuna5 = "''";
         variaveis.xColuna6 = "''";
         variaveis.xColuna7 = "''";
         variaveis.xColuna8 = "''";
         variaveis.xColuna9 = "''";
         
         variaveis.xColunaNome1 = "Código";
         variaveis.xColunaNome2 = "Cód Produto";
         variaveis.xColunaNome3 = "Descrição";
         variaveis.xColunaNome4 = "Descrição Genérica";
         variaveis.xColunaNome5 = "";
         variaveis.xColunaNome6 = "";
         variaveis.xColunaNome7 = "";
         variaveis.xColunaNome8 = "";
         variaveis.xColunaNome9 = "";
         
         variaveis.xColunaTamanho1 = 60;
         variaveis.xColunaTamanho2 = 80;
         variaveis.xColunaTamanho3 = 400;
         variaveis.xColunaTamanho4 = 300;
         variaveis.xColunaTamanho5 = 0;
         variaveis.xColunaTamanho6 = 0;
         variaveis.xColunaTamanho7 = 0;
         variaveis.xColunaTamanho8 = 0;
         variaveis.xColunaTamanho9 = 0;
         
         variaveis.xColunaStart = "prod_descricao";
         variaveis.xColunaNomeStart = "Descrição";
         variaveis.xTabela = "produtos";
         variaveis.xSql = ""; 
         
         FpesqPesquisa md = new FpesqPesquisa(null, true);
         Dimension d = new Dimension();   
         d.setSize(850, 480); 
         md.setSize(d);
         
         md.setTitle("Pesquisa Produto - ENTER ou DUPLO CLICK no registro retorna dados.");

         md.setLocationRelativeTo(null);
         md.setVisible(true);
       lbID.setText((String) md.getRetorno());
       tbPai.setSelectedIndex(0);
       if(!lbID.getText().equals(""))
       {
          String vmCampos = "*";
          String vmCondicao_Consulta = " WHERE prod_codigo_id = " + lbID.getText();
          try
        {
        rs = AcessoDados.Selecao("produtos", vmCampos, vmCondicao_Consulta);
        rs.next();
        txtCodigoProduto.setText(rs.getString("prod_codigo_produto"));
        txtDescricao.setText(rs.getString("prod_descricao"));
        txtUnidadeMedida.setText(rs.getString("prod_unid_codigo_id"));
        txtUnidadeMedidaFocusLost(null);
        txtEstoqueMinimo.setText(funcoes.formataNumero(rs.getString("prod_estoque_minimo").replace(".", ","),txtUM.getText()));
        txtEstoqueMaximo.setText(funcoes.formataNumero(rs.getString("prod_estoque_maximo").replace(".", ","),txtUM.getText()));
        lbVenda.setText(funcoes.formataMoeda(rs.getString("prod_preco_venda"),"BD"));

        
        Lotes();
        UltimasVendas();
        rs.close();
          }catch (Exception e) {
           e.printStackTrace();
        }
       }
    }//GEN-LAST:event_btnPesquisarActionPerformed

    public void UltimasVendas()
    {
        DefaultTableModel tableModel =(DefaultTableModel) grVendas.getModel();
        tableModel.setNumRows(0);

        String vmCampos = " PED_CODIGO_ID, PAR_NOME_RAZAO_SOCIAL, "+
                         "PROD_DESCRICAO, " +
                         "PED_DATA_FATURAMENTO," +
                         "ITEM_PED_QUANTIDADE, " +
                         "item_ped_valor_unitario "; 
       String vmCondicao_Consulta = " INNER JOIN PEDIDOS ON (PED_PAR_CODIGO_ID = PAR_CODIGO_ID) "+
                                    "INNER JOIN ITEM_PEDIDO ON (ITEM_PED_PEDIDO_CODIGO_ID = PED_CODIGO_ID) "+
                                    "INNER JOIN PRODUTOS ON (ITEM_PED_PROD_CODIGO_ID = PROD_CODIGO_ID) "+
                                    "WHERE PED_DATA_FATURAMENTO IS NOT NULL "+
                                    "AND ITEM_PED_PROD_CODIGO_ID = " + lbID.getText()  +
               " ORDER BY PED_CODIGO_ID DESC LIMIT 5 ";
       
        try
        {
        rs = AcessoDados.Selecao("PARCEIROS", vmCampos, vmCondicao_Consulta);
        javax.swing.table.DefaultTableModel dtm = (javax.swing.table.DefaultTableModel)grVendas.getModel();
        double vTotalEstoque = 0;
        while (rs.next())
        {
            dtm.addRow(new Object[]{funcoes.formataData(rs.getString("PED_DATA_FATURAMENTO")),
                                    rs.getString("PED_CODIGO_ID"),
                                    rs.getString("PAR_NOME_RAZAO_SOCIAL"),
                                    rs.getString("ITEM_PED_QUANTIDADE"),
                                    funcoes.formataMoeda(rs.getString("ITEM_PED_VALOR_UNITARIO"),"BD") });
            
        }
        DefaultTableCellRenderer esquerda = new DefaultTableCellRenderer();
        DefaultTableCellRenderer centralizado = new DefaultTableCellRenderer();
        DefaultTableCellRenderer direita = new DefaultTableCellRenderer();

        esquerda.setHorizontalAlignment(SwingConstants.LEFT);
        centralizado.setHorizontalAlignment(SwingConstants.CENTER);
        direita.setHorizontalAlignment(SwingConstants.RIGHT);

        rs.close();

        }catch (Exception e) {
           e.printStackTrace();
        }

        
    }
    
    public void Lotes()
    {
        DefaultTableModel tableModel =(DefaultTableModel) grLotes.getModel();
        tableModel.setNumRows(0);

        String vmCampos = "*";
        String vmCondicao_Consulta = " WHERE lot_prod_codigo_id = " + lbID.getText();
        try
        {
            rs = AcessoDados.Selecao("lotes", vmCampos, vmCondicao_Consulta);
            grLotes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {},
            new String [] {"Número Lote", "Qtde"
            }) { boolean[]  canEdit = new boolean [] {
                false, false
            };
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }

        });
        javax.swing.table.DefaultTableModel dtm = (javax.swing.table.DefaultTableModel)grLotes.getModel();
        double vTotalEstoque = 0;
        while (rs.next())
        {
            dtm.addRow(new Object[]{rs.getString("lot_numero_lot"),
                                    funcoes.formataNumero(rs.getString("lot_qtde").replace(".",","), txtUM.getText())});
            vTotalEstoque += rs.getDouble("lot_qtde");
        }
        DefaultTableCellRenderer esquerda = new DefaultTableCellRenderer();
        DefaultTableCellRenderer centralizado = new DefaultTableCellRenderer();
        DefaultTableCellRenderer direita = new DefaultTableCellRenderer();

        esquerda.setHorizontalAlignment(SwingConstants.LEFT);
        centralizado.setHorizontalAlignment(SwingConstants.CENTER);
        direita.setHorizontalAlignment(SwingConstants.RIGHT);

        //grLotes.getColumnModel().getColumn(1).setCellRenderer(direita);

        rs.close();
        DecimalFormat nf = new DecimalFormat("##,##0");
        txtEstoqueAtual.setText(funcoes.formataNumero(String.valueOf(vTotalEstoque).replace(".", ","), txtUM.getText()));

        }catch (Exception e) {
           e.printStackTrace();
        }

    }
    private void txtUnidadeMedidaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUnidadeMedidaKeyPressed
        // TODO add your handling code here:

    }//GEN-LAST:event_txtUnidadeMedidaKeyPressed
    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FrmUsuario dialog = new FrmUsuario(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnSair;
    private javax.swing.JTable grLotes;
    private javax.swing.JTable grVendas;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel lbID;
    private javax.swing.JLabel lbVenda;
    private javax.swing.JPanel pnlDados;
    private javax.swing.JTabbedPane tbPai;
    private javax.swing.JTextField txtCodigoProduto;
    private javax.swing.JTextField txtDescricao;
    private javax.swing.JLabel txtEstoqueAtual;
    private javax.swing.JLabel txtEstoqueMaximo;
    private javax.swing.JLabel txtEstoqueMinimo;
    private javax.swing.JTextField txtUM;
    private javax.swing.JTextField txtUnidadeMedida;
    // End of variables declaration//GEN-END:variables

}
