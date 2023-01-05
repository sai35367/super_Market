
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;
public class Seller extends javax.swing.JFrame {
        Connection cn;
        Statement st;
        ResultSet rs;
    public Seller() {
        initComponents();
        SelectSeller();
    }
    public void SelectSeller()
    {
        try { 
            cn=DriverManager.getConnection("jdbc:derby://localhost:1527/Super_Market","admin1","123456");
            st=cn.createStatement();
            rs=st.executeQuery("select * from ADMIN1.SELLTB");
            sellTable.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException ex) {
          ex.printStackTrace();
        }
        
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        sellTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        sellName = new javax.swing.JTextField();
        Gender = new javax.swing.JComboBox<>();
        sellID = new javax.swing.JTextField();
        Clear = new rojerusan.RSButtonHover();
        Add = new rojerusan.RSButtonHover();
        Edit = new rojerusan.RSButtonHover();
        Delete = new rojerusan.RSButtonHover();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        sellPass = new javax.swing.JPasswordField();
        jLabel11 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 0, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sellTable.setFont(new java.awt.Font("Book Antiqua", 1, 14)); // NOI18N
        sellTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "NAME", "PASSWORD", "GANDER"
            }
        ));
        sellTable.setIntercellSpacing(new java.awt.Dimension(0, 0));
        sellTable.setRowHeight(25);
        sellTable.setSelectionBackground(new java.awt.Color(0, 102, 255));
        sellTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sellTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(sellTable);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 1090, 340));

        jLabel1.setFont(new java.awt.Font("Book Antiqua", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("NAME");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, 60, 50));

        jLabel2.setFont(new java.awt.Font("Book Antiqua", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 51, 0));
        jLabel2.setText("SELLER LIST");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 310, 240, -1));

        jLabel3.setFont(new java.awt.Font("Book Antiqua", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("GENDER");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 130, 90, 50));

        jLabel5.setFont(new java.awt.Font("Book Antiqua", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 0, 0));
        jLabel5.setText("SELLERID");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 110, 50));

        jLabel6.setFont(new java.awt.Font("Book Antiqua", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 0, 0));
        jLabel6.setText("PASSWORD");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 80, 120, 50));

        sellName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        sellName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sellNameActionPerformed(evt);
            }
        });
        jPanel2.add(sellName, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 140, 180, 30));

        Gender.setFont(new java.awt.Font("Book Antiqua", 1, 14)); // NOI18N
        Gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        jPanel2.add(Gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 140, 180, 30));

        sellID.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        sellID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sellIDActionPerformed(evt);
            }
        });
        jPanel2.add(sellID, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, 180, 30));

        Clear.setText("CLEAR");
        Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearActionPerformed(evt);
            }
        });
        jPanel2.add(Clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 220, 110, -1));

        Add.setText("ADD");
        Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddActionPerformed(evt);
            }
        });
        jPanel2.add(Add, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 220, 110, -1));

        Edit.setText("EDIT");
        Edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditActionPerformed(evt);
            }
        });
        jPanel2.add(Edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 220, 110, -1));

        Delete.setText("DELETE");
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });
        jPanel2.add(Delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 220, 110, -1));

        jLabel7.setFont(new java.awt.Font("Book Antiqua", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 51, 0));
        jLabel7.setText("MANAGE SELLER");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, 330, 50));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 0, 0));
        jLabel8.setText("X");
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 10, 40, 40));

        sellPass.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel2.add(sellPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 92, 180, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 1080, 700));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logout.png"))); // NOI18N
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 640, 40, 40));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("CAT");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 70, 40));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("PRODUCT");
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 70, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 755, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(1194, 755));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void sellNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sellNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sellNameActionPerformed

    private void sellIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sellIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sellIDActionPerformed

    private void ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearActionPerformed
        sellID.setText("") ;
        sellPass.setText("");
        sellName.setText("");
    }//GEN-LAST:event_ClearActionPerformed

    private void AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddActionPerformed
        if(sellID.getText().isEmpty() || sellName.getText().isEmpty() || sellPass.getText().isEmpty()){
                  JOptionPane.showMessageDialog(this, "Missing Infomation");
            }
        else
        {
        try
        {
             //Class.forName("com.mysql.cj.jdbc.Driver");
             cn=DriverManager.getConnection("jdbc:derby://localhost:1527/Super_Market","admin1","123456"); 
             PreparedStatement add=cn.prepareCall("insert into SELLTB values(?,?,?,?)" );
             add.setInt(1,Integer.valueOf(sellID.getText()));
             add.setString(2,sellName.getText());
             add.setString(3,sellPass.getText());
             add.setString(4,Gender.getSelectedItem().toString());
             int row=add.executeUpdate();
             JOptionPane.showMessageDialog(this,"Seller Added Successfully");
        }
        catch(SQLException se)
        {
            se.printStackTrace();
        } 
        finally
        {
            try
            {
                cn.close();
                SelectSeller();
            }
            catch(Exception ee)
            {
                ee.printStackTrace();
            }
        }
      }
    }//GEN-LAST:event_AddActionPerformed
  
    private void EditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditActionPerformed
       if(sellID.getText().isEmpty() || sellName.getText().isEmpty() || sellPass.getText().isEmpty())
       {
                  JOptionPane.showMessageDialog(this, "Missing Infomation");
       }
       else
       {
           try{
               cn=DriverManager.getConnection("jdbc:derby://localhost:1527/Super_Market","admin1","123456"); 
               String q="Update ADMIN1.SELLTB set SELLNAME='"+sellName.getText()+"'"+",SELLPASS='"+sellPass.getText()+"'"+",SELLGENDER='"+Gender.getSelectedItem().toString()+"'"+"where SELLID="+sellID.getText();
               st=cn.createStatement();
               st.executeUpdate(q);
               SelectSeller();
               JOptionPane.showMessageDialog(this, "Seller Updated");
           }
           catch(SQLException se)
           {
               se.printStackTrace();
           }
       }
    }//GEN-LAST:event_EditActionPerformed

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
      if  (sellID.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Select the Seller to be Deleted");
        }
        else
        {
            try{
                cn=DriverManager.getConnection("jdbc:derby://localhost:1527/Super_Market","admin1","123456"); 
                String sr=sellID.getText();
                String q="Delete from ADMIN1.SELLTB where SELLID="+sr;
                st=cn.createStatement();
                st.executeUpdate(q);
                SelectSeller();
                JOptionPane.showMessageDialog(this, "Seller is Deleted");
            }
            catch(SQLException se){
                se.printStackTrace();
            }
        }
    }//GEN-LAST:event_DeleteActionPerformed

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel8MouseClicked

    private void sellTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sellTableMouseClicked
        DefaultTableModel model =(DefaultTableModel)sellTable.getModel();
        int Myindex =sellTable.getSelectedRow();
        sellID.setText(model.getValueAt(Myindex, 0).toString());
          sellName.setText(model.getValueAt(Myindex, 1).toString());
            sellPass.setText(model.getValueAt(Myindex, 2).toString());
        
    }//GEN-LAST:event_sellTableMouseClicked

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        setVisible(false);
        new Login().setVisible(true);
    }//GEN-LAST:event_jLabel11MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        setVisible(false);
        new Product().setVisible(true);
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        setVisible(false);
        new Category().setVisible(true);
    }//GEN-LAST:event_jLabel4MouseClicked

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
            java.util.logging.Logger.getLogger(Seller.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Seller.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Seller.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Seller.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Seller().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojerusan.RSButtonHover Add;
    private rojerusan.RSButtonHover Clear;
    private rojerusan.RSButtonHover Delete;
    private rojerusan.RSButtonHover Edit;
    private javax.swing.JComboBox<String> Gender;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField sellID;
    private javax.swing.JTextField sellName;
    private javax.swing.JPasswordField sellPass;
    private javax.swing.JTable sellTable;
    // End of variables declaration//GEN-END:variables
}
