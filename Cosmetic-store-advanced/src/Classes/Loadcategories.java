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
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author BIMSARA
 */
public class Loadcategories {
    public static void loadCategories(Connection connection, JComboBox<String> cmbCategory) {
        try {
            String sql = "SELECT Category_Name FROM tblCategory";
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            cmbCategory.removeAllItems();
            cmbCategory.addItem("");

            while (rs.next()) {
                String category = rs.getString("Category_Name");
                cmbCategory.addItem(category);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
