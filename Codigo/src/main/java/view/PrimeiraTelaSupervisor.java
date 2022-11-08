package view;

import controler.ControllerAdmin;
import controler.ControllerUsuarios;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import model.ClasseSupervisor;
import util.Util;
import view.supervisor.paginaInicialSuperv1;

public class PrimeiraTelaSupervisor extends javax.swing.JFrame {
    
    ImageIcon imagem;
    ImageIcon supervisor;
    
    public PrimeiraTelaSupervisor() {
         try{
            
            supervisor = new ImageIcon(Util.imgFromInternet("https://firebasestorage.googleapis.com/v0/b/sgmtranscodil-aa0f7.appspot.com/o/ImagesProject%2FsupervisorImagm.png?alt=media&token=2facf663-c6a3-4d8c-828e-f8cb52b8c7f5"));
            imagem = new ImageIcon(Util.imgFromInternet("https://firebasestorage.googleapis.com/v0/b/sgmtranscodil-aa0f7.appspot.com/o/ImagesProject%2FlogoPrincipal.jpg?alt=media&token=e1a80ed4-6e35-4e55-a61c-701ff1cd9199"));
        
         } catch(Exception e){
            e.printStackTrace();
        }
        initComponents();
        setBackground(new Color(0,0,0,0));
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
        ControllerAdmin.conectar();
       
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fundoDOMAIN2 = new view.NEWMAIN.FundoDOMAIN();
        fundoDOMAIN1 = new view.NEWMAIN.FundoDOMAIN();
        separadorPrincipal2 = new view.NEWMAIN.SeparadorPrincipal();
        jLabel3 = new javax.swing.JLabel();
        BotaoLoginSuperv = new javax.swing.JButton();
        senhaSupervLogin = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        emailSupervLogin1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        javax.swing.JButton jButton2 = new JButton(supervisor);
        fundoCadastro1 = new view.NEWMAIN.FundoCadastro();
        BotaoCadastrar = new javax.swing.JButton();
        nomeSuperv = new javax.swing.JTextField();
        nomeSupervisorCadastroLabel = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        emailSuperv = new javax.swing.JTextField();
        cpfSupervLabel = new javax.swing.JLabel();
        emailSupervLabel = new javax.swing.JLabel();
        cpfSuperv = new javax.swing.JTextField();
        javax.swing.JButton jButton1 = new JButton(imagem);

        javax.swing.GroupLayout fundoDOMAIN2Layout = new javax.swing.GroupLayout(fundoDOMAIN2);
        fundoDOMAIN2.setLayout(fundoDOMAIN2Layout);
        fundoDOMAIN2Layout.setHorizontalGroup(
            fundoDOMAIN2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        fundoDOMAIN2Layout.setVerticalGroup(
            fundoDOMAIN2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SGM - Supervisor");
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fundoDOMAIN1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Faça seu login!");

        BotaoLoginSuperv.setBackground(new java.awt.Color(228, 228, 234));
        BotaoLoginSuperv.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        BotaoLoginSuperv.setForeground(new java.awt.Color(90, 90, 90));
        BotaoLoginSuperv.setText("Entrar");
        BotaoLoginSuperv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoLoginSupervActionPerformed(evt);
            }
        });

        senhaSupervLogin.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        senhaSupervLogin.setText("jPasswordField1");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Senha:");

        emailSupervLogin1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        emailSupervLogin1.setForeground(new java.awt.Color(0, 0, 0));
        emailSupervLogin1.setText("email@email.com");
        emailSupervLogin1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailSupervLogin1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("E-mail:");

        jButton2.setBorder(null);
        jButton2.setContentAreaFilled(false);
        jButton2.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout separadorPrincipal2Layout = new javax.swing.GroupLayout(separadorPrincipal2);
        separadorPrincipal2.setLayout(separadorPrincipal2Layout);
        separadorPrincipal2Layout.setHorizontalGroup(
            separadorPrincipal2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, separadorPrincipal2Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(50, 50, 50)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(emailSupervLogin1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(senhaSupervLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(BotaoLoginSuperv)
                .addGap(71, 71, 71))
        );
        separadorPrincipal2Layout.setVerticalGroup(
            separadorPrincipal2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, separadorPrincipal2Layout.createSequentialGroup()
                .addContainerGap(55, Short.MAX_VALUE)
                .addGroup(separadorPrincipal2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(senhaSupervLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(emailSupervLogin1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(BotaoLoginSuperv))
                .addGap(72, 72, 72))
            .addGroup(separadorPrincipal2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        BotaoCadastrar.setBackground(new java.awt.Color(228, 228, 234));
        BotaoCadastrar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        BotaoCadastrar.setForeground(new java.awt.Color(90, 90, 90));
        BotaoCadastrar.setText("Cadastrar");
        BotaoCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoCadastrarActionPerformed(evt);
            }
        });

        nomeSuperv.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        nomeSuperv.setText("Seu nome...");
        nomeSuperv.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        nomeSupervisorCadastroLabel.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        nomeSupervisorCadastroLabel.setForeground(new java.awt.Color(0, 0, 0));
        nomeSupervisorCadastroLabel.setText("Nome: ");

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 30)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 88));
        jLabel4.setText("Cadastre-se!");

        emailSuperv.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        emailSuperv.setText("email@email.com");
        emailSuperv.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        cpfSupervLabel.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        cpfSupervLabel.setForeground(new java.awt.Color(0, 0, 0));
        cpfSupervLabel.setText("CPF:");

        emailSupervLabel.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        emailSupervLabel.setForeground(new java.awt.Color(0, 0, 0));
        emailSupervLabel.setText("E-mail:");
        emailSupervLabel.setToolTipText("");

        cpfSuperv.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        cpfSuperv.setText("000.000.000-00");
        cpfSuperv.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout fundoCadastro1Layout = new javax.swing.GroupLayout(fundoCadastro1);
        fundoCadastro1.setLayout(fundoCadastro1Layout);
        fundoCadastro1Layout.setHorizontalGroup(
            fundoCadastro1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fundoCadastro1Layout.createSequentialGroup()
                .addGroup(fundoCadastro1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fundoCadastro1Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(fundoCadastro1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(emailSupervLabel)
                            .addComponent(nomeSupervisorCadastroLabel)))
                    .addGroup(fundoCadastro1Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(cpfSupervLabel)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(fundoCadastro1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cpfSuperv, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nomeSuperv, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailSuperv, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(67, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fundoCadastro1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(fundoCadastro1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fundoCadastro1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(116, 116, 116))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fundoCadastro1Layout.createSequentialGroup()
                        .addComponent(BotaoCadastrar)
                        .addGap(34, 34, 34))))
        );
        fundoCadastro1Layout.setVerticalGroup(
            fundoCadastro1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fundoCadastro1Layout.createSequentialGroup()
                .addGroup(fundoCadastro1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(fundoCadastro1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(nomeSupervisorCadastroLabel))
                    .addGroup(fundoCadastro1Layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
                        .addComponent(nomeSuperv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(fundoCadastro1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailSuperv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailSupervLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(fundoCadastro1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cpfSupervLabel)
                    .addComponent(cpfSuperv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(BotaoCadastrar)
                .addGap(34, 34, 34))
        );

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout fundoDOMAIN1Layout = new javax.swing.GroupLayout(fundoDOMAIN1);
        fundoDOMAIN1.setLayout(fundoDOMAIN1Layout);
        fundoDOMAIN1Layout.setHorizontalGroup(
            fundoDOMAIN1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(separadorPrincipal2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fundoDOMAIN1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 602, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(fundoCadastro1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );
        fundoDOMAIN1Layout.setVerticalGroup(
            fundoDOMAIN1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fundoDOMAIN1Layout.createSequentialGroup()
                .addComponent(separadorPrincipal2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(fundoDOMAIN1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fundoDOMAIN1Layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(fundoCadastro1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(fundoDOMAIN1Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 507, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(63, Short.MAX_VALUE))
        );

        getContentPane().add(fundoDOMAIN1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1130, 770));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotaoCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoCadastrarActionPerformed
        // TODO add your handling code here:
        JDialog dialog = new JDialog();
        dialog.setAlwaysOnTop(true);
        String nome = nomeSuperv.getText();
        String cpf = cpfSuperv.getText();
        String email = emailSuperv.getText();
        String senha = "sgm2022178";
        String imagem = null;
        String id = null;
        boolean validado = true;
        
        ClasseSupervisor supervisinho = new ClasseSupervisor(nome, cpf, email, senha, imagem, id, validado);
        JOptionPane.showMessageDialog(dialog, ControllerAdmin.cadastrarSupervisor(supervisinho));
    }//GEN-LAST:event_BotaoCadastrarActionPerformed

    private void emailSupervLogin1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailSupervLogin1ActionPerformed

    }//GEN-LAST:event_emailSupervLogin1ActionPerformed

    private void BotaoLoginSupervActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoLoginSupervActionPerformed

        String senha = String.valueOf(senhaSupervLogin.getPassword());
        String email = emailSupervLogin1.getText();
        JDialog dialog = new JDialog();
        dialog.setAlwaysOnTop(true);

        if(ControllerAdmin.loginSuperv(email, senha) == true){
            JOptionPane.showMessageDialog(dialog, "Bem-vindo!");
            ClasseSupervisor supervisor2 = ControllerAdmin.getSupervByEmail(email);
            paginaInicialSuperv1.getSupervisorUsuario(supervisor2);
            paginaInicialSuperv1.adcDados(ControllerUsuarios.retornaUsuariosPorStatusDeValidacao(false));
            new paginaInicialSuperv1().setVisible(true);
            dispose();
        }else{
            JOptionPane.showMessageDialog(dialog, ControllerAdmin.possiveisErrosLogin(email, senha));

        }
    }//GEN-LAST:event_BotaoLoginSupervActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    }//GEN-LAST:event_jButton1ActionPerformed
//BotaoLoginSuperv = new javax.swing.JButton();
    
    public static void main(String args[]) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               
                new PrimeiraTelaSupervisor().setVisible(true);
            }
        });
    }

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoCadastrar;
    private javax.swing.JButton BotaoLoginSuperv;
    private javax.swing.JTextField cpfSuperv;
    private javax.swing.JLabel cpfSupervLabel;
    private javax.swing.JTextField emailSuperv;
    private javax.swing.JLabel emailSupervLabel;
    private javax.swing.JTextField emailSupervLogin1;
    private view.NEWMAIN.FundoCadastro fundoCadastro1;
    private view.NEWMAIN.FundoDOMAIN fundoDOMAIN1;
    private view.NEWMAIN.FundoDOMAIN fundoDOMAIN2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField nomeSuperv;
    private javax.swing.JLabel nomeSupervisorCadastroLabel;
    private javax.swing.JPasswordField senhaSupervLogin;
    private view.NEWMAIN.SeparadorPrincipal separadorPrincipal2;
    // End of variables declaration//GEN-END:variables
}
