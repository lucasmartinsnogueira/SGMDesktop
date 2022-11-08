package view.supervisor;

import controler.ControllerAdmin;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.File;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import model.ClasseSupervisor;
import static view.supervisor.paginaInicialSuperv1.supervisor;

public class MudaImagemPerfil extends javax.swing.JFrame {

    public MudaImagemPerfil() {
        initComponents();
        setBackground(new Color(0,0,0,0));
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
        ControllerAdmin.conectar();   
    }
    public static void getSupervisorUsuario(ClasseSupervisor sup){
        supervisor = sup;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton3 = new javax.swing.JButton();
        jFileChooser1 = new javax.swing.JFileChooser();
        fundoDOMAIN1 = new view.NEWMAIN.FundoDOMAIN();
        jButton1 = new javax.swing.JButton();
        separadorPrincipal1 = new view.NEWMAIN.SeparadorPrincipal();
        jFileChooser2 = new javax.swing.JFileChooser();

        jButton3.setBackground(new java.awt.Color(0, 153, 255));
        jButton3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jButton3.setText("Atualizar");
        jButton3.setBorderPainted(false);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        fundoDOMAIN1.setBackground(new java.awt.Color(255, 255, 255));
        fundoDOMAIN1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("Fechar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        fundoDOMAIN1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 10, -1, -1));
        fundoDOMAIN1.add(separadorPrincipal1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 565, 37));

        jFileChooser2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFileChooser2ActionPerformed(evt);
            }
        });
        fundoDOMAIN1.add(jFileChooser2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 43, -1, 320));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fundoDOMAIN1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fundoDOMAIN1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
public String imgChosen = "the image is nowhere to be found!";
    private void jFileChooser2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFileChooser2ActionPerformed
        // TODO add your handling code here:
        jFileChooser2.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        File file = jFileChooser2.getSelectedFile();
        String fullPath = file.getAbsolutePath();
        String caminho = fullPath;
        
        ControllerAdmin help = new ControllerAdmin();
        
        JDialog dialog = new JDialog();
        dialog.setAlwaysOnTop(true);
        JOptionPane.showMessageDialog(dialog, help.uploadDeImagem(paginaInicialSuperv1.supervisor.getId(), caminho));
        this.setVisible(false);
        dispose();
    }//GEN-LAST:event_jFileChooser2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        paginaInicialSuperv1.getSupervisorUsuario(supervisor);
        this.setVisible(false);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
   
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MudaImagemPerfil().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private view.NEWMAIN.FundoDOMAIN fundoDOMAIN1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JFileChooser jFileChooser2;
    private view.NEWMAIN.SeparadorPrincipal separadorPrincipal1;
    // End of variables declaration//GEN-END:variables
}
