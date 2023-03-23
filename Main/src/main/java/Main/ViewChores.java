/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Main;

import java.sql.*;
import javax.swing.JComboBox;
import javax.swing.table.DefaultTableModel;
import javax.swing.DefaultCellEditor;
import javax.swing.JOptionPane;
/**
 *
 * @author usercc
 */
public class ViewChores extends javax.swing.JFrame {

    /**
     * Creates new form ViewChores
     */
    public ViewChores() {
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
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        viewTaskTableOne = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        viewTaskTableTwo = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        notDoneAlertBtn = new javax.swing.JButton();
        viewLatestTask = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jButton1.setText("Home");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Create Chores List");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("View Task");

        jButton4.setText("Achivement");

        jLabel1.setText("View Task");

        viewTaskTableOne.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Task", "Description", "User-01 Task", "User-02 Task", "Changing Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        viewTaskTableOne.setColumnSelectionAllowed(true);
        jScrollPane1.setViewportView(viewTaskTableOne);
        viewTaskTableOne.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (viewTaskTableOne.getColumnModel().getColumnCount() > 0) {
            viewTaskTableOne.getColumnModel().getColumn(4).setCellEditor(new DefaultCellEditor(comboBox));
        }

        viewTaskTableTwo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Task", "Description", "User-01 Task", "User-02 Task", "Changing Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(viewTaskTableTwo);

        jLabel3.setText("This Week Task List");

        jLabel4.setText("Last Week Done Task List");

        notDoneAlertBtn.setText("Alert!");
        notDoneAlertBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                notDoneAlertBtnActionPerformed(evt);
            }
        });

        viewLatestTask.setText("Refresh");
        viewLatestTask.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewLatestTaskActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(198, 198, 198)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(notDoneAlertBtn))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(viewLatestTask))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addGap(176, 176, 176))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton3)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 512, Short.MAX_VALUE)
                            .addComponent(jScrollPane2))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(notDoneAlertBtn))
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(viewLatestTask))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void notDoneAlertBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_notDoneAlertBtnActionPerformed
        // TODO add your handling code here:
        showAlertLate();
    }//GEN-LAST:event_notDoneAlertBtnActionPerformed

    private void viewLatestTaskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewLatestTaskActionPerformed
        // TODO add your handling code here:
        sendQuery("SELECT * FROM chores Where chore_date >= date('now', 'weekday 5', '-7 days')", "One");
        sendQuery("SELECT * FROM chores Where chore_status = 0 and chore_date <= date('now', 'weekday 5', '-7 days') and chore_date >= date('now', 'weekday 5', '-14 days')", "Two");
    }//GEN-LAST:event_viewLatestTaskActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        showAlertLate();
        sendQuery("SELECT * FROM chores Where chore_date >= date('now', 'weekday 5', '-7 days')", "One");
        sendQuery("SELECT * FROM chores Where chore_status = 0 and chore_date <= date('now', 'weekday 5', '-7 days') and chore_date >= date('now', 'weekday 5', '-14 days')", "Two");
    }//GEN-LAST:event_formWindowOpened

    static JComboBox<String> comboBox = new JComboBox<>();

    
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
            java.util.logging.Logger.getLogger(ViewChores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewChores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewChores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewChores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        // add an item to the combo box in one line
        comboBox.addItem("Done");
        comboBox.addItem("Not Done");
        comboBox.addItem("Assigned");
        comboBox.addItem("Not - assigned"); 
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewChores().setVisible(true);
            }
        });
    }

    private void showAlertLate()
    {
        Connection conn = null;

        try {
            // db parameters
            String url = "jdbc:sqlite:./etal.db";
            // create a connection to the database
            conn = DriverManager.getConnection(url);
             // Execute a query
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM chores Where chore_status != 0 and chore_date >= date('now', 'weekday 5', '-7 days')");

            String toShow = "Chores not done: \n";
            // Retrieve data from the result set
            while (rs.next()) {
                toShow += rs.getString("chore_name") + "\n";
            }
            JOptionPane.showMessageDialog(null, toShow, "Alert", JOptionPane.WARNING_MESSAGE);

            // Close the result set, statement, and connection
            rs.close();
            stmt.close();
            conn.close();
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
    
    private void sendQuery(String query, String tableName)
    {
        Connection conn = null;

        try {
            // db parameters
            String url = "jdbc:sqlite:./etal.db";
            // create a connection to the database
            conn = DriverManager.getConnection(url);
             // Execute a query
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            if (tableName == "One")
            {
                //Reset Table
                DefaultTableModel model = (DefaultTableModel)viewTaskTableOne.getModel();
                model.setRowCount(0);
                viewTaskTableOne.repaint();

                // Retrieve data from the result set
                while (rs.next()) {
                    model.addRow(new Object[]{rs.getString("chore_name"),
                    rs.getString("chore_desc"),(rs.getBoolean("chore_first_user") ? "Yes" : "No"),
                    (rs.getBoolean("chore_second_user") ? "Yes" : "No"),comboBox.getItemAt(rs.getInt("chore_status"))});
                }
            }
            else if (tableName == "Two") {
                //Reset Table
                DefaultTableModel model = (DefaultTableModel)viewTaskTableTwo.getModel();
                model.setRowCount(0);
                viewTaskTableTwo.repaint();

                // Retrieve data from the result set
                while (rs.next()) {
                    model.addRow(new Object[]{rs.getString("chore_name"),
                    rs.getString("chore_desc"),(rs.getBoolean("chore_first_user") ? "Yes" : "No"),
                    (rs.getBoolean("chore_second_user") ? "Yes" : "No"),comboBox.getItemAt(rs.getInt("chore_status"))});
                }
            }

            // Close the result set, statement, and connection
            rs.close();
            stmt.close();
            conn.close();
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton notDoneAlertBtn;
    private javax.swing.JButton viewLatestTask;
    private javax.swing.JTable viewTaskTableOne;
    private javax.swing.JTable viewTaskTableTwo;
    // End of variables declaration//GEN-END:variables
}
