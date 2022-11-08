/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view.supervisor.Relatorios.OS;

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
import java.util.HashMap;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.plaf.FontUIResource;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import model.ClassePedido;
import model.ClasseSupervisor;
import view.PrimeiraTelaSupervisor;
import view.supervisor.OSs.TabelaTodasAsOS2;
import view.supervisor.Relatorios.paginaUmRelatorios;
import view.supervisor.paginaInicialSuperv1;

/**
 *
 * @author Users
 */
public class GerenciaDeOS extends javax.swing.JFrame {
    static ClasseSupervisor supervisor;
    Font font = new Font("Dialog", Font.PLAIN, 16);
    DefaultTableModel model;
    DefaultTableModel model2;
    int valorJB2 = ControllerPedidos.getQuantPedidosFinalizados() * 100 / ped.size();
    static int totalDeOS = ControllerPedidos.getPedidos().size();
    static int quantEsperaMateriais = ControllerPedidos.getPedidosAguardandoMateriais().size();
    static int quantNaoValidados = ControllerPedidos.getPedidosAindaNaoAprovadosPorEstoeuistas().size();
    static ArrayList<ClassePedido> pedidoPerto = ControllerPedidos.pegaProximoDeFinalizarDuasSemanas(ControllerPedidos.getPedidos());
    static int tot = ControllerPedidos.pegaProximoDeFinalizarDuasSemanas(ControllerPedidos.getPedidos()).size();
    static int pertoDeFinalizar = tot * 100 / totalDeOS;
    
    public GerenciaDeOS() {
        initComponents();
        setBackground(new Color(1.0f, 1.0f, 1.0f, 0.0f));
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
        aEsperaMateriais.setValue(quantEsperaMateriais*100/totalDeOS);
        aindaNaoAprovados.setValue(quantNaoValidados*100/totalDeOS);
    }
    static ArrayList<ClassePedido> ped;
    public static void getSupervisorUsuario(ClasseSupervisor sup){
        supervisor = sup;
    }
    public static void adcDados(ArrayList<ClassePedido> p){
        ped = p;   
    }
    
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
        fundoDOMAIN2 = new view.NEWMAIN.FundoDOMAIN();
        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jProgressBar2 = new javax.swing.JProgressBar();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        fundoDOMAIN3 = new view.NEWMAIN.FundoDOMAIN();
        jLabel1 = new javax.swing.JLabel();
        fundoDOMAIN4 = new view.NEWMAIN.FundoDOMAIN();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        separadorR1 = new view.NEWMAIN.Relatorios.SeparadorR();
        fundoDOMAIN5 = new view.NEWMAIN.FundoDOMAIN();
        aindaNaoAprovados = new javax.swing.JProgressBar();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        aEsperaMateriais = new javax.swing.JProgressBar();
        jButton4 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        fundoDOMAIN6 = new view.NEWMAIN.FundoDOMAIN();
        Aviso = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jProgressBar6 = new javax.swing.JProgressBar();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();

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

        fundoDOMAIN2.setBackground(new java.awt.Color(255, 255, 255));
        fundoDOMAIN2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jProgressBar1.setStringPainted(true);
        jProgressBar1.setValue(100 - valorJB2);
        fundoDOMAIN2.add(jProgressBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 300, 30));

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Estado das Ordens:");
        fundoDOMAIN2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, -1, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Ordens a finalizar:");
        fundoDOMAIN2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Ordens Finalizadas:");
        fundoDOMAIN2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        jProgressBar2.setStringPainted(true);

        jProgressBar2.setValue(valorJB2);
        fundoDOMAIN2.add(jProgressBar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 300, 30));

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        int helper = ped.size() - ControllerPedidos.getQuantPedidosFinalizados();
        jLabel5.setText(Integer.toString(helper));
        fundoDOMAIN2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 140, 210, -1));

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText(Integer.toString(ControllerPedidos.getQuantPedidosFinalizados()));
        fundoDOMAIN2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 80, 210, -1));

        fundoDOMAIN1.add(fundoDOMAIN2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, 690, 210));

        fundoDOMAIN3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Ordens de Serviço cadastradas no sistema: "+ped.size());

        javax.swing.GroupLayout fundoDOMAIN3Layout = new javax.swing.GroupLayout(fundoDOMAIN3);
        fundoDOMAIN3.setLayout(fundoDOMAIN3Layout);
        fundoDOMAIN3Layout.setHorizontalGroup(
            fundoDOMAIN3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1680, Short.MAX_VALUE)
            .addGroup(fundoDOMAIN3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(fundoDOMAIN3Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1656, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        fundoDOMAIN3Layout.setVerticalGroup(
            fundoDOMAIN3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
            .addGroup(fundoDOMAIN3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fundoDOMAIN3Layout.createSequentialGroup()
                    .addContainerGap(23, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addContainerGap(23, Short.MAX_VALUE)))
        );

        fundoDOMAIN1.add(fundoDOMAIN3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 1680, 70));

        fundoDOMAIN4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel8.setText("jLabel8");

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Ordens cadastradas por carreta:");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Carreta", "Quantidade"
            }
        ));
        ArrayList<String> carretas = ControllerPedidos.getCarretas();
        HashMap<String, Object> quantityPerCarreta = ControllerPedidos.getQuantPorCarreta(carretas);
        model =(DefaultTableModel) jTable1.getModel();
        model.setNumRows(0);
        if(carretas != null){
            for(int i = 0; i < carretas.size(); i++){
                if(!carretas.get(i).equals("0")){
                    model.addRow(new Object[] {

                        carretas.get(i),
                        quantityPerCarreta.get(carretas.get(i)),
                    });
                }
                else{
                    model.addRow(new Object[] {

                        "nulo",
                        quantityPerCarreta.get(carretas.get(i)),
                    });
                }
            }

        }

        Action visu = new AbstractAction()
        {
            public void actionPerformed(ActionEvent e)
            {
                JTable table = (JTable)e.getSource();
                int modelRow = Integer.valueOf(e.getActionCommand());
                TabelaTodasAsOS2.getSupervisorUsuario(supervisor);
                if(!carretas.get(modelRow).equals("0"))
                TabelaTodasAsOS2.adcDados(ControllerPedidos.getOSbyCarreta(carretas.get(modelRow)));
                else
                TabelaTodasAsOS2.adcDados(ControllerPedidos.getOSbyCarreta(null));
                new TabelaTodasAsOS2().setVisible(true);
                dispose();
            }
        };

        ButtonColumn buttonColumn = new ButtonColumn(jTable1, visu, 0);
        buttonColumn.setMnemonic(KeyEvent.VK_D);
        UIManager.put("Table1.font", 14);
        JTableHeader tableHeader = jTable1.getTableHeader();
        Font headerFont = new Font("Verdana", Font.PLAIN, 14);
        tableHeader.setFont(headerFont);
        jTable1.setFont(new Font("Dialog", Font.PLAIN, 14));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout fundoDOMAIN4Layout = new javax.swing.GroupLayout(fundoDOMAIN4);
        fundoDOMAIN4.setLayout(fundoDOMAIN4Layout);
        fundoDOMAIN4Layout.setHorizontalGroup(
            fundoDOMAIN4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(fundoDOMAIN4Layout.createSequentialGroup()
                .addGroup(fundoDOMAIN4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fundoDOMAIN4Layout.createSequentialGroup()
                        .addGap(204, 204, 204)
                        .addComponent(jLabel7))
                    .addGroup(fundoDOMAIN4Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 642, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
            .addGroup(fundoDOMAIN4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(fundoDOMAIN4Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel8)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        fundoDOMAIN4Layout.setVerticalGroup(
            fundoDOMAIN4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fundoDOMAIN4Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
            .addGroup(fundoDOMAIN4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(fundoDOMAIN4Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel8)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        fundoDOMAIN1.add(fundoDOMAIN4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 400, 690, 520));
        fundoDOMAIN1.add(separadorR1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 50, 100, 900));

        fundoDOMAIN5.setBackground(new java.awt.Color(255, 255, 255));
        fundoDOMAIN5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        aindaNaoAprovados.setStringPainted(true);
        aindaNaoAprovados.setValue(100 - valorJB2);
        fundoDOMAIN5.add(aindaNaoAprovados, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 130, 390, 30));

        jLabel10.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Outros dados:");
        fundoDOMAIN5.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 30, -1, -1));

        jLabel11.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Ordens que não foram aprovadas pelos estoquistas:");
        fundoDOMAIN5.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        jLabel12.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Ordens que esperam materiais do estoque:");
        fundoDOMAIN5.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));

        aEsperaMateriais.setStringPainted(true);

        aEsperaMateriais.setValue(valorJB2);
        fundoDOMAIN5.add(aEsperaMateriais, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 80, 390, 30));

        jButton4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jButton4.setText("Ver");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        fundoDOMAIN5.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 80, -1, -1));

        jButton10.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jButton10.setText("Ver");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        fundoDOMAIN5.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 130, -1, -1));

        fundoDOMAIN1.add(fundoDOMAIN5, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 730, 960, 190));

        fundoDOMAIN6.setBackground(new java.awt.Color(255, 255, 255));
        fundoDOMAIN6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Aviso.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Aviso.setForeground(new java.awt.Color(153, 153, 153));
        Aviso.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        if(pedidoPerto.size() > 0){
            Aviso.setVisible(false);
        }
        Aviso.setText("Aqui aparecem as OS que foram cadastradas em um intervalo de duas semanas");
        fundoDOMAIN6.add(Aviso, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 290, 920, -1));

        jLabel13.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Ordens cadastradas nas últimas duas semanas");
        fundoDOMAIN6.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(275, 23, -1, -1));

        jProgressBar6.setStringPainted(true);
        jProgressBar6.setValue(pertoDeFinalizar);
        fundoDOMAIN6.add(jProgressBar6, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 78, 434, 30));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Título", "Data"
            }
        ));
        model2 =(DefaultTableModel) jTable2.getModel();
        model2.setNumRows(0);

        if(pedidoPerto != null){
            for(int i = 0; i < pedidoPerto.size(); i++){
                model2.addRow(new Object[] {
                    pedidoPerto.get(i).getTitulo(),
                    pedidoPerto.get(i).getDiaMesAno(pedidoPerto.get(i).getData().toString()).replaceAll(" ", "/"),
                });
            }
        }
        UIManager.put("Table1.font", 14);
        JTableHeader tableHeader2 = jTable2.getTableHeader();
        Font headerFont2 = new Font("Verdana", Font.PLAIN, 14);
        tableHeader2.setFont(headerFont2);
        jTable2.setFont(new Font("Dialog", Font.PLAIN, 14));
        jScrollPane2.setViewportView(jTable2);

        fundoDOMAIN6.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 155, 939, 326));

        jLabel14.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Quantidade:");
        fundoDOMAIN6.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 78, -1, -1));

        jLabel15.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("(" + pedidoPerto.size() + ")");
        fundoDOMAIN6.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(676, 78, 275, -1));

        jButton11.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jButton11.setText("Todas");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        fundoDOMAIN6.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 120, -1, -1));

        jButton12.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jButton12.setText("Finalizadas");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        fundoDOMAIN6.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, -1, -1));

        jButton13.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jButton13.setText("Não finalizadas");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        fundoDOMAIN6.add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        fundoDOMAIN1.add(fundoDOMAIN6, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 170, 960, 540));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(fundoDOMAIN1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fundoDOMAIN1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if(quantEsperaMateriais != 0){
            TabelaTodasAsOS2.getSupervisorUsuario(supervisor);
            TabelaTodasAsOS2.adcDados(ControllerPedidos.getPedidosAguardandoMateriais());
            new TabelaTodasAsOS2().setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        if(quantNaoValidados != 0){
            TabelaTodasAsOS2.getSupervisorUsuario(supervisor);
            TabelaTodasAsOS2.adcDados(ControllerPedidos.getPedidosAindaNaoAprovadosPorEstoeuistas());
            new TabelaTodasAsOS2().setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        //todos


        pedidoPerto = ControllerPedidos.pegaProximoDeFinalizarDuasSemanas(ControllerPedidos.getPedidos());
        
        pertoDeFinalizar = pedidoPerto.size() * 100 / totalDeOS;
        jProgressBar6.setValue(pertoDeFinalizar);
        jLabel15.setText(Integer.toString(pedidoPerto.size()));
        
        model2.setNumRows(0);
        
        if(pedidoPerto != null){
            for(int i = 0; i < pedidoPerto.size(); i++){
                model2.addRow(new Object[] {
                    pedidoPerto.get(i).getTitulo(),
                    pedidoPerto.get(i).getDiaMesAno(pedidoPerto.get(i).getData().toString()).replaceAll(" ", "/"),
                });
            }
        }
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        pedidoPerto = ControllerPedidos.pegaProximoDeFinalizarDuasSemanas(ControllerPedidos.getPedidosFinalizados());
        
        pertoDeFinalizar = pedidoPerto.size() * 100 / totalDeOS;
        jProgressBar6.setValue(pertoDeFinalizar);
        jLabel15.setText(Integer.toString(pedidoPerto.size()));
        
        
        model2.setNumRows(0);
        
        if(pedidoPerto != null){
            for(int i = 0; i < pedidoPerto.size(); i++){
                model2.addRow(new Object[] {
                    pedidoPerto.get(i).getTitulo(),
                    pedidoPerto.get(i).getDiaMesAno(pedidoPerto.get(i).getData().toString()).replaceAll(" ", "/"),
                });
            }
        }
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        //pedidoPerto.size()
        pedidoPerto = ControllerPedidos.pegaProximoDeFinalizarDuasSemanas(ControllerPedidos.getPedidosNaoFinalizados());
        
        pertoDeFinalizar = pedidoPerto.size() * 100 / totalDeOS;
        jProgressBar6.setValue(pertoDeFinalizar);
        jLabel15.setText(Integer.toString(pedidoPerto.size()));
        
        model2.setNumRows(0);
        
        if(pedidoPerto != null){
            for(int i = 0; i < pedidoPerto.size(); i++){
                model2.addRow(new Object[] {
                    pedidoPerto.get(i).getTitulo(),
                    pedidoPerto.get(i).getDiaMesAno(pedidoPerto.get(i).getData().toString()).replaceAll(" ", "/"),
                });
            }
        }
    }//GEN-LAST:event_jButton13ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GerenciaDeOS().setVisible(true);
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
    private javax.swing.JLabel Aviso;
    private javax.swing.JProgressBar aEsperaMateriais;
    private javax.swing.JProgressBar aindaNaoAprovados;
    private view.NEWMAIN.FundoDOMAIN fundoDOMAIN1;
    private view.NEWMAIN.FundoDOMAIN fundoDOMAIN2;
    private view.NEWMAIN.FundoDOMAIN fundoDOMAIN3;
    private view.NEWMAIN.FundoDOMAIN fundoDOMAIN4;
    private view.NEWMAIN.FundoDOMAIN fundoDOMAIN5;
    private view.NEWMAIN.FundoDOMAIN fundoDOMAIN6;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JProgressBar jProgressBar2;
    private javax.swing.JProgressBar jProgressBar6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private view.NEWMAIN.SeparadorPrincipal separadorPrincipal1;
    private view.NEWMAIN.Relatorios.SeparadorR separadorR1;
    // End of variables declaration//GEN-END:variables
}
