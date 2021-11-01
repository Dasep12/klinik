/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.operator;

import Conection.Conn;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.AcroFields;
import com.itextpdf.text.pdf.PdfDocument;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.PdfStamper;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.util.Date;
import javafx.scene.control.Cell;
import javafx.scene.layout.Border;
import javax.swing.JOptionPane;


/**
 *
 * @author dasep
 */
public class Report extends javax.swing.JFrame {

    /**
     * Creates new form Report
     */
    public Report() {
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

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        id_pasien = new javax.swing.JTextField();
        name1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("CLICK TO REPORT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("TESTER");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        id_pasien.setText("PSN001154");
        id_pasien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_pasienActionPerformed(evt);
            }
        });

        name1.setText("Dasep");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(id_pasien, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(210, Short.MAX_VALUE)
                    .addComponent(name1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(76, 76, 76)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                .addComponent(id_pasien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(199, Short.MAX_VALUE)
                    .addComponent(name1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(72, 72, 72)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try {
           // String  sql = "select * from obat_pasien where id_pasien='"+ id_pasien.getText() +"' " ;
           String sql = "SELECT  tbl_pasien.tgl_daftar , tbl_pasien.nama  , tbl_pasien.id_pasien , obat_pasien.obat ," +
                        " transaksi.jasa_medis , transaksi.lain_lain , transaksi.biaya_obat , obat_pasien.harga FROM tbl_pasien " +
                        " LEFT JOIN transaksi ON tbl_pasien.id_pasien = transaksi.idpassien " +
                        " LEFT JOIN obat_pasien ON tbl_pasien.id_pasien = obat_pasien.id_pasien" +
                        " WHERE tbl_pasien.id_pasien='PSN0001' "; 
           java.sql.Connection conn = (Connection)Conn.configDB();
            java.sql.Statement stm = conn.createStatement();
            java.sql.Statement stm2 = conn.createStatement();
            java.sql.ResultSet res = stm.executeQuery(sql);
            java.sql.ResultSet res2 = stm2.executeQuery(sql);
            /* Step-2: Initialize PDF documents - logical objects */
            File directory = new File("C://Backup File");
            if (! directory.exists()){
                directory.mkdir();
                // If you require it to make the entire directory path including parents,
                // use directory.mkdirs(); here instead.
            }

            Font F = FontFactory.getFont(FontFactory.COURIER, 9 , Font.NORMAL, BaseColor.BLACK) ;
            Font F2 = FontFactory.getFont(FontFactory.COURIER, 10 , Font.NORMAL, BaseColor.BLACK) ;
            String idTrans  = id_pasien.getText();
            String path = "C://Backup File//" + idTrans + ".pdf" ;
            Document document = new Document();
            document.setPageSize(PageSize.A5);
            PdfWriter.getInstance(document, new FileOutputStream(path));
            document.open();            
            document.add(new Paragraph("\n"));
            document.add(new Paragraph(""
                    + "                                      "
                    + "TAGIHAN PEMBAYARAN KLINIK BU ITA"
                    + "                                      "
                    + "",FontFactory.getFont(FontFactory.TIMES_BOLD, 10, Font.BOLD)));
            
            document.add(new Paragraph("    Nama Pasien : " + id_pasien.getText() , F2));
            document.add(new Paragraph("    ID Pasien : " + id_pasien.getText() , F2));
            document.add(new Paragraph("\n"));
            //we have four columns in our table
            PdfPTable my_report_table = new PdfPTable(2);
            
            //create a cell object
            PdfPCell table_cell;
            
            PdfPCell cell = new PdfPCell();
            cell.setMinimumHeight(50);
            cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
          //  cell.setBorder(Border.NO_BORDER);
            
            
            my_report_table.addCell("Jenis Tagihan");
            my_report_table.addCell("Biaya");
            my_report_table.setHeaderRows(1);
            
             while (res.next()) {                
                  String obat         = res.getString("obat");
                  cell                = new PdfPCell(new Phrase(obat + (" (obat)") , F));
                  my_report_table.addCell(cell);
                  
                  String harga           = res.getString("harga");
                  cell                = new PdfPCell(new Phrase(harga , F));
                  my_report_table.addCell(cell);
             }
             //biaya medis
            res2.next();
            cell                = new PdfPCell(new Phrase("Jasa Medis"  , F));
            my_report_table.addCell(cell);
            cell                = new PdfPCell(new Phrase(res2.getString("jasa_medis") , F));
            my_report_table.addCell(cell);
            //end
            
            //biaya lain
            cell                = new PdfPCell(new Phrase("Lain-Lain" , F));
            my_report_table.addCell(cell);
            cell                = new PdfPCell(new Phrase(res2.getString("lain_lain") , F));
            my_report_table.addCell(cell);
            //end
            
            //total
            cell                = new PdfPCell(new Phrase("Total" , F));
            my_report_table.addCell(cell);
            cell                = new PdfPCell(new Phrase("10000", F));
            my_report_table.addCell(cell);
            //end
             
          
             
            /* Attach report table to PDF */
           document.add(my_report_table);    
           document.close();        

        /* Close all DB related objects */
        JOptionPane.showMessageDialog(null,"Disimpan " + path);
        //tampilkan data pdf transaksi 
        Desktop.getDesktop().open(new File(path));
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
      //String path = "C:\\Backup File\\tes.pdf" ;
      //PdfWriter pdfWriter = new PdfWriter(path);
      //PdfDocument pdfDocument = new PdfDocument(pdfWriter);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void id_pasienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_pasienActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_id_pasienActionPerformed

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
            java.util.logging.Logger.getLogger(Report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Report().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField id_pasien;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JTextField name1;
    // End of variables declaration//GEN-END:variables
}
