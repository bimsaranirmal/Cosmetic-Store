/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package cosmetic.store;

import Classes.DbConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author BIMSARA
 */
public class CategoryJPanel extends javax.swing.JPanel {
    
    Connection connection;
    PreparedStatement ps;

    /**
     * Creates new form CategoryJPanel
     */
    public CategoryJPanel() {
        initComponents();
        connection = DbConnection.getInstance().getConnection();
        loadTable();
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
        txtCatID = new javax.swing.JTextField();
        txtCatName = new javax.swing.JTextField();
        btnAddCategory = new javax.swing.JButton();
        btnUpdateCategory = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnCatDelete = new javax.swing.JButton();
        btnClearCarRecord = new javax.swing.JButton();
        btnCatSearch = new javax.swing.JButton();
        btnCatClear = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCategory = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        txtCatID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCatIDKeyPressed(evt);
            }
        });

        btnAddCategory.setBackground(new java.awt.Color(102, 102, 102));
        btnAddCategory.setForeground(new java.awt.Color(255, 255, 255));
        btnAddCategory.setText("Add");
        btnAddCategory.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAddCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddCategoryActionPerformed(evt);
            }
        });

        btnUpdateCategory.setBackground(new java.awt.Color(102, 102, 102));
        btnUpdateCategory.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdateCategory.setText("Update");
        btnUpdateCategory.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUpdateCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateCategoryActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(102, 102, 102));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText(" Category Name");
        jLabel1.setOpaque(true);

        jLabel2.setBackground(new java.awt.Color(102, 102, 102));
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText(" Category ID");
        jLabel2.setOpaque(true);

        btnCatDelete.setBackground(new java.awt.Color(102, 102, 102));
        btnCatDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnCatDelete.setText("Delete");
        btnCatDelete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCatDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCatDeleteActionPerformed(evt);
            }
        });

        btnClearCarRecord.setBackground(new java.awt.Color(102, 102, 102));
        btnClearCarRecord.setForeground(new java.awt.Color(255, 255, 255));
        btnClearCarRecord.setText("Clear");
        btnClearCarRecord.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnClearCarRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearCarRecordActionPerformed(evt);
            }
        });

        btnCatSearch.setBackground(new java.awt.Color(102, 102, 102));
        btnCatSearch.setForeground(new java.awt.Color(255, 255, 255));
        btnCatSearch.setText("Search");
        btnCatSearch.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCatSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCatSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(78, 78, 78)
                                .addComponent(btnUpdateCategory))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnCatSearch)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnAddCategory)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnClearCarRecord)
                            .addComponent(btnCatDelete)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCatID, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCatName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtCatID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtCatName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCatSearch)
                    .addComponent(btnClearCarRecord)
                    .addComponent(btnAddCategory))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdateCategory)
                    .addComponent(btnCatDelete))
                .addGap(121, 121, 121))
        );

        btnCatClear.setBackground(new java.awt.Color(102, 102, 102));
        btnCatClear.setForeground(new java.awt.Color(255, 255, 255));
        btnCatClear.setText("Clear");
        btnCatClear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCatClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCatClearActionPerformed(evt);
            }
        });

        tblCategory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Category ID", "Category Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblCategory.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tblCategory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCategoryMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblCategory);

        jLabel3.setBackground(new java.awt.Color(153, 153, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8-category-30.png"))); // NOI18N
        jLabel3.setText("Manage Category");
        jLabel3.setOpaque(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCatClear)
                        .addGap(343, 343, 343))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCatClear))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddCategoryActionPerformed
        try {
    // Validate fields
    String name = txtCatName.getText();
    if (name.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Category Name is required!");
        return;
    }

    // Generate the next category ID automatically
    String getMaxIdSql = "SELECT MAX(CAST(SUBSTR(Category_ID, 3) AS UNSIGNED)) AS max_id FROM tblCategory";
    ps = connection.prepareStatement(getMaxIdSql);
    ResultSet rs = ps.executeQuery();

    String newId;
    if (rs.next() && rs.getObject("max_id") != null) {
        int maxId = rs.getInt("max_id");
        newId = "C-" + String.format("%04d", maxId + 1);  // Format new ID with leading zeros
    } else {
        newId = "C-0001";  // If no IDs exist, start with "C-0001"
    }

    // Set the new ID to the text field
    txtCatID.setText(newId);

    // Check if category ID already exists
    String checkSql = "SELECT * FROM tblCategory WHERE Category_ID = ?";
    ps = connection.prepareStatement(checkSql);
    ps.setString(1, newId);
    rs = ps.executeQuery();

    if (rs.next()) {
        JOptionPane.showMessageDialog(this, "Category ID already exists! Please generate a different ID.");
    } else {
        // Insert the new category record
        String addSql = "INSERT INTO tblCategory (Category_ID, Category_Name) VALUES (?, ?)";
        ps = connection.prepareStatement(addSql);
        ps.setString(1, newId);
        ps.setString(2, name);

        if (ps.executeUpdate() > 0) {
            JOptionPane.showMessageDialog(this, "Category Record Inserted!");
            clear();
            loadTable();
        }
    }
} catch (Exception e) {
    e.printStackTrace();
}
    }//GEN-LAST:event_btnAddCategoryActionPerformed

    private void btnUpdateCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateCategoryActionPerformed
         try {
        // Get category details from text fields
        String id = txtCatID.getText();
        String name = txtCatName.getText();

        // Validate fields
        if (id.isEmpty() || name.isEmpty()) {
            JOptionPane.showMessageDialog(this, "All fields are required!");
            return;
        }

        // Update the category record
        String sql = "UPDATE tblCategory SET Category_Name=? WHERE Category_ID = ?";
        ps = connection.prepareStatement(sql);
        ps.setString(1, name);
        ps.setString(2, id);

        if (ps.executeUpdate() > 0) {
            JOptionPane.showMessageDialog(this, "The Category Record Updated!");
            clear();
            loadTable();
        } else {
            JOptionPane.showMessageDialog(this, "Category ID not found!");
        }

    } catch (Exception e) {
        e.printStackTrace();
    }
    }//GEN-LAST:event_btnUpdateCategoryActionPerformed

    private void btnCatDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCatDeleteActionPerformed
         int res = JOptionPane.showConfirmDialog(this,
                "Do you want to Exit ?",
                "Exit",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);
        
        if(res== JOptionPane.YES_OPTION){
            deleteCategory();      
        }
        
    }//GEN-LAST:event_btnCatDeleteActionPerformed

    private void tblCategoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCategoryMouseClicked
        DefaultTableModel model = (DefaultTableModel)tblCategory.getModel();

        int row = tblCategory.getSelectedRow();
        txtCatID.setText(model.getValueAt(row, 0).toString());
        txtCatName.setText(model.getValueAt(row, 1).toString());
    }//GEN-LAST:event_tblCategoryMouseClicked

    private void btnClearCarRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearCarRecordActionPerformed
        clear();
    }//GEN-LAST:event_btnClearCarRecordActionPerformed

    private void btnCatSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCatSearchActionPerformed
        try {
            String id = txtCatID.getText();
            String sql = "SELECT * FROM tblCategory WHERE Category_ID =?";
            ps = connection.prepareStatement(sql);

            ps.setString(1, id);

            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                txtCatName.setText(rs.getString(2));
            } else {
                JOptionPane.showMessageDialog(this, "Category Record Not Found!");
                clear();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnCatSearchActionPerformed

    private void btnCatClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCatClearActionPerformed
        DefaultTableModel model = (DefaultTableModel)tblCategory.getModel();
        model.setRowCount(0);
    }//GEN-LAST:event_btnCatClearActionPerformed

    private void txtCatIDKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCatIDKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCatIDKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddCategory;
    private javax.swing.JButton btnCatClear;
    private javax.swing.JButton btnCatDelete;
    private javax.swing.JButton btnCatSearch;
    private javax.swing.JButton btnClearCarRecord;
    private javax.swing.JButton btnUpdateCategory;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblCategory;
    private javax.swing.JTextField txtCatID;
    private javax.swing.JTextField txtCatName;
    // End of variables declaration//GEN-END:variables
   private void clear() {
        txtCatID.setText("");
        txtCatName.setText("");
    }
   
   private void loadTable() {
        try{
            String sql="SELECT * FROM tblCategory";

            ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            DefaultTableModel model = (DefaultTableModel)tblCategory.getModel();
            model.setRowCount(0);
            while(rs.next()){
                model.addRow(new String[]{rs.getString(1),
                    rs.getString(2)});
        }

        }catch(Exception e) {
            e.printStackTrace();
        }
    }
   
   private void deleteCategory(){
       try {
            String id = txtCatID.getText();
            String name = txtCatName.getText();

        // Validate fields
        if (id.isEmpty() || name.isEmpty()) {
            JOptionPane.showMessageDialog(this, "All fields are required!");
            return;
        }
            String sql = "DELETE FROM tblCategory WHERE Category_ID =?";
            ps = connection.prepareStatement(sql);

            ps.setString(1, id);

            if (ps.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(this, "The Category Record Deleted!");
                clear();
                loadTable();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
   }
}
