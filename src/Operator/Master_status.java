/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Operator;
import Conection.Conn ;
import java.sql.Connection;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author dasep
 */
public class Master_status extends javax.swing.JFrame {

    /**
     * Creates new form Master_obat
     */
    private String id ;
    public Master_status() {
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
        jLabel10 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        status = new javax.swing.JTable();
        key = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        id_status = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jenis_status = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        ubah = new javax.swing.JButton();
        hapus = new javax.swing.JButton();
        tambah = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        refresh = new javax.swing.JButton();
        cari = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(72, 136, 99));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("MASTER STATUS");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, 190, 30));

        jPanel2.setBackground(new java.awt.Color(72, 136, 99));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Data Status", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        status.setBackground(new java.awt.Color(51, 240, 255));
        status.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID Status", "Status "
            }
        ));
        status.setGridColor(new java.awt.Color(51, 102, 255));
        status.setRowHeight(18);
        status.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                statusMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(status);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 740, 220));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 760, 250));

        key.setBackground(new java.awt.Color(149, 72, 91));
        key.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(key, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 20, 150, 30));

        jPanel3.setBackground(new java.awt.Color(72, 136, 99));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tambah Data Status", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel3.setForeground(java.awt.Color.white);
        jPanel3.setLayout(null);

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ID Status");
        jPanel3.add(jLabel2);
        jLabel2.setBounds(110, 40, 90, 33);

        id_status.setBackground(new java.awt.Color(149, 72, 91));
        id_status.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.add(id_status);
        id_status.setBounds(180, 40, 180, 33);

        jLabel4.setForeground(java.awt.Color.white);
        jLabel4.setText("Jenis Status");
        jPanel3.add(jLabel4);
        jLabel4.setBounds(390, 40, 110, 33);

        jenis_status.setBackground(new java.awt.Color(149, 72, 91));
        jenis_status.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.add(jenis_status);
        jenis_status.setBounds(480, 40, 180, 33);

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 750, 100));

        jPanel4.setBackground(new java.awt.Color(72, 136, 99));

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

        jButton11.setBackground(new java.awt.Color(48, 37, 40));
        jButton11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton11.setForeground(new java.awt.Color(255, 255, 255));
        jButton11.setText("Tambah");

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
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 750, 50));

        refresh.setBackground(new java.awt.Color(48, 37, 40));
        refresh.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        refresh.setForeground(new java.awt.Color(255, 255, 255));
        refresh.setText("Refresh");
        refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshActionPerformed(evt);
            }
        });
        jPanel1.add(refresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 107, 38));

        cari.setBackground(new java.awt.Color(48, 37, 40));
        cari.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cari.setForeground(new java.awt.Color(255, 255, 255));
        cari.setText("Cari");
        cari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cariActionPerformed(evt);
            }
        });
        jPanel1.add(cari, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 20, 70, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 790, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambahActionPerformed
        // TODO add your handling code here:
        if(id_status.getText().equals("") || jenis_status.getText().equals("")){
            JOptionPane.showMessageDialog(null,"field kosong");
        }else {
            try {
                String sql = "INSERT INTO  tbl_status_periksa ("
                        + " id_status , jenis_status ) values "
                        + "('"+ id_status.getText() +"' , '"+ jenis_status.getText() +"' ) " ;
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

    private void statusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_statusMouseClicked
        // TODO add your handling code here:
         int baris  = status.rowAtPoint(evt.getPoint());
        String id = status.getValueAt(baris,0).toString();
        id_status.setText(id);
        id_status.setEditable(false);
        tambah.setEnabled(false);
        ubah.setEnabled(true);
        hapus.setEnabled(true);
        reset.setEnabled(true);
        try {
            String sql = "Select * from tbl_status_periksa where id_status  = '"+ id +"' " ;
            java.sql.Connection conn = (Connection)Conn.configDB();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet res = stm.executeQuery(sql);
            while(res.next()){
                jenis_status.setText(res.getString("jenis_status"));
            }
        }catch(Exception e){

        }
    }//GEN-LAST:event_statusMouseClicked

    private void ubahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ubahActionPerformed
        // TODO add your handling code here:
        if(jenis_status.getText().equals("")){
            JOptionPane.showMessageDialog(null,"field kosong");
        }else {
            try {
                String sql = "update tbl_status_periksa  set"
                        + " jenis_status = '"+ jenis_status.getText() + "' "
                                + " where id_status='"+ id_status.getText() +"'  " ;
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
                    String sql = "delete from tbl_status_periksa where id_status = '"+ id_status.getText() +"' " ;
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

    private void cariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cariActionPerformed
        // TODO add your handling code here:
         if(key.getText().equals("")){
            JOptionPane.showMessageDialog(null,"keyword kosong");
        }else {
            String data = key.getText();
            loadData(data);
        }
    }//GEN-LAST:event_cariActionPerformed

    private void refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshActionPerformed
        // TODO add your handling code here:
        String data = null ;
                   loadData(data);
    }//GEN-LAST:event_refreshActionPerformed

        public void reset(){
            id_status.setText("");
            jenis_status.setText("");
            id_status.setEditable(true);
            tambah.setEnabled(true);
            ubah.setEnabled(false);
            reset.setEnabled(false);
            hapus.setEnabled(false);

        }

       public void loadData(String data){
       DefaultTableModel model = new DefaultTableModel();
        model.addColumn("ID Status");
        model.addColumn("Status");

        //tampilkan data makanan kedalam table
        try {
            String sql = "" ;

            if(data == null ){
                sql = "Select * from tbl_status_periksa  " ;
            }else {
                    sql = "Select * from tbl_status_periksa where "
                            + "id_status like  '%"+ data +"%' or jenis_status like '%"+ data +"%'" ;
            }
                    java.sql.Connection conn = (Connection)Conn.configDB();
                    java.sql.Statement stm = conn.createStatement();
                    java.sql.ResultSet res = stm.executeQuery(sql);
                    while(res.next()){
                        model.addRow(new Object[] {res.getString("id_status") ,  res.getString("jenis_status") } );
                    }
            status.setModel(model);
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
            java.util.logging.Logger.getLogger(Master_status.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Master_status.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Master_status.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Master_status.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Master_status().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cari;
    private javax.swing.JButton hapus;
    private javax.swing.JTextField id_status;
    private javax.swing.JButton jButton11;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jenis_status;
    private javax.swing.JTextField key;
    private javax.swing.JButton refresh;
    private javax.swing.JButton reset;
    private javax.swing.JTable status;
    private javax.swing.JButton tambah;
    private javax.swing.JButton ubah;
    // End of variables declaration//GEN-END:variables
}
