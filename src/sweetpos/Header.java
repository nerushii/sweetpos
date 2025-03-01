/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package sweetpos;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.Timer;

/**
 *
 * @author Janieru
 */
public class Header extends javax.swing.JPanel {
    public Header() {
        initComponents();
        date_time();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        dateTime = new javax.swing.JLabel();

        setBackground(new java.awt.Color(185, 210, 250));
        setForeground(new java.awt.Color(185, 210, 250));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/sweetLogo.png"))); // NOI18N

        dateTime.setFont(new java.awt.Font("Milky Nice", 0, 14)); // NOI18N
        dateTime.setForeground(new java.awt.Color(50, 80, 255));
        dateTime.setText("Date");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(dateTime, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(dateTime)
                .addContainerGap(30, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void date_time() {
        Timer timer = new Timer(1000, e -> {
        Date currentDate = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("hh:mm a, dd/MM/yyyy");
        String formattedDateTime = dateFormat.format(currentDate);
        dateTime.setText(formattedDateTime);
        });
        timer.start();
    }    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel dateTime;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
