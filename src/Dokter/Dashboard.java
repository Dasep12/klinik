/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dokter;

import Conection.Conn;
import java.sql.Connection;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author dasep
 */
public class Dashboard extends javax.swing.JFrame {

    private String id ;

    /**
     * Creates new form Dashboard
     */
    public Dashboard() {
        initComponents();
        loadData(this.id);
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        key = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        logout = new javax.swing.JButton();
        refresh = new javax.swing.JButton();
        refresh1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        pasienList = new javax.swing.JTable();
        cari = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(72, 136, 99));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(72, 136, 99));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("KLINIK INDOMARET PRISMATAMA");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, 340, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Pusat Pelayanan Masyarakat");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 50, 300, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Kota Jakarta Utara");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 80, -1, -1));

        jPanel3.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 870, 100));

        key.setBackground(new java.awt.Color(149, 72, 91));
        key.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.add(key, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 110, 150, 30));

        jPanel1.setBackground(new java.awt.Color(71, 82, 83));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Data Dokter", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Selamat Datang");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 126, -1));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Dokter Dasep Depiyawan");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        logout.setBackground(new java.awt.Color(48, 37, 40));
        logout.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        logout.setForeground(new java.awt.Color(255, 255, 255));
        logout.setText("Logout");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });
        jPanel1.add(logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 180, 50));

        refresh.setBackground(new java.awt.Color(48, 37, 40));
        refresh.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        refresh.setForeground(new java.awt.Color(255, 255, 255));
        refresh.setText("Simpan");
        refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshActionPerformed(evt);
            }
        });
        jPanel1.add(refresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 180, 50));

        refresh1.setBackground(new java.awt.Color(48, 37, 40));
        refresh1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        refresh1.setForeground(new java.awt.Color(255, 255, 255));
        refresh1.setText("Refresh Table");
        refresh1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refresh1ActionPerformed(evt);
            }
        });
        jPanel1.add(refresh1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 180, 50));

        jPanel3.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 200, 310));

        jPanel4.setBackground(new java.awt.Color(71, 82, 83));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "List Pasien", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        jScrollPane1.setViewportView(pasienList);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 630, 280));

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, 650, 310));

        cari.setBackground(new java.awt.Color(48, 37, 40));
        cari.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cari.setForeground(new java.awt.Color(255, 255, 255));
        cari.setText("Cari");
        cari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cariActionPerformed(evt);
            }
        });
        jPanel3.add(cari, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 110, 70, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 640, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    public void loadData(String data){
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("No");
        model.addColumn("ID Pasien");
        model.addColumn("Nama Pasien");
        model.addColumn("Jenis Kelamin");
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
                            res.getString("jenis_kelamin") ,  res.getString("status")  } );
                    }
            pasienList.setModel(model);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        } 
    }
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

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_logoutActionPerformed

    private void refresh1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refresh1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_refresh1ActionPerformed

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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField key;
    private javax.swing.JButton logout;
    private javax.swing.JTable pasienList;
    private javax.swing.JButton refresh;
    private javax.swing.JButton refresh1;
    // End of variables declaration//GEN-END:variables
}