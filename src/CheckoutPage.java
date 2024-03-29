
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.Random;
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
public class CheckoutPage extends javax.swing.JFrame {

    /**
     * Creates new form CheckoutPage
     */
    String id;
    Connection koneksi;
    String idNama;
    public CheckoutPage(String id , String idNama) {
        initComponents();
        koneksi = DBConnection.getConnection("localhost", "3306", "root", "", "33_db_ticketing");
        this.id = id;
        this.idNama = idNama;
        
        LocalDate now = LocalDate.now();
        txtTujuan.setEnabled(false);
        txtHarga.setEnabled(false);
        txtTanggalBerangkat.setEnabled(false);
        txtTanggalPesan.setEnabled(false);
        txtRute.setEnabled(false);
        txtNama.setEnabled(false);
        txtKode.setEnabled(false);
         int nilai = 0;
         Random random = new Random();
         for(int i = 1; i<= 1; i++ ) {
              nilai = 1+random.nextInt(10000);
         }
        String kodePemesanan = "Code" + nilai;
        txtKode.setText(kodePemesanan);
        
        
        showDataNama(idNama);
        showData(id);
        
    
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtKode = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtTanggalPesan = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtTmptPesan = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtNama = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtKursi = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtRute = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtTujuan = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtTanggalBerangkat = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtJamCekin = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtJamBerangkat = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtHarga = new javax.swing.JTextField();
        txtBayar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 159, 26));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Halaman Check- out Pemesanan");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Kode Pemesanan");

        txtKode.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Tanggal Pemesanan");

        txtTanggalPesan.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Tempat Pemesanan");

        txtTmptPesan.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Nama Pelanggan");

        txtNama.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Kursi");

        txtKursi.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Rute");

        txtRute.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Tujuan");

        txtTujuan.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Tanggal Berangkat");

        txtTanggalBerangkat.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Jam Cek-in");

        txtJamCekin.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Jam Berangkat");

        txtJamBerangkat.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Total Harga");

        txtHarga.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        txtBayar.setBackground(new java.awt.Color(19, 15, 64));
        txtBayar.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        txtBayar.setForeground(new java.awt.Color(255, 255, 255));
        txtBayar.setText("Bayar");
        txtBayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBayarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(230, 230, 230)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(txtRute, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(txtKode, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3)
                                    .addComponent(txtTanggalPesan, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4)
                                    .addComponent(txtTmptPesan, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5)
                                    .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6)
                                    .addComponent(txtKursi, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 108, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12)
                                    .addComponent(txtHarga, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11)
                                    .addComponent(txtJamBerangkat, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10)
                                    .addComponent(txtJamCekin, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9)
                                    .addComponent(txtTanggalBerangkat, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8)
                                    .addComponent(txtTujuan, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(183, 183, 183))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(363, 363, 363)
                .addComponent(txtBayar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtKode, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTujuan, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTanggalPesan, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTanggalBerangkat, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTmptPesan, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtJamCekin, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtJamBerangkat, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtKursi, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtHarga, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtRute, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtBayar)
                .addContainerGap(85, Short.MAX_VALUE))
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
    
    public void showDataNama(String idNama) {
        String query = "SELECT * FROM tbl_penumpang WHERE id_penumpang = '"+idNama+"'";
        try {
            Statement stmt = koneksi.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            rs.first();
            
            txtNama.setText(rs.getString("nama_penumpang"));
        }catch(Exception e) {
            e.printStackTrace();
    }
   }
    
    public void simpanData() {
//        kode,tanggal,tempatpesa,namaPel,kursi,rute,tujuan,tanggalBer,jamCekin,jamber,harga
        String tanggalBerangkat = txtTanggalBerangkat.getText();
        String kode = txtKode.getText();
        String tempatPesan = txtTmptPesan.getText();
        String namaPelanggan = txtNama.getText();
        String kursi = txtKursi.getText();
        String tujuan = txtTujuan.getText();
        String tanggalPemesanan = txtTanggalPesan.getText();
        String jamCekin = txtJamCekin.getText();
        String jamBerangkat = txtJamBerangkat.getText();
        String harga = txtHarga.getText();
        int increment = 0;
        
        if(tanggalBerangkat.equals("") && kode.equals("") && tempatPesan.equals("") && namaPelanggan.equals("") && kursi.equals("") && tujuan.equals("")&& tanggalPemesanan.equals("") && jamBerangkat.equals("") && jamCekin.equals("") && harga.equals("")){
            JOptionPane.showMessageDialog(null, "Isi data dengan lengkap");
        }else {
            String query = "INSERT INTO tbl_pemesanan VALUES ('"+increment+"','"+kode+"', '"+tanggalPemesanan+"','"+tempatPesan+"',"
                    + "'"+idNama+"', '"+kursi+"','"+rute+"', '"+tujuan+"','"+tanggalBerangkat+"','"+jamCekin+"',"
                    + "'"+jamBerangkat+"','"+harga+"','3')";
            System.out.println(query);
            try{
                Statement stmt = koneksi.createStatement();
                int berhasil = stmt.executeUpdate(query);
                
                if(berhasil == 1) {
                    JOptionPane.showMessageDialog(null, "Terima kasih telah membeli tiket kepada kami");
                     new HomeUser(idNama).setVisible(true);
                     this.dispose();
                }else{
                    JOptionPane.showMessageDialog(null, "Gagal memesan tiket");
                }
            }catch(Exception e) {
                e.printStackTrace();
            }
        }
    }
    
    String rute;
    public void showData(String id) {
       String query = "SELECT * FROM tbl_rute "
                + "INNER JOIN tbl_transportasi ON (tbl_rute.id_transportasi = tbl_transportasi.id_transportasi)"
                + " INNER JOIN tbl_tipe_transportasi ON (tbl_transportasi.id_tipe_transportasi = tbl_tipe_transportasi.id_tipe_transportasi)"
               + " WHERE tbl_rute.id_rute = '"+id+"'";
       
       try{
           Statement stmt = koneksi.createStatement();
           ResultSet rs = stmt.executeQuery(query);
           rs.first();
           
           String tanggalBerangkat = String.valueOf(rs.getDate("tanggal_berangkat"));
           String tujuan = rs.getString("tujuan");
           String harga  = String.valueOf(rs.getFloat("harga"));
           rute = String.valueOf(rs.getInt("id_rute"));
           
           txtTanggalBerangkat.setText(tanggalBerangkat);
           txtTujuan.setText(tujuan);
           txtHarga.setText(harga);
           txtTanggalPesan.setText(LocalDate.now()+"");
           txtRute.setText("Rute ke - "+rute);
       }catch(Exception e) {
           e.printStackTrace();
           JOptionPane.showMessageDialog(null, "terdapat kesalahan pada database");
       }
       
       
    }
    
    
    private void txtBayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBayarActionPerformed
//        JOptionPane.showMessageDialog(null, "Terima Kasih Telah Memesan Tiket Pada Kami");
        simpanData();
       
    }//GEN-LAST:event_txtBayarActionPerformed

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
            java.util.logging.Logger.getLogger(CheckoutPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CheckoutPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CheckoutPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CheckoutPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CheckoutPage("","").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton txtBayar;
    private javax.swing.JTextField txtHarga;
    private javax.swing.JTextField txtJamBerangkat;
    private javax.swing.JTextField txtJamCekin;
    private javax.swing.JTextField txtKode;
    private javax.swing.JTextField txtKursi;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtRute;
    private javax.swing.JTextField txtTanggalBerangkat;
    private javax.swing.JTextField txtTanggalPesan;
    private javax.swing.JTextField txtTmptPesan;
    private javax.swing.JTextField txtTujuan;
    // End of variables declaration//GEN-END:variables
}
