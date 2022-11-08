package view.NEWMAIN.OS;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import util.Util;

public class SeparadorOS extends javax.swing.JPanel {
    static ImageIcon historico, relatorio, usuario, oss, sair;
    
    public SeparadorOS() {
        try{
            historico = new ImageIcon(Util.imgFromInternet(Util.historico));
            relatorio = new ImageIcon(Util.imgFromInternet(Util.relatorio));
            usuario = new ImageIcon(Util.imgFromInternet(Util.usuario));
            oss = new ImageIcon(Util.imgFromInternet(Util.os2));
            sair = new ImageIcon(Util.imgFromInternet(Util.sair));
        }catch(Exception e){
            e.printStackTrace();
        }
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        javax.swing.JButton Home = new JButton(usuario);
        Relatorio = new JButton(relatorio);
        javax.swing.JButton Sair = new JButton(sair);
        javax.swing.JButton OSs = new JButton(oss);

        jPanel1.setBackground(new java.awt.Color(93, 209, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeActionPerformed(evt);
            }
        });
        jPanel1.add(Home, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 119, 80));
        Home.setBorder(null);
        Home.setContentAreaFilled(false);
        jPanel1.add(Relatorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 119, 80));
        Relatorio.setBorder(null);
        Relatorio.setContentAreaFilled(false);

        Sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SairActionPerformed(evt);
            }
        });
        jPanel1.add(Sair, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 820, 110, 80));
        Sair.setBorder(null);
        Sair.setContentAreaFilled(false);
        jPanel1.add(OSs, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 119, 80));
        OSs.setBorder(null);
        OSs.setContentAreaFilled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 597, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void HomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HomeActionPerformed

    private void SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SairActionPerformed

    }//GEN-LAST:event_SairActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Relatorio;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
