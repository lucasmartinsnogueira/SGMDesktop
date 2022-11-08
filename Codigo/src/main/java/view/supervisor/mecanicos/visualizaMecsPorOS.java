package view.supervisor.mecanicos;

import controler.ControllerTrabalhosOS;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import model.ClasseSupervisor;
import model.ClasseTrabalhosOS;
import model.ClasseUsuarios;
import util.Util;

public class visualizaMecsPorOS extends javax.swing.JFrame {
    static ClasseSupervisor supervisor;
    static ClasseUsuarios mecanico;
    static ImageIcon mecan;
    ControllerTrabalhosOS  f;
    String Andamento = "kks", time = "ss";
    public visualizaMecsPorOS() {
        initComponents();
        
        setBackground(new Color(1.0f, 1.0f, 1.0f, 0.0f));
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
    }
    
    public static void getSupervisorUsuario(ClasseSupervisor sup){
        supervisor = sup;
    }
    
    public static void getMecanicoParaVer(ClasseUsuarios mec){
        mecanico = mec;
        String caminho = " ";//157H 210W
        if(mec.getImagem() == null){
            caminho = "https://firebasestorage.googleapis.com/v0/b/sgmtranscodil-aa0f7.appspot.com/o/ImagesProject%2Fmec.png?alt=media&token=e3f2d7b6-1650-45a1-a662-9866bddce103";
        }else{
            caminho = mec.getImagem();
        }
        try{
            mecan = new ImageIcon(Util.imgFromInternet(caminho));
            int[] dim = Util.getScaledDimension(mecan, 210, 157);
            
            Image img = mecan.getImage().getScaledInstance(dim[0], dim[1], Image.SCALE_DEFAULT);
            mecan = new ImageIcon(img);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    static String ID = "sjjs";
    public static void getIdOS(String idOS){
        ID = idOS;
    
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fundoDOMAIN1 = new view.NEWMAIN.FundoDOMAIN();
        NomeMec = new javax.swing.JLabel();
        NomeMec1 = new javax.swing.JLabel();
        NomeMec2 = new javax.swing.JLabel();
        NomeMec3 = new javax.swing.JLabel();
        NomeMec4 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton(mecan);
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        NomeMec5 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        NomeMec6 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        fundoDOMAIN1.setBackground(new java.awt.Color(178, 178, 178));
        fundoDOMAIN1.setPreferredSize(new java.awt.Dimension(420, 417));

        NomeMec.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        NomeMec.setForeground(new java.awt.Color(0, 0, 0));
        NomeMec.setText("Nome:");

        NomeMec1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        NomeMec1.setForeground(new java.awt.Color(0, 0, 0));
        NomeMec1.setText("ID:");

        NomeMec2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        NomeMec2.setForeground(new java.awt.Color(0, 0, 0));
        NomeMec2.setText("CPF:");

        NomeMec3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        NomeMec3.setForeground(new java.awt.Color(0, 0, 0));
        NomeMec3.setText("E-mail:");

        NomeMec4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        NomeMec4.setForeground(new java.awt.Color(0, 0, 0));
        NomeMec4.setText("Status:");

        jTextField2.setEditable(false);
        jTextField2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jTextField2.setText(mecanico.getEmail());

        jTextField1.setEditable(false);
        jTextField1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jTextField1.setText(mecanico.getNome());

        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.setBorder(null);
        jButton1.setContentAreaFilled(false);

        jTextField3.setEditable(false);
        jTextField3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jTextField3.setText(mecanico.getCpf());

        jTextField4.setEditable(false);
        jTextField4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        String res = mecanico.isValidado()==true?"ativado":"desativado";
        jTextField4.setText(res);

        jTextField5.setEditable(false);
        jTextField5.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jTextField5.setText(mecanico.getId());

        jButton2.setText("Fechar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        NomeMec5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        NomeMec5.setForeground(new java.awt.Color(0, 0, 0));
        NomeMec5.setText("Andamento:");

        jTextField6.setEditable(false);
        jTextField6.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        boolean s = true;
        for(int i = 0; i < ControllerTrabalhosOS.getTempoDaOS(ID).size(); i++){
            ClasseTrabalhosOS trabalho = ControllerTrabalhosOS.getTempoDaOS(ID).get(i);
            if(trabalho.getIdMecanico().equals(mecanico.getId())){
                s = trabalho.isStatus();
                Andamento = s? "finalizado" : "não finalizado";
            }
        }
        jTextField6.setText(Andamento);

        NomeMec6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        NomeMec6.setForeground(new java.awt.Color(0, 0, 0));
        NomeMec6.setText("Tempo:");

        jTextField7.setEditable(false);
        jTextField7.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        int tempo = 0;
        for(int i = 0; i < ControllerTrabalhosOS.getTempoDaOS(ID).size(); i++){
            ClasseTrabalhosOS trabalho = ControllerTrabalhosOS.getTempoDaOS(ID).get(i);
            if(trabalho.getIdMecanico().equals(mecanico.getId())){
                tempo = trabalho.getTenpoIndividual();
                time = trabalho.getTempoASHmS(tempo);
            }
        }
        jTextField7.setText(time);

        javax.swing.GroupLayout fundoDOMAIN1Layout = new javax.swing.GroupLayout(fundoDOMAIN1);
        fundoDOMAIN1.setLayout(fundoDOMAIN1Layout);
        fundoDOMAIN1Layout.setHorizontalGroup(
            fundoDOMAIN1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fundoDOMAIN1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(fundoDOMAIN1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(fundoDOMAIN1Layout.createSequentialGroup()
                        .addGroup(fundoDOMAIN1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NomeMec2)
                            .addComponent(NomeMec4)
                            .addComponent(NomeMec1)
                            .addComponent(NomeMec5)
                            .addGroup(fundoDOMAIN1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(NomeMec)
                                .addComponent(NomeMec3)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(fundoDOMAIN1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(fundoDOMAIN1Layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2))
                            .addGroup(fundoDOMAIN1Layout.createSequentialGroup()
                                .addGroup(fundoDOMAIN1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(fundoDOMAIN1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jTextField1)
                                        .addComponent(jTextField2)
                                        .addComponent(jTextField3)
                                        .addComponent(jTextField4)
                                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(fundoDOMAIN1Layout.createSequentialGroup()
                        .addComponent(NomeMec6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                        .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)))
                .addContainerGap())
        );
        fundoDOMAIN1Layout.setVerticalGroup(
            fundoDOMAIN1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fundoDOMAIN1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(fundoDOMAIN1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fundoDOMAIN1Layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addGap(146, 146, 146))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fundoDOMAIN1Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(fundoDOMAIN1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NomeMec)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(fundoDOMAIN1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NomeMec3)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(fundoDOMAIN1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NomeMec2)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(fundoDOMAIN1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NomeMec4)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(fundoDOMAIN1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NomeMec1)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(fundoDOMAIN1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(NomeMec5)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(fundoDOMAIN1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(NomeMec6)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fundoDOMAIN1, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fundoDOMAIN1, javax.swing.GroupLayout.DEFAULT_SIZE, 493, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.setVisible(false);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new visualizaMecsPorOS().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel NomeMec;
    private javax.swing.JLabel NomeMec1;
    private javax.swing.JLabel NomeMec2;
    private javax.swing.JLabel NomeMec3;
    private javax.swing.JLabel NomeMec4;
    private javax.swing.JLabel NomeMec5;
    private javax.swing.JLabel NomeMec6;
    private view.NEWMAIN.FundoDOMAIN fundoDOMAIN1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    // End of variables declaration//GEN-END:variables
}
