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
public class CMaterials extends javax.swing.JPanel {

    /**
     * Creates new form CMaterials
     */
    public CMaterials() {
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

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

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
        jButton1.setBounds(80, 490, 130, 109);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projectapp/images/backicon.png"))); // NOI18N
        jButton2.setContentAreaFilled(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2);
        jButton2.setBounds(300, 490, 130, 109);

        jLabel1.setText("A comprehensive guide with appropriate anecdotes to keep interest.");
        add(jLabel1);
        jLabel1.setBounds(30, 28, 329, 14);

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
        cl.show(getParent(), "CIMAGEQUIZ");
        }
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
