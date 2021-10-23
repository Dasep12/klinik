/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Operator;

import Conection.Conn;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author cad-server
 */
public class Transaksi extends javax.swing.JFrame {
public  String idPasien ;
    /**
     * Creates new form Transaksi
     */ 
private String id ; 
    public Transaksi() {
        initComponents();
        getID(this.id);
        setTotalObat(this.id);
        loadObat(this.id);
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
        load_obat = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        total_obat = new javax.swing.JTextField();
        jasa_medis = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        print = new javax.swing.JButton();
        back = new javax.swing.JButton();
        save = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        penyakit = new javax.swing.JTextField();
        anamnesa_1 = new javax.swing.JTextField();
        diagnosa_1 = new javax.swing.JTextField();
        distole = new javax.swing.JTextField();
        id_pasien = new javax.swing.JTextField();
        nama_pasien = new javax.swing.JTextField();
        diagnosa_2 = new javax.swing.JTextField();
        anamnesa_2 = new javax.swing.JTextField();
        tindak_lanjut = new javax.swing.JTextField();
        sistol = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(71, 82, 83));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Data Obat", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        load_obat.setBackground(new java.awt.Color(71, 82, 83));
        load_obat.setForeground(new java.awt.Color(255, 255, 255));
        load_obat.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "No", "Nama Obat", "Harga"
            }
        ));
        jScrollPane1.setViewportView(load_obat);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 22, -1, 140));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 477, 170));

        jPanel3.setBackground(new java.awt.Color(181, 102, 102));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("TRANSAKSI PASIEN");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, 270, 30));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 60));

        jPanel4.setBackground(new java.awt.Color(181, 102, 102));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 60));

        jPanel5.setBackground(new java.awt.Color(71, 82, 83));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Biaya", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Total Biaya Obat");
        jPanel5.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 18, 90, 33));

        total_obat.setEditable(false);
        total_obat.setBackground(new java.awt.Color(149, 72, 91));
        total_obat.setForeground(new java.awt.Color(255, 255, 255));
        jPanel5.add(total_obat, new org.netbeans.lib.awtextra.AbsoluteConstraints(107, 18, 162, 33));

        jasa_medis.setBackground(new java.awt.Color(149, 72, 91));
        jasa_medis.setForeground(new java.awt.Color(255, 255, 255));
        jPanel5.add(jasa_medis, new org.netbeans.lib.awtextra.AbsoluteConstraints(107, 57, 162, 33));

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Jasa Medis");
        jPanel5.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 57, 90, 33));

        print.setBackground(new java.awt.Color(48, 37, 40));
        print.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        print.setForeground(new java.awt.Color(255, 255, 255));
        print.setText("Print");
        print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printActionPerformed(evt);
            }
        });
        jPanel5.add(print, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 102, 74, 40));

        back.setBackground(new java.awt.Color(48, 37, 40));
        back.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        back.setForeground(new java.awt.Color(255, 255, 255));
        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        jPanel5.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(97, 102, 74, 40));

        save.setBackground(new java.awt.Color(48, 37, 40));
        save.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        save.setForeground(new java.awt.Color(255, 255, 255));
        save.setText("Save");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });
        jPanel5.add(save, new org.netbeans.lib.awtextra.AbsoluteConstraints(183, 102, 74, 40));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 70, 280, 170));

        jPanel7.setBackground(new java.awt.Color(71, 82, 83));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Rekam Medis", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel7.setForeground(new java.awt.Color(255, 255, 255));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Distole");
        jPanel7.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 90, 33));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("ID Pasien");
        jPanel7.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 90, 33));

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Nama ");
        jPanel7.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 30, 90, 33));

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Diagnosa 1");
        jPanel7.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 90, 33));

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Diagnosa 2");
        jPanel7.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 110, 90, 33));

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Anamnesa 1");
        jPanel7.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 90, 33));

        jLabel15.setBackground(new java.awt.Color(255, 255, 255));
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Anamnesa 2");
        jPanel7.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 150, 90, 33));

        jLabel16.setBackground(new java.awt.Color(255, 255, 255));
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Nama Penyakit");
        jPanel7.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 90, 33));

        jLabel18.setBackground(new java.awt.Color(255, 255, 255));
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Tindak Lanjut");
        jPanel7.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 190, 100, 33));

        penyakit.setEditable(false);
        penyakit.setBackground(new java.awt.Color(149, 72, 91));
        penyakit.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        penyakit.setForeground(new java.awt.Color(255, 255, 255));
        jPanel7.add(penyakit, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, 230, 33));

        anamnesa_1.setEditable(false);
        anamnesa_1.setBackground(new java.awt.Color(149, 72, 91));
        anamnesa_1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        anamnesa_1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel7.add(anamnesa_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 230, 33));

        diagnosa_1.setEditable(false);
        diagnosa_1.setBackground(new java.awt.Color(149, 72, 91));
        diagnosa_1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        diagnosa_1.setForeground(new java.awt.Color(255, 255, 255));
        diagnosa_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diagnosa_1ActionPerformed(evt);
            }
        });
        jPanel7.add(diagnosa_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 230, 33));

        distole.setEditable(false);
        distole.setBackground(new java.awt.Color(149, 72, 91));
        distole.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        distole.setForeground(new java.awt.Color(255, 255, 255));
        jPanel7.add(distole, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 230, 33));

        id_pasien.setEditable(false);
        id_pasien.setBackground(new java.awt.Color(149, 72, 91));
        id_pasien.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        id_pasien.setForeground(new java.awt.Color(255, 255, 255));
        jPanel7.add(id_pasien, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, 230, 33));

        nama_pasien.setEditable(false);
        nama_pasien.setBackground(new java.awt.Color(149, 72, 91));
        nama_pasien.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        nama_pasien.setForeground(new java.awt.Color(255, 255, 255));
        jPanel7.add(nama_pasien, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 30, 230, 33));

        diagnosa_2.setEditable(false);
        diagnosa_2.setBackground(new java.awt.Color(149, 72, 91));
        diagnosa_2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        diagnosa_2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel7.add(diagnosa_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 110, 230, 33));

        anamnesa_2.setEditable(false);
        anamnesa_2.setBackground(new java.awt.Color(149, 72, 91));
        anamnesa_2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        anamnesa_2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel7.add(anamnesa_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 150, 230, 33));

        tindak_lanjut.setEditable(false);
        tindak_lanjut.setBackground(new java.awt.Color(149, 72, 91));
        tindak_lanjut.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        tindak_lanjut.setForeground(new java.awt.Color(255, 255, 255));
        jPanel7.add(tindak_lanjut, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 190, 230, 33));

        sistol.setEditable(false);
        sistol.setBackground(new java.awt.Color(149, 72, 91));
        sistol.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        sistol.setForeground(new java.awt.Color(255, 255, 255));
        jPanel7.add(sistol, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 70, 230, 33));

        jLabel17.setBackground(new java.awt.Color(255, 255, 255));
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Sistol");
        jPanel7.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 70, 90, 33));

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 760, 250));

        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 511, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void loadObat(String data){
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("No");
        model.addColumn("Nama Obat");
        model.addColumn("Harga Obat");
        
        //tampilkan data makanan kedalam table 
        try {
            int no = 1 ;
           
                  String  sql = "Select * from obat_pasien where " 
                            + "id_pasien=  '"+ data +"'   " ;
                    java.sql.Connection conn = (Connection)Conn.configDB();
                    java.sql.Statement stm = conn.createStatement();
                    java.sql.ResultSet res = stm.executeQuery(sql);
                    while(res.next()){
                        model.addRow(new Object[] {no++ , res.getString("obat") ,  res.getString("harga") } );
                    }
           load_obat.setModel(model);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        } 
    }
    public  void getID(String idPasien){
        id_pasien.setText(idPasien);
        String idps= id_pasien.getText();
    }
    
    //setting jumlah obat
    public  void setTotalObat(String idPasien) {
                //hitung obat 
        try{
            String idps =idPasien;
            String sql = "SELECT SUM(harga) AS total FROM obat_pasien WHERE id_pasien = '"+ idps + "' " ;
            String sql2 = "select * from rekam_medis where id_pasien='"+ idps +"'" ;
            java.sql.Connection conn = (Connection)Conn.configDB();
            java.sql.Statement stm = conn.createStatement();
            java.sql.Statement stm2 = conn.createStatement();
            java.sql.ResultSet res = stm.executeQuery(sql);
            java.sql.ResultSet res2 = stm2.executeQuery(sql2);
            while(res.next()){
                total_obat.setText(res.getString("total"));
            }
            
            while(res2.next()){
                distole.setText(res2.getString("distole"));
                nama_pasien.setText(res2.getString("nama_pasien"));
                sistol.setText(res2.getString("sistol"));
                distole.setText(res2.getString("distole"));
                diagnosa_1.setText(res2.getString("diagnosa1"));
                diagnosa_2.setText(res2.getString("diagnosa2"));
                anamnesa_1.setText(res2.getString("anamnesa1"));
                anamnesa_2.setText(res2.getString("anamnesa2"));
                penyakit.setText(res2.getString("nama_penyakit"));
                tindak_lanjut.setText(res2.getString("tindak_lanjut"));
            }
        }catch(Exception e) {
            JOptionPane.showMessageDialog(null,e);
        }
    }
    private void printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_printActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        this.dispose();
        Dashboard a = new Dashboard();
        a.setVisible(true);
    }//GEN-LAST:event_backActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        // TODO add your handling code here:
        if(jasa_medis.getText().equals("")){
            JOptionPane.showMessageDialog(null,"masukan jasa medis");
        }else {
            try {
                  java.sql.Connection conn = (Connection)Conn.configDB();
                  String id = id_pasien.getText();
                 
                  //update jasa medis di form rekam_medis
                  String sql = "update rekam_medis set jasa_medis= '"+ jasa_medis.getText() +"'"
                          + "where id_pasien='"+ id +"' " ;
                  
                  java.sql.PreparedStatement pst = conn.prepareStatement(sql);
                  pst.execute();
                  
                  //ambil data pasien   
                  String sql2 = "select * from tbl_pasien where id_pasien='"+ id_pasien.getText() +"'" ;
                  java.sql.Statement stm = conn.createStatement();
                  java.sql.ResultSet res = stm.executeQuery(sql2);
                  res.next();
                  
                  //input dt
                  String inputTransaksi = "insert into transaksi "
                          + "(idpassien , tgldaftar , nama , tempat_lahir, tgl_lahir , jenis_kelamin , alamat ,"
                          + " no_telp , no_bpjs , jasa_medis , lain_lain , total , biaya_obat )"
                          + "values"
                          + "('" + id + "' , '"+ res.getString("tgl_daftar") +"' , '"+ res.getString("nama") +"' ,"
                          + " '"+ res.getString("tempat_lahir") +"' , '"+ res.getString("tgl_lahir") +"' , "
                          + " '"+ res.getString("jenis_kelamin") +"' , '"+ res.getString("alamat") +"' ,"
                          + " '"+ res.getString("no_telp") +"' , '"+ res.getString("no_bpjs") +"' , "
                          + " '"+ jasa_medis.getText() +"' , '80' , '90' , '"+ total_obat.getText() +"'   ) " ;
                  java.sql.PreparedStatement pst3 = conn.prepareStatement(inputTransaksi);
                  pst3.execute();
                  
                  JOptionPane.showMessageDialog(null,"Berhasil");
            }catch(Exception e){
                JOptionPane.showMessageDialog(null,e);
            }
        }
    }//GEN-LAST:event_saveActionPerformed

    private void diagnosa_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diagnosa_1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_diagnosa_1ActionPerformed

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
            java.util.logging.Logger.getLogger(Transaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Transaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Transaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Transaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Transaksi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField anamnesa_1;
    private javax.swing.JTextField anamnesa_2;
    private javax.swing.JButton back;
    private javax.swing.JTextField diagnosa_1;
    private javax.swing.JTextField diagnosa_2;
    private javax.swing.JTextField distole;
    private javax.swing.JTextField id_pasien;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jasa_medis;
    private javax.swing.JTable load_obat;
    private javax.swing.JTextField nama_pasien;
    private javax.swing.JTextField penyakit;
    private javax.swing.JButton print;
    private javax.swing.JButton save;
    private javax.swing.JTextField sistol;
    private javax.swing.JTextField tindak_lanjut;
    private javax.swing.JTextField total_obat;
    // End of variables declaration//GEN-END:variables
}
