
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

public class Category extends javax.swing.JFrame {
     Connection cn;
        Statement st;
        ResultSet rs;
    public Category() {
        initComponents();
        SelectCategory();
    }
      public void SelectCategory()
    {
        try { 
            cn=DriverManager.getConnection("jdbc:derby://localhost:1527/Super_Market","admin1","123456");
            st=cn.createStatement();
            rs=st.executeQuery("select * from ADMIN1.CATEGORYTB");
            catTable.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException ex) {
          ex.printStackTrace();
        }
        
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        catTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        catName = new javax.swing.JTextField();
        catID = new javax.swing.JTextField();
        Clear = new rojerusan.RSButtonHover();
        Add = new rojerusan.RSButtonHover();
        Edit = new rojerusan.RSButtonHover();
        Delete = new rojerusan.RSButtonHover();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        catDes = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        catTable1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        catName1 = new javax.swing.JTextField();
        catID1 = new javax.swing.JTextField();
        Clear1 = new rojerusan.RSButtonHover();
        Add1 = new rojerusan.RSButtonHover();
        Edit1 = new rojerusan.RSButtonHover();
        Delete1 = new rojerusan.RSButtonHover();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        catDes1 = new javax.swing.JTextArea();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 0, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        catTable.setFont(new java.awt.Font("Book Antiqua", 1, 14)); // NOI18N
        catTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "CATID", "NAME", "DESCRIPTION"
            }
        ));
        catTable.setIntercellSpacing(new java.awt.Dimension(0, 0));
        catTable.setRowHeight(25);
        catTable.setSelectionBackground(new java.awt.Color(0, 102, 255));
        catTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                catTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(catTable);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 1090, 340));

        jLabel1.setFont(new java.awt.Font("Book Antiqua", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("NAME");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, 60, 50));

        jLabel2.setFont(new java.awt.Font("Book Antiqua", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 51, 0));
        jLabel2.setText("CATEGORIES LIST");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 310, 360, -1));

        jLabel5.setFont(new java.awt.Font("Book Antiqua", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 0, 0));
        jLabel5.setText("CATID");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 70, 50));

        jLabel6.setFont(new java.awt.Font("Book Antiqua", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 0, 0));
        jLabel6.setText("DESCRIPTION");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 40, 140, 30));

        catName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        catName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                catNameActionPerformed(evt);
            }
        });
        jPanel2.add(catName, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 140, 180, 30));

        catID.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        catID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                catIDActionPerformed(evt);
            }
        });
        jPanel2.add(catID, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, 180, 30));

        Clear.setText("CLEAR");
        Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearActionPerformed(evt);
            }
        });
        jPanel2.add(Clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 220, 110, -1));

        Add.setText("ADD");
        Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddActionPerformed(evt);
            }
        });
        jPanel2.add(Add, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 220, 110, -1));

        Edit.setText("EDIT");
        Edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditActionPerformed(evt);
            }
        });
        jPanel2.add(Edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 220, 110, -1));

        Delete.setText("DELETE");
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });
        jPanel2.add(Delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 220, 110, -1));

        jLabel7.setFont(new java.awt.Font("Book Antiqua", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 51, 0));
        jLabel7.setText("MANAGE CATEGORIES");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, 440, 50));

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

        catDes.setColumns(20);
        catDes.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        catDes.setRows(5);
        jScrollPane2.setViewportView(catDes);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 70, 330, 120));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 1090, 700));

        jPanel3.setBackground(new java.awt.Color(255, 0, 102));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        catTable1.setFont(new java.awt.Font("Book Antiqua", 1, 14)); // NOI18N
        catTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "CATID", "NAME", "DESCRIPTION"
            }
        ));
        catTable1.setIntercellSpacing(new java.awt.Dimension(0, 0));
        catTable1.setRowHeight(25);
        catTable1.setSelectionBackground(new java.awt.Color(0, 102, 255));
        catTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                catTable1MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(catTable1);

        jPanel4.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 1090, 340));

        jLabel3.setFont(new java.awt.Font("Book Antiqua", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("NAME");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, 60, 50));

        jLabel4.setFont(new java.awt.Font("Book Antiqua", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 51, 0));
        jLabel4.setText("CATEGORIES LIST");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 310, 360, -1));

        jLabel9.setFont(new java.awt.Font("Book Antiqua", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 0, 0));
        jLabel9.setText("CATID");
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 70, 50));

        jLabel10.setFont(new java.awt.Font("Book Antiqua", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 0, 0));
        jLabel10.setText("DESCRIPTION");
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 40, 140, 30));

        catName1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        catName1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                catName1ActionPerformed(evt);
            }
        });
        jPanel4.add(catName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 140, 180, 30));

        catID1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        catID1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                catID1ActionPerformed(evt);
            }
        });
        jPanel4.add(catID1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, 180, 30));

        Clear1.setText("CLEAR");
        Clear1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Clear1ActionPerformed(evt);
            }
        });
        jPanel4.add(Clear1, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 220, 110, -1));

        Add1.setText("ADD");
        Add1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Add1ActionPerformed(evt);
            }
        });
        jPanel4.add(Add1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 220, 110, -1));

        Edit1.setText("EDIT");
        Edit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Edit1ActionPerformed(evt);
            }
        });
        jPanel4.add(Edit1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 220, 110, -1));

        Delete1.setText("DELETE");
        Delete1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Delete1ActionPerformed(evt);
            }
        });
        jPanel4.add(Delete1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 220, 110, -1));

        jLabel11.setFont(new java.awt.Font("Book Antiqua", 1, 36)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 51, 0));
        jLabel11.setText("MANAGE CATEGORIES");
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, 440, 50));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 0, 0));
        jLabel12.setText("X");
        jLabel12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });
        jPanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 10, 40, 40));

        catDes1.setColumns(20);
        catDes1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        catDes1.setRows(5);
        jScrollPane4.setViewportView(catDes1);

        jPanel4.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 70, 330, 120));

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 1090, 700));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logout.png"))); // NOI18N
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 640, 40, 40));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("PRODUCT");
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 70, 30));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("SELLER");
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 60, 30));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

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

    private void catNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_catNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_catNameActionPerformed

    private void catIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_catIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_catIDActionPerformed

    private void ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearActionPerformed
        catName.setText("");
        catID.setText("");
        catDes.setText("");
    }//GEN-LAST:event_ClearActionPerformed

    private void AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddActionPerformed
         if(catID.getText().isEmpty() || catName.getText().isEmpty() || catDes.getText().isEmpty()){
                  JOptionPane.showMessageDialog(this, "Missing Infomation");
         }
        else{          
            try
            {
             cn=DriverManager.getConnection("jdbc:derby://localhost:1527/Super_Market","admin1","123456"); 
             PreparedStatement add=cn.prepareCall("insert into CATEGORYTB values(?,?,?)" );
             add.setInt(1,Integer.valueOf(catID.getText()));
             add.setString(2,catName.getText());
             add.setString(3,catDes.getText());
             int row=add.executeUpdate();
             JOptionPane.showMessageDialog(this, "Categories Added Successfully");
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
                SelectCategory();
            }
            catch(Exception ee)
            {
                ee.printStackTrace();
            }
        }
    }
    }//GEN-LAST:event_AddActionPerformed

    private void EditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditActionPerformed
          if(catID.getText().isEmpty() || catName.getText().isEmpty() || catDes.getText().isEmpty())
       {
                  JOptionPane.showMessageDialog(this, "Missing Infomation");
       }
       else
       {
           try{
               cn=DriverManager.getConnection("jdbc:derby://localhost:1527/Super_Market","admin1","123456"); 
               String q="Update ADMIN1.CATEGORYTB set CATNAME='"+catName.getText()+"'"+",CATDES='"+catDes.getText()+"'"+"where CATID="+catID.getText();
               st=cn.createStatement();
               st.executeUpdate(q);
               SelectCategory();
               JOptionPane.showMessageDialog(this, "Category Updated");
           }
           catch(SQLException se)
           {
               se.printStackTrace();
           }
       }
    }//GEN-LAST:event_EditActionPerformed

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
         if(catID.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Select the Category to be Deleted");
        }
        else
        {
            try{
                cn=DriverManager.getConnection("jdbc:derby://localhost:1527/Super_Market","admin1","123456"); 
                String sr=catID.getText();
                String q="Delete from ADMIN1.CATEGORYTB where CATID="+sr;
                st=cn.createStatement();
                st.executeUpdate(q);
                SelectCategory();
                JOptionPane.showMessageDialog(this, "Category is Deleted");
            }
            catch(SQLException se){
                se.printStackTrace();
            }
        }
    }//GEN-LAST:event_DeleteActionPerformed

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel8MouseClicked

    private void catTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_catTableMouseClicked
          DefaultTableModel model =(DefaultTableModel)catTable.getModel();
          int Myindex =catTable.getSelectedRow();
          catID.setText(model.getValueAt(Myindex, 0).toString());
          catName.setText(model.getValueAt(Myindex, 1).toString());
          catDes.setText(model.getValueAt(Myindex, 2).toString());
    }//GEN-LAST:event_catTableMouseClicked

    private void catTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_catTable1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_catTable1MouseClicked

    private void catName1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_catName1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_catName1ActionPerformed

    private void catID1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_catID1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_catID1ActionPerformed

    private void Clear1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Clear1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Clear1ActionPerformed

    private void Add1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Add1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Add1ActionPerformed

    private void Edit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Edit1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Edit1ActionPerformed

    private void Delete1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Delete1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Delete1ActionPerformed

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel12MouseClicked

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        setVisible(false);
        new Login().setVisible(true);
    }//GEN-LAST:event_jLabel13MouseClicked

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        setVisible(false);
        new Seller().setVisible(true);
    }//GEN-LAST:event_jLabel15MouseClicked

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
        setVisible(false);
        new Product().setVisible(true);
    }//GEN-LAST:event_jLabel14MouseClicked

  
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Category().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojerusan.RSButtonHover Add;
    private rojerusan.RSButtonHover Add1;
    private rojerusan.RSButtonHover Clear;
    private rojerusan.RSButtonHover Clear1;
    private rojerusan.RSButtonHover Delete;
    private rojerusan.RSButtonHover Delete1;
    private rojerusan.RSButtonHover Edit;
    private rojerusan.RSButtonHover Edit1;
    private javax.swing.JTextArea catDes;
    private javax.swing.JTextArea catDes1;
    private javax.swing.JTextField catID;
    private javax.swing.JTextField catID1;
    private javax.swing.JTextField catName;
    private javax.swing.JTextField catName1;
    private javax.swing.JTable catTable;
    private javax.swing.JTable catTable1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
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
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    // End of variables declaration//GEN-END:variables
}
