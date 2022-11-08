package view.supervisor.usuarios;

import controler.ControllerUsuarios;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import model.ClasseSupervisor;
import model.ClasseUsuarios;
import util.Util;

public class atualizaUserFrame extends javax.swing.JFrame {
    static ClasseSupervisor supervisor;
    static ClasseUsuarios usuario;
    static ImageIcon user;
    
    public atualizaUserFrame() {
        initComponents();
        
        setBackground(new Color(1.0f, 1.0f, 1.0f, 0.0f));
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
    }
    
    public static void getSupervisorUsuario(ClasseSupervisor sup){
        supervisor = sup;
    }
    
    public static void getUsuParaVer(ClasseUsuarios mec){
        usuario = mec;
        String caminho = " ";//157H 210W
        if(mec.getImagem() == null && mec.getCategoria().equals("Mecânico")){
            caminho = "https://firebasestorage.googleapis.com/v0/b/sgmtranscodil-aa0f7.appspot.com/o/ImagesProject%2Fmec.png?alt=media&token=e3f2d7b6-1650-45a1-a662-9866bddce103";
        }else if(mec.getImagem() == null && mec.getCategoria().equals("Estoque")){
            caminho = "https://firebasestorage.googleapis.com/v0/b/sgmtranscodil-aa0f7.appspot.com/o/ImagesProject%2Fest.png?alt=media&token=30bda6ff-4149-48b3-8bf7-2e5e886fdb04";
        }else if(mec.getImagem() == null && mec.getCategoria().equals("Supervisor")){
            caminho = "https://firebasestorage.googleapis.com/v0/b/sgmtranscodil-aa0f7.appspot.com/o/ImagesProject%2Fsup.png?alt=media&token=aaa51ee9-1f55-4fcc-a400-f73a366bf778";
        }else{
            caminho = mec.getImagem();
        }
        try{
            user = new ImageIcon(Util.imgFromInternet(caminho));
            int[] dim = Util.getScaledDimension(user, 210, 157);
            
            Image img = user.getImage().getScaledInstance(dim[0], dim[1], Image.SCALE_DEFAULT);
            user = new ImageIcon(img);
        }catch(Exception e){
            e.printStackTrace();
        }
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
        eMail = new javax.swing.JTextField();
        nome = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton(user);
        CPF = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        Cat = new javax.swing.JTextField();
        NomeMec5 = new javax.swing.JLabel();

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

        eMail.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        eMail.setText(usuario.getEmail());

        nome.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        nome.setText(usuario.getNome());
        nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeActionPerformed(evt);
            }
        });

        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.setBorder(null);
        jButton1.setContentAreaFilled(false);

        CPF.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        CPF.setText(usuario.getCpf());

        jTextField4.setEditable(false);
        jTextField4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        String res = usuario.isValidado()==true?"ativado":"desativado";
        jTextField4.setText(res);

        jTextField5.setEditable(false);
        jTextField5.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jTextField5.setText(usuario.getId());

        jButton2.setText("Fechar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jButton3.setText("Atualizar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jButton4.setText("Invalidar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        Cat.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        Cat.setText(usuario.getCategoria());

        NomeMec5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        NomeMec5.setForeground(new java.awt.Color(0, 0, 0));
        NomeMec5.setText("Categoria:");

        javax.swing.GroupLayout fundoDOMAIN1Layout = new javax.swing.GroupLayout(fundoDOMAIN1);
        fundoDOMAIN1.setLayout(fundoDOMAIN1Layout);
        fundoDOMAIN1Layout.setHorizontalGroup(
            fundoDOMAIN1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fundoDOMAIN1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(fundoDOMAIN1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2))
                            .addGroup(fundoDOMAIN1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(Cat, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(fundoDOMAIN1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField4)
                                    .addComponent(jTextField5)
                                    .addComponent(CPF)
                                    .addComponent(eMail)
                                    .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jButton4))))
                    .addComponent(jButton3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        fundoDOMAIN1Layout.setVerticalGroup(
            fundoDOMAIN1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fundoDOMAIN1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(fundoDOMAIN1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(fundoDOMAIN1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NomeMec)
                    .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(fundoDOMAIN1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NomeMec3)
                    .addComponent(eMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(fundoDOMAIN1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NomeMec2)
                    .addComponent(CPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(fundoDOMAIN1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NomeMec4)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(fundoDOMAIN1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NomeMec1)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(fundoDOMAIN1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NomeMec5)
                    .addComponent(Cat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(fundoDOMAIN1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fundoDOMAIN1, javax.swing.GroupLayout.DEFAULT_SIZE, 397, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fundoDOMAIN1, javax.swing.GroupLayout.DEFAULT_SIZE, 441, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        user = null;
        this.setVisible(false);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        JDialog dialog = new JDialog();
        dialog.setAlwaysOnTop(true);
        JOptionPane.showMessageDialog(dialog, ControllerUsuarios.InalidarUsuarios(usuario.getId()));
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        JDialog dialog = new JDialog();
        dialog.setAlwaysOnTop(true);
        //String nome, String cpf, String email, String imagem, String id, String categoria, boolean validado
        String nom = nome.getText();
        String cpf = CPF.getText();
        String email = eMail.getText();
        String imagem = usuario.getImagem();
        String id = usuario.getId();
        String categoria = Cat.getText();
        boolean validado = usuario.isValidado();
        
        
        ClasseUsuarios usuarioNovo = new ClasseUsuarios(nom, cpf, email, imagem, id, categoria, validado);
        JOptionPane.showMessageDialog(dialog, ControllerUsuarios.atualizarUsuarios(usuarioNovo, usuario));
        
    }//GEN-LAST:event_jButton3ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new atualizaUserFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CPF;
    private javax.swing.JTextField Cat;
    private javax.swing.JLabel NomeMec;
    private javax.swing.JLabel NomeMec1;
    private javax.swing.JLabel NomeMec2;
    private javax.swing.JLabel NomeMec3;
    private javax.swing.JLabel NomeMec4;
    private javax.swing.JLabel NomeMec5;
    private javax.swing.JTextField eMail;
    private view.NEWMAIN.FundoDOMAIN fundoDOMAIN1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField nome;
    // End of variables declaration//GEN-END:variables
}
