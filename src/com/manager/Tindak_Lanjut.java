/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.manager;

import Conection.Conn;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.text.SimpleDateFormat;
import java.util.Date;
import javafx.scene.control.Cell;
import javax.swing.JOptionPane;

/**
 *
 * @author dasep
 */
public class Tindak_Lanjut extends javax.swing.JFrame {

    /**
     * Creates new form Tindak_Lanjut
     */
    public Tindak_Lanjut() {
        initComponents();
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
        jPanel4 = new javax.swing.JPanel();
        rekamMedis2 = new javax.swing.JButton();
        tgl_awal = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        tgl_akhir = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconImage(    new javax.swing.ImageIcon(getClass().getResource("/image/icon.png")).getImage());
        setResizable(false);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(71, 82, 83));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Report Tindak Lanjut", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rekamMedis2.setBackground(new java.awt.Color(48, 37, 40));
        rekamMedis2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        rekamMedis2.setForeground(new java.awt.Color(255, 255, 255));
        rekamMedis2.setText("EXPORT");
        rekamMedis2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rekamMedis2ActionPerformed(evt);
            }
        });
        jPanel4.add(rekamMedis2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, 180, 50));

        tgl_awal.setBackground(new java.awt.Color(149, 72, 91));
        tgl_awal.setForeground(new java.awt.Color(255, 255, 255));
        tgl_awal.setDateFormatString("yyyy-MM-dd");
        jPanel4.add(tgl_awal, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, 180, 40));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("S/D");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 110, 40, -1));

        tgl_akhir.setBackground(new java.awt.Color(149, 72, 91));
        tgl_akhir.setForeground(new java.awt.Color(255, 255, 255));
        tgl_akhir.setDateFormatString("yyyy-MM-dd");
        jPanel4.add(tgl_akhir, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, 180, 40));

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 560, 320));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 580, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 341, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void rekamMedis2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rekamMedis2ActionPerformed
        // TODO add your handling code here:
        
        SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");
        String tgl1 = format1.format(tgl_awal.getDate());
        String tgl2 = format1.format(tgl_akhir.getDate());
        
        try {
            File theDir = new File("C:/Backup File/");
                if (!theDir.exists()){
                    theDir.mkdirs();
                }
            String path  = "C://Backup File//Laporan Tindak Lanjut.pdf" ;
            String  sql = "SELECT * FROM tbl_pasien JOIN rekam_medis"
                    + " WHERE tbl_pasien.id_pasien = rekam_medis.id_pasien "
                    + "AND STATUS='SUDAH DI PERIKSA' " 
                    + " AND tgl_daftar BETWEEN '"+ tgl1 +"' AND '"+ tgl2 +"' "
                    + "AND transaksi='OK' " ;
            java.sql.Connection conn = (Connection)Conn.configDB();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet res = stm.executeQuery(sql);
            /* Step-2: Initialize PDF documents - logical objects */
        Document my_pdf_report = new Document();
        PdfWriter.getInstance(my_pdf_report, new FileOutputStream(path));
        my_pdf_report.open();            
        my_pdf_report.add(new Paragraph("Laporan Tindak Lanjut",FontFactory.getFont(FontFactory.TIMES_BOLD, 12, Font.BOLD, BaseColor.BLUE)));
        my_pdf_report.add(new Paragraph( "Tanggal Penarikan : "  + tgl1 + " s/d " + tgl2 ));
        my_pdf_report.add(new Paragraph("-------------------------------------------------------------------"
                + "--------------------------------------------------------------"));
        my_pdf_report.add(new Paragraph("\n"));
        //we have four columns in our table
        PdfPTable my_report_table = new PdfPTable(5);
       // Cell cell = new PDf;
        
        my_report_table.setWidthPercentage(100);
        //create a cell object
        PdfPCell table_cell;
        PdfPCell table_cell2;
        
        Font F = FontFactory.getFont(FontFactory.COURIER, 9 , Font.NORMAL, BaseColor.WHITE) ;
        Font F2 = FontFactory.getFont(FontFactory.COURIER, 8, Font.NORMAL, BaseColor.BLACK);
        table_cell2 = new PdfPCell(new Phrase("Nama Pasien",F));
        table_cell2.setBackgroundColor(BaseColor.BLUE);
        my_report_table.addCell(table_cell2);
        
        table_cell2 = new PdfPCell(new Phrase("Jenis Kelamin",F));
        table_cell2.setBackgroundColor(BaseColor.BLUE);
        my_report_table.addCell(table_cell2);
        
        table_cell2 = new PdfPCell(new Phrase("Tempat,Tanggal Lahir",F));
        table_cell2.setBackgroundColor(BaseColor.BLUE);
        my_report_table.addCell(table_cell2);
        
        table_cell2 = new PdfPCell(new Phrase("Tanggal Daftar",F));
        table_cell2.setBackgroundColor(BaseColor.BLUE);
        my_report_table.addCell(table_cell2);
        
        table_cell2 = new PdfPCell(new Phrase("Tindak Lanjut",F));
        table_cell2.setBackgroundColor(BaseColor.BLUE);
        my_report_table.addCell(table_cell2);
       
        my_report_table.setHeaderRows(1);
       
        while (res.next()) {                
            String id           = res.getString("nama");
            table_cell          = new PdfPCell(new Phrase(id , F2));
            my_report_table.addCell(table_cell);
            
            String tempat       = res.getString("tempat_lahir");
            String lahir        = res.getString("tgl_lahir");
            table_cell          = new PdfPCell(new Phrase(tempat + "," + lahir , F2 ));
            my_report_table.addCell(table_cell);
            
            String nohp        = res.getString("jenis_kelamin");
            table_cell          = new PdfPCell(new Phrase(nohp , F2));
            my_report_table.addCell(table_cell);
            
            String alamat     = res.getString("tgl_daftar");
            table_cell          = new PdfPCell(new Phrase(alamat , F2 ));
            my_report_table.addCell(table_cell);
            
            String makanan         = res.getString("tindak_lanjut");
            table_cell          = new PdfPCell(new Phrase(makanan , F2));
            my_report_table.addCell(table_cell);            
         }
        /* Attach report table to PDF */
        my_pdf_report.add(my_report_table);                       
        my_pdf_report.close();
             JOptionPane.showMessageDialog(null,"Sukses");
             Desktop.getDesktop().open(new File(path));
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_rekamMedis2ActionPerformed

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
            java.util.logging.Logger.getLogger(Tindak_Lanjut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tindak_Lanjut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tindak_Lanjut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tindak_Lanjut.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tindak_Lanjut().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JButton rekamMedis2;
    private com.toedter.calendar.JDateChooser tgl_akhir;
    private com.toedter.calendar.JDateChooser tgl_awal;
    // End of variables declaration//GEN-END:variables
}
