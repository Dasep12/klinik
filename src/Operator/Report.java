/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Operator;

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jButton1)
                .addGap(53, 53, 53)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(56, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(153, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try {
            String  sql = "select * from obat_pasien where id_pasien='PSN0001' " ;
            java.sql.Connection conn = (Connection)Conn.configDB();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet res = stm.executeQuery(sql);
            /* Step-2: Initialize PDF documents - logical objects */
            File directory = new File("C://Backup File");
            if (! directory.exists()){
                directory.mkdir();
                // If you require it to make the entire directory path including parents,
                // use directory.mkdirs(); here instead.
            }

            String idTrans = "PSN0012021";
            String path = "C://Backup File//" + idTrans + ".pdf" ;
            Document document = new Document();
            document.setPageSize(PageSize.A5);
            PdfWriter.getInstance(document, new FileOutputStream(path));
            document.open();            
            document.add(new Paragraph("\n"));
            document.add(new Paragraph(""
                    + "                                      "
                    + "KLINIK BU ITA"
                    + "                                      "
                    + "",FontFactory.getFont(FontFactory.TIMES_BOLD, 14, Font.BOLD)));
    
            document.addTitle("Hallo");
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
                  cell                = new PdfPCell(new Phrase(obat));
                  my_report_table.addCell(cell);
                  
                  String harga           = res.getString("harga");
                  cell                = new PdfPCell(new Phrase(harga));
                  my_report_table.addCell(cell);
             }
             //biaya medis
            cell                = new PdfPCell(new Phrase("JASA MEDIS"));
            my_report_table.addCell(cell);
            cell                = new PdfPCell(new Phrase("109090"));
            my_report_table.addCell(cell);
            //end of biaya medis
            
            //biaya medis
            cell                = new PdfPCell(new Phrase("LAIN LAIN"));
            my_report_table.addCell(cell);
            cell                = new PdfPCell(new Phrase("109090"));
            my_report_table.addCell(cell);
            //end of biaya medis
             
            
            //terimakasih
            document.add(new Paragraph("---------------TERIMA KASIH-------------"));
             
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
        
    }//GEN-LAST:event_jButton2ActionPerformed

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
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    // End of variables declaration//GEN-END:variables
}
