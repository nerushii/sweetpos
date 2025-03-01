package sweetpos;

//import com.mysql.cj.jdbc.result.ResultSetMetaData;
import java.awt.*;
//import java.awt.Color;
//import java.awt.Font;
import java.sql.*;
//import java.sql.Connection;
//import java.sql.ResultSet;
//import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;
//import java.sql.DriverManager;
//import java.sql.SQLException;
import java.util.*;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javaswingdev.drawer.Drawer;
import javaswingdev.drawer.DrawerController;
import javaswingdev.drawer.DrawerItem;
import javaswingdev.drawer.EventDrawer;

public class category extends javax.swing.JFrame {

    /**
     * Creates new form category
     */
    private DrawerController drawer;
    
    /*public category() {
        initComponents();
        table_update();
        getDrawer();
        getContentPane().setBackground(new java.awt.Color(255, 255, 255));
    }*/
    
    String name1;
    
    public category(String name) {
        initComponents();
        table_update();
        getDrawer();
        getContentPane().setBackground(new java.awt.Color(255, 255, 255));
        
        //Places the passed username string from login.java into the name1 variable that was declared a while ago then uses it to complete the string in the nameLabel variable
        this.name1 = name;
        nameLabel.setText("Hello," + name + "!");
    }

    Connection con1;
    PreparedStatement pst;
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        catLabel = new javax.swing.JLabel();
        staLabel = new javax.swing.JLabel();
        categtxt = new javax.swing.JTextField();
        stattxt = new javax.swing.JComboBox<>();
        addButton1 = new javax.swing.JButton();
        deleteButton1 = new javax.swing.JButton();
        updateButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        setResizable(false);

        menuButton.setBackground(new java.awt.Color(255, 255, 255));
        menuButton.setForeground(new java.awt.Color(255, 255, 255));
        menuButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/menuIcon.png"))); // NOI18N
        menuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuButtonActionPerformed(evt);
            }
        });

        jTable1.setFont(new java.awt.Font("Milky Nice", 0, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Category", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        catLabel.setFont(new java.awt.Font("Milky Nice", 0, 24)); // NOI18N
        catLabel.setForeground(new java.awt.Color(50, 80, 255));
        catLabel.setText("Category:");

        staLabel.setFont(new java.awt.Font("Milky Nice", 0, 24)); // NOI18N
        staLabel.setForeground(new java.awt.Color(50, 80, 255));
        staLabel.setText("Status:");

        categtxt.setFont(new java.awt.Font("Milky Nice", 0, 12)); // NOI18N
        categtxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        stattxt.setFont(new java.awt.Font("Milky Nice", 0, 12)); // NOI18N
        stattxt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Active", "Not Active" }));

        addButton1.setBackground(new java.awt.Color(50, 80, 255));
        addButton1.setFont(new java.awt.Font("Milky Nice", 0, 18)); // NOI18N
        addButton1.setForeground(new java.awt.Color(255, 255, 255));
        addButton1.setText("+ Add Category");
        addButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButton1ActionPerformed(evt);
            }
        });

        deleteButton1.setBackground(new java.awt.Color(255, 75, 85));
        deleteButton1.setFont(new java.awt.Font("Milky Nice", 0, 14)); // NOI18N
        deleteButton1.setForeground(new java.awt.Color(255, 255, 255));
        deleteButton1.setText("X Delete Category");
        deleteButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButton1ActionPerformed(evt);
            }
        });

        updateButton1.setBackground(new java.awt.Color(50, 80, 255));
        updateButton1.setFont(new java.awt.Font("Milky Nice", 0, 18)); // NOI18N
        updateButton1.setForeground(new java.awt.Color(255, 255, 255));
        updateButton1.setText("Update Category");
        updateButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(categtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(addButton1)
                        .addGap(18, 18, 18)
                        .addComponent(updateButton1)
                        .addGap(79, 79, 79)
                        .addComponent(deleteButton1))
                    .addComponent(catLabel)
                    .addComponent(staLabel)
                    .addComponent(stattxt, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(catLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(categtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(staLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(stattxt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(addButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                        .addComponent(updateButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(deleteButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48))
        );

        jLabel1.setFont(new java.awt.Font("Milky Nice", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Category");

        nameLabel.setFont(new java.awt.Font("Milky Nice", 0, 24)); // NOI18N
        nameLabel.setForeground(new java.awt.Color(50, 80, 255));
        nameLabel.setText(" ");
        nameLabel.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 565, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(menuButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(menuButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(nameLabel))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 637, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
  
    //Updates the table according to the values in the database and displays the data
    private void table_update () {
        try {
            
            int c;
            
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                con1 = DriverManager.getConnection("jdbc:mysql://localhost/sweetdb","root","");
                pst = con1.prepareStatement("select * from category");
                ResultSet rs = pst.executeQuery();
                ResultSetMetaData rsd = rs.getMetaData();
                
                //Stores the column count in c and set the row count of the model in the table to 0
                c = rsd.getColumnCount();
                DefaultTableModel d = (DefaultTableModel)jTable1.getModel();
                d.setRowCount(0);
                jTable1.setDefaultEditor(Object.class, null);
                
                //Modifies the table header to match the font in the current theme
                JTableHeader tableHeader = jTable1.getTableHeader();
                tableHeader.setBackground(Color.white);
                tableHeader.setForeground(Color.black);
                tableHeader.setFont(new Font("Milky Nice", Font.PLAIN, 14));
                
                //While there is atleast one row selected in the table, the selected row is then added and displayed into the table
                while(rs.next()) {
                    Vector v2 = new Vector();
                    for (int i = 1; i<=c; i++) {
                        v2.add(rs.getString("id"));
                        v2.add(rs.getString("category"));
                        v2.add(rs.getString("status"));
                    }
                    d.addRow(v2);
                }
                
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(inventory.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (SQLException ex) {
            Logger.getLogger(inventory.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    //Modifies the drawer and displays the components
    private void getDrawer() {
        drawer = Drawer.newDrawer(this)
                .header(new Header())
                .space(30)
                .background(new Color(185,210,250))
                .backgroundTransparent(0.3f)
                .drawerWidth(300)
                .duration(200)
                .enableScroll(true)
                .drawerBackground(new Color(185,210,250))
                
                //Adds clickable items/tabs with their respective icons
                .addChild(new DrawerItem("Category")
                        .icon(new ImageIcon(getClass().getResource("/icons/Category.gif")))
                        .font(new Font("Milky Nice", Font.PLAIN, 14))
                        .build())
                .addChild(new DrawerItem("Products")
                        .icon(new ImageIcon(getClass().getResource("/icons/Cookie.gif")))
                        .font(new Font("Milky Nice", Font.PLAIN, 14))
                        .build())
                .addChild(new DrawerItem("Inventory")
                        .icon(new ImageIcon(getClass().getResource("/icons/Inventory.gif")))
                        .font(new Font("Milky Nice", Font.PLAIN, 14))
                        .build())
                .addChild(new DrawerItem("Release of Items")
                        .icon(new ImageIcon(getClass().getResource("/icons/releaseItem.gif")))
                        .font(new Font("Milky Nice", Font.PLAIN, 14))
                        .build())
                .addChild(new DrawerItem("  Point of Sales")
                        .icon(new ImageIcon(getClass().getResource("/icons/Receipt.gif")))
                        .font(new Font("Milky Nice", Font.PLAIN, 14))
                        .build())
                .addFooter(new DrawerItem("Exit")
                        .icon(new ImageIcon(getClass().getResource("/icons/exitIcon.png")))
                        .font(new Font("Milky Nice", Font.PLAIN, 14))
                        .build())
                        .event(new EventDrawer() {
                            @Override
                            
                            //Allow the switching of windows when their tab is selected
                            public void selected(int index, DrawerItem item) {
                                if (item.getLabel().equals("Products")) {
                                    category.this.setVisible(false);
                                    products r = new products(name1);
                                    r.setVisible(true);
                                }
                                if (item.getLabel().equals("Inventory")) {
                                    category.this.setVisible(false);
                                    inventory i = new inventory(name1);
                                    i.setVisible(true);
                                }
                                if (item.getLabel().equals("Release of Items")) {
                                    category.this.setVisible(false);
                                    roi o = new roi(name1);
                                    o.setVisible(true);
                                }
                                if (item.getLabel().equals("  Point of Sales")) {
                                    category.this.setVisible(false);
                                    pos p = new pos(name1);
                                    p.setVisible(true);
                                }
                                if (item.getLabel().equals("Exit")) {
                                    int dialogResult = JOptionPane.showConfirmDialog(null, "Do you want to exit the program?", "Warning", JOptionPane.YES_NO_OPTION);
                                    if (dialogResult == JOptionPane.YES_OPTION) {
                                    System.exit(0);
                                    }
                                }
                        }
                })
                .build();
    }
    
    //Shows or hide the drawer when button is clicked
    private void menuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuButtonActionPerformed
        if(drawer.isShow()) {
            drawer.hide();
        } else {
            drawer.show();
        }
    }//GEN-LAST:event_menuButtonActionPerformed

    //Passes the data/value of selected rows in the table into the category text field and status combo box
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        DefaultTableModel d1 = (DefaultTableModel)jTable1.getModel();
        int selectIndex = jTable1.getSelectedRow();
        categtxt.setText(d1.getValueAt(selectIndex, 1).toString());
        stattxt.setSelectedItem(d1.getValueAt(selectIndex, 2).toString());
    }//GEN-LAST:event_jTable1MouseClicked

    //Adds the inputted values into the database
    private void addButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButton1ActionPerformed
        String category = categtxt.getText();
        String status = stattxt.getSelectedItem().toString();
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con1 = DriverManager.getConnection("jdbc:mysql://localhost/sweetdb","root","");
            pst = con1.prepareStatement("insert into category(category,status)values(?,?)");
            pst.setString(1, category);
            pst.setString(2, status);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Category successfully added!");
            table_update();
            categtxt.setText("");
            stattxt.setSelectedIndex(-1);
            categtxt.requestFocus();

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(inventory.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(inventory.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_addButton1ActionPerformed

    //Deletes the data of selected row in the table
    private void deleteButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButton1ActionPerformed
        DefaultTableModel d1 = (DefaultTableModel)jTable1.getModel();
        int selectIndex = jTable1.getSelectedRow();
        int id = Integer.parseInt(d1.getValueAt(selectIndex, 0).toString());
        int dialogResult = JOptionPane.showConfirmDialog(null, "Do you want to delete the record?", "Warning", JOptionPane.YES_NO_OPTION);

        if (dialogResult == JOptionPane.YES_OPTION) {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                con1 = DriverManager.getConnection("jdbc:mysql://localhost/sweetdb","root","");
                pst = con1.prepareStatement("delete from category where id = ?");
                pst.setInt(1, id);
                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "Category successfully deleted!");
                table_update();
                categtxt.setText("");
                stattxt.setSelectedIndex(-1);
                categtxt.requestFocus();

            } catch (ClassNotFoundException ex) {
                Logger.getLogger(inventory.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(inventory.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_deleteButton1ActionPerformed

    //Updates the data of selected row in the table
    private void updateButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButton1ActionPerformed
        DefaultTableModel d1 = (DefaultTableModel)jTable1.getModel();
        int selectIndex = jTable1.getSelectedRow();
        int id = Integer.parseInt(d1.getValueAt(selectIndex, 0).toString());
        String category = categtxt.getText();
        String status = stattxt.getSelectedItem().toString();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con1 = DriverManager.getConnection("jdbc:mysql://localhost/sweetdb","root","");
            pst = con1.prepareStatement("update category set category = ?, status = ? where id = ?");
            pst.setString(1, category);
            pst.setString(2, status);
            pst.setInt(3, id);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Category successfully updated!");
            table_update();
            categtxt.setText("");
            stattxt.setSelectedIndex(-1);
            categtxt.requestFocus();

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(inventory.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(inventory.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_updateButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(category.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(category.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(category.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(category.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SplashScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton1;
    private javax.swing.JLabel catLabel;
    private javax.swing.JTextField categtxt;
    private javax.swing.JButton deleteButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton menuButton;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JLabel staLabel;
    private javax.swing.JComboBox<String> stattxt;
    private javax.swing.JButton updateButton1;
    // End of variables declaration//GEN-END:variables
}
