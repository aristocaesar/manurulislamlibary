/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.manurul.view.modal;

import com.manurul.lib.InputBorder;
import java.awt.Toolkit;
import com.manurul.lib.RoundedPanel;
import java.awt.Color;

/**
 *
 * @author RSI-13
 */
public class BukuDATABUKU extends javax.swing.JFrame {

    /**
     * Creates new form BukuDATABUKU
     */
    String title = "Edit";
    
    public BukuDATABUKU(String Action, int ID) {
        initComponents();
        
        // SET SIZE
        this.setSize(1040, 725);
        
        // SET CENTER LOCATION
        this.setLocationRelativeTo(null);
        
        // SET DISABLE RESIZESABLE
        this.setResizable(false);
        
        // SET ICON
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("../../src/LOGO_MANURUL.png")));
        
        // INIT INPUT BORDER PADDING
        InputBorder.set(INPUT_ISBN, 8);
        InputBorder.set(INPUT_JUDUL_BUKU, 8);
        InputBorder.set(INPUT_TAHUN_TERBIT, 8);
        InputBorder.set(INPUT_HARGA_BUKU, 8);
        InputBorder.set(INPUT_PANJANG_BUKU, 8);
        InputBorder.set(INPUT_LEBAR_BUKU, 8);
        InputBorder.set(INPUT_PENULIS, 8);
        InputBorder.set(INPUT_DESKRIPSI, 8);
        InputBorder.set(INPUT_BERMASALAH, 8);
        InputBorder.set(INPUT_DIPINJAM, 8);
        InputBorder.set(INPUT_CREATED, 8);
        InputBorder.set(INPUT_UPDATED, 8);
        
        // SET VISIBLE COMPONENT BASE ON ACTION
        if(Action.equals("ADD")){
            
            this.setSize(1040, 650);
            this.title = "Tambah";
        
            LABEL_BERMASALAH.setVisible(false);
            INPUT_BERMASALAH.setVisible(false);
            
            LABEL_DIPINJAM.setVisible(false);
            INPUT_DIPINJAM.setVisible(false);
            
            LABEL_CREATED.setVisible(false);
            INPUT_CREATED.setVisible(false);
            
            LABEL_UPDATED.setVisible(false);
            INPUT_UPDATED.setVisible(false);
            
            BTN_HAPUS_BUKU.setVisible(false);
        }
        
        // SET TITLE
        this.setTitle("MA Nurul Islam Library Management - "+this.title+" Buku");
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        FRAME_MAIN_ANGGOTA = new javax.swing.JPanel();
        CONTAINER_ANGGOTA = new RoundedPanel(15, Color.WHITE);
        LABEL_ISBN = new javax.swing.JLabel();
        INPUT_ISBN = new javax.swing.JTextField();
        LABEL_MAX_HARI_PINJAM = new javax.swing.JLabel();
        LABEL_JUDUL_BUKU = new javax.swing.JLabel();
        LABEL_PANJANG_BUKU = new javax.swing.JLabel();
        LABEL_DESKRIPSI = new javax.swing.JLabel();
        INPUT_JUDUL_BUKU = new javax.swing.JTextField();
        INPUT_PANJANG_BUKU = new javax.swing.JTextField();
        INPUT_LEBAR_BUKU = new javax.swing.JTextField();
        LABEL_LEBAR_BUKU = new javax.swing.JLabel();
        INPUT_DESKRIPSI = new javax.swing.JTextField();
        LABEL_KATEGORI = new javax.swing.JLabel();
        INPUT_KATEGORI = new javax.swing.JComboBox<>();
        LABEL_JUMLAH_HALAMAN = new javax.swing.JLabel();
        INPUT_BERMASALAH = new javax.swing.JTextField();
        LABEL_BERMASALAH = new javax.swing.JLabel();
        INPUT_TAHUN_TERBIT = new javax.swing.JTextField();
        LABEL_TAHUN_TERBIT = new javax.swing.JLabel();
        LABEL_PENERBIT = new javax.swing.JLabel();
        INPUT_HARGA_BUKU = new javax.swing.JTextField();
        LABEL_HARGA_BUKU = new javax.swing.JLabel();
        LABEL_PENULIS = new javax.swing.JLabel();
        INPUT_PENULIS = new javax.swing.JTextField();
        LABEL_UPDATED = new javax.swing.JLabel();
        INPUT_UPDATED = new javax.swing.JTextField();
        INPUT_DIPINJAM = new javax.swing.JTextField();
        LABEL_DIPINJAM = new javax.swing.JLabel();
        INPUT_CREATED = new javax.swing.JTextField();
        LABEL_CREATED = new javax.swing.JLabel();
        LABEL_STOK = new javax.swing.JLabel();
        LABEL_RAK = new javax.swing.JLabel();
        INPUT_MAX_BATAS_PINJAM = new javax.swing.JSpinner();
        INPUT_STOK = new javax.swing.JSpinner();
        jComboBox1 = new javax.swing.JComboBox<>();
        INPUT_JUMLAH_HALAMAN = new javax.swing.JSpinner();
        INPUT_PENERBIT = new javax.swing.JComboBox<>();
        BTN_SIMPAN_BUKU = new javax.swing.JButton();
        BTN_HAPUS_BUKU = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setType(java.awt.Window.Type.POPUP);

        FRAME_MAIN_ANGGOTA.setBackground(new java.awt.Color(239, 240, 245));
        FRAME_MAIN_ANGGOTA.setPreferredSize(new java.awt.Dimension(1024, 414));

        CONTAINER_ANGGOTA.setBackground(new java.awt.Color(239, 240, 245));

        LABEL_ISBN.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        LABEL_ISBN.setForeground(new java.awt.Color(96, 96, 96));
        LABEL_ISBN.setText("ISBN");

        INPUT_ISBN.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        INPUT_ISBN.setForeground(new java.awt.Color(96, 96, 96));
        INPUT_ISBN.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(96, 96, 96)));

        LABEL_MAX_HARI_PINJAM.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        LABEL_MAX_HARI_PINJAM.setForeground(new java.awt.Color(96, 96, 96));
        LABEL_MAX_HARI_PINJAM.setText("Maksimal Batas Pinjam ( Hari )");

        LABEL_JUDUL_BUKU.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        LABEL_JUDUL_BUKU.setForeground(new java.awt.Color(96, 96, 96));
        LABEL_JUDUL_BUKU.setText("Judul Buku");

        LABEL_PANJANG_BUKU.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        LABEL_PANJANG_BUKU.setForeground(new java.awt.Color(96, 96, 96));
        LABEL_PANJANG_BUKU.setText("Panjang Buku");

        LABEL_DESKRIPSI.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        LABEL_DESKRIPSI.setForeground(new java.awt.Color(96, 96, 96));
        LABEL_DESKRIPSI.setText("Deskripsi");

        INPUT_JUDUL_BUKU.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        INPUT_JUDUL_BUKU.setForeground(new java.awt.Color(96, 96, 96));
        INPUT_JUDUL_BUKU.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(96, 96, 96)));

        INPUT_PANJANG_BUKU.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        INPUT_PANJANG_BUKU.setForeground(new java.awt.Color(96, 96, 96));
        INPUT_PANJANG_BUKU.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(96, 96, 96)));

        INPUT_LEBAR_BUKU.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        INPUT_LEBAR_BUKU.setForeground(new java.awt.Color(96, 96, 96));
        INPUT_LEBAR_BUKU.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(96, 96, 96)));

        LABEL_LEBAR_BUKU.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        LABEL_LEBAR_BUKU.setForeground(new java.awt.Color(96, 96, 96));
        LABEL_LEBAR_BUKU.setText("Lebar Buku");

        INPUT_DESKRIPSI.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        INPUT_DESKRIPSI.setForeground(new java.awt.Color(96, 96, 96));
        INPUT_DESKRIPSI.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(96, 96, 96)));

        LABEL_KATEGORI.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        LABEL_KATEGORI.setForeground(new java.awt.Color(96, 96, 96));
        LABEL_KATEGORI.setText("Kategori");

        INPUT_KATEGORI.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        INPUT_KATEGORI.setForeground(new java.awt.Color(96, 96, 96));
        INPUT_KATEGORI.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        INPUT_KATEGORI.setBorder(null);

        LABEL_JUMLAH_HALAMAN.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        LABEL_JUMLAH_HALAMAN.setForeground(new java.awt.Color(96, 96, 96));
        LABEL_JUMLAH_HALAMAN.setText("Jumlah Halaman");

        INPUT_BERMASALAH.setEditable(false);
        INPUT_BERMASALAH.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        INPUT_BERMASALAH.setForeground(new java.awt.Color(96, 96, 96));
        INPUT_BERMASALAH.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(96, 96, 96)));

        LABEL_BERMASALAH.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        LABEL_BERMASALAH.setForeground(new java.awt.Color(96, 96, 96));
        LABEL_BERMASALAH.setText("Bermasalah");

        INPUT_TAHUN_TERBIT.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        INPUT_TAHUN_TERBIT.setForeground(new java.awt.Color(96, 96, 96));
        INPUT_TAHUN_TERBIT.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(96, 96, 96)));

        LABEL_TAHUN_TERBIT.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        LABEL_TAHUN_TERBIT.setForeground(new java.awt.Color(96, 96, 96));
        LABEL_TAHUN_TERBIT.setText("Tahun Terbit");

        LABEL_PENERBIT.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        LABEL_PENERBIT.setForeground(new java.awt.Color(96, 96, 96));
        LABEL_PENERBIT.setText("Penerbit");

        INPUT_HARGA_BUKU.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        INPUT_HARGA_BUKU.setForeground(new java.awt.Color(96, 96, 96));
        INPUT_HARGA_BUKU.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(96, 96, 96)));

        LABEL_HARGA_BUKU.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        LABEL_HARGA_BUKU.setForeground(new java.awt.Color(96, 96, 96));
        LABEL_HARGA_BUKU.setText("Harga Buku");

        LABEL_PENULIS.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        LABEL_PENULIS.setForeground(new java.awt.Color(96, 96, 96));
        LABEL_PENULIS.setText("Penulis");

        INPUT_PENULIS.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        INPUT_PENULIS.setForeground(new java.awt.Color(96, 96, 96));
        INPUT_PENULIS.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(96, 96, 96)));

        LABEL_UPDATED.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        LABEL_UPDATED.setForeground(new java.awt.Color(96, 96, 96));
        LABEL_UPDATED.setText("Terakhir Diperbarui");

        INPUT_UPDATED.setEditable(false);
        INPUT_UPDATED.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        INPUT_UPDATED.setForeground(new java.awt.Color(96, 96, 96));
        INPUT_UPDATED.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(96, 96, 96)));

        INPUT_DIPINJAM.setEditable(false);
        INPUT_DIPINJAM.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        INPUT_DIPINJAM.setForeground(new java.awt.Color(96, 96, 96));
        INPUT_DIPINJAM.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(96, 96, 96)));

        LABEL_DIPINJAM.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        LABEL_DIPINJAM.setForeground(new java.awt.Color(96, 96, 96));
        LABEL_DIPINJAM.setText("Sedang Dipinjam");

        INPUT_CREATED.setEditable(false);
        INPUT_CREATED.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        INPUT_CREATED.setForeground(new java.awt.Color(96, 96, 96));
        INPUT_CREATED.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(96, 96, 96)));

        LABEL_CREATED.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        LABEL_CREATED.setForeground(new java.awt.Color(96, 96, 96));
        LABEL_CREATED.setText("Tanggal Dibuat");

        LABEL_STOK.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        LABEL_STOK.setForeground(new java.awt.Color(96, 96, 96));
        LABEL_STOK.setText("Stok");

        LABEL_RAK.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        LABEL_RAK.setForeground(new java.awt.Color(96, 96, 96));
        LABEL_RAK.setText("Rak");

        INPUT_MAX_BATAS_PINJAM.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        INPUT_MAX_BATAS_PINJAM.setModel(new javax.swing.SpinnerNumberModel(0, 0, 30, 1));

        INPUT_STOK.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        INPUT_STOK.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        jComboBox1.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        INPUT_JUMLAH_HALAMAN.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        INPUT_JUMLAH_HALAMAN.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        INPUT_PENERBIT.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        INPUT_PENERBIT.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout CONTAINER_ANGGOTALayout = new javax.swing.GroupLayout(CONTAINER_ANGGOTA);
        CONTAINER_ANGGOTA.setLayout(CONTAINER_ANGGOTALayout);
        CONTAINER_ANGGOTALayout.setHorizontalGroup(
            CONTAINER_ANGGOTALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CONTAINER_ANGGOTALayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(CONTAINER_ANGGOTALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(CONTAINER_ANGGOTALayout.createSequentialGroup()
                        .addComponent(LABEL_HARGA_BUKU, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(366, 366, 366)
                        .addGroup(CONTAINER_ANGGOTALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(LABEL_CREATED, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE)
                            .addComponent(INPUT_UPDATED, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(INPUT_CREATED)))
                    .addGroup(CONTAINER_ANGGOTALayout.createSequentialGroup()
                        .addGroup(CONTAINER_ANGGOTALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CONTAINER_ANGGOTALayout.createSequentialGroup()
                                .addGroup(CONTAINER_ANGGOTALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(INPUT_KATEGORI, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(INPUT_ISBN, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LABEL_ISBN, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(INPUT_JUDUL_BUKU, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, CONTAINER_ANGGOTALayout.createSequentialGroup()
                                        .addComponent(LABEL_JUDUL_BUKU, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(LABEL_KATEGORI, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(37, 37, 37))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CONTAINER_ANGGOTALayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(CONTAINER_ANGGOTALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(LABEL_TAHUN_TERBIT, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(INPUT_TAHUN_TERBIT, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(36, 36, 36))
                            .addGroup(CONTAINER_ANGGOTALayout.createSequentialGroup()
                                .addComponent(INPUT_HARGA_BUKU, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(CONTAINER_ANGGOTALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CONTAINER_ANGGOTALayout.createSequentialGroup()
                                .addGroup(CONTAINER_ANGGOTALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(INPUT_MAX_BATAS_PINJAM, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LABEL_MAX_HARI_PINJAM, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(CONTAINER_ANGGOTALayout.createSequentialGroup()
                                        .addGroup(CONTAINER_ANGGOTALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(INPUT_PANJANG_BUKU)
                                            .addComponent(LABEL_PANJANG_BUKU, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(CONTAINER_ANGGOTALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(INPUT_LEBAR_BUKU, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                                            .addComponent(LABEL_LEBAR_BUKU, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addGap(37, 37, 37))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CONTAINER_ANGGOTALayout.createSequentialGroup()
                                .addGroup(CONTAINER_ANGGOTALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(INPUT_PENERBIT, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(INPUT_JUMLAH_HALAMAN, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LABEL_PENULIS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(LABEL_JUMLAH_HALAMAN, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(LABEL_PENERBIT, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE)
                                    .addComponent(INPUT_PENULIS))
                                .addGap(36, 36, 36)))
                        .addGroup(CONTAINER_ANGGOTALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(INPUT_DESKRIPSI)
                            .addComponent(INPUT_BERMASALAH)
                            .addComponent(LABEL_BERMASALAH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(LABEL_DESKRIPSI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(CONTAINER_ANGGOTALayout.createSequentialGroup()
                                .addGroup(CONTAINER_ANGGOTALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(LABEL_STOK, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                                    .addComponent(INPUT_STOK))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(CONTAINER_ANGGOTALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(LABEL_RAK, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                                    .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(CONTAINER_ANGGOTALayout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(CONTAINER_ANGGOTALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(INPUT_DIPINJAM, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(LABEL_DIPINJAM, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(LABEL_UPDATED, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addGap(25, 25, 25))
        );
        CONTAINER_ANGGOTALayout.setVerticalGroup(
            CONTAINER_ANGGOTALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CONTAINER_ANGGOTALayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(CONTAINER_ANGGOTALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CONTAINER_ANGGOTALayout.createSequentialGroup()
                        .addGroup(CONTAINER_ANGGOTALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LABEL_ISBN)
                            .addComponent(LABEL_MAX_HARI_PINJAM))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(CONTAINER_ANGGOTALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(INPUT_ISBN, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                            .addComponent(INPUT_MAX_BATAS_PINJAM)))
                    .addGroup(CONTAINER_ANGGOTALayout.createSequentialGroup()
                        .addGroup(CONTAINER_ANGGOTALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LABEL_STOK)
                            .addComponent(LABEL_RAK))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(CONTAINER_ANGGOTALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(INPUT_STOK, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                            .addComponent(jComboBox1))))
                .addGap(31, 31, 31)
                .addGroup(CONTAINER_ANGGOTALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CONTAINER_ANGGOTALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(LABEL_JUDUL_BUKU)
                        .addComponent(LABEL_PANJANG_BUKU))
                    .addGroup(CONTAINER_ANGGOTALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(LABEL_DESKRIPSI)
                        .addComponent(LABEL_LEBAR_BUKU)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CONTAINER_ANGGOTALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(INPUT_JUDUL_BUKU, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(INPUT_PANJANG_BUKU, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(INPUT_LEBAR_BUKU, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(INPUT_DESKRIPSI, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(CONTAINER_ANGGOTALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CONTAINER_ANGGOTALayout.createSequentialGroup()
                        .addGroup(CONTAINER_ANGGOTALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LABEL_KATEGORI)
                            .addComponent(LABEL_JUMLAH_HALAMAN))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(CONTAINER_ANGGOTALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(INPUT_KATEGORI, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                            .addComponent(INPUT_JUMLAH_HALAMAN)))
                    .addGroup(CONTAINER_ANGGOTALayout.createSequentialGroup()
                        .addComponent(LABEL_BERMASALAH)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(INPUT_BERMASALAH, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(31, 31, 31)
                .addGroup(CONTAINER_ANGGOTALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(CONTAINER_ANGGOTALayout.createSequentialGroup()
                        .addComponent(LABEL_TAHUN_TERBIT)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(INPUT_TAHUN_TERBIT, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(CONTAINER_ANGGOTALayout.createSequentialGroup()
                        .addComponent(LABEL_PENERBIT)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(INPUT_PENERBIT))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CONTAINER_ANGGOTALayout.createSequentialGroup()
                        .addComponent(LABEL_DIPINJAM)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(INPUT_DIPINJAM, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(31, 31, 31)
                .addGroup(CONTAINER_ANGGOTALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CONTAINER_ANGGOTALayout.createSequentialGroup()
                        .addComponent(LABEL_HARGA_BUKU)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(INPUT_HARGA_BUKU, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(CONTAINER_ANGGOTALayout.createSequentialGroup()
                        .addGroup(CONTAINER_ANGGOTALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LABEL_UPDATED)
                            .addComponent(LABEL_PENULIS))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(CONTAINER_ANGGOTALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(INPUT_UPDATED, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(INPUT_PENULIS, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(LABEL_CREATED)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(INPUT_CREATED, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        BTN_SIMPAN_BUKU.setBackground(new java.awt.Color(0, 171, 60));
        BTN_SIMPAN_BUKU.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        BTN_SIMPAN_BUKU.setForeground(new java.awt.Color(255, 255, 255));
        BTN_SIMPAN_BUKU.setText("Simpan");
        BTN_SIMPAN_BUKU.setBorder(null);

        BTN_HAPUS_BUKU.setBackground(new java.awt.Color(153, 153, 153));
        BTN_HAPUS_BUKU.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        BTN_HAPUS_BUKU.setForeground(new java.awt.Color(255, 255, 255));
        BTN_HAPUS_BUKU.setText("Hapus");
        BTN_HAPUS_BUKU.setBorder(null);

        javax.swing.GroupLayout FRAME_MAIN_ANGGOTALayout = new javax.swing.GroupLayout(FRAME_MAIN_ANGGOTA);
        FRAME_MAIN_ANGGOTA.setLayout(FRAME_MAIN_ANGGOTALayout);
        FRAME_MAIN_ANGGOTALayout.setHorizontalGroup(
            FRAME_MAIN_ANGGOTALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FRAME_MAIN_ANGGOTALayout.createSequentialGroup()
                .addGroup(FRAME_MAIN_ANGGOTALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(FRAME_MAIN_ANGGOTALayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(CONTAINER_ANGGOTA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(FRAME_MAIN_ANGGOTALayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BTN_HAPUS_BUKU, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BTN_SIMPAN_BUKU, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20))
        );
        FRAME_MAIN_ANGGOTALayout.setVerticalGroup(
            FRAME_MAIN_ANGGOTALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FRAME_MAIN_ANGGOTALayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(CONTAINER_ANGGOTA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(20, 20, 20)
                .addGroup(FRAME_MAIN_ANGGOTALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BTN_SIMPAN_BUKU, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTN_HAPUS_BUKU, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FRAME_MAIN_ANGGOTA, javax.swing.GroupLayout.DEFAULT_SIZE, 1040, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(FRAME_MAIN_ANGGOTA, javax.swing.GroupLayout.DEFAULT_SIZE, 699, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(BukuDATABUKU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BukuDATABUKU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BukuDATABUKU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BukuDATABUKU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BukuDATABUKU("", 0).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTN_HAPUS_BUKU;
    private javax.swing.JButton BTN_SIMPAN_BUKU;
    private javax.swing.JPanel CONTAINER_ANGGOTA;
    private javax.swing.JPanel FRAME_MAIN_ANGGOTA;
    private javax.swing.JTextField INPUT_BERMASALAH;
    private javax.swing.JTextField INPUT_CREATED;
    private javax.swing.JTextField INPUT_DESKRIPSI;
    private javax.swing.JTextField INPUT_DIPINJAM;
    private javax.swing.JTextField INPUT_HARGA_BUKU;
    private javax.swing.JTextField INPUT_ISBN;
    private javax.swing.JTextField INPUT_JUDUL_BUKU;
    private javax.swing.JSpinner INPUT_JUMLAH_HALAMAN;
    private javax.swing.JComboBox<String> INPUT_KATEGORI;
    private javax.swing.JTextField INPUT_LEBAR_BUKU;
    private javax.swing.JSpinner INPUT_MAX_BATAS_PINJAM;
    private javax.swing.JTextField INPUT_PANJANG_BUKU;
    private javax.swing.JComboBox<String> INPUT_PENERBIT;
    private javax.swing.JTextField INPUT_PENULIS;
    private javax.swing.JSpinner INPUT_STOK;
    private javax.swing.JTextField INPUT_TAHUN_TERBIT;
    private javax.swing.JTextField INPUT_UPDATED;
    private javax.swing.JLabel LABEL_BERMASALAH;
    private javax.swing.JLabel LABEL_CREATED;
    private javax.swing.JLabel LABEL_DESKRIPSI;
    private javax.swing.JLabel LABEL_DIPINJAM;
    private javax.swing.JLabel LABEL_HARGA_BUKU;
    private javax.swing.JLabel LABEL_ISBN;
    private javax.swing.JLabel LABEL_JUDUL_BUKU;
    private javax.swing.JLabel LABEL_JUMLAH_HALAMAN;
    private javax.swing.JLabel LABEL_KATEGORI;
    private javax.swing.JLabel LABEL_LEBAR_BUKU;
    private javax.swing.JLabel LABEL_MAX_HARI_PINJAM;
    private javax.swing.JLabel LABEL_PANJANG_BUKU;
    private javax.swing.JLabel LABEL_PENERBIT;
    private javax.swing.JLabel LABEL_PENULIS;
    private javax.swing.JLabel LABEL_RAK;
    private javax.swing.JLabel LABEL_STOK;
    private javax.swing.JLabel LABEL_TAHUN_TERBIT;
    private javax.swing.JLabel LABEL_UPDATED;
    private javax.swing.JComboBox<String> jComboBox1;
    // End of variables declaration//GEN-END:variables
}
