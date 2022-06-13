/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.manurul.view.modal;

import com.manurul.lib.InputBorder;
import com.manurul.lib.RoundedPanel;
import com.manurul.model.TransaksiModel;
import com.manurul.view.Dashboard;
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.JOptionPane;

/**
 *
 * @author player
 */
public class getDaftarBukuTRANSAKSI extends javax.swing.JFrame {

    /**
     * Creates new form getDaftatBukuTRANSAKSI
     */
    
    
    public getDaftarBukuTRANSAKSI(String Keyword) {
        initComponents();
    
        // SET CENTER LOCATION
        this.setLocationRelativeTo(null);
        
        // SET DISABLE RESIZESABLE
        this.setResizable(false);
        
        // SET BORDER
        InputBorder.set(INPUT_SEARCH, 8);
        INPUT_SEARCH.setFocusable(true);
        
        // SET TITLE
        this.setTitle("MA Nurul Islam Library Management - Tambah Buku");
        
        new TransaksiModel().setDataBuku(Keyword, Dashboard.PJ_INPUT_JENIS_BUKU.getSelectedItem().toString());
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PANEL_SEARCH = new RoundedPanel(15, Color.WHITE);
        INPUT_SEARCH = new javax.swing.JTextField();
        BTN_SEARCH = new javax.swing.JLabel();
        PANEL_TABLE = new RoundedPanel(15, Color.WHITE);
        jScrollPane1 = new javax.swing.JScrollPane();
        TABLE_LIST_BUKU = new javax.swing.JTable(){

            private static final long serialVersionUID = 1L;

            public boolean isCellEditable(int row, int column) {
                return false;
            };

        };

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        INPUT_SEARCH.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        INPUT_SEARCH.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        INPUT_SEARCH.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                INPUT_SEARCHKeyTyped(evt);
            }
        });

        BTN_SEARCH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/manurul/src/ICON_SEARCH.png"))); // NOI18N
        BTN_SEARCH.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout PANEL_SEARCHLayout = new javax.swing.GroupLayout(PANEL_SEARCH);
        PANEL_SEARCH.setLayout(PANEL_SEARCHLayout);
        PANEL_SEARCHLayout.setHorizontalGroup(
            PANEL_SEARCHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PANEL_SEARCHLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(INPUT_SEARCH)
                .addGap(20, 20, 20)
                .addComponent(BTN_SEARCH)
                .addGap(25, 25, 25))
        );
        PANEL_SEARCHLayout.setVerticalGroup(
            PANEL_SEARCHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PANEL_SEARCHLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(PANEL_SEARCHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(INPUT_SEARCH)
                    .addComponent(BTN_SEARCH, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE))
                .addGap(25, 25, 25))
        );

        TABLE_LIST_BUKU.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        TABLE_LIST_BUKU.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        TABLE_LIST_BUKU.setRowHeight(30);
        TABLE_LIST_BUKU.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TABLE_LIST_BUKUMouseClicked(evt);
            }
        });
        TABLE_LIST_BUKU.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TABLE_LIST_BUKUKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(TABLE_LIST_BUKU);

        javax.swing.GroupLayout PANEL_TABLELayout = new javax.swing.GroupLayout(PANEL_TABLE);
        PANEL_TABLE.setLayout(PANEL_TABLELayout);
        PANEL_TABLELayout.setHorizontalGroup(
            PANEL_TABLELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PANEL_TABLELayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 804, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        PANEL_TABLELayout.setVerticalGroup(
            PANEL_TABLELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PANEL_TABLELayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(PANEL_TABLE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PANEL_SEARCH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(PANEL_SEARCH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(PANEL_TABLE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void getSelectedItem(){
    
        try{
            
            // get row
            int rowIndex = TABLE_LIST_BUKU.getSelectedRow();

            Object isbn = TABLE_LIST_BUKU.getValueAt(rowIndex, 0);
            String judul = TABLE_LIST_BUKU.getValueAt(rowIndex, 1).toString();
            
            // get value data peminjam
            String valueBukuByPeminjam = Dashboard.TM.getExistBukuInPeminjam(isbn.toString());
            if(valueBukuByPeminjam.equals("Dipinjam")){
                throw new Exception("Buku " + judul + " sudah / sedang dipinjam !");
            }else if(valueBukuByPeminjam.equals("Bermasalah")){
                throw new Exception("Peminjaman buku " + judul + " mengalami masalah !");
            }

            // cek jumlah rows
            int countRow = Dashboard.TABLE_LIST_PINJAM.getRowCount();
            
            // cek duplicate
            if(Dashboard.TABLE_LIST_PINJAM.getValueAt(0, 0) != null){
                    for(int i = 0; i < countRow; i++){
                        String dataTableMain = Dashboard.TABLE_LIST_PINJAM.getValueAt(i, 0).toString();
                        if(dataTableMain.equals(isbn)){
                            throw new Exception("Buku " + judul + " sudah ditambahkan !");
                        }
                    }   
            }
            
            String max_pinjam_hari = TABLE_LIST_BUKU.getValueAt(rowIndex, 3).toString();

            boolean started = false;
            if(Dashboard.TABLE_LIST_PINJAM.getValueAt(0, 0) == "" && Dashboard.TABLE_LIST_PINJAM.getRowCount() == 1){
                started = true;
            }

            Dashboard.TM.setRowTableDashboardPinjam(new String[]{
                isbn.toString(),
                judul,
                max_pinjam_hari
            }, started);

            this.dispose();
            
        }catch(Exception error){
            JOptionPane.showMessageDialog(null, error.getMessage(), "Informasi !", JOptionPane.INFORMATION_MESSAGE);
        }
        
    }
    
    private void INPUT_SEARCHKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_INPUT_SEARCHKeyTyped
        new TransaksiModel().setDataBuku(INPUT_SEARCH.getText(), Dashboard.PJ_INPUT_JENIS_BUKU.getSelectedItem().toString());
    }//GEN-LAST:event_INPUT_SEARCHKeyTyped

    private void TABLE_LIST_BUKUMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TABLE_LIST_BUKUMouseClicked

        if(evt.getClickCount() == 2){
            getSelectedItem();
        }

    }//GEN-LAST:event_TABLE_LIST_BUKUMouseClicked

    private void TABLE_LIST_BUKUKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TABLE_LIST_BUKUKeyPressed

        if(evt.getKeyCode() == evt.VK_ENTER){
            getSelectedItem();
        }

    }//GEN-LAST:event_TABLE_LIST_BUKUKeyPressed

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
            java.util.logging.Logger.getLogger(getDaftarBukuTRANSAKSI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(getDaftarBukuTRANSAKSI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(getDaftarBukuTRANSAKSI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(getDaftarBukuTRANSAKSI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new getDaftarBukuTRANSAKSI("").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BTN_SEARCH;
    private javax.swing.JTextField INPUT_SEARCH;
    private javax.swing.JPanel PANEL_SEARCH;
    private javax.swing.JPanel PANEL_TABLE;
    public static javax.swing.JTable TABLE_LIST_BUKU;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
