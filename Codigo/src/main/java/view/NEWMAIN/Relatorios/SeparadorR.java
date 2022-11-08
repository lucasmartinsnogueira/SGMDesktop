package view.NEWMAIN.Relatorios;

import view.NEWMAIN.paginaInicial.*;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import util.Util;

public class SeparadorR extends javax.swing.JPanel {

    static ImageIcon relatorio, usuario, oss, sair;
    public SeparadorR() {
        try{
            relatorio = new ImageIcon(Util.imgFromInternet(Util.relatorio2));
            usuario = new ImageIcon(Util.imgFromInternet(Util.usuario));
            oss = new ImageIcon(Util.imgFromInternet(Util.OS));
            sair = new ImageIcon(Util.imgFromInternet(Util.sair));
        }catch(Exception e){
            e.printStackTrace();
        }
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        javax.swing.JButton Home = new JButton(usuario);
        Relatorio = new JButton(relatorio);
        javax.swing.JButton Sair = new JButton(sair);
        javax.swing.JButton OSs = new JButton(oss);

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 22)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 153, 153));
        jLabel3.setText("Histórico");

        setBackground(new java.awt.Color(93, 209, 255));

        Home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeActionPerformed(evt);
            }
        });

        Sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Sair, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Home, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                    .addComponent(Relatorio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(OSs, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Home, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Relatorio, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(OSs, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 606, Short.MAX_VALUE)
                .addComponent(Sair, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        Home.setBorder(null);
        Home.setContentAreaFilled(false);
        Relatorio.setBorder(null);
        Relatorio.setContentAreaFilled(false);
        Sair.setBorder(null);
        Sair.setContentAreaFilled(false);
        OSs.setBorder(null);
        OSs.setContentAreaFilled(false);
    }// </editor-fold>//GEN-END:initComponents
        
    private void HomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeActionPerformed
    }//GEN-LAST:event_HomeActionPerformed

    private void SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SairActionPerformed

    }//GEN-LAST:event_SairActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Relatorio;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
