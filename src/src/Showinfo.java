package src;


import javax.swing.JOptionPane;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Locale;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Baby
 */
public class Showinfo extends javax.swing.JFrame {
 // String cn,cr,ct;
    /**
     * Creates new form Showinfo
     */
    public Showinfo() {
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

        entityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("student?zeroDateTimeBehavior=convertToNullPU").createEntityManager();
        studentinfoQuery = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT s FROM Studentinfo s");
        studentinfoList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : studentinfoQuery.getResultList();
        studentinfoQuery1 = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT s FROM Studentinfo s");
        studentinfoList1 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : studentinfoQuery1.getResultList();
        studentinfoQuery2 = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT s FROM Studentinfo s");
        studentinfoList2 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : studentinfoQuery2.getResultList();
        studentinfoQuery3 = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT s FROM Studentinfo s");
        studentinfoList3 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : studentinfoQuery3.getResultList();
        studentinfoQuery4 = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT s FROM Studentinfo s");
        studentinfoList4 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : studentinfoQuery4.getResultList();
        studentinfoQuery5 = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT s FROM Studentinfo s");
        studentinfoList5 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : studentinfoQuery5.getResultList();
        studentinfoQuery6 = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT s FROM Studentinfo s");
        studentinfoList6 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : studentinfoQuery6.getResultList();
        studentinfoQuery7 = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT s FROM Studentinfo s");
        studentinfoList7 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : studentinfoQuery7.getResultList();
        studentinfoQuery8 = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT s FROM Studentinfo s");
        studentinfoList8 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : studentinfoQuery8.getResultList();
        studentinfoQuery9 = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT s FROM Studentinfo s");
        studentinfoList9 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : studentinfoQuery9.getResultList();
        studentinfoQuery10 = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT s FROM Studentinfo s");
        studentinfoList10 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : studentinfoQuery10.getResultList();
        studentinfoQuery11 = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT s FROM Studentinfo s");
        studentinfoList11 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : studentinfoQuery11.getResultList();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jcomclsna = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        jtxttotalst = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtpresent = new javax.swing.JTextField();
        txtabsence = new javax.swing.JTextField();
        dateTF = new org.jdesktop.swingx.JXDatePicker();
        jPanel6 = new javax.swing.JPanel();
        jbtnclear = new javax.swing.JButton();
        save1 = new javax.swing.JButton();
        jbtnshoe1 = new javax.swing.JButton();
        btnupdate = new javax.swing.JButton();
        btntable = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 204, 204));

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        jPanel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setText("Show  Student Attendence");
        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setText("Class name");

        jcomclsna.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--Class Name--", "class6", "class7", "class8" }));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setText("Total Stusent:");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setText("Present stu:");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel9.setText("Absence:");

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel10.setText("Date");

        txtpresent.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtpresent.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        txtabsence.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jPanel6.setBackground(new java.awt.Color(0, 0, 0));

        jbtnclear.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jbtnclear.setText("clear");

        save1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        save1.setText("Save");
        save1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save1ActionPerformed(evt);
            }
        });

        jbtnshoe1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jbtnshoe1.setText("Show");

        btnupdate.setText("UPdate");

        btntable.setText("Show in table");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(save1)
                .addGap(53, 53, 53)
                .addComponent(jbtnshoe1)
                .addGap(48, 48, 48)
                .addComponent(btnupdate)
                .addGap(62, 62, 62)
                .addComponent(btntable)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addComponent(jbtnclear)
                .addGap(48, 48, 48))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jbtnclear, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(save1)
                    .addComponent(jbtnshoe1)
                    .addComponent(btnupdate)
                    .addComponent(btntable))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(65, 65, 65)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtpresent, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                            .addComponent(txtabsence))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtxttotalst, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jcomclsna, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(78, 78, 78)
                                .addComponent(dateTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(dateTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcomclsna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxttotalst, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtpresent, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtabsence, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 220, Short.MAX_VALUE)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void save1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save1ActionPerformed
       String clname,totalstu,presentstu;
       clname=jcomclsna.getSelectedItem().toString();
       totalstu=jtxttotalst.getText();
    presentstu=txtpresent.getText();
   String date;
  SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd",Locale.getDefault());
 date =sdf.format(dateTF.getDate());
   
    
      //absence=txtabsence.getText();
      // dat=jDateChooser1.getDateFormatString();
      //int absent=0;
       String ab=String.valueOf(Integer.parseInt(totalstu)-Integer.parseInt(presentstu));
        txtabsence.setText(ab);
        Connection con=null;
        Statement stmt=null;
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "123");
            stmt=con.createStatement();
            stmt.executeUpdate("insert into studentattend(classname,totalstu,presentstu,absence,attend_date)values('"+clname+"','"+totalstu+"', '"+ presentstu+"', '"+ab+"','"+date+"')");
        
        
        }catch(Exception e){
        
       e.printStackTrace();
        
        }
    }//GEN-LAST:event_save1ActionPerformed
//  private void getAllRecord(){
//   cn =jcomc.getSelectedItem().toString();
//   cr =txtrono.getText();
//   ct =jtxtct.getText();
//  
//  
//  }
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
            java.util.logging.Logger.getLogger(Showinfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Showinfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Showinfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Showinfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Showinfo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btntable;
    private javax.swing.JButton btnupdate;
    private org.jdesktop.swingx.JXDatePicker dateTF;
    private javax.persistence.EntityManager entityManager;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JButton jbtnclear;
    private javax.swing.JButton jbtnshoe1;
    private javax.swing.JComboBox jcomclsna;
    private javax.swing.JTextField jtxttotalst;
    private javax.swing.JButton save1;
    private java.util.List<src.Studentinfo> studentinfoList;
    private java.util.List<src.Studentinfo> studentinfoList1;
    private java.util.List<src.Studentinfo> studentinfoList10;
    private java.util.List<src.Studentinfo> studentinfoList11;
    private java.util.List<src.Studentinfo> studentinfoList2;
    private java.util.List<src.Studentinfo> studentinfoList3;
    private java.util.List<src.Studentinfo> studentinfoList4;
    private java.util.List<src.Studentinfo> studentinfoList5;
    private java.util.List<src.Studentinfo> studentinfoList6;
    private java.util.List<src.Studentinfo> studentinfoList7;
    private java.util.List<src.Studentinfo> studentinfoList8;
    private java.util.List<src.Studentinfo> studentinfoList9;
    private javax.persistence.Query studentinfoQuery;
    private javax.persistence.Query studentinfoQuery1;
    private javax.persistence.Query studentinfoQuery10;
    private javax.persistence.Query studentinfoQuery11;
    private javax.persistence.Query studentinfoQuery2;
    private javax.persistence.Query studentinfoQuery3;
    private javax.persistence.Query studentinfoQuery4;
    private javax.persistence.Query studentinfoQuery5;
    private javax.persistence.Query studentinfoQuery6;
    private javax.persistence.Query studentinfoQuery7;
    private javax.persistence.Query studentinfoQuery8;
    private javax.persistence.Query studentinfoQuery9;
    private javax.swing.JTextField txtabsence;
    private javax.swing.JTextField txtpresent;
    // End of variables declaration//GEN-END:variables
}
