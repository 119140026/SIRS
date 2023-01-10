
package TUBES;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;


public class Grafik1 extends javax.swing.JFrame {
    koneksi koneksi = new koneksi();

    private DefaultTableModel model;
    
    public void loadData(){
        model.getDataVector().removeAllElements();
        model.fireTableDataChanged();
        
        try{
            Connection c = koneksi.getkoneksi();
            Statement s = c.createStatement();
            
            String sql =  "SELECT * FROM grafikdatabase;";
                     
            ResultSet a = s.executeQuery(sql);
          
            while(a.next()){
                Object[] o = new Object[3];
                o [0] = a.getString("Pasien");
                o [1] = a.getString("Obat");
                o [2] = a.getString("TenagaMedis");
                
                         
               model.addRow(o);
            }
            a.close();
            s.close();
        }catch(SQLException e){
            System.out.println("terjadi kesalahan");
        }
    } 
    public void clear(){
        txp.setText("");
        txo.setText("");
        txt.setText("");
    }

 
    public Grafik1() {
        initComponents();
        this.setLocationRelativeTo(null);
                     
        model = new DefaultTableModel();
        
        jTable1.setModel(model);
        
        model.addColumn("Pasien");
        model.addColumn("Obat");
        model.addColumn("Tenaga Medis");
      
                               
        loadData();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnsimpan = new javax.swing.JButton();
        txp = new javax.swing.JTextField();
        txo = new javax.swing.JTextField();
        txt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        btnpie = new javax.swing.JButton();
        btnbat = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 153, 51));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("CHART DIAGRAM");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(30, 30, 30))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        btnsimpan.setText("SIMPAN");
        btnsimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsimpanActionPerformed(evt);
            }
        });

        jLabel2.setText("PASIEN");

        jLabel3.setText("OBAT");

        jLabel4.setText("TENAGA MEDIS");

        jButton1.setText("HAPUS");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnpie.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnpie.setText("GRAFIK PIE");
        btnpie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpieActionPerformed(evt);
            }
        });

        btnbat.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnbat.setText("GRAFIK BAR");
        btnbat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txp, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnsimpan)
                            .addComponent(jLabel2))
                        .addGap(63, 63, 63)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txo, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(73, 73, 73)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE))
                                    .addComponent(txt)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnbat)
                                .addGap(9, 9, 9)))
                        .addGap(10, 10, 10))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnpie)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnsimpan)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnpie)
                    .addComponent(btnbat))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnsimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsimpanActionPerformed
        // TODO add your handling code here:
        String Pasien = txp.getText();
        String Obat = txo.getText();
        String TenagaMedis = txt.getText();
        
        try{
            Connection c = koneksi.getkoneksi();
            String sql = "INSERT INTO grafikdatabase VALUES (?, ?, ?)";
            PreparedStatement p = c.prepareStatement(sql);
            p.setString(1, Pasien);
            p.setString(2, Obat);
            p.setString(3, TenagaMedis);
          
            p.executeUpdate();
            p.close();
            JOptionPane.showMessageDialog(null, "Data Tersimpan");
        }catch(SQLException e){
            System.out.println("Terjadi Kesalahan");
        }finally{
        loadData();
        }
    }//GEN-LAST:event_btnsimpanActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try{
                Connection c = koneksi.getkoneksi();
                String sql = "DELETE FROM grafikdatabase";
                PreparedStatement p = c.prepareStatement(sql);
                               
                p.executeUpdate();
                p.close();
                JOptionPane.showMessageDialog(null, "Data Terhapus");
            }catch(SQLException e){
                System.out.println("Terjadi Kesalahab");
            }finally{
            loadData();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnpieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpieActionPerformed
        // TODO add your handling code here:
        try{
            Connection c = koneksi.getkoneksi();
            Statement s = c.createStatement();
             String sql = "SELECT * FROM grafikdatabase";
             ResultSet r = s.executeQuery(sql);
                while (r.next()) {
                    int Pasien=r.getInt("Pasien");
                    int Obat=r.getInt("Obat");
                    int TenagaMedis=r.getInt("TenagaMedis");
                DefaultPieDataset piedata = new DefaultPieDataset();
                piedata.setValue("Pasien",Pasien);
                piedata.setValue("Obat",Obat);
                piedata.setValue("Tenaga Medis",TenagaMedis);
                JFreeChart chart= ChartFactory.createPieChart("SISTEM INFORMASI RUMAH SAKIT", piedata);
                ChartFrame frame=new ChartFrame("framechart",chart);
                frame.setVisible(true);
                frame.setSize(500,500);
                }
        }catch(SQLException e){
            System.out.println("terjadi kesalahan");
        }       
        
    }//GEN-LAST:event_btnpieActionPerformed

    private void btnbatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbatActionPerformed
        // TODO add your handling code here:
        try{
            Connection c = koneksi.getkoneksi();
            Statement s = c.createStatement();
            String sql = "SELECT * FROM grafikdatabase";
            ResultSet r = s.executeQuery(sql);
            while (r.next()) {
                int Pasien=r.getInt("Pasien");
                int Obat=r.getInt("Obat");
                int TenagaMedis=r.getInt("TenagaMedis");
                DefaultCategoryDataset piedata = new DefaultCategoryDataset();
                piedata.setValue(Pasien,"Pasien","Pasien");
                piedata.setValue(Obat,"Obat","Obat");
                piedata.setValue(TenagaMedis,"Tenaga Medis","Tenaga Medis");
                JFreeChart chart= ChartFactory.createBarChart("SISTEM INFORMASI RUMAH SAKIT","Data Rumah Sakit","Jumlah", piedata);
                ChartFrame frame=new ChartFrame("framechart",chart);
                frame.setVisible(true);
                frame.setSize(500,500);
            }
        }catch(SQLException e){
            System.out.println("terjadi kesalahan");
        }
    }//GEN-LAST:event_btnbatActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        btnsimpan.setEnabled(false);
        int i = jTable1.getSelectedRow();
        if (i == -1){
            return;
        }
        
        String Pasien = (String)model.getValueAt(i, 0);
        txp.setText(Pasien);
        String Obat = (String)model.getValueAt(i, 1);
        txo.setText(Obat);
        String A = (String)model.getValueAt(i, 2);
        txt.setText(A);
    }//GEN-LAST:event_jTable1MouseClicked

    
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Grafik1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnbat;
    private javax.swing.JButton btnpie;
    private javax.swing.JButton btnsimpan;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txo;
    private javax.swing.JTextField txp;
    private javax.swing.JTextField txt;
    // End of variables declaration//GEN-END:variables
}
