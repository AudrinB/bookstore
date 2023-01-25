/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package book.store.mis;

import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author UR PC
 */
public class Billing extends javax.swing.JFrame {
 public Billing() {
        initComponents();
      
        
    }
public Billing(String UN){
 initComponents();
 UnameLbl.setText(UN);
   DisplayBooks();
        BookNameTb.setEditable(false);
        PriceTb.setEditable(false);
}

 Connection con = null;
 Statement st = null;
 ResultSet Rs = null;   
 DefaultTableModel df;

 public void DisplayBooks() {
     
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bookstore", "root", "");
            String sql = "select * from BookTb";
            st = con.prepareStatement(sql);
            
            Rs = st.executeQuery(sql);
            BooksTable.setModel(DbUtils.resultSetToTableModel(Rs));
           
      

  }
         catch (SQLException ex) {
            Logger.getLogger(Books.class.getName()).log(Level.SEVERE, null, ex);
        }

 }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        UserLogo = new javax.swing.JLabel();
        UnameLbl = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        BookNameTb = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        ClientNameTb = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        QtyTb = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        PriceTb = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        BillNumTb = new javax.swing.JTextField();
        AddToBillBtn = new javax.swing.JButton();
        ResetBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        BooksTable = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        BillTxt = new javax.swing.JTextArea();
        UserLbl1 = new javax.swing.JLabel();
        PrintBtn = new javax.swing.JButton();
        LogoutBtn = new javax.swing.JLabel();
        GrdTotalLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        UserLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/book/store/mis/icons8-user-64.png"))); // NOI18N
        UserLogo.setText("jLabel2");
        UserLogo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UserLogoMouseClicked(evt);
            }
        });

        UnameLbl.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        UnameLbl.setForeground(new java.awt.Color(54, 93, 97));
        UnameLbl.setText("Users");
        UnameLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UnameLblMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(54, 93, 97));
        jLabel1.setText("BOOK-STORE MIS");

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/book/store/mis/icons8-close-window-32.png"))); // NOI18N
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(316, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(261, 261, 261)
                .addComponent(jLabel13)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(jLabel1))
                .addContainerGap())
        );

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(54, 93, 97));
        jLabel8.setText("Book Name");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(54, 93, 97));
        jLabel9.setText("Client Name");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(54, 93, 97));
        jLabel10.setText("Quantity");

        QtyTb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QtyTbActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(54, 93, 97));
        jLabel11.setText("Price");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(54, 93, 97));
        jLabel12.setText("Bill Number");

        AddToBillBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        AddToBillBtn.setForeground(new java.awt.Color(54, 93, 97));
        AddToBillBtn.setText("Add to bill");
        AddToBillBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddToBillBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AddToBillBtnMouseEntered(evt);
            }
        });
        AddToBillBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddToBillBtnActionPerformed(evt);
            }
        });

        ResetBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ResetBtn.setForeground(new java.awt.Color(54, 93, 97));
        ResetBtn.setText("Reset");
        ResetBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ResetBtnMouseClicked(evt);
            }
        });
        ResetBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetBtnActionPerformed(evt);
            }
        });

        BooksTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Title", "Author", "Categories", "Price"
            }
        ));
        BooksTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BooksTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(BooksTable);

        BillTxt.setColumns(20);
        BillTxt.setRows(5);
        jScrollPane2.setViewportView(BillTxt);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 311, Short.MAX_VALUE)
                .addContainerGap())
        );

        UserLbl1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        UserLbl1.setForeground(new java.awt.Color(54, 93, 97));
        UserLbl1.setText("Users");
        UserLbl1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UserLbl1MouseClicked(evt);
            }
        });

        PrintBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        PrintBtn.setForeground(new java.awt.Color(54, 93, 97));
        PrintBtn.setText("PRINT");
        PrintBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PrintBtnMouseClicked(evt);
            }
        });

        LogoutBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/book/store/mis/icons8-emergency-exit-32.png"))); // NOI18N
        LogoutBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LogoutBtnMouseClicked(evt);
            }
        });

        GrdTotalLbl.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        GrdTotalLbl.setForeground(new java.awt.Color(0, 153, 204));
        GrdTotalLbl.setText("Total");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(UserLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(UnameLbl))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BookNameTb, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(QtyTb))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                            .addComponent(BillNumTb)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ClientNameTb, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(AddToBillBtn))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(PriceTb, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(86, 86, 86)
                                .addComponent(ResetBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(LogoutBtn)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(UserLbl1)
                                .addGap(152, 152, 152))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(PrintBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(131, 131, 131))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(GrdTotalLbl)
                                .addGap(155, 155, 155))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(UserLbl1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(GrdTotalLbl)
                        .addGap(38, 38, 38)
                        .addComponent(PrintBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(LogoutBtn)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(UserLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(UnameLbl))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel8)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(BookNameTb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel10)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(QtyTb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel12)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(BillNumTb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel9)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(ClientNameTb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel11)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(PriceTb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(AddToBillBtn)
                                .addComponent(ResetBtn))
                            .addGap(18, 18, 18)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void UserLogoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UserLogoMouseClicked
        // TODO add your handling code here:
        new User().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_UserLogoMouseClicked

    private void UnameLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UnameLblMouseClicked

    }//GEN-LAST:event_UnameLblMouseClicked

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLabel13MouseClicked
private void SaveBill(){
     if(BillNumTb.getText().isEmpty() || ClientNameTb.getText().isEmpty()){
            
            JOptionPane.showMessageDialog(this,"Missing Information");
        }
        else{
            try{
             con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bookstore", "root", "");
             PreparedStatement add = (PreparedStatement) con.prepareStatement("insert into billtb values(?,?,?,?)");
             add.setInt(1, Integer.valueOf(BillNumTb.getText()));
             add.setString(2,UnameLbl.getText());
             add.setString(3,ClientNameTb.getText());
             add.setInt(4,Integer.valueOf(Total));           
             int row = add.executeUpdate();
             JOptionPane.showMessageDialog(this, "Bill Saved"); 
            } catch (Exception e){
                e.printStackTrace();
         
        }
        }
}
    
  private void Reset(){
    BookNameTb.setText("");
    PriceTb.setText("");
    QtyTb.setText("");
    ClientNameTb.setText("");
    BillTxt.setText("");
    i = 0;
    GrdTotalLbl.setText("Total");
    
}
int BId;
private void UpdatedBook(){
    int newQty = Stock - Integer.valueOf(QtyTb.getText());
    try{
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bookstore", "root", "");
              
                String Query = "Update BookTb set quantity="+newQty+" where id="+BId;
                Statement Delete = con.createStatement();
                Delete.executeUpdate(Query);
                JOptionPane.showMessageDialog(this, "Book Updated");
                DisplayBooks(); 
                //Reset();
            }
            catch(Exception e){
                e.printStackTrace();
            }
}  

    int i = 0, Total = 0, GrdTotal = 0;
    private void AddToBillBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToBillBtnMouseClicked
        // TODO add your handling code here:
        if(QtyTb.getText().isEmpty() || BookNameTb.getText().isEmpty()){
            JOptionPane.showMessageDialog(this,"Missing Information");
        }
        else if(Integer.valueOf(QtyTb.getText())>Stock){
        JOptionPane.showMessageDialog(this ,"No enough books in the stock");
    }else{
            i++;
            Total = Integer.valueOf(PriceTb.getText())*Integer.valueOf(QtyTb.getText());
            if( i == 1){
                BillTxt.setText(BillTxt.getText()+"     ==========BOOK SHOP==========\n"+"NUM     PRODUCT     PRICE     QUANTITY     TOTAL\n"+i+"         "+BookNameTb.getText()+"          "+PriceTb.getText()+"          "+QtyTb.getText()+"          "+Total+"\n");
            }
            else{
                BillTxt.setText(BillTxt.getText()+i+"          "+BookNameTb.getText()+"          "+PriceTb.getText()+"          "+QtyTb.getText()+"          "+Total+"\n"); 
            }
            GrdTotal = GrdTotal + Total;
            GrdTotalLbl.setText("Frw"+GrdTotal);
           UpdatedBook();
        }
       
    }//GEN-LAST:event_AddToBillBtnMouseClicked

    private void AddToBillBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddToBillBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddToBillBtnActionPerformed

    private void ResetBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ResetBtnMouseClicked
        // TODO add your handling code here:
        Reset();
    }//GEN-LAST:event_ResetBtnMouseClicked

    private void ResetBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ResetBtnActionPerformed

    private void UserLbl1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UserLbl1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_UserLbl1MouseClicked

    private void PrintBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PrintBtnMouseClicked
        // TODO add your handling code here:
        try{
            BillTxt.print();
        }
        catch (Exception e){

        }
        SaveBill();
        Reset();        
    }//GEN-LAST:event_PrintBtnMouseClicked

    private void LogoutBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutBtnMouseClicked
        // TODO add your handling code here:
        new LoginForm().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_LogoutBtnMouseClicked

    private void QtyTbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QtyTbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_QtyTbActionPerformed
int Stock = 0;
    private void BooksTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BooksTableMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)BooksTable.getModel();
        int MyIndex = BooksTable.getSelectedRow();
        BId = Integer.valueOf(model.getValueAt(MyIndex, 0).toString());
        BookNameTb.setText(model.getValueAt(MyIndex, 1).toString());
        Stock = Integer.valueOf(model.getValueAt(MyIndex, 4).toString());
        PriceTb.setText(model.getValueAt(MyIndex, 5).toString());
    }//GEN-LAST:event_BooksTableMouseClicked

    private void AddToBillBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddToBillBtnMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_AddToBillBtnMouseEntered

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
    private javax.swing.JButton AddToBillBtn;
    private javax.swing.JTextField BillNumTb;
    private javax.swing.JTextArea BillTxt;
    private javax.swing.JTextField BookNameTb;
    private javax.swing.JTable BooksTable;
    private javax.swing.JTextField ClientNameTb;
    private javax.swing.JLabel GrdTotalLbl;
    private javax.swing.JLabel LogoutBtn;
    private javax.swing.JTextField PriceTb;
    private javax.swing.JButton PrintBtn;
    private javax.swing.JTextField QtyTb;
    private javax.swing.JButton ResetBtn;
    private javax.swing.JLabel UnameLbl;
    private javax.swing.JLabel UserLbl1;
    private javax.swing.JLabel UserLogo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
