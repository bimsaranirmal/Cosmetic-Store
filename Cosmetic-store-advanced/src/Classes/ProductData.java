/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author BIMSARA
 */
public class ProductData {
    private Connection connection;
    private PreparedStatement ps;
    
    public ProductData(Connection connection) {
        this.connection = connection;
    }
    
    public void searchProduct(JTextField txtProductID, JTextField txtProductName, JComboBox cmbCategory,
                              JTextField txtPrice, JTextField txtStocks) {
        try {
            String id = txtProductID.getText();
            String name = txtProductName.getText();
            String category = (String) cmbCategory.getSelectedItem();
            Double price = null;
            if (!txtPrice.getText().isEmpty()) {
                price = Double.parseDouble(txtPrice.getText());
            }

            String sql = "SELECT * FROM tblproducts WHERE ";
            boolean isFirstCondition = true;

            if (!id.isEmpty()) {
                if (!isFirstCondition) {
                    sql += "AND ";
                }
                sql += "Product_ID = ? ";
                isFirstCondition = false;
            }
            if (!name.isEmpty()) {
                if (!isFirstCondition) {
                    sql += "AND ";
                }
                sql += "Product_Name = ? ";
                isFirstCondition = false;
            }
            if (category != null && !category.isEmpty()) {
                if (!isFirstCondition) {
                    sql += "AND ";
                }
                sql += "Category_Name = ? ";
                isFirstCondition = false;
            }
            if (price != null) {
                if (!isFirstCondition) {
                    sql += "AND ";
                }
                sql += "Stocks = ? ";
                isFirstCondition = false;
            }
            if (price != null) {
                if (!isFirstCondition) {
                    sql += "AND ";
                }
                sql += "Price = ? ";
                isFirstCondition = false;
            }

            ps = connection.prepareStatement(sql);

            int parameterIndex = 1;
            if (!id.isEmpty()) {
                ps.setString(parameterIndex++, id);
            }
            if (!name.isEmpty()) {
                ps.setString(parameterIndex++, name);
            }
            if (category != null && !category.isEmpty()) {
                ps.setString(parameterIndex++, category);
            }
            if (price != null) {
                ps.setDouble(parameterIndex, price);
            }

            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                txtProductID.setText(rs.getString("Product_ID"));
                txtProductName.setText(rs.getString("Product_Name"));
                cmbCategory.setSelectedItem(rs.getString("Category_Name"));
                txtPrice.setText(rs.getString("Price"));
                txtStocks.setText(rs.getString("Stocks"));
            } else {
                JOptionPane.showMessageDialog(null, "Product Record Not Found!");
                clear(txtProductID, txtProductName, cmbCategory, txtPrice, txtStocks); 
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void clear(JTextField txtProductID, JTextField txtProductName, JComboBox cmbCategory,
        JTextField txtPrice, JTextField txtStocks) {
        txtProductID.setText("");
        txtProductName.setText("");
        cmbCategory.setSelectedItem("");
        txtPrice.setText("");
        txtStocks.setText("");
    }
    
    public void loadProducts(DefaultTableModel model) {
        try {
            String sql = "SELECT * FROM tblproducts";

            ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            model.setRowCount(0);
            while (rs.next()) {
                model.addRow(new String[]{
                        rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        String.valueOf(rs.getDouble(4)),
                        String.valueOf(rs.getInt(5))
                });
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void clearTable(DefaultTableModel model) {
        model.setRowCount(0);
    }
}
