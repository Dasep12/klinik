/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.operator;

import Conection.Conn;
import Main.Login;
import java.sql.Connection;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author cad-server
 */
public class HomeOperator extends javax.swing.JFrame {

    /**
     * Creates new form Dashboard
     */
    private String id ;
    public HomeOperator() {
        initComponents();
        loadData(this.id);
        Icon icon = new ImageIcon("E:\\editicon.PNG");
        JButton daftar_pasien = new JButton(icon);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        key = new javax.swing.JTextField();
        cari = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        pasienList = new javax.swing.JTable();
        daftar_obat = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        id_pasien = new javax.swing.JTextField();
        alamat = new javax.swing.JTextField();
        no_bpjs = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        nama = new javax.swing.JTextField();
        no_hp = new javax.swing.JTextField();
        status = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        simpan_rekam = new javax.swing.JButton();
        tambah_pasien = new javax.swing.JButton();
        data_obat = new javax.swing.JButton();
        data_penyakit = new javax.swing.JButton();
        logout = new javax.swing.JButton();
        data_status = new javax.swing.JButton();
        tindak_lanjut = new javax.swing.JButton();
        transaksi = new javax.swing.JButton();
        refresh = new javax.swing.JButton();
        Histori = new javax.swing.JButton();

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(181, 102, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Pusat Pelayanan Masyarakat");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 50, 300, 30));

        key.setBackground(new java.awt.Color(149, 72, 91));
        key.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(key, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 80, 150, 30));

        cari.setBackground(new java.awt.Color(48, 37, 40));
        cari.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cari.setForeground(new java.awt.Color(255, 255, 255));
        cari.setText("Cari");
        cari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cariActionPerformed(evt);
            }
        });
        jPanel2.add(cari, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 80, 70, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("KLINIK BIDAN ITA");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 20, 190, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, 120));

        jPanel3.setBackground(new java.awt.Color(71, 82, 83));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pasienList.setBackground(new java.awt.Color(77, 80, 89));
        pasienList.setForeground(new java.awt.Color(255, 255, 255));
        pasienList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID Pasien", "Nama Pasien", "Alamat", "No.Hp", "Status"
            }
        ));
        pasienList.setRowHeight(20);
        pasienList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pasienListMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(pasienList);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 810, 320));

        daftar_obat.setBackground(new java.awt.Color(71, 82, 83));
        daftar_obat.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Form Transaksi", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 255, 255))); // NOI18N
        daftar_obat.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        daftar_obat.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 38, 62, 21));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("ID Pasien");
        daftar_obat.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 90, 33));

        id_pasien.setEditable(false);
        id_pasien.setBackground(new java.awt.Color(149, 72, 91));
        id_pasien.setForeground(new java.awt.Color(255, 255, 255));
        daftar_obat.add(id_pasien, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, 230, 33));

        alamat.setEditable(false);
        alamat.setBackground(new java.awt.Color(149, 72, 91));
        alamat.setForeground(new java.awt.Color(255, 255, 255));
        daftar_obat.add(alamat, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 230, 33));

        no_bpjs.setEditable(false);
        no_bpjs.setBackground(new java.awt.Color(149, 72, 91));
        no_bpjs.setForeground(new java.awt.Color(255, 255, 255));
        daftar_obat.add(no_bpjs, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 230, 33));

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("No BPJS");
        daftar_obat.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 90, 33));

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Alamat");
        daftar_obat.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 80, 33));

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("No Hp");
        daftar_obat.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 70, 90, 33));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Nama Pasien");
        daftar_obat.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 30, 90, 33));

        nama.setEditable(false);
        nama.setBackground(new java.awt.Color(149, 72, 91));
        nama.setForeground(new java.awt.Color(255, 255, 255));
        daftar_obat.add(nama, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 30, 230, 33));

        no_hp.setEditable(false);
        no_hp.setBackground(new java.awt.Color(149, 72, 91));
        no_hp.setForeground(new java.awt.Color(255, 255, 255));
        daftar_obat.add(no_hp, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 70, 230, 33));

        status.setEditable(false);
        status.setBackground(new java.awt.Color(149, 72, 91));
        status.setForeground(new java.awt.Color(255, 255, 255));
        daftar_obat.add(status, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 110, 230, 33));

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Status");
        daftar_obat.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 110, 90, 33));

        jPanel3.add(daftar_obat, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 820, 180));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 840, 530));

        simpan_rekam.setBackground(new java.awt.Color(48, 37, 40));
        simpan_rekam.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        simpan_rekam.setForeground(new java.awt.Color(255, 255, 255));
        simpan_rekam.setText("Simpan Data");
        simpan_rekam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpan_rekamActionPerformed(evt);
            }
        });
        jPanel1.add(simpan_rekam, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 280, 130, 40));

        tambah_pasien.setBackground(new java.awt.Color(48, 37, 40));
        tambah_pasien.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        tambah_pasien.setForeground(new java.awt.Color(255, 255, 255));
        tambah_pasien.setText("Daftar Pasien");
        tambah_pasien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambah_pasienActionPerformed(evt);
            }
        });
        jPanel1.add(tambah_pasien, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 120, 40));

        data_obat.setBackground(new java.awt.Color(48, 37, 40));
        data_obat.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        data_obat.setForeground(new java.awt.Color(255, 255, 255));
        data_obat.setText("Data Obat");
        data_obat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                data_obatActionPerformed(evt);
            }
        });
        jPanel1.add(data_obat, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 120, 40));

        data_penyakit.setBackground(new java.awt.Color(48, 37, 40));
        data_penyakit.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        data_penyakit.setForeground(new java.awt.Color(255, 255, 255));
        data_penyakit.setText("Data Penyakit");
        data_penyakit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                data_penyakitActionPerformed(evt);
            }
        });
        jPanel1.add(data_penyakit, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 120, 40));

        logout.setBackground(new java.awt.Color(48, 37, 40));
        logout.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        logout.setForeground(new java.awt.Color(255, 255, 255));
        logout.setText("Logout");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });
        jPanel1.add(logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 540, 120, 40));

        data_status.setBackground(new java.awt.Color(48, 37, 40));
        data_status.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        data_status.setForeground(new java.awt.Color(255, 255, 255));
        data_status.setText("Data Status");
        data_status.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                data_statusActionPerformed(evt);
            }
        });
        jPanel1.add(data_status, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 120, 40));

        tindak_lanjut.setBackground(new java.awt.Color(48, 37, 40));
        tindak_lanjut.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        tindak_lanjut.setForeground(new java.awt.Color(255, 255, 255));
        tindak_lanjut.setText("Tindak Lanjut");
        tindak_lanjut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tindak_lanjutActionPerformed(evt);
            }
        });
        jPanel1.add(tindak_lanjut, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 120, 40));

        transaksi.setBackground(new java.awt.Color(48, 37, 40));
        transaksi.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        transaksi.setForeground(new java.awt.Color(255, 255, 255));
        transaksi.setText("Transaksi");
        transaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transaksiActionPerformed(evt);
            }
        });
        jPanel1.add(transaksi, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, 120, 40));

        refresh.setBackground(new java.awt.Color(48, 37, 40));
        refresh.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        refresh.setForeground(new java.awt.Color(255, 255, 255));
        refresh.setText("Refresh Table");
        refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshActionPerformed(evt);
            }
        });
        jPanel1.add(refresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 120, 40));

        Histori.setBackground(new java.awt.Color(48, 37, 40));
        Histori.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Histori.setForeground(new java.awt.Color(255, 255, 255));
        Histori.setText("Histori");
        Histori.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HistoriActionPerformed(evt);
            }
        });
        jPanel1.add(Histori, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, 120, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(985, 686));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    public void loadData(String data){
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("No");
        model.addColumn("ID Pasien");
        model.addColumn("Nama Pasien");
        model.addColumn("Jenis Kelamin");
        model.addColumn("Tanggal Daftar");
        model.addColumn("Status");
        
        //tampilkan data makanan kedalam table 
        try {
            String sql = "" ;
            int no = 1 ;
            if(data == null ){
                sql = "Select id_pasien , nama , jenis_kelamin,tgl_daftar , status from tbl_pasien where"
                        + " status='BELUM DI PERIKSA' or transaksi='NOK' " ;
            }else {
                    sql = "Select id_pasien , nama , jenis_kelamin,tgl_daftar , status from tbl_pasien where " 
                            + " transaksi='NOK'  and id_pasien like  '%"+ data +"%' or nama like '%"+ data +"%'"
                            + "or tgl_daftar like '%"+ data +"%'  " ;
            }
                    java.sql.Connection conn = (Connection)Conn.configDB();
                    java.sql.Statement stm = conn.createStatement();
                    java.sql.ResultSet res = stm.executeQuery(sql);
                    while(res.next()){
                        model.addRow(new Object[] {no++ , res.getString("id_pasien") ,  res.getString("nama") ,
                            res.getString("jenis_kelamin") ,  res.getString("tgl_daftar") , res.getString("status")  } );
                    }
            pasienList.setModel(model);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        } 
    }
    private void cariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cariActionPerformed
        // TODO add your handling code here:
        if(key.getText().equals("")){
            JOptionPane.showMessageDialog(null,"keyword kosong");
        }else {
            String data = key.getText();
            loadData(data);
        }
    }//GEN-LAST:event_cariActionPerformed

    private void pasienListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pasienListMouseClicked
        // TODO add your handling code here:
        int baris            = pasienList.rowAtPoint(evt.getPoint());
        String id            = pasienList.getValueAt(baris,1).toString();
        String status_pasien = pasienList.getValueAt(baris,5).toString();
        
        try {
            String sql = "Select * from tbl_pasien where id_pasien = '"+ id +"' " ;
            java.sql.Connection conn = (Connection)Conn.configDB();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet res = stm.executeQuery(sql);
            while(res.next()){
                id_pasien.setText(res.getString("id_pasien"));
                alamat.setText(res.getString("alamat"));
                no_bpjs.setText(res.getString("no_bpjs"));
                nama.setText(res.getString("nama"));
                no_hp.setText(res.getString("no_telp"));
                status.setText(res.getString("status"));
            }
        }catch(Exception e){
            
        }
    }//GEN-LAST:event_pasienListMouseClicked

    private void simpan_rekamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpan_rekamActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_simpan_rekamActionPerformed

    private void tambah_pasienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambah_pasienActionPerformed
        // TODO add your handling code here:
        TambahPasien a = new TambahPasien();
        a.setVisible(true);
    }//GEN-LAST:event_tambah_pasienActionPerformed

    private void data_obatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_data_obatActionPerformed
        // TODO add your handling code here:
        Master_obat a = new Master_obat();
        a.setVisible(true);
    }//GEN-LAST:event_data_obatActionPerformed

    private void data_penyakitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_data_penyakitActionPerformed
        // TODO add your handling code here:
        Master_penyakit a = new Master_penyakit();
        a.setVisible(true);
    }//GEN-LAST:event_data_penyakitActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        // TODO add your handling code here:
        this.dispose();
        Login a = new Login();
        a.setVisible(true);
    }//GEN-LAST:event_logoutActionPerformed

    private void data_statusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_data_statusActionPerformed
        // TODO add your handling code here:
        Master_status a = new Master_status();
        a.setVisible(true);
    }//GEN-LAST:event_data_statusActionPerformed

    private void tindak_lanjutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tindak_lanjutActionPerformed
        // TODO add your handling code here:
        Master_tindak_lanjut a = new Master_tindak_lanjut();
        a.setVisible(true);
    }//GEN-LAST:event_tindak_lanjutActionPerformed

    private void transaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transaksiActionPerformed
        // TODO add your handling code here:
        String stat = status.getText();
        if(stat.equals("SUDAH DI PERIKSA")){
            this.dispose();
            Transaksi a  = new Transaksi();
            a.getID(id_pasien.getText());
            a.setTotalObat(id_pasien.getText());
            a.loadObat(id_pasien.getText());
            a.setVisible(true);
        }else if(stat.equals("BELUM DI PERIKSA")) {
            JOptionPane.showMessageDialog(null,"Pasien Belum di periksa");
        }else if(stat.equals("")) {
            JOptionPane.showMessageDialog(null,"Pilih Pasien");
        }
    }//GEN-LAST:event_transaksiActionPerformed

    private void refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshActionPerformed
        // TODO add your handling code here:
        String data = null ;
        loadData(data);
    }//GEN-LAST:event_refreshActionPerformed

    private void HistoriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HistoriActionPerformed
        // TODO add your handling code here:
        Histori a  = new Histori();
        a.setVisible(true);
    }//GEN-LAST:event_HistoriActionPerformed

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
            java.util.logging.Logger.getLogger(HomeOperator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeOperator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeOperator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeOperator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeOperator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Histori;
    private javax.swing.JTextField alamat;
    private javax.swing.JButton cari;
    private javax.swing.JPanel daftar_obat;
    private javax.swing.JButton data_obat;
    private javax.swing.JButton data_penyakit;
    private javax.swing.JButton data_status;
    private javax.swing.JTextField id_pasien;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField key;
    private javax.swing.JButton logout;
    private javax.swing.JTextField nama;
    private javax.swing.JTextField no_bpjs;
    private javax.swing.JTextField no_hp;
    private javax.swing.JTable pasienList;
    private javax.swing.JButton refresh;
    private javax.swing.JButton simpan_rekam;
    private javax.swing.JTextField status;
    private javax.swing.JButton tambah_pasien;
    private javax.swing.JButton tindak_lanjut;
    private javax.swing.JButton transaksi;
    // End of variables declaration//GEN-END:variables
}
