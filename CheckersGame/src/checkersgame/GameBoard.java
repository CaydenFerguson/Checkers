/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package checkersgame;
import java.awt.Color;
import java.util.Arrays;
import javax.swing.JButton;
import java.util.*;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
/**
 *
 * @author caydenferguson
 */
public class GameBoard extends javax.swing.JFrame {

    /**
     * Creates new form GameBoard
     */
    public GameBoard() {
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

        A1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        jButton27 = new javax.swing.JButton();
        jButton28 = new javax.swing.JButton();
        jButton29 = new javax.swing.JButton();
        jButton30 = new javax.swing.JButton();
        jButton31 = new javax.swing.JButton();
        jButton32 = new javax.swing.JButton();
        jButton33 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton34 = new javax.swing.JButton();
        jButton35 = new javax.swing.JButton();
        jButton36 = new javax.swing.JButton();
        jButton37 = new javax.swing.JButton();
        jButton38 = new javax.swing.JButton();
        jButton39 = new javax.swing.JButton();
        jButton40 = new javax.swing.JButton();
        jButton41 = new javax.swing.JButton();
        jButton42 = new javax.swing.JButton();
        jButton43 = new javax.swing.JButton();
        jButton44 = new javax.swing.JButton();
        jButton45 = new javax.swing.JButton();
        jButton46 = new javax.swing.JButton();
        jButton47 = new javax.swing.JButton();
        jButton48 = new javax.swing.JButton();
        jButton49 = new javax.swing.JButton();
        jButton50 = new javax.swing.JButton();
        jButton51 = new javax.swing.JButton();
        jButton52 = new javax.swing.JButton();
        jButton53 = new javax.swing.JButton();
        jButton54 = new javax.swing.JButton();
        jButton55 = new javax.swing.JButton();
        jButton56 = new javax.swing.JButton();
        jButton57 = new javax.swing.JButton();
        jButton58 = new javax.swing.JButton();
        jButton59 = new javax.swing.JButton();
        jButton60 = new javax.swing.JButton();
        jButton61 = new javax.swing.JButton();
        jButton62 = new javax.swing.JButton();
        jButton63 = new javax.swing.JButton();
        jButton64 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        A1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/checkersgame/blackKing.png"))); // NOI18N
        A1.setText("1");
        A1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A1ActionPerformed(evt);
            }
        });
        getContentPane().add(A1);
        A1.setBounds(10, 20, 110, 80);

        jButton2.setText("jButton1");
        getContentPane().add(jButton2);
        jButton2.setBounds(110, 20, 80, 80);

        jButton3.setText("jButton1");
        getContentPane().add(jButton3);
        jButton3.setBounds(200, 20, 80, 80);

        jButton4.setText("jButton1");
        getContentPane().add(jButton4);
        jButton4.setBounds(300, 20, 80, 80);

        jButton5.setText("jButton1");
        getContentPane().add(jButton5);
        jButton5.setBounds(390, 20, 80, 80);

        jButton6.setText("jButton1");
        getContentPane().add(jButton6);
        jButton6.setBounds(480, 20, 80, 80);

        jButton7.setText("jButton1");
        getContentPane().add(jButton7);
        jButton7.setBounds(570, 20, 80, 80);

        jButton8.setText("jButton1");
        getContentPane().add(jButton8);
        jButton8.setBounds(660, 20, 80, 80);

        jButton9.setText("jButton1");
        getContentPane().add(jButton9);
        jButton9.setBounds(20, 110, 80, 80);

        jButton10.setText("jButton1");
        getContentPane().add(jButton10);
        jButton10.setBounds(110, 110, 80, 80);

        jButton11.setText("jButton1");
        getContentPane().add(jButton11);
        jButton11.setBounds(200, 110, 80, 80);

        jButton12.setText("jButton1");
        getContentPane().add(jButton12);
        jButton12.setBounds(290, 110, 80, 80);

        jButton13.setText("jButton1");
        getContentPane().add(jButton13);
        jButton13.setBounds(390, 110, 80, 80);

        jButton14.setText("jButton1");
        getContentPane().add(jButton14);
        jButton14.setBounds(480, 110, 80, 80);

        jButton15.setText("jButton1");
        getContentPane().add(jButton15);
        jButton15.setBounds(570, 110, 80, 80);

        jButton16.setText("jButton1");
        getContentPane().add(jButton16);
        jButton16.setBounds(660, 110, 80, 80);

        jButton17.setText("jButton1");
        getContentPane().add(jButton17);
        jButton17.setBounds(10, 200, 80, 80);

        jButton18.setText("jButton1");
        getContentPane().add(jButton18);
        jButton18.setBounds(110, 200, 80, 80);

        jButton19.setText("jButton1");
        getContentPane().add(jButton19);
        jButton19.setBounds(200, 200, 80, 80);

        jButton20.setText("jButton1");
        getContentPane().add(jButton20);
        jButton20.setBounds(290, 200, 80, 80);

        jButton21.setText("jButton1");
        getContentPane().add(jButton21);
        jButton21.setBounds(390, 200, 80, 80);

        jButton22.setText("jButton1");
        getContentPane().add(jButton22);
        jButton22.setBounds(480, 200, 80, 80);

        jButton23.setText("jButton1");
        getContentPane().add(jButton23);
        jButton23.setBounds(570, 200, 80, 80);

        jButton24.setText("jButton1");
        getContentPane().add(jButton24);
        jButton24.setBounds(660, 200, 80, 80);

        jButton25.setText("jButton1");
        getContentPane().add(jButton25);
        jButton25.setBounds(10, 290, 80, 80);

        jButton26.setText("jButton1");
        getContentPane().add(jButton26);
        jButton26.setBounds(110, 290, 80, 80);

        jButton27.setText("jButton1");
        getContentPane().add(jButton27);
        jButton27.setBounds(200, 290, 80, 80);

        jButton28.setText("jButton1");
        getContentPane().add(jButton28);
        jButton28.setBounds(290, 290, 80, 80);

        jButton29.setText("jButton1");
        getContentPane().add(jButton29);
        jButton29.setBounds(380, 290, 80, 80);

        jButton30.setText("jButton1");
        jButton30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton30ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton30);
        jButton30.setBounds(480, 290, 80, 80);

        jButton31.setText("jButton1");
        getContentPane().add(jButton31);
        jButton31.setBounds(570, 290, 80, 80);

        jButton32.setText("jButton1");
        getContentPane().add(jButton32);
        jButton32.setBounds(660, 290, 80, 80);

        jButton33.setText("jButton1");
        getContentPane().add(jButton33);
        jButton33.setBounds(10, 380, 80, 80);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/checkersgame/checkerBoard.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 760, 760);

        jButton34.setText("jButton1");
        getContentPane().add(jButton34);
        jButton34.setBounds(20, 20, 80, 80);

        jButton35.setText("jButton1");
        getContentPane().add(jButton35);
        jButton35.setBounds(20, 20, 80, 80);

        jButton36.setText("jButton1");
        getContentPane().add(jButton36);
        jButton36.setBounds(20, 20, 80, 80);

        jButton37.setText("jButton1");
        getContentPane().add(jButton37);
        jButton37.setBounds(20, 20, 80, 80);

        jButton38.setText("jButton1");
        getContentPane().add(jButton38);
        jButton38.setBounds(20, 20, 80, 80);

        jButton39.setText("jButton1");
        getContentPane().add(jButton39);
        jButton39.setBounds(20, 20, 80, 80);

        jButton40.setText("jButton1");
        getContentPane().add(jButton40);
        jButton40.setBounds(20, 20, 80, 80);

        jButton41.setText("jButton1");
        getContentPane().add(jButton41);
        jButton41.setBounds(20, 20, 80, 80);

        jButton42.setText("jButton1");
        getContentPane().add(jButton42);
        jButton42.setBounds(20, 20, 80, 80);

        jButton43.setText("jButton1");
        getContentPane().add(jButton43);
        jButton43.setBounds(20, 20, 80, 80);

        jButton44.setText("jButton1");
        getContentPane().add(jButton44);
        jButton44.setBounds(20, 20, 80, 80);

        jButton45.setText("jButton1");
        getContentPane().add(jButton45);
        jButton45.setBounds(20, 20, 80, 80);

        jButton46.setText("jButton1");
        getContentPane().add(jButton46);
        jButton46.setBounds(20, 20, 80, 80);

        jButton47.setText("jButton1");
        getContentPane().add(jButton47);
        jButton47.setBounds(20, 20, 80, 80);

        jButton48.setText("jButton1");
        getContentPane().add(jButton48);
        jButton48.setBounds(20, 20, 80, 80);

        jButton49.setText("jButton1");
        getContentPane().add(jButton49);
        jButton49.setBounds(20, 20, 80, 80);

        jButton50.setText("jButton1");
        getContentPane().add(jButton50);
        jButton50.setBounds(20, 20, 80, 80);

        jButton51.setText("jButton1");
        getContentPane().add(jButton51);
        jButton51.setBounds(20, 20, 80, 80);

        jButton52.setText("jButton1");
        getContentPane().add(jButton52);
        jButton52.setBounds(20, 20, 80, 80);

        jButton53.setText("jButton1");
        getContentPane().add(jButton53);
        jButton53.setBounds(20, 20, 80, 80);

        jButton54.setText("jButton1");
        getContentPane().add(jButton54);
        jButton54.setBounds(20, 20, 80, 80);

        jButton55.setText("jButton1");
        getContentPane().add(jButton55);
        jButton55.setBounds(20, 20, 80, 80);

        jButton56.setText("jButton1");
        getContentPane().add(jButton56);
        jButton56.setBounds(20, 20, 80, 80);

        jButton57.setText("jButton1");
        getContentPane().add(jButton57);
        jButton57.setBounds(20, 20, 80, 80);

        jButton58.setText("jButton1");
        getContentPane().add(jButton58);
        jButton58.setBounds(20, 20, 80, 80);

        jButton59.setText("jButton1");
        getContentPane().add(jButton59);
        jButton59.setBounds(20, 20, 80, 80);

        jButton60.setText("jButton1");
        getContentPane().add(jButton60);
        jButton60.setBounds(20, 20, 80, 80);

        jButton61.setText("jButton1");
        getContentPane().add(jButton61);
        jButton61.setBounds(20, 20, 80, 80);

        jButton62.setText("jButton1");
        getContentPane().add(jButton62);
        jButton62.setBounds(20, 20, 80, 80);

        jButton63.setText("jButton1");
        getContentPane().add(jButton63);
        jButton63.setBounds(20, 20, 80, 80);

        jButton64.setText("jButton1");
        getContentPane().add(jButton64);
        jButton64.setBounds(20, 20, 80, 80);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void A1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A1ActionPerformed
        ImageIcon trial = new ImageIcon("redPiece.png");
        A1.setIcon(trial);
    }//GEN-LAST:event_A1ActionPerformed

    private void jButton30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton30ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton30ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GameBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GameBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GameBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GameBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GameBoard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton A1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton31;
    private javax.swing.JButton jButton32;
    private javax.swing.JButton jButton33;
    private javax.swing.JButton jButton34;
    private javax.swing.JButton jButton35;
    private javax.swing.JButton jButton36;
    private javax.swing.JButton jButton37;
    private javax.swing.JButton jButton38;
    private javax.swing.JButton jButton39;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton40;
    private javax.swing.JButton jButton41;
    private javax.swing.JButton jButton42;
    private javax.swing.JButton jButton43;
    private javax.swing.JButton jButton44;
    private javax.swing.JButton jButton45;
    private javax.swing.JButton jButton46;
    private javax.swing.JButton jButton47;
    private javax.swing.JButton jButton48;
    private javax.swing.JButton jButton49;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton50;
    private javax.swing.JButton jButton51;
    private javax.swing.JButton jButton52;
    private javax.swing.JButton jButton53;
    private javax.swing.JButton jButton54;
    private javax.swing.JButton jButton55;
    private javax.swing.JButton jButton56;
    private javax.swing.JButton jButton57;
    private javax.swing.JButton jButton58;
    private javax.swing.JButton jButton59;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton60;
    private javax.swing.JButton jButton61;
    private javax.swing.JButton jButton62;
    private javax.swing.JButton jButton63;
    private javax.swing.JButton jButton64;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}