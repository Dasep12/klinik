/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.operator;
import Conection.Conn ;
import java.sql.Connection;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author dasep
 */
public class Master_obat extends javax.swing.JFrame {

    /**
     * Creates new form Master_obat
     */
    private String id ;
    public Master_obat() {
        initComponents();
        loadData(this.id);
        reset.setEnabled(false);
        hapus.setEnabled(false);
        ubah.setEnabled(false);
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
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        obat = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        id_obat = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        nama_obat = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        expired = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        supplier = new javax.swing.JTextField();
        harga_obat = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        ubah = new javax.swing.JButton();
        hapus = new javax.swing.JButton();
        tambah = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        refresh = new javax.swing.JButton();
        key = new javax.swing.JTextField();
        cari = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(225, 225, 225));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(71, 82, 83));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Data Obat", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        obat.setBackground(new java.awt.Color(77, 80, 89));
        obat.setForeground(new java.awt.Color(255, 255, 255));
        obat.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "No", "ID Obat", "Nama Obat", "Expired Date"
            }
        ));
        obat.setGridColor(new java.awt.Color(255, 255, 255));
        obat.setRowHeight(18);
        obat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                obatMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(obat);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 730, 220));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 750, 250));

        jPanel3.setBackground(new java.awt.Color(71, 82, 83));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tambah Data Obat", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel3.setForeground(java.awt.Color.white);
        jPanel3.setLayout(null);

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ID Obat");
        jPanel3.add(jLabel2);
        jLabel2.setBounds(30, 40, 49, 33);

        id_obat.setBackground(new java.awt.Color(149, 72, 91));
        id_obat.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.add(id_obat);
        id_obat.setBounds(100, 40, 140, 33);

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nama  Obat");
        jPanel3.add(jLabel3);
        jLabel3.setBounds(10, 80, 100, 33);

        nama_obat.setBackground(new java.awt.Color(149, 72, 91));
        nama_obat.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.add(nama_obat);
        nama_obat.setBounds(100, 80, 140, 33);

        jLabel4.setForeground(java.awt.Color.white);
        jLabel4.setText("Tanggal Exp");
        jPanel3.add(jLabel4);
        jLabel4.setBounds(260, 40, 100, 33);

        expired.setBackground(new java.awt.Color(149, 72, 91));
        expired.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.add(expired);
        expired.setBounds(340, 40, 150, 33);

        jLabel5.setForeground(java.awt.Color.white);
        jLabel5.setText("Supplier");
        jPanel3.add(jLabel5);
        jLabel5.setBounds(270, 80, 100, 33);

        supplier.setBackground(new java.awt.Color(149, 72, 91));
        supplier.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.add(supplier);
        supplier.setBounds(340, 80, 150, 33);

        harga_obat.setBackground(new java.awt.Color(149, 72, 91));
        harga_obat.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.add(harga_obat);
        harga_obat.setBounds(550, 40, 140, 33);

        jLabel6.setForeground(java.awt.Color.white);
        jLabel6.setText("Harga");
        jPanel3.add(jLabel6);
        jLabel6.setBounds(500, 40, 70, 33);

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 750, 130));

        jPanel4.setBackground(new java.awt.Color(71, 82, 83));

        ubah.setBackground(new java.awt.Color(48, 37, 40));
        ubah.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        ubah.setForeground(new java.awt.Color(255, 255, 255));
        ubah.setText("Ubah");
        ubah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ubahActionPerformed(evt);
            }
        });

        hapus.setBackground(new java.awt.Color(48, 37, 40));
        hapus.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        hapus.setForeground(new java.awt.Color(255, 255, 255));
        hapus.setText("Hapus");
        hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusActionPerformed(evt);
            }
        });

        tambah.setBackground(new java.awt.Color(48, 37, 40));
        tambah.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        tambah.setForeground(new java.awt.Color(255, 255, 255));
        tambah.setText("Tambah");
        tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahActionPerformed(evt);
            }
        });

        reset.setBackground(new java.awt.Color(48, 37, 40));
        reset.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        reset.setForeground(new java.awt.Color(255, 255, 255));
        reset.setText("Reset");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(142, Short.MAX_VALUE)
                .addComponent(tambah, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ubah, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(hapus, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(126, 126, 126))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ubah, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hapus, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tambah, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 750, 70));

        jPanel5.setBackground(new java.awt.Color(181, 102, 102));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        refresh.setBackground(new java.awt.Color(48, 37, 40));
        refresh.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        refresh.setForeground(new java.awt.Color(255, 255, 255));
        refresh.setText("Refresh");
        refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshActionPerformed(evt);
            }
        });
        jPanel5.add(refresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 107, 38));

        key.setBackground(new java.awt.Color(149, 72, 91));
        key.setForeground(new java.awt.Color(255, 255, 255));
        jPanel5.add(key, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 40, 150, 30));

        cari.setBackground(new java.awt.Color(48, 37, 40));
        cari.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cari.setForeground(new java.awt.Color(255, 255, 255));
        cari.setText("Cari");
        cari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cariActionPerformed(evt);
            }
        });
        jPanel5.add(cari, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 40, 70, 30));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("MASTER OBAT");
        jPanel5.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 30, 190, 30));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 80));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 769, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 561, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambahActionPerformed
        // TODO add your handling code here:
        if(id_obat.getText().equals("") || nama_obat.getText().equals("")|| expired.getText().equals("")
                || supplier.getText().equals("") || harga_obat.getText().equals("")){
            JOptionPane.showMessageDialog(null,"field kosong");
        }else {
            try {
                String sql = "INSERT INTO  tbl_obat ("
                        + " id_obat , nama_obat , expired , "
                        + "supplier , harga) values "
                        + "('"+ id_obat.getText() +"' , '"+ nama_obat.getText() +"' , '"+ expired.getText() +"' , "
                        + "'"+ supplier.getText() +"' , '"+ harga_obat.getText() +"' ) " ;
                  java.sql.Connection conn = (Connection)Conn.configDB();
                  java.sql.PreparedStatement pst = conn.prepareStatement(sql);
                  pst.execute();
                  JOptionPane.showMessageDialog(null,"Penyimpanan Berhasil");
                   String data = null ;
                   loadData(data);
                   reset();
            }catch(Exception e){
                JOptionPane.showMessageDialog(null,e.getMessage());
            }
        }
    }//GEN-LAST:event_tambahActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        // TODO add your handling code here:
        reset();
    }//GEN-LAST:event_resetActionPerformed

    private void obatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_obatMouseClicked
        // TODO add your handling code here:
         int baris  = obat.rowAtPoint(evt.getPoint());
        String id = obat.getValueAt(baris,0).toString();
        id_obat.setText(id);
        id_obat.setEditable(false);
        tambah.setEnabled(false);
        ubah.setEnabled(true);
        hapus.setEnabled(true);
        reset.setEnabled(true);
        try {
            String sql = "Select * from tbl_obat where id_obat = '"+ id +"' " ;
            java.sql.Connection conn = (Connection)Conn.configDB();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet res = stm.executeQuery(sql);
            while(res.next()){
                nama_obat.setText(res.getString("nama_obat"));
                supplier.setText(res.getString("supplier"));
                expired.setText(res.getString("expired"));
                harga_obat.setText(res.getString("harga"));
            }
        }catch(Exception e){
            
        }
    }//GEN-LAST:event_obatMouseClicked

    private void ubahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ubahActionPerformed
        // TODO add your handling code here:
        if(id_obat.getText().equals("") || nama_obat.getText().equals("")|| expired.getText().equals("")
                || supplier.getText().equals("") || harga_obat.getText().equals("") ){
            JOptionPane.showMessageDialog(null,"field kosong");
        }else {
            try {
                String sql = "update tbl_obat  set"
                        + " nama_obat = '"+ nama_obat.getText() +"' ,"
                        + " expired = '"+ expired.getText() + "' , " 
                        + " supplier = '"+ supplier.getText() + "' , harga='"+ harga_obat.getText() +"' "
                                + " where id_obat='"+ id_obat.getText() +"' " ;
                  java.sql.Connection conn = (Connection)Conn.configDB();
                  java.sql.PreparedStatement pst = conn.prepareStatement(sql);
                  pst.execute();
                  JOptionPane.showMessageDialog(null,"Penyimpanan Berhasil");
                    String data = null ;
                    loadData(data);
                  reset();
            }catch(Exception e){
                JOptionPane.showMessageDialog(null,e.getMessage());
            }
        }
    }//GEN-LAST:event_ubahActionPerformed

    private void hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusActionPerformed
        // TODO add your handling code here:
     int option =    JOptionPane.showConfirmDialog(null, "Hapus ? ");
        switch(option){
            case JOptionPane.YES_OPTION : 
                try {
                    String sql = "delete from tbl_obat where id_obat = '"+ id_obat.getText() +"' " ;
                    java.sql.Connection conn = (Connection)Conn.configDB();
                    java.sql.PreparedStatement pst = conn.prepareStatement(sql);
                    pst.execute();
                   JOptionPane.showMessageDialog(null, "data di hapus");
                   reset();
                   String data = null ;
                   loadData(data);
                }catch(Exception e){
                    JOptionPane.showMessageDialog(null, e.getMessage());
                }
                break ;
            default :
                
                break ;
        }
    }//GEN-LAST:event_hapusActionPerformed

    private void refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshActionPerformed
        // TODO add your handling code here:
        String data = null ;
        loadData(data);
    }//GEN-LAST:event_refreshActionPerformed

    private void cariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cariActionPerformed
        // TODO add your handling code here:
        if(key.getText().equals("")){
            JOptionPane.showMessageDialog(null,"keyword kosong");
        }else {
            String data = key.getText();
            loadData(data);
        }
    }//GEN-LAST:event_cariActionPerformed
        
        public void reset(){
            id_obat.setText("");
            nama_obat.setText("");
            expired.setText("");
            harga_obat.setText("");
            supplier.setText("");
            id_obat.setEditable(true);
            tambah.setEnabled(true);
            ubah.setEnabled(false);
            reset.setEnabled(false);
            hapus.setEnabled(false);

        }
    
    public void loadData(String data){
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("ID Obat");
        model.addColumn("Nama Obat");
        model.addColumn("Tanggal Exp");
        model.addColumn("Supplier");
        
        //tampilkan data makanan kedalam table 
        try {
            String sql = "" ;
            
            if(data == null ){
                sql = "Select * from tbl_obat  " ;
            }else {
                    sql = "Select * from tbl_obat where " 
                            + "id_obat like  '%"+ data +"%' or nama_obat like '%"+ data +"%'"
                            + "or supplier like '%"+ data +"%'  " ;
            }
                    java.sql.Connection conn = (Connection)Conn.configDB();
                    java.sql.Statement stm = conn.createStatement();
                    java.sql.ResultSet res = stm.executeQuery(sql);
                    while(res.next()){
                        model.addRow(new Object[] {res.getString("id_obat") ,  res.getString("nama_obat") ,
                            res.getString("expired") ,  res.getString("supplier") } );
                    }
            obat.setModel(model);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        } 
    }
    
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
            java.util.logging.Logger.getLogger(Master_obat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Master_obat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Master_obat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Master_obat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Master_obat().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cari;
    private javax.swing.JTextField expired;
    private javax.swing.JButton hapus;
    private javax.swing.JTextField harga_obat;
    private javax.swing.JTextField id_obat;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField key;
    private javax.swing.JTextField nama_obat;
    private javax.swing.JTable obat;
    private javax.swing.JButton refresh;
    private javax.swing.JButton reset;
    private javax.swing.JTextField supplier;
    private javax.swing.JButton tambah;
    private javax.swing.JButton ubah;
    // End of variables declaration//GEN-END:variables
}
