package View;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
public class menuChinh extends javax.swing.JFrame {

    /**
     * Creates new form menuChinh
     */
    public menuChinh() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        DangKyBienSoanGiaoTrinh = new javax.swing.JButton();
        BaoCaoTienDo = new javax.swing.JButton();
        NghiemThu = new javax.swing.JButton();
        QuanLyGiaoTrinh = new javax.swing.JButton();
        XuatBan = new javax.swing.JButton();
        ThoatGiaoDien = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setBackground(new java.awt.Color(102, 255, 204));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        jLabel1.setText("CÁC CHỨC NĂNG CHÍNH");
        jLabel1.setToolTipText("");

        DangKyBienSoanGiaoTrinh.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        DangKyBienSoanGiaoTrinh.setText("Đăng ký biên soạn giáo trình");
        DangKyBienSoanGiaoTrinh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DangKyBienSoanGiaoTrinhActionPerformed(evt);
            }
        });

        BaoCaoTienDo.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        BaoCaoTienDo.setText("Báo cáo tiến độ giáo trình");
        BaoCaoTienDo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BaoCaoTienDoActionPerformed(evt);
            }
        });

        NghiemThu.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        NghiemThu.setText("Nghiệm thu giáo trình");
        NghiemThu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NghiemThuActionPerformed(evt);
            }
        });

        QuanLyGiaoTrinh.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        QuanLyGiaoTrinh.setText("Quản lý giáo trình");
        QuanLyGiaoTrinh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QuanLyGiaoTrinhActionPerformed(evt);
            }
        });

        XuatBan.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        XuatBan.setText("Xuất bản giáo trình");
        XuatBan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                XuatBanActionPerformed(evt);
            }
        });

        ThoatGiaoDien.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        ThoatGiaoDien.setText("Thoát");
        ThoatGiaoDien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ThoatGiaoDienActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(XuatBan, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ThoatGiaoDien, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(QuanLyGiaoTrinh, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NghiemThu, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BaoCaoTienDo, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DangKyBienSoanGiaoTrinh)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(DangKyBienSoanGiaoTrinh)
                .addGap(18, 18, 18)
                .addComponent(BaoCaoTienDo)
                .addGap(18, 18, 18)
                .addComponent(NghiemThu)
                .addGap(18, 18, 18)
                .addComponent(QuanLyGiaoTrinh)
                .addGap(18, 18, 18)
                .addComponent(XuatBan)
                .addGap(18, 18, 18)
                .addComponent(ThoatGiaoDien)
                .addContainerGap(58, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BaoCaoTienDoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BaoCaoTienDoActionPerformed
        // TODO add your handling code here:
        BaoCaoTienDoView f = new BaoCaoTienDoView();
        f.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        f.setLocationRelativeTo(null);
        f.setResizable(false);
        f.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_BaoCaoTienDoActionPerformed

    private void DangKyBienSoanGiaoTrinhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DangKyBienSoanGiaoTrinhActionPerformed
        // TODO add your handling code here:
        DangKiBienSoan f = new DangKiBienSoan();
        f.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        f.setLocationRelativeTo(null);
        f.setResizable(false);
        f.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_DangKyBienSoanGiaoTrinhActionPerformed

    private void NghiemThuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NghiemThuActionPerformed
        // TODO add your handling code here:
        NghiemThuView f = new NghiemThuView();
        f.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        f.setLocationRelativeTo(null);
        f.setResizable(false);
        f.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_NghiemThuActionPerformed

    private void QuanLyGiaoTrinhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QuanLyGiaoTrinhActionPerformed
        // TODO add your handling code here:
        QuanLyGiaoTrinh f = new QuanLyGiaoTrinh();
        f.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        f.setLocationRelativeTo(null);
        f.setResizable(false);
        f.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_QuanLyGiaoTrinhActionPerformed

    private void XuatBanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_XuatBanActionPerformed
        // TODO add your handling code here:
        XuatBanView f = new XuatBanView();
        f.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        f.setLocationRelativeTo(null);
        f.setResizable(false);
        f.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_XuatBanActionPerformed

    private void ThoatGiaoDienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ThoatGiaoDienActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_ThoatGiaoDienActionPerformed

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
            java.util.logging.Logger.getLogger(menuChinh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menuChinh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menuChinh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menuChinh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menuChinh().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BaoCaoTienDo;
    private javax.swing.JButton DangKyBienSoanGiaoTrinh;
    private javax.swing.JButton NghiemThu;
    private javax.swing.JButton QuanLyGiaoTrinh;
    private javax.swing.JButton ThoatGiaoDien;
    private javax.swing.JButton XuatBan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
