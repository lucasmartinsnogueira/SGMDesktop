/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view.supervisor.OSs;

import com.aspect.snoop.ui.canary.ButtonColumn;
import controler.ControllerPedidos;
import controler.ControllerUsuarios;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Enumeration;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.plaf.FontUIResource;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import model.ClassePedido;
import model.ClasseSupervisor;
import view.PrimeiraTelaSupervisor;
import view.supervisor.Relatorios.paginaUmRelatorios;
import view.supervisor.paginaInicialSuperv1;

/**
 *
 * @author Users
 */
public class TabelaTodasAsOS2 extends javax.swing.JFrame {
    static ClasseSupervisor supervisor;
    Font font = new Font("Dialog", Font.PLAIN, 16);
    DefaultTableModel m;
    public TabelaTodasAsOS2() {
        initComponents();
        setBackground(new Color(1.0f, 1.0f, 1.0f, 0.0f));
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
    }
    static ArrayList<ClassePedido> ped;
    public static void getSupervisorUsuario(ClasseSupervisor sup){
        supervisor = sup;
    }
    
    public static void adcDados(ArrayList<ClassePedido> p){
        ped = p;   
    }
    
    static JButton ver = new JButton("Visualizar");
    
    static ArrayList<String> tits = new ArrayList<>();
    public static void Titulos(){
        for(int i = 0; i< ped.size(); i++){
            tits.add(ped.get(i).getTitulo());
        }
        ver.setSize(100,45);
        ver.setVisible(true);
    }
    DefaultTableModel model;
//    AbstractTableModel model = new JTableButtonTest().getTableButtonModel(ver, tits);
    
    String idPedid = " ";
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fundoDOMAIN1 = new view.NEWMAIN.FundoDOMAIN();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        separadorPrincipal1 = new view.NEWMAIN.SeparadorPrincipal();
        separadorOS1 = new view.NEWMAIN.OS.SeparadorOS();
        fundoDOMAIN2 = new view.NEWMAIN.FundoDOMAIN();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        fundoDOMAIN1.setBackground(new java.awt.Color(229, 228, 228));
        fundoDOMAIN1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 129, 124));
        jLabel16.setText("S");
        fundoDOMAIN1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, -1, -1));

        jLabel17.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 227, 26));
        jLabel17.setText("G");
        fundoDOMAIN1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, -1, -1));

        jLabel18.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(102, 205, 249));
        jLabel18.setText("M");
        fundoDOMAIN1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, -1, -1));

        jLabel19.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("S");
        fundoDOMAIN1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, -1, -1));

        jLabel20.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("SGM - Sistema de Gestão da Mecânica");
        fundoDOMAIN1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, -1, -1));

        jButton2.setBorder(null);
        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        fundoDOMAIN1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 90, 80));
        jButton2.setToolTipText("Ordens de Serviço");

        jButton9.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        jButton9.setForeground(new java.awt.Color(102, 205, 249));
        jButton9.setText("O");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jButton9.setBorder(null);
        jButton9.setContentAreaFilled(false);
        fundoDOMAIN1.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1760, 10, -1, -1));

        jButton8.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        jButton8.setForeground(new java.awt.Color(255, 227, 26));
        jButton8.setText("O");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jButton8.setBorder(null);
        jButton8.setContentAreaFilled(false);
        fundoDOMAIN1.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1740, 10, -1, -1));

        jButton7.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 129, 124));
        jButton7.setText("O");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jButton7.setBorder(null);
        jButton7.setContentAreaFilled(false);
        fundoDOMAIN1.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1720, 10, -1, -1));

        jButton6.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("X");
        jButton6.setToolTipText("Fechar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jButton6.setBorder(null);
        jButton6.setContentAreaFilled(false);
        fundoDOMAIN1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1820, 10, -1, -1));

        jButton1.setBorder(null);
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        fundoDOMAIN1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 870, 90, 80));
        jButton1.setToolTipText("Sair");

        jButton3.setBorder(null);
        jButton3.setContentAreaFilled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        fundoDOMAIN1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 90, 80));
        jButton3.setToolTipText("Página inicial");

        jButton5.setBorder(null);
        jButton5.setContentAreaFilled(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        fundoDOMAIN1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 90, 80));
        jButton5.setToolTipText("Relatórios");
        fundoDOMAIN1.add(separadorPrincipal1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1880, 50));
        fundoDOMAIN1.add(separadorOS1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 50, 100, 900));

        fundoDOMAIN2.setBackground(new java.awt.Color(255, 255, 255));
        fundoDOMAIN2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Visualize as Ordens de Serviço do Sistema!");
        fundoDOMAIN2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 50, 710, 40));

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Ao clicar em visualizar, você será redirecionado(a) para a visualização da OS em questão e terá a possibilidade de removê-la");
        fundoDOMAIN2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 100, 800, 40));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Título", "ID", "Carreta", ""
            }
        ));
        UIManager.put("Table1.font", 14);
        model =(DefaultTableModel) jTable1.getModel();
        model.setNumRows(0);
        if(ped != null){
            for(int i = 0; i < ped.size(); i++){
                int carreta = ped.get(i).getCarreta();
                String carretaa = carreta == 0 ? "nulo" : Integer.toString(carreta);
                model.addRow(new Object[] {
                    ped.get(i).getTitulo(),
                    ped.get(i).getIdPedido(),
                    carretaa,
                    "Visualizar"
                });
            }
        }
        Action visu = new AbstractAction()
        {
            public void actionPerformed(ActionEvent e)
            {
                JTable table = (JTable)e.getSource();
                int modelRow = Integer.valueOf(e.getActionCommand());
                vizualizarOS.getSupervisorUsuario(supervisor);
                vizualizarOS.getOSparaValidar(ped.get(modelRow).getIdPedido());
                new vizualizarOS().setVisible(true);
                dispose();
            }
        };

        ButtonColumn buttonColumn = new ButtonColumn(jTable1, visu, 3);
        buttonColumn.setMnemonic(KeyEvent.VK_D);
        UIManager.put("Table1.font", 14);
        JTableHeader tableHeader = jTable1.getTableHeader();
        Font headerFont = new Font("Verdana", Font.PLAIN, 14);
        tableHeader.setFont(headerFont);
        jTable1.setFont(new Font("Dialog", Font.PLAIN, 14));
        jScrollPane1.setViewportView(jTable1);

        fundoDOMAIN2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, 1340, 580));

        fundoDOMAIN1.add(fundoDOMAIN2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, 1520, 790));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1880, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(fundoDOMAIN1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 950, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(fundoDOMAIN1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        TabelaTodasAsOS2.getSupervisorUsuario(supervisor);
        TabelaTodasAsOS2.adcDados(ControllerPedidos.getPedidos());
        new TabelaTodasAsOS2().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed

    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        this.setVisible(false);
        dispose();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new PrimeiraTelaSupervisor().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        paginaInicialSuperv1.getSupervisorUsuario(supervisor);
        paginaInicialSuperv1.adcDados(ControllerUsuarios.retornaUsuariosPorStatusDeValidacao(false));
        new paginaInicialSuperv1().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        paginaUmRelatorios.getSupervisorUsuario(supervisor);
        paginaUmRelatorios.adcDados();
        new paginaUmRelatorios().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TabelaTodasAsOS2().setVisible(true);
            }
        });
    }
    
    public void setDefaultFont(Font defaultFont){
        FontUIResource font = new FontUIResource(defaultFont);
        
        Enumeration uiManagerKeys = UIManager.getDefaults().keys();
        while(uiManagerKeys.hasMoreElements()){
            Object key   = uiManagerKeys.nextElement(),
            value = UIManager.get(key);

            if(null != value && value instanceof FontUIResource)
            UIManager.put(key, font);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private view.NEWMAIN.FundoDOMAIN fundoDOMAIN1;
    private view.NEWMAIN.FundoDOMAIN fundoDOMAIN2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private view.NEWMAIN.OS.SeparadorOS separadorOS1;
    private view.NEWMAIN.SeparadorPrincipal separadorPrincipal1;
    // End of variables declaration//GEN-END:variables
}
