/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectapp;

import java.awt.CardLayout;
import java.awt.LayoutManager;

/**
 *
 * @author user
 */
public class CImageQuiz extends javax.swing.JPanel {

    /**
     * Creates new form CImageQuiz
     */
    public CImageQuiz() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton4 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        jButton4.setText("jButton4");

        setLayout(null);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectapp/images/Homeicon.png"))); // NOI18N
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1);
        jButton1.setBounds(80, 480, 130, 109);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectapp/images/backicon.png"))); // NOI18N
        jButton2.setContentAreaFilled(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2);
        jButton2.setBounds(300, 480, 130, 109);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectapp/images/rainy7.png"))); // NOI18N
        jButton3.setContentAreaFilled(false);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        add(jButton3);
        jButton3.setBounds(90, 80, 97, 100);

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectapp/images/firewood1.png"))); // NOI18N
        jButton5.setContentAreaFilled(false);
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        add(jButton5);
        jButton5.setBounds(270, 100, 193, 50);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Materials");
        add(jLabel1);
        jLabel1.setBounds(320, 190, 100, 22);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Atmospheric chemistry");
        add(jLabel2);
        jLabel2.setBounds(40, 190, 200, 20);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectapp/images/chemistrybg.png"))); // NOI18N
        add(jLabel3);
        jLabel3.setBounds(0, 0, 500, 600);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        LayoutManager layout = getParent().getLayout();
        if (layout instanceof CardLayout) {
        CardLayout cl = (CardLayout)layout;
        cl.show(getParent(), "MAIN");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         LayoutManager layout = getParent().getLayout();
        if (layout instanceof CardLayout) {
        CardLayout cl = (CardLayout)layout;
        cl.show(getParent(), "CHEMISTRY");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        LayoutManager layout = getParent().getLayout();
        if (layout instanceof CardLayout) {
        CardLayout cl = (CardLayout)layout;
        cl.show(getParent(), "CATMOSPHERE");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        LayoutManager layout = getParent().getLayout();
        if (layout instanceof CardLayout) {
        CardLayout cl = (CardLayout)layout;
        cl.show(getParent(), "CMATERIALS");
        }
    }//GEN-LAST:event_jButton5ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
