package view.supervisor.Relatorios;

import view.supervisor.usuarios.*;
import com.aspect.snoop.ui.canary.ButtonColumn;
import controler.ControllerAdmin;
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
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.plaf.FontUIResource;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import model.ClasseSupervisor;
import model.ClasseUsuarios;
import view.PrimeiraTelaSupervisor;
import view.supervisor.OSs.TabelaTodasAsOS2;
import view.supervisor.Relatorios.OS.GerenciaDeOS;
import view.supervisor.paginaInicialSuperv1;

public class paginaUmRelatorios extends javax.swing.JFrame {
    static ClasseSupervisor supervisor;
    static String myaux = "abcdefgh";
    static int quantidade = 100;
    static int valorSupervisor = ControllerUsuarios.retornaUsuariosPorCategoria("Supervisor").size();
    static int valorEstoque = ControllerUsuarios.retornaUsuariosPorCategoria("Estoque").size();
    static int valorMecanico = ControllerUsuarios.retornaUsuariosPorCategoria("Mecânico").size();
    static int valorInvalidos = ControllerUsuarios.retornaUsuariosPorStatusDeValidacao(false).size();
    static int total1 = valorSupervisor + valorEstoque + valorMecanico;
    static int total2 = total1 + valorInvalidos;
    
    public paginaUmRelatorios() {
        initComponents();
        setBackground(new Color(1.0f, 1.0f, 1.0f, 0.0f));
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
        ControllerAdmin.conectar();
        
        int helpMe = (valorMecanico*100/total1) + (valorEstoque*100/total1);
        mecanico.setValue(valorMecanico*100/total1);
        estoquista.setValue(valorEstoque*100/total1);
        Supervisor.setValue(100 - helpMe);
        invalido.setValue(valorInvalidos*100/total2);
        
    }
    public static void getSupervisorUsuario(ClasseSupervisor sup){
        supervisor = sup;
    }
    
    /*para a tabela de validação*/
    static Font font = new Font("Dialog", Font.PLAIN, 14);//vai ser usado ao ser chamado pelo setDefaultFont
    DefaultTableModel model;
    static ArrayList<ClasseUsuarios> usr;
    public static void adcDados(){
        
        usr = ControllerUsuarios.retornaUsuariosPorStatusDeValidacao(true);
        quantidade = usr.size();
        setDefaultFont(font);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        fundoDOMAIN1 = new view.NEWMAIN.FundoDOMAIN();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        separadorPrincipal1 = new view.NEWMAIN.SeparadorPrincipal();
        fundoDOMAIN4 = new view.NEWMAIN.FundoDOMAIN();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        separadorR1 = new view.NEWMAIN.Relatorios.SeparadorR();
        fundoDOMAIN2 = new view.NEWMAIN.FundoDOMAIN();
        GerenciaOS = new javax.swing.JButton();
        fundoDOMAIN3 = new view.NEWMAIN.FundoDOMAIN();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        invalido = new javax.swing.JProgressBar();
        mecanico = new javax.swing.JProgressBar();
        Supervisor = new javax.swing.JProgressBar();
        estoquista = new javax.swing.JProgressBar();
        jLabel8 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SGM - Página inicial");
        setMinimumSize(new java.awt.Dimension(1130, 770));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fundoDOMAIN1.setBackground(new java.awt.Color(229, 228, 228));
        fundoDOMAIN1.setMinimumSize(new java.awt.Dimension(1940, 986));
        fundoDOMAIN1.setPreferredSize(new java.awt.Dimension(1940, 986));
        fundoDOMAIN1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 129, 124));
        jLabel11.setText("S");
        fundoDOMAIN1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, -1, -1));

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 227, 26));
        jLabel10.setText("G");
        fundoDOMAIN1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, -1, -1));

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(102, 205, 249));
        jLabel12.setText("M");
        fundoDOMAIN1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, -1, -1));

        jLabel13.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("S");
        fundoDOMAIN1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, -1, -1));

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

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("SGM - Sistema de Gestão da Mecânica");
        fundoDOMAIN1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, -1, -1));
        fundoDOMAIN1.add(separadorPrincipal1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1880, 50));

        fundoDOMAIN4.setBackground(new java.awt.Color(255, 255, 255));
        fundoDOMAIN4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 153, 153));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Aqui aparecerão os usuários do sistema");
        if(usr.size() > 0){
            jLabel7.setVisible(false);
        }
        fundoDOMAIN4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 1640, 40));

        jTable1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Email", "CPF", "Id de Usuário", "Categoria", ""
            }
        ));
        jTable1.setRowHeight(20);
        UIManager.put("Table1.font", 14);
        model =(DefaultTableModel) jTable1.getModel();
        model.setNumRows(0);
        if(usr != null){
            for(int i = 0; i < usr.size(); i++){
                model.addRow(new Object[] {
                    usr.get(i).getNome(),
                    usr.get(i).getEmail(),
                    usr.get(i).getCpf(),
                    usr.get(i).getId(),
                    usr.get(i).getCategoria(),
                    "Visualizar"
                });
            }
        }
        JTableHeader tableHeader = jTable1.getTableHeader();
        Font headerFont = new Font("Verdana", Font.PLAIN, 14);
        tableHeader.setFont(headerFont);
        jTable1.setFont(new Font("Dialog", Font.PLAIN, 14));

        Action validar = new AbstractAction()
        {
            public void actionPerformed(ActionEvent e)
            {
                JTable table = (JTable)e.getSource();
                int modelRow = Integer.valueOf(e.getActionCommand());
                atualizaUserFrame.getSupervisorUsuario(supervisor);
                atualizaUserFrame.getUsuParaVer(usr.get(modelRow));
                new atualizaUserFrame().setVisible(true);
            }
        };

        ButtonColumn buttonColumn = new ButtonColumn(jTable1, validar, 5);
        buttonColumn.setMnemonic(KeyEvent.VK_D);
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(14);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(14);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(14);
            jTable1.getColumnModel().getColumn(3).setPreferredWidth(14);
            jTable1.getColumnModel().getColumn(4).setPreferredWidth(14);
        }

        fundoDOMAIN4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 1660, 460));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Quantidade de usuários válidos no sistema: "+quantidade);
        fundoDOMAIN4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 700, 70));

        jTextField1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jTextField1.setText("Digite um nome...");
        fundoDOMAIN4.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 30, 280, -1));

        jButton4.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jButton4.setText("Pesquisar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        fundoDOMAIN4.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1460, 30, -1, -1));

        jButton10.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jButton10.setText("Cancelar");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        fundoDOMAIN4.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1590, 30, -1, -1));

        fundoDOMAIN1.add(fundoDOMAIN4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 370, 1700, 560));

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

        jButton2.setBorder(null);
        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        fundoDOMAIN1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 90, 80));
        jButton2.setToolTipText("Ordens de Serviço");

        jButton1.setBorder(null);
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        fundoDOMAIN1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 870, 90, 80));
        jButton1.setToolTipText("Sair");
        fundoDOMAIN1.add(separadorR1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 50, 100, 900));

        fundoDOMAIN2.setBackground(new java.awt.Color(255, 255, 255));
        fundoDOMAIN2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        GerenciaOS.setBackground(new java.awt.Color(0, 204, 153));
        GerenciaOS.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        GerenciaOS.setForeground(new java.awt.Color(255, 255, 255));
        GerenciaOS.setText("Ordens de Serviço");
        GerenciaOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GerenciaOSActionPerformed(evt);
            }
        });
        fundoDOMAIN2.add(GerenciaOS, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 510, 170));

        fundoDOMAIN1.add(fundoDOMAIN2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 90, 700, 250));

        fundoDOMAIN3.setBackground(new java.awt.Color(255, 255, 255));
        fundoDOMAIN3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Usuários do sistema:");
        fundoDOMAIN3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(357, 26, -1, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Mecânicos:");
        fundoDOMAIN3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, -1));

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Estoquistas:");
        fundoDOMAIN3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, -1));

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Supervisores:");
        fundoDOMAIN3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, -1, -1));

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Usuários inválidos:");
        fundoDOMAIN3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, -1, 25));

        invalido.setStringPainted(true);
        fundoDOMAIN3.add(invalido, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, 571, 25));

        mecanico.setStringPainted(true);
        fundoDOMAIN3.add(mecanico, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, 571, 25));

        Supervisor.setStringPainted(true);
        fundoDOMAIN3.add(Supervisor, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, 571, 25));

        estoquista.setStringPainted(true);
        fundoDOMAIN3.add(estoquista, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, 571, 25));

        jLabel8.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText(Integer.toString(valorInvalidos));
        fundoDOMAIN3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 210, -1, -1));

        jLabel14.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText(Integer.toString(valorMecanico));
        fundoDOMAIN3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 90, -1, -1));

        jLabel15.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText(Integer.toString(valorEstoque));
        fundoDOMAIN3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 130, -1, -1));

        jLabel16.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText(Integer.toString(valorSupervisor));
        fundoDOMAIN3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 170, -1, -1));

        fundoDOMAIN1.add(fundoDOMAIN3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 960, 250));

        getContentPane().add(fundoDOMAIN1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1880, 950));

        pack();
    }// </editor-fold>//GEN-END:initComponents
     
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        paginaInicialSuperv1.getSupervisorUsuario(supervisor);
        paginaInicialSuperv1.adcDados(ControllerUsuarios.retornaUsuariosPorStatusDeValidacao(false));
        new paginaInicialSuperv1().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new PrimeiraTelaSupervisor().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        TabelaTodasAsOS2.getSupervisorUsuario(supervisor);
        TabelaTodasAsOS2.adcDados(ControllerPedidos.getPedidos());
        new TabelaTodasAsOS2().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        this.setVisible(false);
        dispose();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed

    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        model.setNumRows(0);
        
        usr = ControllerUsuarios.retornaUsuariosPorNome(jTextField1.getText());
        if(usr != null){
            for(int i = 0; i < usr.size(); i++){
                model.addRow(new Object[] {
                    usr.get(i).getNome(),
                    usr.get(i).getEmail(),
                    usr.get(i).getCpf(),
                    usr.get(i).getId(),
                    usr.get(i).getCategoria(),
                    "Visualizar"
                });
            }
        }
        JTableHeader tableHeader = jTable1.getTableHeader();
        Font headerFont = new Font("Verdana", Font.PLAIN, 14);
        tableHeader.setFont(headerFont);
        jTable1.setFont(new Font("Dialog", Font.PLAIN, 14));


        Action validar = new AbstractAction()
            {
                public void actionPerformed(ActionEvent e)
                {
                    JTable table = (JTable)e.getSource();
                    int modelRow = Integer.valueOf(e.getActionCommand());
                    atualizaUserFrame.getSupervisorUsuario(supervisor);
                    atualizaUserFrame.getUsuParaVer(usr.get(modelRow));
                    new atualizaUserFrame().setVisible(true);
                }
            };

        ButtonColumn buttonColumn = new ButtonColumn(jTable1, validar, 5);
        buttonColumn.setMnemonic(KeyEvent.VK_D);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void GerenciaOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GerenciaOSActionPerformed
        GerenciaDeOS.getSupervisorUsuario(supervisor);
        GerenciaDeOS.adcDados(ControllerPedidos.getPedidos());
        new GerenciaDeOS().setVisible(true);
        dispose();
    }//GEN-LAST:event_GerenciaOSActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        model.setNumRows(0);
        
        usr = ControllerUsuarios.retornaUsuariosPorStatusDeValidacao(true);
        if(usr != null){
            for(int i = 0; i < usr.size(); i++){
                model.addRow(new Object[] {
                    usr.get(i).getNome(),
                    usr.get(i).getEmail(),
                    usr.get(i).getCpf(),
                    usr.get(i).getId(),
                    usr.get(i).getCategoria(),
                    "Visualizar"
                });
            }
        }
        JTableHeader tableHeader = jTable1.getTableHeader();
        Font headerFont = new Font("Verdana", Font.PLAIN, 14);
        tableHeader.setFont(headerFont);
        jTable1.setFont(new Font("Dialog", Font.PLAIN, 14));


        Action validar = new AbstractAction()
            {
                public void actionPerformed(ActionEvent e)
                {
                    JTable table = (JTable)e.getSource();
                    int modelRow = Integer.valueOf(e.getActionCommand());
                    atualizaUserFrame.getSupervisorUsuario(supervisor);
                    atualizaUserFrame.getUsuParaVer(usr.get(modelRow));
                    new atualizaUserFrame().setVisible(true);
                }
            };

        ButtonColumn buttonColumn = new ButtonColumn(jTable1, validar, 5);
        buttonColumn.setMnemonic(KeyEvent.VK_D);                                      
    }//GEN-LAST:event_jButton10ActionPerformed
    
    /*deixa as fontes do menu no tamanho 14*/
    public static void setDefaultFont(Font defaultFont){
        FontUIResource font = new FontUIResource(defaultFont);
        
        Enumeration uiManagerKeys = UIManager.getDefaults().keys();
        while(uiManagerKeys.hasMoreElements()){
            Object key   = uiManagerKeys.nextElement(),
            value = UIManager.get(key);

            if(null != value && value instanceof FontUIResource)
            UIManager.put(key, font);
        }
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new paginaUmRelatorios().setVisible(true);
            }
        });
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton GerenciaOS;
    private javax.swing.JProgressBar Supervisor;
    private javax.swing.JProgressBar estoquista;
    private view.NEWMAIN.FundoDOMAIN fundoDOMAIN1;
    private view.NEWMAIN.FundoDOMAIN fundoDOMAIN2;
    private view.NEWMAIN.FundoDOMAIN fundoDOMAIN3;
    private view.NEWMAIN.FundoDOMAIN fundoDOMAIN4;
    private javax.swing.JProgressBar invalido;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JProgressBar mecanico;
    private view.NEWMAIN.SeparadorPrincipal separadorPrincipal1;
    private view.NEWMAIN.Relatorios.SeparadorR separadorR1;
    // End of variables declaration//GEN-END:variables
}
