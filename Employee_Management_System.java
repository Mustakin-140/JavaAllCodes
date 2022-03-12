
package Employee_Management_System;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.util.Vector;
   


public class Employee_Management_System extends javax.swing.JFrame
{
    private static final String Username = "java_test";
    private static final String Password ="Mahicse54";
    private static final String DB_NAME = "jdbc:mysql://localhost:3306/MUSTAKIN";
    
    
    Connection sqlcon = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    int q,i,id,deleteItem;
   
    public Employee_Management_System() 
    {
        initComponents();
    }
    
    public  void upDateDB()
    {
       try
       {
           Class.forName("com.mysql.jdbc.Driver");
           sqlcon = DriverManager.getConnection(DB_NAME,Username,Password);
           pst = sqlcon.prepareStatement("select * from employee");
           
           rs = pst.executeQuery();
           ResultSetMetaData stData = rs.getMetaData();
           
           q = stData.getColumnCount();
           
           DefaultTableModel RecordTable = (DefaultTableModel)jTable2.getModel();
           RecordTable.setRowCount(0);
           
           while(rs.next())
           {
               Vector columnData = new Vector();
               for(i = 1;i <= q; i++)
               {
                   columnData.add(rs.getShort("ID"));
                   columnData.add(rs.getShort("Name"));
                   columnData.add(rs.getShort("Address"));
                   columnData.add(rs.getShort("Telephone"));
                   columnData.add(rs.getShort("Department"));
               }
               RecordTable.addRow(columnData);
           }
        }
       catch(ClassNotFoundException | SQLException ex)
       {
           JOptionPane.showMessageDialog(null,ex);
           
       }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jtxtDept = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtxtAddress = new javax.swing.JTextArea();
        jtxtID = new javax.swing.JTextField();
        jtxtName = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jtxtTelephone = new javax.swing.JTextField();
        jbtnReset = new javax.swing.JButton();
        jbtnSave = new javax.swing.JButton();
        jbtnDelete = new javax.swing.JButton();
        jbtnUpdate = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 170, -1));

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel1.setText("Employee Management System");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 30, 590, -1));

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel2.setText("Dept.");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 380, -1, 20));

        jtxtDept.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(jtxtDept, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 370, 360, 30));

        jLabel3.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel3.setText("ID");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 130, 40, 20));

        jLabel5.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel5.setText("Name");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 180, -1, 20));

        jLabel6.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel6.setText("Address");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 240, -1, 20));

        jtxtAddress.setColumns(20);
        jtxtAddress.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jtxtAddress.setRows(5);
        jScrollPane1.setViewportView(jtxtAddress);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 210, 360, 90));

        jtxtID.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jtxtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtIDActionPerformed(evt);
            }
        });
        getContentPane().add(jtxtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 120, 360, 30));

        jtxtName.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jtxtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtNameActionPerformed(evt);
            }
        });
        getContentPane().add(jtxtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 170, 360, 30));

        jLabel7.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel7.setText("Telephone");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 320, -1, 20));

        jtxtTelephone.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(jtxtTelephone, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 320, 360, 30));

        jbtnReset.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jbtnReset.setText("Reset");
        jbtnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnResetActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 560, 90, 40));

        jbtnSave.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jbtnSave.setText("Save");
        jbtnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSaveActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 560, 90, 40));

        jbtnDelete.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jbtnDelete.setText("Delete");
        getContentPane().add(jbtnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 560, 100, 40));

        jbtnUpdate.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jbtnUpdate.setText("Update");
        getContentPane().add(jbtnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 560, 100, 40));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Address", "Telephone", "Department"
            }
        ));
        jScrollPane3.setViewportView(jTable2);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 420, 460, 100));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtxtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtIDActionPerformed
       
    }//GEN-LAST:event_jtxtIDActionPerformed

    private void jtxtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtNameActionPerformed
       
    }//GEN-LAST:event_jtxtNameActionPerformed

    private void jbtnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnResetActionPerformed
        jtxtID.setText("");
        jtxtName.setText("");
        jtxtAddress.setText("");
        jtxtTelephone.setText("");
        jtxtDept.setText("");
    }//GEN-LAST:event_jbtnResetActionPerformed

    private void jbtnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSaveActionPerformed
        try
       {
           Class.forName("com.mysql.jdbc.Driver");
           sqlcon = DriverManager.getConnection(DB_NAME,Username,Password);
           pst = sqlcon.prepareStatement("insert into  MUSTAKIN(ID,Name,Address,Telephone,Department)value(?,?,?,?,?)");
           pst.setString(1,jtxtID.getText());
           pst.setString(2,jtxtName.getText());
           pst.setString(3,jtxtAddress.getText());
           pst.setString(4,jtxtTelephone.getText());
           pst.setString(5,jtxtDept.getText());
           
           pst.executeUpdate();
           JOptionPane.showMessageDialog(this,"Record Saved");
           
           upDateDB();
       }
        
        catch(ClassNotFoundException | SQLException ex)
        {
            java.util.logging.Logger.getLogger(Java_Mysqlconn.class.getName()).log(java.util.logging.Level.SEVERE,null,ex);
            
        }
    }//GEN-LAST:event_jbtnSaveActionPerformed

   
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(() -> {
            new Employee_Management_System().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable2;
    private javax.swing.JButton jbtnDelete;
    private javax.swing.JButton jbtnReset;
    private javax.swing.JButton jbtnSave;
    private javax.swing.JButton jbtnUpdate;
    private javax.swing.JTextArea jtxtAddress;
    private javax.swing.JTextField jtxtDept;
    private javax.swing.JTextField jtxtID;
    private javax.swing.JTextField jtxtName;
    private javax.swing.JTextField jtxtTelephone;
    // End of variables declaration//GEN-END:variables
}
