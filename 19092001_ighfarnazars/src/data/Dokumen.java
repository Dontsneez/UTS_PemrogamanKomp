package data;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Dokumen extends javax.swing.JFrame {

    private void kosongkan_from() {
        txtkodedokumen.setEditable(true);
        txtkodedokumen.setText(null);
        txtnamadokumen.setText(null);
        cmbkatagoridokumen.setSelectedItem(this);
        txtlokasi.setText(null);
        txtdeskripsi.setText(null);
        txttanggal.setText(null);
    }
    
    private void tampilkan_data() {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("No.");
        model.addColumn("Kode Dokumen");
        model.addColumn("Nama Dokumen");
        model.addColumn("Kategori Dokumen");
        model.addColumn("Lokasi Dokumen");
        model.addColumn("Deskripsi Dokumen");
        model.addColumn("Tanggal");
        
        String cari= txtcari.getText();
        try {
            int no = 1;
            String sql = "SELECT *FROM dokumen WHERE nama LIKE '%"+cari+"%' ";
            java.sql.Connection conn = (Connection)Config.configDB();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet res = stm.executeQuery(sql);
            
            while (res.next()) {
                model.addRow(new Object[]{no++,res.getString(1),
                        res.getString(2),res.getString(3),res.getString(4),res.getString(5),res.getString(6)});
            }
            tabledokumen.setModel(model);
        } catch (Exception e) {
            System.out.println("Error : "+e.getMessage());
        }
    }
    
    public Dokumen() {
        initComponents();
        tampilkan_data();
        kosongkan_from();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtkodedokumen = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtnamadokumen = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtlokasi = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtdeskripsi = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txttanggal = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        cmbkatagoridokumen = new javax.swing.JComboBox<String>();
        btnTambahData = new javax.swing.JButton();
        btnSiimpan = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnBatal = new javax.swing.JButton();
        btnKeluar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabledokumen = new javax.swing.JTable();
        txtcari = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();

        jLabel8.setText("jLabel8");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ighfar Nazar S");
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jLabel1.setBackground(new java.awt.Color(0, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ARSIP DOKUMEN");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 15;
        gridBagConstraints.ipadx = 113;
        gridBagConstraints.ipady = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 175, 0, 0);
        getContentPane().add(jLabel1, gridBagConstraints);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Kode Dokumen");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridheight = 4;
        gridBagConstraints.ipadx = 14;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(7, 82, 0, 0);
        getContentPane().add(jLabel2, gridBagConstraints);

        txtkodedokumen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtkodedokumenActionPerformed(evt);
            }
        });
        txtkodedokumen.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtkodedokumenKeyTyped(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 10;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 21;
        gridBagConstraints.gridheight = 4;
        gridBagConstraints.ipadx = 238;
        gridBagConstraints.ipady = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(7, 29, 0, 0);
        getContentPane().add(txtkodedokumen, gridBagConstraints);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Nama Dokumen");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.ipadx = 22;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 82, 0, 0);
        getContentPane().add(jLabel3, gridBagConstraints);

        txtnamadokumen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnamadokumenActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 10;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 21;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 238;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 29, 0, 0);
        getContentPane().add(txtnamadokumen, gridBagConstraints);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Kategori Dokumen");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 82, 0, 0);
        getContentPane().add(jLabel4, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 10;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.gridwidth = 21;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 238;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 29, 0, 0);
        getContentPane().add(txtlokasi, gridBagConstraints);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Lokasi Dokumen");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 18;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 82, 0, 0);
        getContentPane().add(jLabel5, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 10;
        gridBagConstraints.gridy = 14;
        gridBagConstraints.gridwidth = 21;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 238;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 29, 0, 0);
        getContentPane().add(txtdeskripsi, gridBagConstraints);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Deskripsi Dokumen");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 14;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 82, 0, 0);
        getContentPane().add(jLabel6, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 10;
        gridBagConstraints.gridy = 16;
        gridBagConstraints.gridwidth = 21;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 238;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 29, 0, 0);
        getContentPane().add(txttanggal, gridBagConstraints);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Tanggal");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 16;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 85;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 82, 0, 0);
        getContentPane().add(jLabel7, gridBagConstraints);

        cmbkatagoridokumen.setBackground(new java.awt.Color(0, 0, 255));
        cmbkatagoridokumen.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cmbkatagoridokumen.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Khusus", "Umum", "Privat" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 10;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 27;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 29, 0, 0);
        getContentPane().add(cmbkatagoridokumen, gridBagConstraints);

        btnTambahData.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnTambahData.setText("TAMBAH");
        btnTambahData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahDataActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 18;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.ipadx = 12;
        gridBagConstraints.ipady = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(27, 164, 0, 0);
        getContentPane().add(btnTambahData, gridBagConstraints);

        btnSiimpan.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnSiimpan.setText("SIMPAN");
        btnSiimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiimpanActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 10;
        gridBagConstraints.gridy = 18;
        gridBagConstraints.ipadx = 8;
        gridBagConstraints.ipady = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(27, 9, 0, 0);
        getContentPane().add(btnSiimpan, gridBagConstraints);

        btnHapus.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnHapus.setText("HAPUS");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 14;
        gridBagConstraints.gridy = 18;
        gridBagConstraints.gridwidth = 16;
        gridBagConstraints.ipadx = 8;
        gridBagConstraints.ipady = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(27, 18, 0, 0);
        getContentPane().add(btnHapus, gridBagConstraints);

        btnEdit.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnEdit.setText("EDIT");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 11;
        gridBagConstraints.gridy = 18;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 21;
        gridBagConstraints.ipady = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(27, 10, 0, 0);
        getContentPane().add(btnEdit, gridBagConstraints);

        btnBatal.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnBatal.setText("RESET");
        btnBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBatalActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 31;
        gridBagConstraints.gridy = 18;
        gridBagConstraints.ipadx = 3;
        gridBagConstraints.ipady = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(27, 2, 0, 0);
        getContentPane().add(btnBatal, gridBagConstraints);

        btnKeluar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnKeluar.setText("Kembali");
        btnKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKeluarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 33;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(25, 18, 0, 0);
        getContentPane().add(btnKeluar, gridBagConstraints);

        tabledokumen.setModel(new javax.swing.table.DefaultTableModel(
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
        tabledokumen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabledokumenMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabledokumen);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 33;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.gridheight = 16;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 514;
        gridBagConstraints.ipady = 283;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(6, 18, 0, 45);
        getContentPane().add(jScrollPane1, gridBagConstraints);

        txtcari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcariActionPerformed(evt);
            }
        });
        txtcari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtcariKeyPressed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 35;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 131;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(16, 18, 0, 0);
        getContentPane().add(txtcari, gridBagConstraints);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("Cari Nama");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 34;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 181, 0, 0);
        getContentPane().add(jLabel9, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 9;
        gridBagConstraints.gridy = 19;
        gridBagConstraints.gridwidth = 24;
        gridBagConstraints.ipadx = 361;
        gridBagConstraints.ipady = 17;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 2, 0, 0);
        getContentPane().add(jSeparator1, gridBagConstraints);

        jLabel10.setText(":");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.ipadx = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(2, 1, 0, 0);
        getContentPane().add(jLabel10, gridBagConstraints);

        jLabel11.setText(":");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.ipadx = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(21, 1, 0, 0);
        getContentPane().add(jLabel11, gridBagConstraints);

        jLabel12.setText(":");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.ipadx = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(25, 1, 0, 0);
        getContentPane().add(jLabel12, gridBagConstraints);

        jLabel13.setText(":");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.ipadx = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(23, 1, 0, 0);
        getContentPane().add(jLabel13, gridBagConstraints);

        jLabel14.setText(":");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 14;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.ipadx = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(25, 1, 0, 0);
        getContentPane().add(jLabel14, gridBagConstraints);

        jLabel15.setText(":");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 16;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.ipadx = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(25, 1, 0, 0);
        getContentPane().add(jLabel15, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 21;
        gridBagConstraints.gridwidth = 33;
        gridBagConstraints.ipadx = 530;
        gridBagConstraints.ipady = 20;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 82, 0, 0);
        getContentPane().add(jSeparator2, gridBagConstraints);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBatalActionPerformed
        kosongkan_from();
    }//GEN-LAST:event_btnBatalActionPerformed

    private void btnKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKeluarActionPerformed
      new MenuUtama().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btnKeluarActionPerformed

    private void btnTambahDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahDataActionPerformed

        try {
            String sql = "INSERT INTO dokumen VALUES ('"+txtkodedokumen.getText()+"','"
                    + ""+txtnamadokumen.getText()+"','"+cmbkatagoridokumen.getSelectedItem()+"','"
                    + ""+txtlokasi.getText()+"','"+txtdeskripsi.getText()+"','"+txttanggal.getText()+"')";
            java.sql.Connection conn = (Connection)Config.configDB();
            java.sql.PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.execute();
            JOptionPane.showMessageDialog(null, "Proses simpan Data berhasil");
            tampilkan_data();
            kosongkan_from(); 
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
            
        }
        txtkodedokumen.setFocusable(true);
        
    }//GEN-LAST:event_btnTambahDataActionPerformed

    private void btnSiimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiimpanActionPerformed
        
        try {
            String sql = "INSERT INTO dokumen VALUES ('"+txtkodedokumen.getText()+"','"
                    + ""+txtnamadokumen.getText()+"','"+cmbkatagoridokumen.getSelectedItem()+"','"
                    + ""+txtlokasi.getText()+"','"+txtdeskripsi.getText()+"','"+txttanggal.getText()+"')";
            java.sql.Connection conn = (Connection)Config.configDB();
            java.sql.PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.execute();
            JOptionPane.showMessageDialog(null, "Proses simpan Data berhasil");
            tampilkan_data();
            kosongkan_from(); 
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
            
        }
        
    }//GEN-LAST:event_btnSiimpanActionPerformed

    private void tabledokumenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabledokumenMouseClicked
        
        int baris = tabledokumen.rowAtPoint(evt.getPoint());
        String nik = tabledokumen.getValueAt(baris, 1).toString();
        txtkodedokumen.setText(nik);
        
        String nama = tabledokumen.getValueAt(baris, 2).toString();
        txtnamadokumen.setText(nama);
        
        String jab = tabledokumen.getValueAt(baris, 3).toString();
        cmbkatagoridokumen.setSelectedItem(jab);
        
        String alamat = tabledokumen.getValueAt(baris, 4).toString();
        txtlokasi.setText(alamat);
        
        String email = tabledokumen.getValueAt(baris, 5).toString();
        txtdeskripsi.setText(email);
        
        String telp = tabledokumen.getValueAt(baris, 6).toString();
        txttanggal.setText(telp);
        
    }//GEN-LAST:event_tabledokumenMouseClicked

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        
        try {
            String sql = "UPDATE dokumen SET kode = '"+txtkodedokumen.getText()+"'"
                    + ",nama = '"+txtnamadokumen.getText()+"',kategori = '"+cmbkatagoridokumen.getSelectedItem()+"'"
                    + ",lokasi = '"+txtlokasi.getText()+"',deskripsi = '"+txtdeskripsi.getText()+"'"
                    + ",tanggal = '"+txttanggal.getText()+"' WHERE kode = '"+txtkodedokumen.getText()+"'";
            java.sql.Connection conn = (Connection)Config.configDB();
            java.sql.PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.execute();
            JOptionPane.showMessageDialog(null, "Edit Data Berhasil");
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        tampilkan_data();
        kosongkan_from();
        
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        
        try {
            String sql = "DELETE FROM dokumen WHERE kode = '"+txtkodedokumen.getText()+"'";
            java.sql.Connection conn = (Connection)Config.configDB();
            java.sql.PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.execute();
            JOptionPane.showMessageDialog(null, "Hapus Data Berhasil");
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        tampilkan_data();
        kosongkan_from();
        
    }//GEN-LAST:event_btnHapusActionPerformed

    private void txtcariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcariActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcariActionPerformed

    private void txtcariKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcariKeyPressed
        tampilkan_data();
    }//GEN-LAST:event_txtcariKeyPressed

    private void txtnamadokumenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnamadokumenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnamadokumenActionPerformed

    private void txtkodedokumenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtkodedokumenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtkodedokumenActionPerformed

    private void txtkodedokumenKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtkodedokumenKeyTyped
        
        char enter=evt.getKeyChar();

        if(!(Character.isDigit(enter)))

        {

            evt.consume();
        }
        
    }//GEN-LAST:event_txtkodedokumenKeyTyped

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
            java.util.logging.Logger.getLogger(Dokumen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dokumen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dokumen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dokumen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dokumen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBatal;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnKeluar;
    private javax.swing.JButton btnSiimpan;
    private javax.swing.JButton btnTambahData;
    private javax.swing.JComboBox<String> cmbkatagoridokumen;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable tabledokumen;
    private javax.swing.JTextField txtcari;
    private javax.swing.JTextField txtdeskripsi;
    private javax.swing.JTextField txtkodedokumen;
    private javax.swing.JTextField txtlokasi;
    private javax.swing.JTextField txtnamadokumen;
    private javax.swing.JTextField txttanggal;
    // End of variables declaration//GEN-END:variables
}
