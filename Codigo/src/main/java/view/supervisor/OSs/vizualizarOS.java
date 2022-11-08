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
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Enumeration;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.plaf.FontUIResource;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import model.ClassePedido;
import model.ClasseSupervisor;
import model.ClasseUsuarios;
import util.Util;
import view.PrimeiraTelaSupervisor;
import view.supervisor.OSs.Imagem.ImagemAmpliada;
import view.supervisor.Relatorios.paginaUmRelatorios;
import view.supervisor.mecanicos.visualizaMecsPorOS;
import view.supervisor.paginaInicialSuperv1;
import view.supervisor.usuarios.atualizaUserFrame;

/**
 *
 * @author Users
 */
public class vizualizarOS extends javax.swing.JFrame {
    static ClasseSupervisor supervisor;
    static ImageIcon mecan;
    static ClassePedido pedidoAntigo;
    static ImageIcon ic;
    ArrayList<ClasseUsuarios> mec = new ArrayList<>();
    public vizualizarOS() {
        pegaMecs(pedidoAntigo.getIdPedido());
        initComponents();
        
        setBackground(new Color(1.0f, 1.0f, 1.0f, 0.0f));
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
        adicionarDados();
    }
    
    public static void getSupervisorUsuario(ClasseSupervisor sup){
        supervisor = sup;
    }

    public static void getOSparaValidar(String id){
        pedidoAntigo = ControllerPedidos.getPedidosPorId(id);
    }
    
    private void pegaMecs(String id){
        mec = ControllerPedidos.pegaMecanicosOS(id);
        System.out.println(mec.get(0).getCategoria());
        String caminho = Util.mecanico;
        try{
            mecan = new ImageIcon(Util.imgFromInternet(caminho));
            int[] dim = Util.getScaledDimension(mecan, 188, 123);

            Image img = mecan.getImage().getScaledInstance(dim[0], dim[1], Image.SCALE_DEFAULT);
            mecan = new ImageIcon(img);
        }catch(Exception e){
            e.printStackTrace();
        }
        
    }
    
    DefaultTableModel m;
    int size = mec.size();
    static ArrayList<ClassePedido> ped;
    ClasseUsuarios supervisorDaOS = ControllerUsuarios.retornaUsuarioPorId(pedidoAntigo.getIdSupervisor());
    ClasseUsuarios EstoquistaDaOS = ControllerUsuarios.retornaUsuarioPorId(pedidoAntigo.getIdEstoquista());
    private void adicionarDados(){
        tituloPedido.setText(pedidoAntigo.getTitulo());       
        cavalosPedido.setText(String.valueOf(pedidoAntigo.getCavalo()));
        carretaPedido.setText(String.valueOf(pedidoAntigo.getCarreta()));
        itensPedido.setText(pedidoAntigo.getItens());
        detalhePedido1.setText(pedidoAntigo.getDetalhes());
        Supervisor.setText(supervisorDaOS.getNome());
        
        if(!pedidoAntigo.isEsperaEst()){
            jSlider1.setValue(50);
            PEstoque.setForeground(new java.awt.Color(51, 233, 71));
        }else{
            jSlider1.setValue(0);
        
        }
        
        if(pedidoAntigo.isValidacao()){
            Estoquista.setText(EstoquistaDaOS.getNome());
            jLabel8.setForeground(new java.awt.Color(51, 233, 71));
            jSlider1.setValue(100);
        }
        
        
        
        
        if(pedidoAntigo.isFeita()){
            PFinalizada.setForeground(new java.awt.Color(51, 233, 71));
        }
        
        
        //System.out.print(pedidoAntigo.getData());
        //9999-12-31T23:59:59Z
        String[] data = pedidoAntigo.getDiaMesAno(pedidoAntigo.getData().toString()).split(" ");
        dia.setText(data[0]);
        mes.setText(data[1]);
        ano.setText(data[2]);
        String[] horario = pedidoAntigo.getHorario(pedidoAntigo.getData().toString()).split("\\:");
        hora.setText(horario[0]);
        minuto.setText(horario[1]);
        segundo.setText(horario[2]);
        try{
            ic = new ImageIcon(Util.imgFromInternet(pedidoAntigo.getImagem()));
            int[] dim = Util.getScaledDimension(ic, jButton11.getPreferredSize().width, jButton11.getPreferredSize().height);
            Image img = ic.getImage().getScaledInstance(dim[0], dim[1], Image.SCALE_DEFAULT);
            ic = new ImageIcon(img);
        } catch(Exception e){
        }     
        jButton11.setIcon(ic);
    }
    
    Font font = new Font("Dialog", Font.PLAIN, 16);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        fundoDOMAIN2 = new view.NEWMAIN.FundoDOMAIN();
        fundoDOMAIN3 = new view.NEWMAIN.FundoDOMAIN();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tituloPedido = new javax.swing.JTextField();
        cavalosPedido = new javax.swing.JTextField();
        carretaPedido = new javax.swing.JTextField();
        detalhesPedido = new javax.swing.JScrollPane();
        itensPedido = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        detalhesPedido1 = new javax.swing.JScrollPane();
        detalhePedido1 = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();
        dia = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        ano = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        mes = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        hora = new javax.swing.JTextField();
        minuto = new javax.swing.JTextField();
        segundo = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton11 = new javax.swing.JButton();
        RemoverPedido = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel21 = new javax.swing.JLabel();
        jSlider1 = new javax.swing.JSlider();
        PFinalizada = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        PEstoque = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        Estoquista = new javax.swing.JTextField();
        Supervisor = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fundoDOMAIN1.setBackground(new java.awt.Color(255, 255, 255));
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

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));

        fundoDOMAIN2.setBackground(new java.awt.Color(229, 228, 228));
        fundoDOMAIN2.setForeground(new java.awt.Color(255, 255, 255));
        fundoDOMAIN2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fundoDOMAIN3.setBackground(new java.awt.Color(255, 255, 255));
        fundoDOMAIN3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel3.setText("Mecânicos:");
        fundoDOMAIN3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, -1, -1));

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel4.setText("Cavalos:");
        fundoDOMAIN3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 300, -1, -1));

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel5.setText("Carreta:");
        fundoDOMAIN3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 340, -1, -1));

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel6.setText("Itens:");
        fundoDOMAIN3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 380, -1, -1));

        tituloPedido.setEditable(false);
        tituloPedido.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tituloPedido.setText("titulo");
        tituloPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tituloPedidoActionPerformed(evt);
            }
        });
        fundoDOMAIN3.add(tituloPedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 130, 230, -1));

        cavalosPedido.setEditable(false);
        cavalosPedido.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        cavalosPedido.setText("cavalos");
        fundoDOMAIN3.add(cavalosPedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 300, 230, -1));

        carretaPedido.setEditable(false);
        carretaPedido.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        carretaPedido.setText("carreta");
        fundoDOMAIN3.add(carretaPedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 340, 230, -1));

        itensPedido.setEditable(false);
        itensPedido.setColumns(20);
        itensPedido.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        itensPedido.setRows(5);
        itensPedido.setText("itens");
        detalhesPedido.setViewportView(itensPedido);

        fundoDOMAIN3.add(detalhesPedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 380, 480, 50));

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel1.setText("Visualize a OS!");
        fundoDOMAIN3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 60, -1, -1));

        jLabel9.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel9.setText("Detalhes:");
        fundoDOMAIN3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 460, -1, -1));

        detalhePedido1.setEditable(false);
        detalhePedido1.setColumns(20);
        detalhePedido1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        detalhePedido1.setRows(5);
        detalhePedido1.setText("detalhes");
        detalhesPedido1.setViewportView(detalhePedido1);

        fundoDOMAIN3.add(detalhesPedido1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 460, 480, 50));

        jLabel10.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel10.setText("Estoquista:");
        fundoDOMAIN3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 710, -1, -1));

        dia.setEditable(false);
        dia.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        dia.setText("dd");
        dia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diaActionPerformed(evt);
            }
        });
        fundoDOMAIN3.add(dia, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 530, -1, -1));

        jLabel11.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel11.setText("/");
        fundoDOMAIN3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 530, 20, -1));

        ano.setEditable(false);
        ano.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        ano.setText("aaaa");
        ano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anoActionPerformed(evt);
            }
        });
        fundoDOMAIN3.add(ano, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 530, -1, -1));

        jLabel12.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel12.setText("/");
        fundoDOMAIN3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 530, 10, 20));

        mes.setEditable(false);
        mes.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        mes.setText("mm");
        fundoDOMAIN3.add(mes, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 530, -1, -1));

        jLabel13.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel13.setText("Hora:");
        fundoDOMAIN3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 530, -1, -1));

        hora.setEditable(false);
        hora.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        hora.setText("hh");
        fundoDOMAIN3.add(hora, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 530, -1, -1));

        minuto.setEditable(false);
        minuto.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        minuto.setText("mm");
        fundoDOMAIN3.add(minuto, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 530, -1, -1));

        segundo.setEditable(false);
        segundo.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        segundo.setText("ss");
        fundoDOMAIN3.add(segundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 530, 30, -1));

        jLabel14.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel14.setText(":");
        fundoDOMAIN3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 530, 20, -1));

        jLabel15.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel15.setText(":");
        fundoDOMAIN3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 530, 20, -1));

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel7.setText("Título:");
        fundoDOMAIN3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 130, -1, -1));

        jButton11.setBorder(null);
        jButton11.setContentAreaFilled(false);
        jButton11.setPreferredSize(new java.awt.Dimension(670, 270));
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        fundoDOMAIN3.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 780, 690, 300));

        RemoverPedido.setBackground(new java.awt.Color(105, 178, 241));
        RemoverPedido.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        RemoverPedido.setForeground(new java.awt.Color(255, 255, 255));
        RemoverPedido.setText("Remover");
        RemoverPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoverPedidoActionPerformed(evt);
            }
        });
        fundoDOMAIN3.add(RemoverPedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 60, -1, 30));

        UIManager.put("Table1.font", 14);
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", ""
            }
        ));
        UIManager.put("Table1.font", 14);
        JTableHeader tableHeader = jTable1.getTableHeader();
        Font headerFont = new Font("Verdana", Font.PLAIN, 14);
        tableHeader.setFont(headerFont);
        jTable1.setFont(new Font("Dialog", Font.PLAIN, 14));
        m =(DefaultTableModel) jTable1.getModel();
        m.setNumRows(0);
        for(int i = 0; i < mec.size(); i++){
            m.addRow(new Object[] {
                mec.get(i).getNome(),
                "Visualizar"
            });
        }
        Action visualizar = new AbstractAction()
        {
            public void actionPerformed(ActionEvent e)
            {
                JTable table = (JTable)e.getSource();
                int modelRow = Integer.valueOf(e.getActionCommand());
                visualizaMecsPorOS.getSupervisorUsuario(supervisor);
                visualizaMecsPorOS.getMecanicoParaVer(mec.get(modelRow));
                visualizaMecsPorOS.getIdOS(pedidoAntigo.getIdPedido());
                new visualizaMecsPorOS().setVisible(true);
            }
        };

        ButtonColumn buttonColumn = new ButtonColumn(jTable1, visualizar, 1);
        buttonColumn.setMnemonic(KeyEvent.VK_D);
        jScrollPane2.setViewportView(jTable1);

        fundoDOMAIN3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 190, 710, 90));

        jLabel21.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel21.setText("Data:");
        fundoDOMAIN3.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 530, -1, -1));

        jSlider1.setEnabled(false);
        fundoDOMAIN3.add(jSlider1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 590, 680, -1));

        PFinalizada.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        PFinalizada.setForeground(new java.awt.Color(233, 24, 36));
        PFinalizada.setText("Ordem finalizada");
        fundoDOMAIN3.add(PFinalizada, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 620, -1, -1));

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(233, 24, 36));
        jLabel8.setText("Validação");
        fundoDOMAIN3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 620, -1, -1));

        PEstoque.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        PEstoque.setForeground(new java.awt.Color(233, 24, 36));
        PEstoque.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PEstoque.setText("Verificação do estoque");
        fundoDOMAIN3.add(PEstoque, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 620, 170, -1));

        jLabel24.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel24.setText("Andamento:");
        fundoDOMAIN3.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 590, -1, -1));

        jLabel25.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel25.setText("Supervisor:");
        fundoDOMAIN3.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 670, -1, -1));

        Estoquista.setEditable(false);
        Estoquista.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        Estoquista.setText("Estoquista");
        fundoDOMAIN3.add(Estoquista, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 710, 340, -1));

        Supervisor.setEditable(false);
        Supervisor.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        Supervisor.setText("Supervisor");
        fundoDOMAIN3.add(Supervisor, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 670, 340, -1));

        jButton4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jButton4.setText("Ver");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        fundoDOMAIN3.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 710, -1, -1));

        jButton10.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jButton10.setText("Ver");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        fundoDOMAIN3.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 670, -1, -1));

        fundoDOMAIN2.add(fundoDOMAIN3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, 1310, 1140));

        jScrollPane1.setViewportView(fundoDOMAIN2);

        fundoDOMAIN1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, 1790, 900));

        getContentPane().add(fundoDOMAIN1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1880, 950));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
        
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
        ic = null;
        new paginaInicialSuperv1().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        ic = null;
        TabelaTodasAsOS2.getSupervisorUsuario(supervisor);
        TabelaTodasAsOS2.adcDados(ControllerPedidos.getPedidos());
        new TabelaTodasAsOS2().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        ic = null;
        paginaUmRelatorios.getSupervisorUsuario(supervisor);
        paginaUmRelatorios.adcDados();
        new paginaUmRelatorios().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void RemoverPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoverPedidoActionPerformed

        JDialog dialog = new JDialog();
        dialog.setAlwaysOnTop(true);

        String idDoPedido = pedidoAntigo.getIdPedido();

        JOptionPane.showMessageDialog(dialog, ControllerPedidos.removerPedido(idDoPedido));
    }//GEN-LAST:event_RemoverPedidoActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        ImagemAmpliada.caminho = pedidoAntigo.getImagem();
        new ImagemAmpliada().setVisible(true);
    }//GEN-LAST:event_jButton11ActionPerformed

    private void anoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_anoActionPerformed

    private void diaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_diaActionPerformed

    private void tituloPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tituloPedidoActionPerformed

    }//GEN-LAST:event_tituloPedidoActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        //supervisorDaOS.getId();
        atualizaUserFrame.getSupervisorUsuario(supervisor);
        atualizaUserFrame.getUsuParaVer(supervisorDaOS);
        new atualizaUserFrame().setVisible(true);
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if(EstoquistaDaOS.getId() != null){
        atualizaUserFrame.getSupervisorUsuario(supervisor);
        atualizaUserFrame.getUsuParaVer(EstoquistaDaOS);
        
        new atualizaUserFrame().setVisible(true);}
        else{
            JDialog dialog = new JDialog();
            dialog.setAlwaysOnTop(true);
            
            JOptionPane.showMessageDialog(dialog, "Nenhum estoquista aprovou essa OS ainda.");
        }
    }//GEN-LAST:event_jButton4ActionPerformed

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
    
    
    public static void main(String args[]) {

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vizualizarOS().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Estoquista;
    private javax.swing.JLabel PEstoque;
    private javax.swing.JLabel PFinalizada;
    private javax.swing.JButton RemoverPedido;
    private javax.swing.JTextField Supervisor;
    private javax.swing.JTextField ano;
    private javax.swing.JTextField carretaPedido;
    private javax.swing.JTextField cavalosPedido;
    private javax.swing.JTextArea detalhePedido1;
    private javax.swing.JScrollPane detalhesPedido;
    private javax.swing.JScrollPane detalhesPedido1;
    private javax.swing.JTextField dia;
    private view.NEWMAIN.FundoDOMAIN fundoDOMAIN1;
    private view.NEWMAIN.FundoDOMAIN fundoDOMAIN2;
    private view.NEWMAIN.FundoDOMAIN fundoDOMAIN3;
    private javax.swing.JTextField hora;
    private javax.swing.JTextArea itensPedido;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
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
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField mes;
    private javax.swing.JTextField minuto;
    private javax.swing.JTextField segundo;
    private view.NEWMAIN.OS.SeparadorOS separadorOS1;
    private view.NEWMAIN.SeparadorPrincipal separadorPrincipal1;
    private javax.swing.JTextField tituloPedido;
    // End of variables declaration//GEN-END:variables
}
