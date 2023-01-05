
import java.awt.print.PrinterException;
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
public class Billing extends javax.swing.JFrame {
        Connection cn;
        Statement st;
        ResultSet rs;
       Double Uprice,Total=0.0,Gtotal=0.0;
       int Av,i;
    public Billing() {
        initComponents();
        SelectProduct();
    }
     public void SelectProduct()
    {
        try { 
            
            cn=DriverManager.getConnection("jdbc:derby://localhost:1527/Super_Market","admin1","123456");
            st=cn.createStatement();
            rs=st.executeQuery("select * from ADMIN1.PRODUCTTB");
            proTable.setModel(DbUtils.resultSetToTableModel(rs));
        } 
        catch (SQLException ex) {
          ex.printStackTrace();
        }
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
        } catch (SQLException ex) 
        {
          ex.printStackTrace();
        }
    }
 public void update()
 {
       try{
               cn=DriverManager.getConnection("jdbc:derby://localhost:1527/Super_Market","admin1","123456"); 
               String q="Update ADMIN1.PRODUCTTB set PROQTY="+proQty.getText()+""+"where PRONAME="+proName.getText();
               st=cn.createStatement();
               //st.executeUpdate(q);
              SelectProduct();
               //JOptionPane.showMessageDialog(this, "Product Updated");
           }
           catch(SQLException se)
           {
               se.printStackTrace();
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
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        proName = new javax.swing.JTextField();
        proCat = new javax.swing.JComboBox<>();
        billID = new javax.swing.JTextField();
        proQty = new javax.swing.JTextField();
        Clear = new rojerusan.RSButtonHover();
        Add = new rojerusan.RSButtonHover();
        Edit = new rojerusan.RSButtonHover();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        BillArea = new javax.swing.JTextArea();
        GT = new javax.swing.JLabel();
        Delete = new rojerusan.RSButtonHover();
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

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 140, 460, 240));

        jLabel1.setFont(new java.awt.Font("Book Antiqua", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("NAME");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 80, 50));

        jLabel2.setFont(new java.awt.Font("Book Antiqua", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 51, 0));
        jLabel2.setText("PRODUCT LIST");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 50, 190, -1));

        jLabel3.setFont(new java.awt.Font("Book Antiqua", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("FILLED BY");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 80, 110, 50));

        jLabel5.setFont(new java.awt.Font("Book Antiqua", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 0, 0));
        jLabel5.setText("BILLID");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 80, 50));

        jLabel6.setFont(new java.awt.Font("Book Antiqua", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 0, 0));
        jLabel6.setText("QUANTITY");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 120, 50));

        proName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        proName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proNameActionPerformed(evt);
            }
        });
        jPanel2.add(proName, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 140, 180, 30));

        proCat.setFont(new java.awt.Font("Book Antiqua", 1, 14)); // NOI18N
        proCat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Beverage", "Vagetable", "Meat" }));
        proCat.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                proCatItemStateChanged(evt);
            }
        });
        proCat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                proCatMouseClicked(evt);
            }
        });
        proCat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proCatActionPerformed(evt);
            }
        });
        jPanel2.add(proCat, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 90, 180, 30));

        billID.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        billID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                billIDActionPerformed(evt);
            }
        });
        jPanel2.add(billID, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, 180, 30));

        proQty.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        proQty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proQtyActionPerformed(evt);
            }
        });
        jPanel2.add(proQty, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, 180, 30));

        Clear.setText("CLEAR");
        Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearActionPerformed(evt);
            }
        });
        jPanel2.add(Clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 250, 130, 50));

        Add.setText("ADD BILL");
        Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddActionPerformed(evt);
            }
        });
        jPanel2.add(Add, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, 130, 50));

        Edit.setText("PRINT");
        Edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditActionPerformed(evt);
            }
        });
        jPanel2.add(Edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 740, 110, -1));

        jLabel7.setFont(new java.awt.Font("Book Antiqua", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 51, 0));
        jLabel7.setText("BILLING POINT");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 10, 290, 50));

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

        BillArea.setColumns(20);
        BillArea.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        BillArea.setRows(5);
        jScrollPane2.setViewportView(BillArea);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 400, 460, 320));

        GT.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        GT.setText("Rs");
        jPanel2.add(GT, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 736, 320, 40));

        Delete.setText("REFRESH");
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });
        jPanel2.add(Delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 90, 100, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 1090, 790));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logout.png"))); // NOI18N
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 60, 60));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1211, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 844, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(1211, 844));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void proTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_proTableMouseClicked
        DefaultTableModel model =(DefaultTableModel)proTable.getModel();
        //int q=Integer.parseInt(proQty.getText());
        int Myindex =proTable.getSelectedRow();
        //proID.setText(model.getValueAt(Myindex, 0).toString());
        proName.setText(model.getValueAt(Myindex, 1).toString());
        Av=Integer.valueOf(model.getValueAt(Myindex, 2).toString());
        Uprice=Double.valueOf(model.getValueAt(Myindex, 3).toString());
        //System.out.println("Sai");
        //System.out.println(Uprice);
        //int q= Integer.parseInt(proQty.getText());
        //System.out.println(q);
       //  Total=Uprice;
        //System.out.println(Total);
        //proQty.setText(model.getValueAt(Myindex, 2).toString());
        //proPrice.setText(model.getValueAt(Myindex, 3).toString());*/
    }//GEN-LAST:event_proTableMouseClicked

    private void proNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_proNameActionPerformed

    private void billIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_billIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_billIDActionPerformed

    private void proQtyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proQtyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_proQtyActionPerformed

    private void ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearActionPerformed
        billID.setText("");
        proName.setText("");
        //proPrice.setText("");
        proQty.setText("");
    }//GEN-LAST:event_ClearActionPerformed

    private void AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddActionPerformed

        if(proName.getText().isEmpty() || proQty.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Missing Infomation");
        }
       
       else{
             i++;
             Total=Uprice*Double.valueOf(proQty.getText());
             Gtotal=Gtotal+Total;
             if(i==1)
             {
                 
                 BillArea.setText(BillArea.getText()+"    ==========SHOPPING POINT==========\n"+"NUM    PRODUCT    PRICE      QUANTY   TOTAL\n"+i+"     "+proName.getText()+"     "+Uprice+"      "+proQty.getText()+"       "+Total+"\n");
             }
             else if(Av<=Integer.valueOf(proQty.getText()))
             {
                  JOptionPane.showMessageDialog(this, "Not Enough Of Stock");
             }
             else{
                  BillArea.setText(BillArea.getText()+i+"     "+proName.getText()+"     "+Uprice+"      "+proQty.getText()+"       "+Total+"\n");
             }
             GT.setText("Rs"+Gtotal);
          }
    }//GEN-LAST:event_AddActionPerformed

    private void EditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditActionPerformed
            try {
                BillArea.print();
            } catch (PrinterException ex) {
                
            }
    }//GEN-LAST:event_EditActionPerformed

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel8MouseClicked

    private void proCatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proCatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_proCatActionPerformed

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        setVisible(false);
        new Login().setVisible(true);
    }//GEN-LAST:event_jLabel11MouseClicked

    private void proCatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_proCatMouseClicked

    }//GEN-LAST:event_proCatMouseClicked

    private void proCatItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_proCatItemStateChanged

    }//GEN-LAST:event_proCatItemStateChanged

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
 SelectProduct();
    }//GEN-LAST:event_DeleteActionPerformed

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
            java.util.logging.Logger.getLogger(Billing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Billing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Billing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Billing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new Billing().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojerusan.RSButtonHover Add;
    private javax.swing.JTextArea BillArea;
    private rojerusan.RSButtonHover Clear;
    private rojerusan.RSButtonHover Delete;
    private rojerusan.RSButtonHover Edit;
    private javax.swing.JLabel GT;
    private javax.swing.JTextField billID;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox<String> proCat;
    private javax.swing.JTextField proName;
    private javax.swing.JTextField proQty;
    private javax.swing.JTable proTable;
    // End of variables declaration//GEN-END:variables
}
