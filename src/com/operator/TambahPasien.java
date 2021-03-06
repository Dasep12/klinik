/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.operator;

import Conection.Conn;
import java.sql.Connection;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import com.operator.no_antri;
/**
 *
 * @author cad-server
 */
public class TambahPasien extends javax.swing.JFrame {

    /**
     * Creates new form TambahPasien
     */
    public TambahPasien() {
        initComponents();
        idPasien();
        antrian();
        setTgl();
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
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        alamat = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        id_pasien = new javax.swing.JTextField();
        jenis_kelamin = new javax.swing.JComboBox<>();
        no_bpjs = new javax.swing.JTextField();
        nama_pasien = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        no_telpon = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tambah = new javax.swing.JButton();
        tempat_lahir = new javax.swing.JTextField();
        tgl_lahir = new com.toedter.calendar.JDateChooser();
        no_antrian = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconImage(    new javax.swing.ImageIcon(getClass().getResource("/image/icon.png")).getImage());
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(181, 102, 102));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("TAMBAH PASIEN");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(301, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(274, 274, 274))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 60));

        jPanel3.setBackground(new java.awt.Color(71, 82, 83));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tambah Pasien", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        alamat.setBackground(new java.awt.Color(149, 72, 91));
        alamat.setColumns(20);
        alamat.setForeground(new java.awt.Color(255, 255, 255));
        alamat.setRows(5);
        jScrollPane1.setViewportView(alamat);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 128, 230, -1));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("ID Pasien");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 18, 80, 33));

        id_pasien.setBackground(new java.awt.Color(149, 72, 91));
        id_pasien.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.add(id_pasien, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 18, 180, 33));

        jenis_kelamin.setBackground(new java.awt.Color(149, 72, 91));
        jenis_kelamin.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jenis_kelamin.setForeground(new java.awt.Color(255, 255, 255));
        jenis_kelamin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Laki-Laki", "Perempuan" }));
        jPanel3.add(jenis_kelamin, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 18, 230, 40));

        no_bpjs.setBackground(new java.awt.Color(149, 72, 91));
        no_bpjs.setForeground(new java.awt.Color(255, 255, 255));
        no_bpjs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                no_bpjsActionPerformed(evt);
            }
        });
        jPanel3.add(no_bpjs, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 68, 230, 33));

        nama_pasien.setBackground(new java.awt.Color(149, 72, 91));
        nama_pasien.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.add(nama_pasien, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 180, 33));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nama Pasien");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 100, 33));

        jLabel5.setForeground(java.awt.Color.white);
        jLabel5.setText("Tempat Lahir");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 100, 33));

        jLabel4.setForeground(java.awt.Color.white);
        jLabel4.setText("Tanggal Lahir");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 100, 33));

        jLabel8.setForeground(java.awt.Color.white);
        jLabel8.setText("No Telpon");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 100, 33));

        no_telpon.setBackground(new java.awt.Color(149, 72, 91));
        no_telpon.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.add(no_telpon, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, 180, 33));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Jenis Kelamin");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 18, 80, 33));

        jLabel9.setForeground(java.awt.Color.white);
        jLabel9.setText("No BPJS");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 68, 100, 33));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Alamat");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 118, 80, 33));

        tambah.setBackground(new java.awt.Color(48, 37, 40));
        tambah.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        tambah.setForeground(new java.awt.Color(255, 255, 255));
        tambah.setText("Tambah");
        tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahActionPerformed(evt);
            }
        });
        jPanel3.add(tambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(555, 236, 107, 38));

        tempat_lahir.setBackground(new java.awt.Color(149, 72, 91));
        tempat_lahir.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.add(tempat_lahir, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 180, 33));

        tgl_lahir.setBackground(new java.awt.Color(149, 72, 91));
        tgl_lahir.setForeground(new java.awt.Color(255, 255, 255));
        tgl_lahir.setDateFormatString("yyyy-MM-dd");
        jPanel3.add(tgl_lahir, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 180, 30));

        no_antrian.setEditable(false);
        no_antrian.setBackground(new java.awt.Color(149, 72, 91));
        no_antrian.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.add(no_antrian, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, 180, 33));

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("No Antrian");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 80, 33));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 740, 360));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 761, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 441, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void no_bpjsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_no_bpjsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_no_bpjsActionPerformed
    private  String getTanggal() {  
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");  
        Date date = new Date();  
        return dateFormat.format(date);  
    }
    public void reset(){
        nama_pasien.setText("");
        alamat.setText("");
        tempat_lahir.setText("");
        no_telpon.setText("");
        no_bpjs.setText("");
    }
    
    public void setTgl(){
        SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");
        String tgl1 = format1.format(new Date());
        tgl_lahir.setDate(new Date());
    }
    
    public  void antrian(){
        try {
            SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");
            String tgl1 = format1.format(new Date());
            //System.out.println(tgl1);

            String sql  = "SELECT max(no_antrian) as total FROM tbl_pasien where tgl_daftar ='" + tgl1 +"'  ";
            java.sql.Connection conn = (Connection)Conn.configDB();
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery(sql);
            
            rs.next();
            System.out.println(rs.getString("total"));
            
            if(rs.getString("total") == null ){
                no_antrian.setText("001");
            }else {
                String nofak = rs.getString("total").substring(0);
                String AN    = "" + (Integer.parseInt(nofak) + 1 );
                String nol   = "" ;
                
                if(AN.length() == 1){
                    nol = "00" ;
                }else if(AN.length() == 2){
                    nol = "0" ;
                }else if(AN.length() == 3){
                    nol = "" ;
                }
                no_antrian.setText(nol + AN);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        
           
    }
    
    public void idPasien(){
        try {
            String sql  = "SELECT * FROM tbl_pasien order by id_pasien desc ";
            java.sql.Connection conn = (Connection)Conn.configDB();
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery(sql);
            
            if(rs.next()){
                String nofak = rs.getString("id_pasien").substring(3);
                String AN    = "" + (Integer.parseInt(nofak) + 1 );
                String nol   = "" ;
                
                if(AN.length() == 1){
                    nol = "000" ;
                }else if(AN.length() == 2){
                    nol = "00" ;
                }else if(AN.length() == 3){
                    nol = "0" ;
                }else if(AN.length() == 4){
                    nol = "" ;
                }
                id_pasien.setText("PSN" + nol + AN);
            }else {
                id_pasien.setText("PSN0001");
            }
        
           
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,e);
        }
    }
    private void tambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambahActionPerformed
        // TODO add your handling code here:
        TambahPasien a = new TambahPasien();
        String tgl_daftar =  a.getTanggal();
        SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");
        String tanggal_lahir =format1.format(tgl_lahir.getDate());
        if(id_pasien.getText().equals("") || nama_pasien.getText().equals("")|| alamat.getText().equals("")
            || no_telpon.getText().equals("") || no_bpjs.getText().equals("")){
            JOptionPane.showMessageDialog(null,"field kosong");
            
            //print langsung no antrian jika daftar sudah selesai
            no_antri b = new no_antri();
          //  b.antri(no_antrian.getText());
        }else {
            try {
                String sql = "INSERT INTO  tbl_pasien ("
                + " id_pasien , nama , tgl_daftar ,  tempat_lahir ,tgl_lahir , jenis_kelamin ,"
                + "alamat , no_telp , no_bpjs , status ,transaksi) values "
                + "('"+ id_pasien.getText() +"' , '"+ nama_pasien.getText() +"' , '"  + tgl_daftar +  "' ,"
                + " '"+ tempat_lahir.getText()  +"' , '"+ tanggal_lahir  +"' , '"+ jenis_kelamin.getSelectedItem()  +"' ,"
                + " '"+ alamat.getText()  +"' , '"+ no_telpon.getText()  +"' , '"+ no_bpjs.getText()  +"' , 'BELUM DI PERIKSA' ,'NOK') " ;

                String sql2 = "insert into rekam_medis(id_pasien , nama_pasien , jenis_kelamin , tempat_lahir ,"
                + " alamat , no_telp , no_bpjs , tgl_lahir )values"
                + " ('"+ id_pasien.getText() +"' , '"+ nama_pasien.getText() +"' , "
                        + "'"+ jenis_kelamin.getSelectedItem() +"' ,  "
                + " '"+ tempat_lahir.getText() +"' , '"+ alamat.getText() +"' , "
                        + "'"+ no_telpon.getText()  +"' , '"+ no_bpjs.getText() +"' , '"+ tanggal_lahir +"' ) ";

                java.sql.Connection conn = (Connection)Conn.configDB();
                java.sql.PreparedStatement pst = conn.prepareStatement(sql);
                java.sql.PreparedStatement pst2 = conn.prepareStatement(sql2);
                pst.execute();
                pst2.execute();
                JOptionPane.showMessageDialog(null,"Pasien Di Daftarkan");
                idPasien();
                reset();
            }catch(Exception e){
                JOptionPane.showMessageDialog(null,e.getMessage());
               
            }
        }
    }//GEN-LAST:event_tambahActionPerformed

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
            java.util.logging.Logger.getLogger(TambahPasien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TambahPasien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TambahPasien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TambahPasien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TambahPasien().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea alamat;
    private javax.swing.JTextField id_pasien;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> jenis_kelamin;
    private javax.swing.JTextField nama_pasien;
    private javax.swing.JTextField no_antrian;
    private javax.swing.JTextField no_bpjs;
    private javax.swing.JTextField no_telpon;
    private javax.swing.JButton tambah;
    private javax.swing.JTextField tempat_lahir;
    private com.toedter.calendar.JDateChooser tgl_lahir;
    // End of variables declaration//GEN-END:variables
}
