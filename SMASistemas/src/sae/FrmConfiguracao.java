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
import Classes.claFuncoes;
import javax.swing.JOptionPane;
import Classes.claVariaveis;
import Classes.claAcessoDados;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

/**
 *
 * @author Thiago
 */
public class FrmConfiguracao extends javax.swing.JDialog {
    claVariaveis variaveis = new claVariaveis();
    claAcessoDados AcessoDados = new claAcessoDados();
    claFuncoes funcoes = new claFuncoes();
    private ResultSet rs;


    /** Creates new form FrmUsuario */
    public FrmConfiguracao(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        funcoes.F_AtribuirClasse(rootPane);
        btnSalvar.setFocusTraversalKeysEnabled(false);
    }
 
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        btnAlterar = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnPesquisaUsuario = new javax.swing.JButton();
        jToolBar1 = new javax.swing.JToolBar();
        lbStatus = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        lbID = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtCodigoID = new javax.swing.JTextField();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        tbSeguranca = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        jComboBox5 = new javax.swing.JComboBox();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Configuração");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/alterar.gif"))); // NOI18N
        btnAlterar.setToolTipText("Alterar");
        btnAlterar.setBorderPainted(false);
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Sair.gif"))); // NOI18N
        btnSair.setToolTipText("Voltar");
        btnSair.setBorderPainted(false);
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/salvar.gif"))); // NOI18N
        btnSalvar.setToolTipText("Salvar");
        btnSalvar.setBorderPainted(false);
        btnSalvar.setEnabled(false);
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/cancelar.gif"))); // NOI18N
        btnCancelar.setToolTipText("Cancelar");
        btnCancelar.setBorderPainted(false);
        btnCancelar.setEnabled(false);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnPesquisaUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Pesquisar.gif"))); // NOI18N
        btnPesquisaUsuario.setToolTipText("Pesquisar");
        btnPesquisaUsuario.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnPesquisaUsuario.setBorderPainted(false);
        btnPesquisaUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisaUsuarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPesquisaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(btnPesquisaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jToolBar1.setFloatable(false);
        jToolBar1.setRollover(true);

        lbStatus.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        lbStatus.setForeground(new java.awt.Color(153, 153, 153));
        lbStatus.setText("Registro ");
        lbStatus.setToolTipText("");
        jToolBar1.add(lbStatus);

        txtNome.setEditable(false);
        txtNome.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        txtNome.setToolTipText("");
        txtNome.setDisabledTextColor(new java.awt.Color(153, 153, 153));
        txtNome.setEnabled(false);
        txtNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNomeKeyReleased(evt);
            }
        });

        lbID.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lbID.setForeground(javax.swing.UIManager.getDefaults().getColor("ComboBox.background"));
        lbID.setText("0");

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel1.setText("Usuário:");
        jLabel1.setToolTipText("");

        txtCodigoID.setColumns(5);
        txtCodigoID.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        txtCodigoID.setToolTipText("");
        txtCodigoID.setEnabled(false);

        jTabbedPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Permissões / Restrições", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 12))); // NOI18N
        jTabbedPane1.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel2.setText("Exibir automáticamente a tela de NF-e ao faturar pedido:");

        jComboBox1.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SIM", "NÃO" }));
        jComboBox1.setToolTipText("");

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel3.setText("Marcar Contas Correntes automáticamente no Contas a Pagar:");

        jComboBox2.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SIM", "NÃO" }));
        jComboBox2.setToolTipText("");

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel4.setText("Marcar Contas Correntes automáticamente no Contas a Receber:");

        jComboBox3.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SIM", "NÃO" }));
        jComboBox3.setToolTipText("");

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel5.setText("Emitir Nota Fiscal Eletrônica em:");

        jComboBox4.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "PRODUÇÃO", "HOMOLOGAÇÃO" }));
        jComboBox4.setToolTipText("");

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel6.setText("Iniciar pedido como:");

        jComboBox5.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "V - Venda", "P - Pendente", "O - Orçamento" }));
        jComboBox5.setToolTipText("");

        javax.swing.GroupLayout tbSegurancaLayout = new javax.swing.GroupLayout(tbSeguranca);
        tbSeguranca.setLayout(tbSegurancaLayout);
        tbSegurancaLayout.setHorizontalGroup(
            tbSegurancaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tbSegurancaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tbSegurancaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(tbSegurancaLayout.createSequentialGroup()
                        .addGroup(tbSegurancaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(tbSegurancaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tbSegurancaLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(tbSegurancaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tbSegurancaLayout.createSequentialGroup()
                                .addGroup(tbSegurancaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(tbSegurancaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jComboBox1, 0, 1, Short.MAX_VALUE)
                                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(61, 61, 61))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tbSegurancaLayout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(127, Short.MAX_VALUE))
        );
        tbSegurancaLayout.setVerticalGroup(
            tbSegurancaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tbSegurancaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tbSegurancaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tbSegurancaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tbSegurancaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tbSegurancaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tbSegurancaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(190, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Faturamento", tbSeguranca);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 623, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 326, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("tab2", jPanel1);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 623, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 326, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("tab3", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCodigoID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNome))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 638, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbID))
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtCodigoID, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbID)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane1.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        //funcoes.limparTodosCampos(rootPane);
        txtNome.setText(null);
        txtCodigoID.setText(null);
        funcoes.HabilitaCampos(rootPane, false);
        btnAlterar.requestFocus();
        lbStatus.setText(" Registro");

    }//GEN-LAST:event_btnCancelarActionPerformed

    public void RemontaTabelas()
    {

    }
    private void txtNomeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomeKeyReleased
        // TODO add your handling code here:
         JTextField tf = (JTextField) evt.getComponent();
        if (evt.getKeyCode()!=32 & evt.getKeyCode()!=8 & evt.getKeyCode()!=37 & evt.getKeyCode()!=39)
            tf.setText(tf.getText().toUpperCase());
    }//GEN-LAST:event_txtNomeKeyReleased

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        // TODO add your handling code here:
        if (txtNome.getText().equals(null) || (txtNome.getText().equals("")))
        {
            JOptionPane.showMessageDialog(null,"Selecione um usuário antes de alterar.");
            return;
        }
        if(funcoes.Permissao("002", variaveis.usuario_id, variaveis.usuario_super, this.getTitle()))
        {

        

        variaveis.status = "A";
        lbStatus.setText("Alterando... ");
        }
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
    
    }//GEN-LAST:event_formWindowActivated

    private void btnPesquisaUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisaUsuarioActionPerformed
        // TODO add your handling code here:
        if(funcoes.Permissao("004", variaveis.usuario_id, variaveis.usuario_super, this.getTitle()))
        {

         variaveis.xColuna1 = "usu_codigo_id";
         variaveis.xColuna2 = "usu_nome";
         variaveis.xColuna3 = "''";
         variaveis.xColuna4 = "''";
         variaveis.xColuna5 = "''";
         variaveis.xColuna6 = "''";
         variaveis.xColuna7 = "''";
         variaveis.xColuna8 = "''";
         variaveis.xColuna9 = "''";
         
         variaveis.xColunaNome1 = "Código";
         variaveis.xColunaNome2 = "Nome";
         variaveis.xColunaNome3 = "''";
         variaveis.xColunaNome4 = "";
         variaveis.xColunaNome5 = "";
         variaveis.xColunaNome6 = "";
         variaveis.xColunaNome7 = "";
         variaveis.xColunaNome8 = "";
         variaveis.xColunaNome9 = "";
         
         variaveis.xColunaTamanho1 = 60;
         variaveis.xColunaTamanho2 = 400;
         variaveis.xColunaTamanho3 = 0;
         variaveis.xColunaTamanho4 = 0;
         variaveis.xColunaTamanho5 = 0;
         variaveis.xColunaTamanho6 = 0;
         variaveis.xColunaTamanho7 = 0;
         variaveis.xColunaTamanho8 = 0;
         variaveis.xColunaTamanho9 = 0;
         
         variaveis.xColunaStart = "usu_nome";
         variaveis.xColunaNomeStart = "Nome";
         variaveis.xTabela = "usuarios";
         variaveis.xSql = ""; 
         
         FpesqPesquisa md = new FpesqPesquisa(null, true);
         Dimension d = new Dimension();   
         d.setSize(470, 480); 
         md.setSize(d);
         
         md.setTitle("Pesquisa usuários - ENTER ou DUPLO CLICK no registro retorna dados.");

         md.setLocationRelativeTo(null);
         md.setVisible(true);

        if(!md.getRetorno().trim().equals("") ||!md.getRetorno().equals(null))
        {
        lbID.setText((String) md.getRetorno());
        txtCodigoID.setText((String) md.getRetorno());
        }
        txtCodigoID.requestFocus();
        if(!txtCodigoID.getText().equals("")) {
            String vmCampos = "*";
            String vmCondicao_Consulta = " WHERE usu_codigo_id = " + txtCodigoID.getText();
            try {
                rs = AcessoDados.Selecao("usuarios", vmCampos, vmCondicao_Consulta);
                rs.next();
                txtCodigoID.setText(rs.getString("usu_codigo_id"));
                txtNome.setText(rs.getString("usu_nome"));
                rs.close();
              
            }catch (Exception e) {
                e.printStackTrace();
            }
         }
        }
    }//GEN-LAST:event_btnPesquisaUsuarioActionPerformed

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
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnPesquisaUsuario;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JComboBox jComboBox4;
    private javax.swing.JComboBox jComboBox5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel lbID;
    private javax.swing.JLabel lbStatus;
    private javax.swing.JPanel tbSeguranca;
    private javax.swing.JTextField txtCodigoID;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables

}
