/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Operator;

import Conection.Conn;
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
public class Dashboard extends javax.swing.JFrame {

    /**
     * Creates new form Dashboard
     */
    private String id ;
    public Dashboard() {
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
        daftar_pasien = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        key = new javax.swing.JTextField();
        cari = new javax.swing.JButton();
        tambah_pasien = new javax.swing.JButton();
        penyakit = new javax.swing.JButton();
        data_obat = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        pasienList = new javax.swing.JTable();
        daftar_obat = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        daftar_pasien1 = new javax.swing.JButton();

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

        daftar_pasien.setText("Status");
        daftar_pasien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                daftar_pasienActionPerformed(evt);
            }
        });
        jPanel1.add(daftar_pasien, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 118, 50));

        jPanel2.setBackground(new java.awt.Color(181, 102, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("KLINIK INDOMARET PRISMATAMA");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, 340, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Pusat Pelayanan Masyarakat");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 50, 300, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Kota Jakarta Utara");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 80, -1, -1));

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

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, 120));

        tambah_pasien.setText("Daftar Pasien");
        tambah_pasien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambah_pasienActionPerformed(evt);
            }
        });
        jPanel1.add(tambah_pasien, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 118, 50));

        penyakit.setText("Data Penyakit");
        penyakit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                penyakitActionPerformed(evt);
            }
        });
        jPanel1.add(penyakit, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 118, 50));

        data_obat.setText("Master Obat");
        data_obat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                data_obatActionPerformed(evt);
            }
        });
        jPanel1.add(data_obat, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 118, 50));

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
                "No Antrian", "Nama Pasien", "Alamat", "No.Hp", "Status"
            }
        ));
        pasienList.setRowHeight(20);
        pasienList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pasienListMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(pasienList);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 820, 310));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        javax.swing.GroupLayout daftar_obatLayout = new javax.swing.GroupLayout(daftar_obat);
        daftar_obat.setLayout(daftar_obatLayout);
        daftar_obatLayout.setHorizontalGroup(
            daftar_obatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(daftar_obatLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(58, Short.MAX_VALUE))
        );
        daftar_obatLayout.setVerticalGroup(
            daftar_obatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(daftar_obatLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        jPanel3.add(daftar_obat, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 130, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 840, 530));

        daftar_pasien1.setText("Tindak Lanjut");
        daftar_pasien1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                daftar_pasien1ActionPerformed(evt);
            }
        });
        jPanel1.add(daftar_pasien1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 118, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 659, Short.MAX_VALUE)
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
                sql = "Select id_pasien , nama , jenis_kelamin,tgl_daftar , status from tbl_pasien  " ;
            }else {
                    sql = "Select id_pasien , nama , jenis_kelamin,tgl_daftar , status from tbl_pasien where " 
                            + "id_pasien like  '%"+ data +"%' or nama like '%"+ data +"%'"
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
    private void daftar_pasienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_daftar_pasienActionPerformed
        // TODO add your handling code here:
        Master_status a = new Master_status();
        a.setVisible(true);
    }//GEN-LAST:event_daftar_pasienActionPerformed

    private void tambah_pasienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambah_pasienActionPerformed
        // TODO add your handling code here:
        Daftar_Pasien a = new Daftar_Pasien();
        a.setVisible(true);
    }//GEN-LAST:event_tambah_pasienActionPerformed

    private void penyakitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_penyakitActionPerformed
        // TODO add your handling code here:
      Master_penyakit a = new Master_penyakit();
        a.setVisible(true);
    }//GEN-LAST:event_penyakitActionPerformed

    private void data_obatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_data_obatActionPerformed
        // TODO add your handling code here:
        Master_obat a = new Master_obat();
        a.setVisible(true);
    }//GEN-LAST:event_data_obatActionPerformed

    private void daftar_pasien1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_daftar_pasien1ActionPerformed
        // TODO add your handling code here:
         Master_tindak_lanjut a = new Master_tindak_lanjut();
         a.setVisible(true);
    }//GEN-LAST:event_daftar_pasien1ActionPerformed

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
        
    }//GEN-LAST:event_pasienListMouseClicked

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
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cari;
    private javax.swing.JPanel daftar_obat;
    private javax.swing.JButton daftar_pasien;
    private javax.swing.JButton daftar_pasien1;
    private javax.swing.JButton data_obat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField key;
    private javax.swing.JTable pasienList;
    private javax.swing.JButton penyakit;
    private javax.swing.JButton tambah_pasien;
    // End of variables declaration//GEN-END:variables
}
