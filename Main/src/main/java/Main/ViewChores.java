/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Main;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;
import javax.swing.event.TableModelEvent;
import javax.swing.table.DefaultTableModel;

import org.Database.DatabaseConnection;
import org.Database.DatabaseFunctions;

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

        jToolBar1 = new javax.swing.JToolBar();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
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
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();

        jToolBar1.setRollover(true);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("This system enables the creation of a weekly list of chores, allows for viewing of the chores, \nprovides the option to mark them as completed and track their progress. \nThe steps for using this system are outlined below:");
        jScrollPane3.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(0, 122, 106));
        jButton1.setFont(new java.awt.Font("PT Serif Caption", 1, 15)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Home");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 122, 106));
        jButton2.setFont(new java.awt.Font("PT Serif Caption", 1, 15)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Create Chores List");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(0, 122, 106));
        jButton3.setFont(new java.awt.Font("PT Serif Caption", 1, 15)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("View Task");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(0, 122, 106));
        jButton4.setFont(new java.awt.Font("PT Serif Caption", 1, 15)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Achivement");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(204, 204, 204));
        jLabel1.setFont(new java.awt.Font("PT Serif Caption", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 122, 106));
        jLabel1.setText("View Chores");
        jLabel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 153, 153), new java.awt.Color(0, 102, 102), null));

        viewTaskTableOne.setBackground(new java.awt.Color(176, 208, 211));
        viewTaskTableOne.setFont(new java.awt.Font("PT Sans Caption", 0, 14)); // NOI18N
        viewTaskTableOne.setForeground(new java.awt.Color(255, 255, 255));
        viewTaskTableOne.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "User", "Changing Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        viewTaskTableOne.setColumnSelectionAllowed(true);
        viewTaskTableOne.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                viewTaskTableOnePropertyChange(evt);
            }
        });
        viewTaskTableOne.addVetoableChangeListener(new java.beans.VetoableChangeListener() {
            public void vetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {
                viewTaskTableOneVetoableChange(evt);
            }
        });
        jScrollPane1.setViewportView(viewTaskTableOne);
        viewTaskTableOne.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        viewTaskTableTwo.setBackground(new java.awt.Color(176, 208, 211));
        viewTaskTableTwo.setFont(new java.awt.Font("PT Sans Caption", 0, 14)); // NOI18N
        viewTaskTableTwo.setForeground(new java.awt.Color(255, 255, 255));
        viewTaskTableTwo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "User", "Changing Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(viewTaskTableTwo);

        jLabel3.setFont(new java.awt.Font("PT Serif Caption", 1, 15)); // NOI18N
        jLabel3.setText("This Week Chores List:");

        jLabel4.setFont(new java.awt.Font("PT Serif Caption", 1, 15)); // NOI18N
        jLabel4.setText("Last Week Done Chores List:");

        notDoneAlertBtn.setBackground(new java.awt.Color(214, 40, 40));
        notDoneAlertBtn.setFont(new java.awt.Font("PT Serif Caption", 1, 15)); // NOI18N
        notDoneAlertBtn.setForeground(new java.awt.Color(255, 255, 255));
        notDoneAlertBtn.setText("Alert!");
        notDoneAlertBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                notDoneAlertBtnActionPerformed(evt);
            }
        });

        viewLatestTask.setBackground(new java.awt.Color(0, 122, 106));
        viewLatestTask.setFont(new java.awt.Font("PT Serif Caption", 1, 14)); // NOI18N
        viewLatestTask.setForeground(new java.awt.Color(255, 255, 255));
        viewLatestTask.setText("Refresh");
        viewLatestTask.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewLatestTaskActionPerformed(evt);
            }
        });

        jTextArea2.setEditable(false);
        jTextArea2.setBackground(new java.awt.Color(131, 197, 190));
        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("PT Sans Caption", 0, 14)); // NOI18N
        jTextArea2.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea2.setRows(5);
        jTextArea2.setText("1. View this week's list of chores here.\n2. Receive alerts for incomplete chores upon opening the app.\n3. Mark chores as done or not done by clicking the checkbox.\n4. Access last week's chore list.\n5. Use the refresh button to see any changes made.\n6. The table displays the chore ID, details, user, and status.");
        jScrollPane4.setViewportView(jTextArea2);

        jLabel2.setFont(new java.awt.Font("PT Serif Caption", 1, 15)); // NOI18N
        jLabel2.setText("Instructions:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addComponent(jScrollPane4)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(viewLatestTask))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(137, 137, 137)
                        .addComponent(notDoneAlertBtn)))
                .addGap(14, 14, 14))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(notDoneAlertBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addGap(7, 7, 7)
                .addComponent(jLabel2)
                .addGap(1, 1, 1)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(viewLatestTask)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        homePage home = new homePage();
        home.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        createList makeList = new createList();
        makeList.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void notDoneAlertBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_notDoneAlertBtnActionPerformed
        // TODO add your handling code here:
        ViewChores viewChoresList = new ViewChores();
        viewChoresList.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_notDoneAlertBtnActionPerformed

    private void viewLatestTaskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewLatestTaskActionPerformed
        // TODO add your handling code here:
        setTableOne();
        setTableTwo();
    }//GEN-LAST:event_viewLatestTaskActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        
        showAlertLate();
        setTableOne();
        setTableTwo();
        DatabaseFunctions df = new DatabaseFunctions();
        viewTaskTableOne.getModel().addTableModelListener(ev -> {
            if (ev.getType() == TableModelEvent.UPDATE)
            {
                int row = ev.getFirstRow();
                int column = ev.getColumn();
                String result = viewTaskTableOne.getModel().getValueAt(row, column).toString();
                String task = viewTaskTableOne.getModel().getValueAt(row, 0).toString();
                String setValue = (result == "true") ? "1" : "0";
                System.out.println(result + " - " + task + " - " + setValue);
                Chore c = new Chore(Integer.parseInt(task), task, "0", false, 1, "1");
                df.SET_CHORE_STATUS(c, (setValue == "1") ? 2 : 0);
            }
        });
    }//GEN-LAST:event_formWindowOpened

    private void viewTaskTableOnePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_viewTaskTableOnePropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_viewTaskTableOnePropertyChange

    private void viewTaskTableOneVetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {//GEN-FIRST:event_viewTaskTableOneVetoableChange
        // TODO add your handling code here:
    }//GEN-LAST:event_viewTaskTableOneVetoableChange

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        achievements gamification = new achievements();
        gamification.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        ViewChores viewChoresList = new ViewChores();
        viewChoresList.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    
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

        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewChores().setVisible(true);
            }
        });
    }

    private void setTableOne()
    {
        DatabaseFunctions df = new DatabaseFunctions();
        var gtwc = df.GET_THIS_WEEK_CHORE_LIST();

        DefaultTableModel model = (DefaultTableModel)viewTaskTableOne.getModel();
        model.setRowCount(0);
        viewTaskTableOne.repaint();

        for (Chore chore : gtwc) {
            model.addRow(new Object[]{chore.getName(),
            chore.getAssigned_to(),("Completed".equals(chore.status))});
        }
    }
//    table two
     private void setTableTwo()
    {
        DatabaseFunctions df = new DatabaseFunctions();
        var gtwc = df.GET_LAST_WEEK_FINISHED_CHORE_LIST();

        DefaultTableModel model = (DefaultTableModel)viewTaskTableTwo.getModel();
        model.setRowCount(0);
        viewTaskTableTwo.repaint();

        for (Chore chore : gtwc) {
            model.addRow(new Object[]{chore.getStatus(),
            chore.getName(),true});
        }
    }
    
    private void showAlertLate()
    {

        DatabaseFunctions df = new DatabaseFunctions();

        var gtwc = df.GET_THIS_WEEK_CHORE_LIST();

        String toShow = "";
        for (Chore chore : gtwc) {
            if (!"Completed".equals(chore.status))
                toShow += chore.getAssigned_to() + " - " + chore.getName() + "\n";
        }
        JOptionPane.showMessageDialog(null, toShow, "Chores not done", JOptionPane.WARNING_MESSAGE);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JButton notDoneAlertBtn;
    private javax.swing.JButton viewLatestTask;
    private javax.swing.JTable viewTaskTableOne;
    private javax.swing.JTable viewTaskTableTwo;
    // End of variables declaration//GEN-END:variables
}