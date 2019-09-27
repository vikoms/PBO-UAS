
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
public class ManageTransportasi extends javax.swing.JFrame {

    /**
     * Creates new form ManageTransportasi
     */
    String idAdmin;
    Connection koneksi;
    String idTransportasi,act;
    public ManageTransportasi(String idAdmin,String idTransportasi, String act) {
        initComponents();
        this.idAdmin = idAdmin;
        koneksi = DBConnection.getConnection("localhost", "3306", "root", "", "33_db_ticketing");
        this.idTransportasi = idTransportasi;
        this.act = act;
        
        if(act.equals("Edit")) {
            showData(idTransportasi);
        }else if(act.equals("Tambah")) {
            addComboTipeTransportasi();
        }
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
        jLabel2 = new javax.swing.JLabel();
        txtKode = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtJumlahKursi = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtKeterangan = new javax.swing.JTextArea();
        comboTipe = new javax.swing.JComboBox();
        btnSimpan = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 159, 26));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Kode");

        txtKode.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Keterangan");

        jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Jumlah Kursi");

        txtJumlahKursi.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Tipe Transportasi");

        jLabel1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Halaman Manage Data Transportasi");

        txtKeterangan.setColumns(20);
        txtKeterangan.setRows(5);
        jScrollPane1.setViewportView(txtKeterangan);

        btnSimpan.setBackground(new java.awt.Color(19, 15, 64));
        btnSimpan.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnSimpan.setForeground(new java.awt.Color(255, 255, 255));
        btnSimpan.setText("Simpan");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });

        btnBack.setBackground(new java.awt.Color(19, 16, 64));
        btnBack.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("Kembali");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 138, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btnSimpan)
                                .addGap(357, 357, 357))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel2)
                                    .addComponent(txtKode)
                                    .addComponent(jLabel3)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(51, 51, 51)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5)
                                    .addComponent(txtJumlahKursi)
                                    .addComponent(comboTipe, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(117, 117, 117))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(72, 72, 72))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnBack)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(btnBack)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtKode, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtJumlahKursi, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboTipe, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(92, 92, 92)
                .addComponent(btnSimpan)
                .addContainerGap(66, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    
    
    public void addComboTipeTransportasi() {
        String sql = "SELECT * FROM tbl_tipe_transportasi";
        
        try{
             Statement stmt = koneksi.createStatement();
             ResultSet rs = stmt.executeQuery(sql);
             comboTipe.addItem("Tipe Transportasi");
             while(rs.next()) {
                 comboTipe.addItem(rs.getString("nama_tipe"));
             }
        }catch(Exception e) {
            e.printStackTrace();
        }
    }
    
    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        
        if(act.equals("Edit")) {
            editData();
        }else if(act.equals("Tambah")) {
            insertData();
        }
        
    }//GEN-LAST:event_btnSimpanActionPerformed

    public void showData(String id) {
        try {
            String sql = "SELECT * FROM tbl_transportasi"
                    + " INNER JOIN tbl_tipe_transportasi ON (tbl_transportasi.id_tipe_transportasi = tbl_tipe_transportasi.id_tipe_transportasi)";
            Statement stmt = koneksi.createStatement();
            System.out.println(sql);
            ResultSet rs = stmt.executeQuery(sql);
            rs.first();
            txtJumlahKursi.setText(rs.getInt("jumlah_kursi")+"");
            txtKeterangan.setText(rs.getString("keterangan"));
            addComboTipeTransportasi();
            comboTipe.setSelectedItem(rs.getString("nama_tipe"));
            txtKode.setText(rs.getString("kode"));
            
        }catch(Exception e) {
            e.printStackTrace();
        }
    }
    
    public void editData() {
        String kode = txtKode.getText();
        int jumlahKursi = Integer.parseInt(txtJumlahKursi.getText());
        String keterangan = txtKeterangan.getText();
        int tipeTransportasi = comboTipe.getSelectedIndex();
        int increment = 0;
        if(tipeTransportasi == 0) {
            JOptionPane.showMessageDialog(null, "Mohon isi tipe transportasi");
        }
    }
    
    public void insertData() {
        String kode = txtKode.getText();
        int jumlahKursi = Integer.parseInt(txtJumlahKursi.getText());
        String keterangan = txtKeterangan.getText();
        int tipeTransportasi = comboTipe.getSelectedIndex();
        int increment = 0;
        if(tipeTransportasi == 0) {
            JOptionPane.showMessageDialog(null, "Mohon isi tipe transportasi");
        } else {
            String sql = "INSERT INTO tbl_transportasi VALUES ('"+increment+"','"+kode+"','"+jumlahKursi+"','"+keterangan+"','"+tipeTransportasi+"')";
            
            try {
                Statement stmt = koneksi.createStatement();
                int berhasil = stmt.executeUpdate(sql);
                if(berhasil == 1) {
                    JOptionPane.showMessageDialog(null, "Data berhasil ditambahkan");
                    new DataTipeTransportasi(idAdmin).setVisible(true);
                    this.dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Data gagal ditambahkan");
                }
            }catch(Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null,"ada kesalahan di query");
            }
        }
        
    }
    
    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        new DataTransportasi(idAdmin).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    /**
     * @param args the command line arguments
     */
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JComboBox comboTipe;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtJumlahKursi;
    private javax.swing.JTextArea txtKeterangan;
    private javax.swing.JTextField txtKode;
    // End of variables declaration//GEN-END:variables
}