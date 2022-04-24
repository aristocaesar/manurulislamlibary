/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.manurul.view.modal;

import com.manurul.lib.GenKode;
import com.manurul.lib.InputBorder;
import java.awt.Toolkit;
import com.manurul.lib.RoundedPanel;
import com.manurul.model.PengurusModel;
import com.manurul.view.Dashboard;
import com.manurul.view.Login;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author caesarhome
 */
public class PengurusUSER extends javax.swing.JFrame {

    /**
     * Creates new form JurusanUSER
     */
    private String title = "Edit";
    
    private String Action;
    
    private String nip;
    private String username;
    private String password;
    private String nama_lengkap;
    private String hak_akses;
    private String status;
    
    ImageIcon successIcon;
    
    PengurusModel PM = new PengurusModel();
    
    
    public PengurusUSER(String Action, String Kode) {
        initComponents();
        
        // INIT STATE
        this.Action = Action;
        
        // SET SIZE
        this.setSize(1024, 450);
        
        // SET CENTER LOCATION
        this.setLocationRelativeTo(null);
        
        // SET DISABLE RESIZESABLE
        this.setResizable(false);
        
        // SET ICON
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("../../src/LOGO_MANURUL.png")));
        
        // INIT INPUT BORDER PADDING
        InputBorder.set(INPUT_ID_PENGURUS, 8);
        InputBorder.set(INPUT_USERNAME, 8);
        InputBorder.set(INPUT_NIP, 8);
        InputBorder.set(INPUT_NAMA, 8);
        InputBorder.set(INPUT_PASSWORD, 8);
        InputBorder.set(INPUT_CREATED, 8);
        InputBorder.set(INPUT_UPDATED, 8);
        
        // SET COMPONENT BASED ON ACTION
        if(Action.equals("ADD")){
            
            this.title = "Tambah";
            
            LABEL_CREATED.setVisible(false);
            INPUT_CREATED.setVisible(false);
            LABEL_UPDATED.setVisible(false);
            INPUT_UPDATED.setVisible(false);
            BTN_HAPUS_PENGURUS.setVisible(false);
            
            // DEFAULT SET VALUE
            INPUT_ID_PENGURUS.setText(GenKode.RandomInt("PGS", 5));
        }else{
            PM.getSelected(Kode);
            this.nip = PM.getNip();
            this.username = PM.getUsername();
            this.password = PM.getPassword();
            this.nama_lengkap = PM.getNamaLengkap();
            this.hak_akses = PM.getHakAkses();
            this.status = PM.getStatus();
        }
        
        // SET TITLE
        this.setTitle("MA Nurul Islam Library Management - " + this.title + " Pengurus");
        
        // SET SUCCESS ICON
        ImageIcon successIcon = new ImageIcon(getClass().getResource("/com/manurul/src/ICON_SUCCESS.png"));
        this.successIcon = successIcon;
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MAIN_FRAME = new javax.swing.JPanel();
        CONTAINER = new RoundedPanel(15, Color.WHITE);
        INPUT_ID_PENGURUS = new javax.swing.JTextField();
        LABEL_ID_PENGURUS = new javax.swing.JLabel();
        INPUT_USERNAME = new javax.swing.JTextField();
        LABEL_USERNAME = new javax.swing.JLabel();
        LABEL_NIP = new javax.swing.JLabel();
        INPUT_NIP = new javax.swing.JTextField();
        LABEL_HAK_AKSES = new javax.swing.JLabel();
        LABEL_NAMA = new javax.swing.JLabel();
        INPUT_NAMA = new javax.swing.JTextField();
        LABEL_PASSWORD = new javax.swing.JLabel();
        INPUT_PASSWORD = new javax.swing.JTextField();
        LABEL_STATUS = new javax.swing.JLabel();
        INPUT_UPDATED = new javax.swing.JTextField();
        LABEL_UPDATED = new javax.swing.JLabel();
        LABEL_CREATED = new javax.swing.JLabel();
        INPUT_CREATED = new javax.swing.JTextField();
        COMBOBOX_STATUS = new javax.swing.JComboBox<>();
        COMBOBOX_HAK_AKSES = new javax.swing.JComboBox<>();
        BTN_HAPUS_PENGURUS = new javax.swing.JButton();
        BTN_SIMPAN_PENGURUS = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setType(java.awt.Window.Type.POPUP);

        MAIN_FRAME.setBackground(new java.awt.Color(239, 240, 245));

        CONTAINER.setBackground(new java.awt.Color(239, 240, 245));

        INPUT_ID_PENGURUS.setEditable(false);
        INPUT_ID_PENGURUS.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        INPUT_ID_PENGURUS.setForeground(new java.awt.Color(96, 96, 96));
        INPUT_ID_PENGURUS.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(96, 96, 96)));

        LABEL_ID_PENGURUS.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        LABEL_ID_PENGURUS.setForeground(new java.awt.Color(96, 96, 96));
        LABEL_ID_PENGURUS.setText("Kode Pengurus");

        INPUT_USERNAME.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        INPUT_USERNAME.setForeground(new java.awt.Color(96, 96, 96));
        INPUT_USERNAME.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(96, 96, 96)));

        LABEL_USERNAME.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        LABEL_USERNAME.setForeground(new java.awt.Color(96, 96, 96));
        LABEL_USERNAME.setText("Username");

        LABEL_NIP.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        LABEL_NIP.setForeground(new java.awt.Color(96, 96, 96));
        LABEL_NIP.setText("NIP");

        INPUT_NIP.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        INPUT_NIP.setForeground(new java.awt.Color(96, 96, 96));
        INPUT_NIP.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(96, 96, 96)));

        LABEL_HAK_AKSES.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        LABEL_HAK_AKSES.setForeground(new java.awt.Color(96, 96, 96));
        LABEL_HAK_AKSES.setText("Hak Akses");

        LABEL_NAMA.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        LABEL_NAMA.setForeground(new java.awt.Color(96, 96, 96));
        LABEL_NAMA.setText("Nama Lengkap");

        INPUT_NAMA.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        INPUT_NAMA.setForeground(new java.awt.Color(96, 96, 96));
        INPUT_NAMA.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(96, 96, 96)));

        LABEL_PASSWORD.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        LABEL_PASSWORD.setForeground(new java.awt.Color(96, 96, 96));
        LABEL_PASSWORD.setText("Password");

        INPUT_PASSWORD.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        INPUT_PASSWORD.setForeground(new java.awt.Color(96, 96, 96));
        INPUT_PASSWORD.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(96, 96, 96)));

        LABEL_STATUS.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        LABEL_STATUS.setForeground(new java.awt.Color(96, 96, 96));
        LABEL_STATUS.setText("Status");

        INPUT_UPDATED.setEditable(false);
        INPUT_UPDATED.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        INPUT_UPDATED.setForeground(new java.awt.Color(96, 96, 96));
        INPUT_UPDATED.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(96, 96, 96)));

        LABEL_UPDATED.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        LABEL_UPDATED.setForeground(new java.awt.Color(96, 96, 96));
        LABEL_UPDATED.setText("Terakhir Diperbarui");

        LABEL_CREATED.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        LABEL_CREATED.setForeground(new java.awt.Color(96, 96, 96));
        LABEL_CREATED.setText("Tanggal Dibuat");

        INPUT_CREATED.setEditable(false);
        INPUT_CREATED.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        INPUT_CREATED.setForeground(new java.awt.Color(96, 96, 96));
        INPUT_CREATED.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(96, 96, 96)));

        COMBOBOX_STATUS.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        COMBOBOX_STATUS.setForeground(new java.awt.Color(96, 96, 96));
        COMBOBOX_STATUS.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Aktif", "Blokir" }));

        COMBOBOX_HAK_AKSES.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        COMBOBOX_HAK_AKSES.setForeground(new java.awt.Color(96, 96, 96));
        COMBOBOX_HAK_AKSES.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrator", "Staf" }));

        javax.swing.GroupLayout CONTAINERLayout = new javax.swing.GroupLayout(CONTAINER);
        CONTAINER.setLayout(CONTAINERLayout);
        CONTAINERLayout.setHorizontalGroup(
            CONTAINERLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CONTAINERLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(CONTAINERLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(INPUT_ID_PENGURUS, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LABEL_ID_PENGURUS, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 282, Short.MAX_VALUE)
                    .addComponent(LABEL_NAMA, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 282, Short.MAX_VALUE)
                    .addComponent(INPUT_NAMA, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LABEL_CREATED, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 282, Short.MAX_VALUE)
                    .addComponent(INPUT_CREATED, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(37, 37, 37)
                .addGroup(CONTAINERLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(INPUT_USERNAME)
                    .addComponent(LABEL_USERNAME, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
                    .addComponent(LABEL_PASSWORD, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
                    .addComponent(INPUT_PASSWORD)
                    .addComponent(LABEL_UPDATED, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
                    .addComponent(INPUT_UPDATED))
                .addGap(37, 37, 37)
                .addGroup(CONTAINERLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(INPUT_NIP)
                    .addComponent(LABEL_NIP, javax.swing.GroupLayout.DEFAULT_SIZE, 325, Short.MAX_VALUE)
                    .addComponent(LABEL_HAK_AKSES, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LABEL_STATUS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(COMBOBOX_STATUS, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(COMBOBOX_HAK_AKSES, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(23, 23, 23))
        );
        CONTAINERLayout.setVerticalGroup(
            CONTAINERLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CONTAINERLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(CONTAINERLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LABEL_ID_PENGURUS)
                    .addComponent(LABEL_USERNAME)
                    .addComponent(LABEL_NIP))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CONTAINERLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(INPUT_ID_PENGURUS, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(INPUT_NIP, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(INPUT_USERNAME, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(CONTAINERLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LABEL_HAK_AKSES)
                    .addComponent(LABEL_NAMA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LABEL_PASSWORD))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CONTAINERLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(INPUT_NAMA, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(INPUT_PASSWORD, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(COMBOBOX_HAK_AKSES, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(CONTAINERLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(CONTAINERLayout.createSequentialGroup()
                        .addComponent(LABEL_STATUS, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(COMBOBOX_STATUS, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(CONTAINERLayout.createSequentialGroup()
                        .addGroup(CONTAINERLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LABEL_UPDATED)
                            .addComponent(LABEL_CREATED, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(CONTAINERLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(INPUT_UPDATED, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(INPUT_CREATED, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(25, 25, 25))
        );

        BTN_HAPUS_PENGURUS.setBackground(new java.awt.Color(153, 153, 153));
        BTN_HAPUS_PENGURUS.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        BTN_HAPUS_PENGURUS.setForeground(new java.awt.Color(255, 255, 255));
        BTN_HAPUS_PENGURUS.setText("Hapus");
        BTN_HAPUS_PENGURUS.setBorder(null);
        BTN_HAPUS_PENGURUS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BTN_HAPUS_PENGURUSMouseClicked(evt);
            }
        });

        BTN_SIMPAN_PENGURUS.setBackground(new java.awt.Color(0, 171, 60));
        BTN_SIMPAN_PENGURUS.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        BTN_SIMPAN_PENGURUS.setForeground(new java.awt.Color(255, 255, 255));
        BTN_SIMPAN_PENGURUS.setText("Simpan");
        BTN_SIMPAN_PENGURUS.setBorder(null);
        BTN_SIMPAN_PENGURUS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BTN_SIMPAN_PENGURUSMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout MAIN_FRAMELayout = new javax.swing.GroupLayout(MAIN_FRAME);
        MAIN_FRAME.setLayout(MAIN_FRAMELayout);
        MAIN_FRAMELayout.setHorizontalGroup(
            MAIN_FRAMELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MAIN_FRAMELayout.createSequentialGroup()
                .addGroup(MAIN_FRAMELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(MAIN_FRAMELayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(CONTAINER, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(MAIN_FRAMELayout.createSequentialGroup()
                        .addGap(420, 420, 420)
                        .addComponent(BTN_HAPUS_PENGURUS, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(BTN_SIMPAN_PENGURUS, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20))
        );
        MAIN_FRAMELayout.setVerticalGroup(
            MAIN_FRAMELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MAIN_FRAMELayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(CONTAINER, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(MAIN_FRAMELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BTN_SIMPAN_PENGURUS, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTN_HAPUS_PENGURUS, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MAIN_FRAME, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MAIN_FRAME, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private boolean cekValidasi(String Action){
    
        try{
      
            String Nip = INPUT_NIP.getText();
            String Username = INPUT_USERNAME.getText();
            String Password = INPUT_PASSWORD.getText();
            String NamaLengkap = INPUT_NAMA.getText();
            String HakAkses = COMBOBOX_HAK_AKSES.getSelectedItem().toString();
            String Status = COMBOBOX_STATUS.getSelectedItem().toString();
            
            // cek apakah semua tidak kosong
            if(Nip.equals("") || Username.equals("") || Password.equals("") || NamaLengkap.equals("")){
                throw new Exception("Semua nilai input harus terisi!");
            }
            
            // cek apakah semua tidak kosong
            if(!Action.equals("DELETE")){
                if(Nip.equals(this.nip) && Username.equals(this.username) && Password.equals(this.password) 
                  && NamaLengkap.equals(this.nama_lengkap) && HakAkses.equals(this.hak_akses) && Status.equals(this.status) ){
                    throw new Exception("Tidak ada perubahan data !");
                }
            }
            
            return true;
        
        }catch(Exception error){
        
            JOptionPane.showMessageDialog(null, error.getMessage(), "Terjadi Kesalahan!", JOptionPane.INFORMATION_MESSAGE);
            return false;
        
        }
        
    }
    
    private void simpan(){
        if(cekValidasi("ADD")){
            PM.setKode(INPUT_ID_PENGURUS.getText());
            PM.setNip(INPUT_NIP.getText());
            PM.setUsername(INPUT_USERNAME.getText());
            PM.setPassword(INPUT_PASSWORD.getText());
            PM.setNamaLengkap(INPUT_NAMA.getText());
            PM.setHakAkses(COMBOBOX_HAK_AKSES.getSelectedItem().toString());
            PM.setStatus(COMBOBOX_STATUS.getSelectedItem().toString());
            if(PM.insertData()){
                    JOptionPane.showMessageDialog(null, PM.getMessage(), "Sukses!", JOptionPane.INFORMATION_MESSAGE, this.successIcon);
//                    new LogModel().Action("TAMBAH KELAS", "Menambahkan kelas "+INPUT_KODE_KELAS.getText(), Dashboard.nama_user);
                    PM.getDataTable("");
                    this.dispose();
            }else{
                JOptionPane.showMessageDialog(null, PM.getMessage(), "Terjadi Kesalahan!", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    
    private void update(){
        if(cekValidasi("UPDATE")){
            PM.setKode(INPUT_ID_PENGURUS.getText());
            PM.setNip(INPUT_NIP.getText());
            PM.setUsername(INPUT_USERNAME.getText());
            PM.setPassword(INPUT_PASSWORD.getText());
            PM.setNamaLengkap(INPUT_NAMA.getText());
            PM.setHakAkses(COMBOBOX_HAK_AKSES.getSelectedItem().toString());
            PM.setStatus(COMBOBOX_STATUS.getSelectedItem().toString());
            if(PM.updateData()){
                    JOptionPane.showMessageDialog(null, PM.getMessage(), "Sukses!", JOptionPane.INFORMATION_MESSAGE, this.successIcon);
//                    new LogModel().Action("TAMBAH KELAS", "Menambahkan kelas "+INPUT_KODE_KELAS.getText(), Dashboard.nama_user);
                    if(PM.getId().equals(Dashboard.id_user)){
                        JOptionPane.showMessageDialog(null, "Silakan login kembali untuk memuat informasi yang terbaru", "Informasi", JOptionPane.INFORMATION_MESSAGE);
                        System.exit(0);
                    }else{
                        PM.getDataTable("");
                        this.dispose();
                    }
            }else{
                JOptionPane.showMessageDialog(null, PM.getMessage(), "Terjadi Kesalahan!", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    
    private void delete(){
        INPUT_NIP.setText(PM.getNip());
        INPUT_USERNAME.setText(PM.getUsername());
        INPUT_PASSWORD.setText(PM.getPassword());
        INPUT_NAMA.setText(PM.getNamaLengkap());
        COMBOBOX_HAK_AKSES.setSelectedItem(PM.getHakAkses());
        COMBOBOX_STATUS.setSelectedItem(PM.getStatus());
        if(cekValidasi("DELETE")){
            if(PM.deleteData()){
                    JOptionPane.showMessageDialog(null, PM.getMessage(), "Sukses!", JOptionPane.INFORMATION_MESSAGE, this.successIcon);
//                    new LogModel().Action("TAMBAH KELAS", "Menambahkan kelas "+INPUT_KODE_KELAS.getText(), Dashboard.nama_user);
                    PM.getDataTable("");
                    this.dispose();
            }else{
                JOptionPane.showMessageDialog(null, PM.getMessage(), "Terjadi Kesalahan!", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    
    private void BTN_SIMPAN_PENGURUSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTN_SIMPAN_PENGURUSMouseClicked
       
        if(this.Action.equals("ADD")){
            simpan();
        }else{
            update();
        }
        
    }//GEN-LAST:event_BTN_SIMPAN_PENGURUSMouseClicked

    private void BTN_HAPUS_PENGURUSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTN_HAPUS_PENGURUSMouseClicked
        int hapus = JOptionPane.showConfirmDialog(null, "Apakah anda ingin menghapus pengurus ini ?", "Konfirmasi!", JOptionPane.OK_CANCEL_OPTION);
        if(hapus == 0){
            delete();
        }
    }//GEN-LAST:event_BTN_HAPUS_PENGURUSMouseClicked

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
            java.util.logging.Logger.getLogger(PengurusUSER.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PengurusUSER.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PengurusUSER.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PengurusUSER.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PengurusUSER("", "").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTN_HAPUS_PENGURUS;
    private javax.swing.JButton BTN_SIMPAN_PENGURUS;
    public static javax.swing.JComboBox<String> COMBOBOX_HAK_AKSES;
    public static javax.swing.JComboBox<String> COMBOBOX_STATUS;
    private javax.swing.JPanel CONTAINER;
    public static javax.swing.JTextField INPUT_CREATED;
    public static javax.swing.JTextField INPUT_ID_PENGURUS;
    public static javax.swing.JTextField INPUT_NAMA;
    public static javax.swing.JTextField INPUT_NIP;
    public static javax.swing.JTextField INPUT_PASSWORD;
    public static javax.swing.JTextField INPUT_UPDATED;
    public static javax.swing.JTextField INPUT_USERNAME;
    private javax.swing.JLabel LABEL_CREATED;
    private javax.swing.JLabel LABEL_HAK_AKSES;
    private javax.swing.JLabel LABEL_ID_PENGURUS;
    private javax.swing.JLabel LABEL_NAMA;
    private javax.swing.JLabel LABEL_NIP;
    private javax.swing.JLabel LABEL_PASSWORD;
    private javax.swing.JLabel LABEL_STATUS;
    private javax.swing.JLabel LABEL_UPDATED;
    private javax.swing.JLabel LABEL_USERNAME;
    private javax.swing.JPanel MAIN_FRAME;
    // End of variables declaration//GEN-END:variables
}
