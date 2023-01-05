
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel; 
import net.proteanit.sql.DbUtils;
public class Product extends javax.swing.JFrame 
{
        Connection cn;
        Statement st;
        ResultSet rs;
    public Product() {
        initComponents();
        SelectProduct();
        GetCat();
    }
     public void GetCat()
    {
        try { 
            cn=DriverManager.getConnection("jdbc:derby://localhost:1527/Super_Market","admin1","123456");
            st=cn.createStatement();
            rs=st.executeQuery("select * from ADMIN1.CATEGORYTB");
            while(rs.next())
            {
                String cat=rs.getString("CATNAME");
                proCat.addItem(cat);
            }
        } catch (SQLException ex) {
          ex.printStackTrace();
        }
    }
     public void  SelectProduct()
     {
          try { 
            cn=DriverManager.getConnection("jdbc:derby://localhost:1527/Super_Market","admin1","123456");
            st=cn.createStatement();
            rs=st.executeQuery("select * from ADMIN1.PRODUCTTB");
            proTable.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException ex) {
          ex.printStackTrace();
        }
     }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        proTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        proPrice = new javax.swing.JTextField();
        proName = new javax.swing.JTextField();
        proCat = new javax.swing.JComboBox<>();
        proID = new javax.swing.JTextField();
        proQty = new javax.swing.JTextField();
        Clear = new rojerusan.RSButtonHover();
        Add = new rojerusan.RSButtonHover();
        Edit = new rojerusan.RSButtonHover();
        Delete = new rojerusan.RSButtonHover();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 0, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        proTable.setFont(new java.awt.Font("Book Antiqua", 1, 14)); // NOI18N
        proTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "NAME", "QUANTITY", "PRICE", "CATEGORY"
            }
        ));
        proTable.setIntercellSpacing(new java.awt.Dimension(0, 0));
        proTable.setRowHeight(25);
        proTable.setSelectionBackground(new java.awt.Color(0, 102, 255));
        proTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                proTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(proTable);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 1090, 340));

        jLabel1.setFont(new java.awt.Font("Book Antiqua", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("NAME");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 80, 50));

        jLabel2.setFont(new java.awt.Font("Book Antiqua", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 51, 0));
        jLabel2.setText("PRODUCT LIST");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 310, 290, -1));

        jLabel3.setFont(new java.awt.Font("Book Antiqua", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("CATEGORY");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 110, 50));

        jLabel4.setFont(new java.awt.Font("Book Antiqua", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        jLabel4.setText("PRICE");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 130, 70, 50));

        jLabel5.setFont(new java.awt.Font("Book Antiqua", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 0, 0));
        jLabel5.setText("PRODID");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 80, 50));

        jLabel6.setFont(new java.awt.Font("Book Antiqua", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 0, 0));
        jLabel6.setText("QUANTITY");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 80, 120, 50));

        proPrice.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        proPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proPriceActionPerformed(evt);
            }
        });
        jPanel2.add(proPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 140, 180, 30));

        proName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        proName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proNameActionPerformed(evt);
            }
        });
        jPanel2.add(proName, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 140, 180, 30));

        proCat.setFont(new java.awt.Font("Book Antiqua", 1, 14)); // NOI18N
        jPanel2.add(proCat, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, 180, 30));

        proID.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        proID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proIDActionPerformed(evt);
            }
        });
        jPanel2.add(proID, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, 180, 30));

        proQty.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        proQty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proQtyActionPerformed(evt);
            }
        });
        jPanel2.add(proQty, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 90, 180, 30));

        Clear.setText("CLEAR");
        Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearActionPerformed(evt);
            }
        });
        jPanel2.add(Clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 250, 110, -1));

        Add.setText("ADD");
        Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddActionPerformed(evt);
            }
        });
        jPanel2.add(Add, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 250, 110, -1));

        Edit.setText("EDIT");
        Edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditActionPerformed(evt);
            }
        });
        jPanel2.add(Edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 250, 110, -1));

        Delete.setText("DELETE");
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });
        jPanel2.add(Delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 250, 110, -1));

        jLabel7.setFont(new java.awt.Font("Book Antiqua", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 51, 0));
        jLabel7.setText("MANAGE PRODUCTS");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, 410, 50));

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

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 1090, 700));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("CAT");
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 50, 40));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("SELLER");
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 70, 40));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logout.png"))); // NOI18N
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 650, 40, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(1192, 753));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void proPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_proPriceActionPerformed

    private void proNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_proNameActionPerformed

    private void proIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_proIDActionPerformed

    private void proQtyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proQtyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_proQtyActionPerformed

    private void ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearActionPerformed
      proID.setText("");
      proName.setText("");
      proPrice.setText("");
      proQty.setText("");
    }//GEN-LAST:event_ClearActionPerformed

    private void AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddActionPerformed
        if(proID.getText().isEmpty() || proName.getText().isEmpty() || proQty.getText().isEmpty() || proPrice.getText().isEmpty()){
                  JOptionPane.showMessageDialog(this, "Missing Infomation");
         }
        else{          
            try
            {
             cn=DriverManager.getConnection("jdbc:derby://localhost:1527/Super_Market","admin1","123456"); 
             PreparedStatement add=cn.prepareCall("insert into PRODUCTTB values(?,?,?,?,?)" );
             add.setInt(1,Integer.valueOf(proID.getText()));
             add.setString(2,proName.getText());
             add.setInt(3,Integer.valueOf(proQty.getText()));
             add.setInt(4,Integer.valueOf(proPrice.getText()));
             add.setString(5,proCat.getSelectedItem().toString());
             int row=add.executeUpdate();
             JOptionPane.showMessageDialog(this, "Product Added Successfully");
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
                SelectProduct();
            }
            catch(Exception ee)
            {
                ee.printStackTrace();
            }
        }
    }
    }//GEN-LAST:event_AddActionPerformed

    private void EditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditActionPerformed
          if(proID.getText().isEmpty() || proName.getText().isEmpty() || proQty.getText().isEmpty() || proPrice.getText().isEmpty()){
                  JOptionPane.showMessageDialog(this, "Missing Infomation");
         }
       else
       {
           try{
               cn=DriverManager.getConnection("jdbc:derby://localhost:1527/Super_Market","admin1","123456"); 
               String q="Update ADMIN1.PRODUCTTB set PRONAME='"+proName.getText()+"'"+",PROQTY="+proQty.getText()+""+",PROPRICE="+proPrice.getText()+""+",PROCAT='"+proCat.getSelectedItem()+"'"+"where PROID="+proID.getText();
               st=cn.createStatement();
               st.executeUpdate(q);
              SelectProduct();
               JOptionPane.showMessageDialog(this, "Product Updated");
           }
           catch(SQLException se)
           {
               se.printStackTrace();
           }
       }
    }//GEN-LAST:event_EditActionPerformed

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
       if(proID.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Select the Seller to be Deleted");
        }
        else
        {
            try{
                cn=DriverManager.getConnection("jdbc:derby://localhost:1527/Super_Market","admin1","123456"); 
                String sr=proID.getText();
                String q="Delete from ADMIN1.PRODUCTTB where  PROID="+sr;
                st=cn.createStatement();
                st.executeUpdate(q);
                SelectProduct();
                JOptionPane.showMessageDialog(this, "Product is Deleted");
            }
            catch(SQLException se){
                se.printStackTrace();
            }
        }
    }//GEN-LAST:event_DeleteActionPerformed

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel8MouseClicked

    private void proTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_proTableMouseClicked
        DefaultTableModel model =(DefaultTableModel)proTable.getModel();
        int Myindex =proTable.getSelectedRow();
        proID.setText(model.getValueAt(Myindex, 0).toString());
        proName.setText(model.getValueAt(Myindex, 1).toString());
        proQty.setText(model.getValueAt(Myindex, 2).toString());
        proPrice.setText(model.getValueAt(Myindex, 3).toString());
    }//GEN-LAST:event_proTableMouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        setVisible(false);
        new Seller().setVisible(true);
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        setVisible(false);
        new Category().setVisible(true);
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        setVisible(false);
        new Login().setVisible(true);
    }//GEN-LAST:event_jLabel11MouseClicked

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
            java.util.logging.Logger.getLogger(Product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Product().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojerusan.RSButtonHover Add;
    private rojerusan.RSButtonHover Clear;
    private rojerusan.RSButtonHover Delete;
    private rojerusan.RSButtonHover Edit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JComboBox<String> proCat;
    private javax.swing.JTextField proID;
    private javax.swing.JTextField proName;
    private javax.swing.JTextField proPrice;
    private javax.swing.JTextField proQty;
    private javax.swing.JTable proTable;
    // End of variables declaration//GEN-END:variables
}
