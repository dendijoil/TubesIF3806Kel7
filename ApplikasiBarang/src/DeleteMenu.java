/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import java.awt.event.ActionListener;

/**
 *
 * @author dendijoil
 */
public class DeleteMenu extends javax.swing.JFrame implements View{

    /**
     * Creates new form delete
     */
    public DeleteMenu() {
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

        jLabel1 = new javax.swing.JLabel();
        btnDelPetugas = new javax.swing.JButton();
        btnDelGudang = new javax.swing.JButton();
        btnDelPenyedia = new javax.swing.JButton();
        btnDelBarang = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Menu Delete");

        btnDelPetugas.setText("3.Delete Petugas");

        btnDelGudang.setText("1.Delete Gudang");

        btnDelPenyedia.setText("2.Delete Penyedia");

        btnDelBarang.setText("4. Delete Barang");

        btnBack.setText("Back");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(159, 159, 159))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnDelPenyedia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnDelPetugas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnDelGudang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnDelBarang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(173, 173, 173)
                        .addComponent(btnBack)))
                .addContainerGap(138, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel1)
                .addGap(23, 23, 23)
                .addComponent(btnDelGudang)
                .addGap(18, 18, 18)
                .addComponent(btnDelPenyedia)
                .addGap(18, 18, 18)
                .addComponent(btnDelPetugas)
                .addGap(18, 18, 18)
                .addComponent(btnDelBarang)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnBack)
                .addGap(0, 36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDelBarang;
    private javax.swing.JButton btnDelGudang;
    private javax.swing.JButton btnDelPenyedia;
    private javax.swing.JButton btnDelPetugas;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables

    public Object getBtnDelGudang() {
        return btnDelGudang;
    }
    public Object getBtnDelPenyedia() {
        return btnDelPenyedia;
    }
    public Object getBtnDelPetugas() {
        return btnDelPetugas;
    }
    public Object getBtnDelBarang() {
        return btnDelBarang;
    }
    public void addListener(ActionListener e) {
        btnDelGudang.addActionListener(e);
        btnDelPenyedia.addActionListener(e);
        btnDelPetugas.addActionListener(e);
        btnDelBarang.addActionListener(e);
        btnBack.addActionListener(e);
    }
    public Object getBtnBack(){
        return btnBack;
    }
}