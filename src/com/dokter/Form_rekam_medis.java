/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dokter;

import Conection.Conn;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import com.dokter.HomeDokter ;
/**
 *
 * @author dasep
 */
public class Form_rekam_medis extends javax.swing.JFrame {

    /**
     * Creates new form Form_rekam_medis
     */
    private String PA , obt ,hrg  ;
    public Form_rekam_medis() {
        initComponents();
        idPasien(this.PA);
        FormObat(obt, hrg );
        listObat();
        loadObat();
        listStatus();
        listPenyakit();
        listTindakLanjut();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        id_pasien = new javax.swing.JTextField();
        distole = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        sistol = new javax.swing.JTextField();
        tinggi_badan = new javax.swing.JTextField();
        diagnosa_2 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        diagnosa_1 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        anamnesa_2 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        anamnesa_1 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        berat_badan = new javax.swing.JTextField();
        simpan_rekam = new javax.swing.JButton();
        status_periksa = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        penyakit = new javax.swing.JComboBox<>();
        selesai = new javax.swing.JButton();
        tindak_lanjut = new javax.swing.JComboBox<>();
        anamnesa_4 = new javax.swing.JTextField();
        anamnesa_3 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        anamnesa_5 = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        harga_obat = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        data_obat = new javax.swing.JTable();
        input_obat = new javax.swing.JButton();
        nama_obat = new javax.swing.JComboBox<>();
        reset = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconImage(    new javax.swing.ImageIcon(getClass().getResource("/image/icon.png")).getImage());
        setResizable(false);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(71, 82, 83));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Data Rekam Medis", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("ID Pasien");
        jPanel5.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 90, 33));

        id_pasien.setBackground(new java.awt.Color(149, 72, 91));
        id_pasien.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        id_pasien.setForeground(new java.awt.Color(255, 255, 255));
        jPanel5.add(id_pasien, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, 230, 33));

        distole.setBackground(new java.awt.Color(149, 72, 91));
        distole.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        distole.setForeground(new java.awt.Color(255, 255, 255));
        jPanel5.add(distole, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, 230, 33));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Distole");
        jPanel5.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, 90, 33));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Sistol");
        jPanel5.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 70, 90, 33));

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Tinggi Badan");
        jPanel5.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 30, 100, 33));

        sistol.setBackground(new java.awt.Color(149, 72, 91));
        sistol.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        sistol.setForeground(new java.awt.Color(255, 255, 255));
        jPanel5.add(sistol, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 70, 230, 33));

        tinggi_badan.setBackground(new java.awt.Color(149, 72, 91));
        tinggi_badan.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        tinggi_badan.setForeground(new java.awt.Color(255, 255, 255));
        jPanel5.add(tinggi_badan, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 30, 230, 33));

        diagnosa_2.setBackground(new java.awt.Color(149, 72, 91));
        diagnosa_2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        diagnosa_2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel5.add(diagnosa_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 110, 230, 33));

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Diagnosa 1");
        jPanel5.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 90, 33));

        diagnosa_1.setBackground(new java.awt.Color(149, 72, 91));
        diagnosa_1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        diagnosa_1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel5.add(diagnosa_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 230, 33));

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Diagnosa 2");
        jPanel5.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 110, 90, 33));

        anamnesa_2.setBackground(new java.awt.Color(149, 72, 91));
        anamnesa_2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        anamnesa_2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel5.add(anamnesa_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 150, 230, 33));

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Anamnesa 1");
        jPanel5.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 90, 33));

        anamnesa_1.setBackground(new java.awt.Color(149, 72, 91));
        anamnesa_1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        anamnesa_1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel5.add(anamnesa_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, 230, 33));

        jLabel15.setBackground(new java.awt.Color(255, 255, 255));
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Anamnesa 2");
        jPanel5.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 150, 90, 33));

        jLabel16.setBackground(new java.awt.Color(255, 255, 255));
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Nama Penyakit");
        jPanel5.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, 90, 33));

        jLabel17.setBackground(new java.awt.Color(255, 255, 255));
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Tindak Lanjut");
        jPanel5.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 350, 90, 33));

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Berat Badan");
        jPanel5.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 250, 100, 33));

        berat_badan.setBackground(new java.awt.Color(149, 72, 91));
        berat_badan.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        berat_badan.setForeground(new java.awt.Color(255, 255, 255));
        jPanel5.add(berat_badan, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 250, 230, 33));

        simpan_rekam.setBackground(new java.awt.Color(48, 37, 40));
        simpan_rekam.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        simpan_rekam.setForeground(new java.awt.Color(255, 255, 255));
        simpan_rekam.setText("Simpan Data");
        simpan_rekam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpan_rekamActionPerformed(evt);
            }
        });
        jPanel5.add(simpan_rekam, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 350, 130, 40));

        status_periksa.setBackground(new java.awt.Color(149, 72, 91));
        status_periksa.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        status_periksa.setForeground(new java.awt.Color(255, 255, 255));
        status_periksa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih Status" }));
        status_periksa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                status_periksaActionPerformed(evt);
            }
        });
        jPanel5.add(status_periksa, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 300, 230, 40));

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Status Periksa");
        jPanel5.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 300, 100, 33));

        penyakit.setBackground(new java.awt.Color(149, 72, 91));
        penyakit.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        penyakit.setForeground(new java.awt.Color(255, 255, 255));
        penyakit.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Penyakit" }));
        penyakit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                penyakitActionPerformed(evt);
            }
        });
        jPanel5.add(penyakit, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 300, 230, 40));

        selesai.setBackground(new java.awt.Color(48, 37, 40));
        selesai.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        selesai.setForeground(new java.awt.Color(255, 255, 255));
        selesai.setText("Selesai");
        selesai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selesaiActionPerformed(evt);
            }
        });
        jPanel5.add(selesai, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 350, 100, 40));

        tindak_lanjut.setBackground(new java.awt.Color(149, 72, 91));
        tindak_lanjut.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        tindak_lanjut.setForeground(new java.awt.Color(255, 255, 255));
        tindak_lanjut.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih Tindakan Lanjut" }));
        tindak_lanjut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tindak_lanjutActionPerformed(evt);
            }
        });
        jPanel5.add(tindak_lanjut, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 350, 230, 40));

        anamnesa_4.setBackground(new java.awt.Color(149, 72, 91));
        anamnesa_4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        anamnesa_4.setForeground(new java.awt.Color(255, 255, 255));
        jPanel5.add(anamnesa_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 200, 230, 33));

        anamnesa_3.setBackground(new java.awt.Color(149, 72, 91));
        anamnesa_3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        anamnesa_3.setForeground(new java.awt.Color(255, 255, 255));
        jPanel5.add(anamnesa_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, 230, 33));

        jLabel18.setBackground(new java.awt.Color(255, 255, 255));
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Anamnesa 3");
        jPanel5.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, 90, 33));

        jLabel21.setBackground(new java.awt.Color(255, 255, 255));
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Anamnesa 4");
        jPanel5.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 200, 90, 33));

        anamnesa_5.setBackground(new java.awt.Color(149, 72, 91));
        anamnesa_5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        anamnesa_5.setForeground(new java.awt.Color(255, 255, 255));
        jPanel5.add(anamnesa_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, 230, 33));

        jLabel22.setBackground(new java.awt.Color(255, 255, 255));
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Anamnesa 5");
        jPanel5.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, 80, 33));

        jPanel3.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 830, 480));

        jPanel6.setBackground(new java.awt.Color(71, 82, 83));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Input Data Obat", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel19.setBackground(new java.awt.Color(255, 255, 255));
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Harga");
        jPanel6.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 80, 90, 33));

        jLabel20.setBackground(new java.awt.Color(255, 255, 255));
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Nama obat");
        jPanel6.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 30, 100, 33));

        harga_obat.setBackground(new java.awt.Color(149, 72, 91));
        harga_obat.setForeground(new java.awt.Color(255, 255, 255));
        jPanel6.add(harga_obat, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 80, 230, 33));

        data_obat.setBackground(new java.awt.Color(77, 80, 89));
        data_obat.setForeground(new java.awt.Color(255, 255, 255));
        data_obat.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Nama Obat", "Harga"
            }
        ));
        data_obat.setRowHeight(20);
        data_obat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                data_obatMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(data_obat);

        jPanel6.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 410, 180));

        input_obat.setBackground(new java.awt.Color(48, 37, 40));
        input_obat.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        input_obat.setForeground(new java.awt.Color(255, 255, 255));
        input_obat.setText("Input");
        input_obat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input_obatActionPerformed(evt);
            }
        });
        jPanel6.add(input_obat, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 120, 100, 40));

        nama_obat.setBackground(new java.awt.Color(149, 72, 91));
        nama_obat.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        nama_obat.setForeground(new java.awt.Color(255, 255, 255));
        nama_obat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih Obat" }));
        nama_obat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nama_obatActionPerformed(evt);
            }
        });
        jPanel6.add(nama_obat, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 30, 230, 40));

        reset.setBackground(new java.awt.Color(48, 37, 40));
        reset.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        reset.setForeground(new java.awt.Color(255, 255, 255));
        reset.setText("Reset");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });
        jPanel6.add(reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 120, 100, 40));

        jPanel3.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 530, 830, 220));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 845, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 759, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void loadObat(){
        DefaultTableModel model = new DefaultTableModel();
        String sql = "Select * from obat_pasien where id_pasien='" + id_pasien.getText() +"'  " ;
        
        model.addColumn("ID");
        model.addColumn("No");
        model.addColumn("Nama Obat");
        model.addColumn("Harga");
        
        //tampilkan data makanan kedalam table 
        try {
            int no = 1 ;
       
                    java.sql.Connection conn = (Connection)Conn.configDB();
                    java.sql.Statement stm = conn.createStatement();
                    java.sql.ResultSet res = stm.executeQuery(sql);
                    while(res.next()){
                        model.addRow(new Object[] { res.getString("id") , no++ ,  res.getString("obat") ,
                            res.getString("harga")   } );
                    }
            TableColumnModel columnModel = data_obat.getColumnModel();
            columnModel.getColumn(0).setPreferredWidth(2);
            data_obat.setModel(model);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        } 
    }
    public void listObat(){

        try {
            String sql  = "SELECT * FROM tbl_obat  ";
            java.sql.Connection conn = (Connection)Conn.configDB();
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery(sql);
            
            while (rs.next()) {                
                nama_obat.addItem(rs.getString("nama_obat"));
            }
        
           
        } catch (SQLException e) {
            
        }
        
    }
    
    public void listPenyakit(){

        try {
            String sql  = "SELECT * FROM tbl_penyakit  ";
            java.sql.Connection conn = (Connection)Conn.configDB();
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery(sql);
            
            while (rs.next()) {                
                penyakit.addItem(rs.getString("nama_penyakit"));
            }
        
           
        } catch (SQLException e) {
            
        }
        
    }
    
    
    
    public void listStatus(){

        try {
            String sql  = "SELECT * FROM tbl_status_periksa ";
            java.sql.Connection conn = (Connection)Conn.configDB();
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery(sql);
            
            while (rs.next()) {                
                status_periksa.addItem(rs.getString("jenis_status"));
            }
        
           
        } catch (SQLException e) {
            
        }
    }
    
    public void listTindakLanjut(){

        try {
            String sql  = "SELECT * FROM tbl_tindaklanjut ";
            java.sql.Connection conn = (Connection)Conn.configDB();
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery(sql);
            
            while (rs.next()) {                
                tindak_lanjut.addItem(rs.getString("jenis_tindaklanjut"));
            }
        
           
        } catch (SQLException e) {
            
        }
    }     

    
    public void idPasien(String id){
        id_pasien.setText(id);
        id_pasien.setEditable(false);
    }
    
    public void FormObat(String obat , String harga){
        harga_obat.setText(harga);
        harga_obat.setEditable(false);
    }
    
    private void input_obatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input_obatActionPerformed
        // TODO add your handling code here:
        if(harga_obat.getText().equals("") || id_pasien.getText().equals("") || nama_obat.getSelectedItem().equals("") ){
            JOptionPane.showMessageDialog(null,"field kosong");
        }else {
            try {
                String sql = "INSERT INTO  obat_pasien ("
                        + " id_pasien , obat  , harga) values "
                        + "('"+ id_pasien.getText() +"' , '"+ nama_obat.getSelectedItem() +"' , '"+ harga_obat.getText() +"'  ) " ;
                  java.sql.Connection conn = (Connection)Conn.configDB();
                  java.sql.PreparedStatement pst = conn.prepareStatement(sql);
                  pst.execute();
                  JOptionPane.showMessageDialog(null,"Penyimpanan Berhasil");
                   loadObat();
                   harga_obat.setText("");
                   nama_obat.setSelectedItem("Pilih Obat");
            }catch(Exception e){
                JOptionPane.showMessageDialog(null,e.getMessage());
            }
        }
    }//GEN-LAST:event_input_obatActionPerformed

    private void simpan_rekamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpan_rekamActionPerformed
        // TODO add your handling code here:
        String idpasien = id_pasien.getText();
        String dst      = distole.getText();
        String tb       = tinggi_badan.getText();
        String sistoll  = sistol.getText();
        String diagnos1  = diagnosa_1.getText();
        String diagnos2  = diagnosa_2.getText();
        String amns1     = anamnesa_1.getText();
        String amn2     = anamnesa_2.getText();
        String amn3     = anamnesa_3.getText();
        String amn4     = anamnesa_4.getText();
        String amn5     = anamnesa_5.getText();
        String nmapenyakit  = (String) penyakit.getSelectedItem();
        String tindak  = (String) tindak_lanjut.getSelectedItem();
        String bb = berat_badan.getText();

        if(dst.equals("") || tb.equals("") || sistoll.equals("") || diagnos1.equals("") ||
           diagnos2.equals("") || amns1.equals("") || amn2.equals("") || nmapenyakit.equals("") || tindak.equals("")
           || bb.equals("")){
            JOptionPane.showMessageDialog(null,"field kosong");
        }else {
            try {
                String sql = "update rekam_medis set "
                        + " sistol = '" + sistoll + "' , "
                        + " distole = '" + dst + "' , "
                        + " tinggi = '" + tb + "' , "
                        + " berat_badan = '" + bb + "' , "
                        + " diagnosa1 = '" + diagnos1 + "' , "
                        + " diagnosa2 = '" + diagnos2 + "' , "
                        + " anamnesa1 = '" + amns1 + "' , "
                        + " anamnesa2 = '" + amn2 + "' , "
                        + " anamnesa3 = '" + amn3 + "' , "
                        + " anamnesa4 = '" + amn4 + "' , "
                        + " anamnesa5 = '" + amn5 + "' , "
                        + " nama_penyakit = '" + nmapenyakit + "' , "
                        + " tindak_lanjut = '" + tindak + "' , "
                        + " status_periksa = '" +  status_periksa.getSelectedItem() + "'  "
                        + " where id_pasien = '" + idpasien + "' " ;
                
                String sql2 = "update tbl_pasien set status='"+ status_periksa.getSelectedItem() +"'"
                        + " where  id_pasien = '" + idpasien + "' " ;
                  java.sql.Connection conn = (Connection)Conn.configDB();
                  java.sql.PreparedStatement pst = conn.prepareStatement(sql);
                  java.sql.PreparedStatement pst2 = conn.prepareStatement(sql2);
                  pst.execute();
                  pst2.execute();
                  JOptionPane.showMessageDialog(null,"Rekam Medis di Simpan");
                  loadObat();
            }catch(Exception e){
                JOptionPane.showMessageDialog(null,e);
            }
        }
    }//GEN-LAST:event_simpan_rekamActionPerformed

    private void nama_obatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nama_obatActionPerformed
        // TODO add your handling code here:
        String d = (String)  nama_obat.getSelectedItem();
         // JOptionPane.showMessageDialog(null,d);
          if(d == "Pilih Obat"){
              harga_obat.setText("");
          }else {
//              JOptionPane.showMessageDialog(null,d);
                try {
                    String sql = "Select * from tbl_obat where nama_obat='"+ d +"' " ;
                    java.sql.Connection conn = (Connection)Conn.configDB();
                    java.sql.Statement stm = conn.createStatement();
                    java.sql.ResultSet res = stm.executeQuery(sql);
                     while(res.next()){
                         harga_obat.setText(res.getString("harga"));
                     }
                }catch(Exception e){

                }
          }
    }//GEN-LAST:event_nama_obatActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        // TODO add your handling code here:
        harga_obat.setText("");
        nama_obat.setSelectedItem("Pilih Obat");
    }//GEN-LAST:event_resetActionPerformed

    private void data_obatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_data_obatMouseClicked
        // TODO add your handling code here:
         int info = JOptionPane.showConfirmDialog(null, "Hapus ?");
            switch(info){
                case  JOptionPane.YES_OPTION : 
                     int baris  = data_obat.rowAtPoint(evt.getPoint());
                     String id = data_obat.getValueAt(baris,0).toString();
                     try {
                         java.sql.Connection conn = (Connection)Conn.configDB();
                         String sql = "delete from obat_pasien where id = '"+ id +"' " ;
                         java.sql.PreparedStatement pst = conn.prepareStatement(sql);
                         pst.execute();
                         loadObat();
                     }catch(Exception e){
                         JOptionPane.showMessageDialog(null,e);
                     }
                     
                    break ;
            }
    }//GEN-LAST:event_data_obatMouseClicked

    private void status_periksaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_status_periksaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_status_periksaActionPerformed

    private void penyakitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_penyakitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_penyakitActionPerformed

    private void selesaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selesaiActionPerformed
        // TODO add your handling code here:
        int a = JOptionPane.showConfirmDialog(null,"Selesai Rekam Medis");
        switch(a){
            case JOptionPane.YES_OPTION :
                this.dispose();
                HomeDokter b = new HomeDokter();
                b.setVisible(true);
            break ;
            default :
                
            break ;
        }
    }//GEN-LAST:event_selesaiActionPerformed

    private void tindak_lanjutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tindak_lanjutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tindak_lanjutActionPerformed

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
            java.util.logging.Logger.getLogger(Form_rekam_medis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form_rekam_medis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form_rekam_medis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form_rekam_medis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form_rekam_medis().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField anamnesa_1;
    private javax.swing.JTextField anamnesa_2;
    private javax.swing.JTextField anamnesa_3;
    private javax.swing.JTextField anamnesa_4;
    private javax.swing.JTextField anamnesa_5;
    private javax.swing.JTextField berat_badan;
    private javax.swing.JTable data_obat;
    private javax.swing.JTextField diagnosa_1;
    private javax.swing.JTextField diagnosa_2;
    private javax.swing.JTextField distole;
    private javax.swing.JTextField harga_obat;
    private javax.swing.JTextField id_pasien;
    private javax.swing.JButton input_obat;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> nama_obat;
    private javax.swing.JComboBox<String> penyakit;
    private javax.swing.JButton reset;
    private javax.swing.JButton selesai;
    private javax.swing.JButton simpan_rekam;
    private javax.swing.JTextField sistol;
    private javax.swing.JComboBox<String> status_periksa;
    private javax.swing.JComboBox<String> tindak_lanjut;
    private javax.swing.JTextField tinggi_badan;
    // End of variables declaration//GEN-END:variables
}
