/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package les_classe;

import com.toedter.calendar.JTextFieldDateEditor;
import java.awt.Color;
import java.sql.Connection;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ramez
 */
public class AjouterDate extends javax.swing.JFrame {

    /**
     * Creates new form AjouterDate
     */
    Connection con ;
    
    int mouse_x;
    int mouse_y;
    AjouterService aa;
    public AjouterDate(AjouterService a) {
        aa=a;
        con = DbConnection.connect();
        this.setUndecorated(true);
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jTextField1 = new javax.swing.JTextField();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(35, 45, 49));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Date :");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 83, 68, 41));

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Lieu :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 151, 68, 41));

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Remarque :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 78, 41));

        JTextFieldDateEditor dateChooserEditor = ((JTextFieldDateEditor)jDateChooser1.getDateEditor());
        dateChooserEditor.setBackground(new Color(35, 45, 49));
        dateChooserEditor.setCaretColor(Color.WHITE);
        dateChooserEditor.setForeground(new java.awt.Color(255, 255, 255));
        jDateChooser1.setBackground(new java.awt.Color(44, 62, 80));
        jDateChooser1.setForeground(new java.awt.Color(255, 255, 255));
        jDateChooser1.setDateFormatString("d/M/yyyy");
        jDateChooser1.setOpaque(false);
        jDateChooser1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jDateChooser1FocusLost(evt);
            }
        });
        jPanel1.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(139, 94, 203, 30));
        dateChooserEditor.setForeground(new java.awt.Color(255, 255, 255));

        jTextField1.setBackground(new java.awt.Color(35, 45, 49));
        jTextField1.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setText("ex : movenpick");
        jTextField1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jTextField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField1FocusLost(evt);
            }
        });
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(139, 158, 320, 30));
        jTextField1.setCaretColor(Color.WHITE);

        jFormattedTextField1.setBackground(new java.awt.Color(35, 45, 49));
        jFormattedTextField1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jFormattedTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jFormattedTextField1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getTimeInstance(java.text.DateFormat.SHORT))));
        jFormattedTextField1.setText("  hh:mm");
        jFormattedTextField1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jFormattedTextField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jFormattedTextField1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jFormattedTextField1FocusLost(evt);
            }
        });
        jPanel1.add(jFormattedTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 94, 101, 30));
        jFormattedTextField1.setCaretColor(Color.WHITE);
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 192, 320, 10));

        jLabel4.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(247, 212, 32));
        jLabel4.setText("Ajouter les Donn??es du  Date");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, -1, 50));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, 320, 10));

        jTextField2.setBackground(new java.awt.Color(35, 45, 49));
        jTextField2.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(255, 255, 255));
        jTextField2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 320, 30));
        jTextField2.setCaretColor(Color.WHITE);

        jButton1.setBackground(new java.awt.Color(35, 45, 49));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(51, 51, 51));
        jButton1.setText("Ajouter");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 290, 90, 40));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gestion/de/boite/de/production/close.png"))); // NOI18N
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel6MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel6MouseReleased(evt);
            }
        });
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 10, -1, -1));

        jLabel7.setVisible(false);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gestion/de/boite/de/production/faux_Bouton.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 170, -1, 20));

        jLabel9.setVisible(false);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gestion/de/boite/de/production/faux_Bouton.png"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 100, -1, -1));

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 10, 350));

        jLabel5.setBackground(new java.awt.Color(35, 45, 49));
        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setToolTipText("");
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel5.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel5MouseDragged(evt);
            }
        });
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel5MousePressed(evt);
            }
        });
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 350));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel5MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseDragged
        // TODO add your handling code here:
        
       
        int screen_x = evt.getXOnScreen();
        int screen_y = evt.getYOnScreen();
        
        this.setLocation(screen_x-mouse_x,screen_y-mouse_y);
    }//GEN-LAST:event_jLabel5MouseDragged

    private void jLabel5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MousePressed
        // TODO add your handling code here:
        mouse_x = evt.getX();
        mouse_y = evt.getY();
    }//GEN-LAST:event_jLabel5MousePressed

    private void jLabel6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MousePressed
        // TODO add your handling code here:
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gestion/de/boite/de/production/close2.png")));
    }//GEN-LAST:event_jLabel6MousePressed

    private void jLabel6MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseReleased
        // TODO add your handling code here:
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gestion/de/boite/de/production/close.png")));
        
    }//GEN-LAST:event_jLabel6MouseReleased

    private void jTextField1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusGained
        // TODO add your handling code here:
        if(jTextField1.getText().equals("ex : movenpick"))
        {
            jTextField1.setText("");
        }
    }//GEN-LAST:event_jTextField1FocusGained

    private void jTextField1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusLost
        // TODO add your handling code here:
        if(jTextField1.getText().equals(""))
        {
            jTextField1.setText("ex : movenpick");
        }
        if(jTextField1.getText().equals("ex : movenpick")||jTextField1.getText().equals(""))
            jLabel7.setVisible(true);
        else
            jLabel7.setVisible(false);
    }//GEN-LAST:event_jTextField1FocusLost

    private void jFormattedTextField1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jFormattedTextField1FocusGained
        // TODO add your handling code here:
        if(jFormattedTextField1.getText().equals("  hh:mm"))
            jFormattedTextField1.setText("");
    }//GEN-LAST:event_jFormattedTextField1FocusGained

    private void jFormattedTextField1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jFormattedTextField1FocusLost
        // TODO add your handling code here:
        if(jFormattedTextField1.getText().equals(""))
            jFormattedTextField1.setText("  hh:mm");
        
        JTextFieldDateEditor dateChooserEditor = ((JTextFieldDateEditor)jDateChooser1.getDateEditor());
        if(dateChooserEditor.getText().length()>1&&jFormattedTextField1.getText().length()==5)
            jLabel9.setVisible(false);
        
        if(dateChooserEditor.getText().equals("")||jFormattedTextField1.getText().length()!=5)
        {
            jLabel9.setVisible(true);
        }
    }//GEN-LAST:event_jFormattedTextField1FocusLost

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        boolean champtest = true;
        JTextFieldDateEditor dateChooserEditor = ((JTextFieldDateEditor)jDateChooser1.getDateEditor());
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String lieu = jTextField1.getText();
        String rem = jTextField2.getText();
        if(lieu.equals("ex : movenpick")||lieu.equals(""))
        {
            jLabel7.setVisible(true);
            champtest= false;
        }
            
        if(dateChooserEditor.getText().equals("")||jFormattedTextField1.getText().length()!=5)
        {
            jLabel9.setVisible(true);
            champtest= false;
        }
        // AUCUN ERROR SUR LES TEXT FIELD
        if(champtest == true)
        {
            String datehour = dateFormat.format( jDateChooser1.getDate())+" "+jFormattedTextField1.getText();
            // MA TNEJAMCH TAJOUTI LES DATES KHATER HEchethom BEL num_SERVICE W EL NUM SERVICE mezel ma t7atech fil table mte3ou  
            
            DefaultTableModel model = aa.getTable();

            model.addRow(new Object[]{datehour,lieu,rem});
            

            aa.setEnabled(true);
            this.dispose();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jDateChooser1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jDateChooser1FocusLost
        // TODO add your handling code here:
        JTextFieldDateEditor dateChooserEditor = ((JTextFieldDateEditor)jDateChooser1.getDateEditor());
        if(dateChooserEditor.getText().length()>1&&jFormattedTextField1.getText().length()==5)
            jLabel9.setVisible(false);
        
        if(dateChooserEditor.getText().equals("")||jFormattedTextField1.getText().length()!=5)
        {
            jLabel9.setVisible(true);
          
        }

    }//GEN-LAST:event_jDateChooser1FocusLost

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        // TODO add your handling code here:
        aa.setEnabled(true);
        this.dispose();
    }//GEN-LAST:event_jLabel6MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         *
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AjouterDate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AjouterDate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AjouterDate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AjouterDate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
*/
        /* Create and display the form */
        try { 
        UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel"); 
        } catch(Exception ignored){}
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new AjouterDate().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
