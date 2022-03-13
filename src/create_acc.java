import java.sql.*;
import java.util.Random;


/**
 *
 * @author HARSH
 */
import javax.swing.JOptionPane;
public class create_acc extends javax.swing.JDialog {
    
    /**
     * Creates new form create_acc
     * @param parent
     * @param modal
     */
    public create_acc(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(parent);
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
        fname = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        age = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        add = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        connumber = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        adhar = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        pan = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        atype = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        PASSWORD = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        deposit = new javax.swing.JTextField();
        cancel = new javax.swing.JButton();
        submit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("CREATE ACCOUNT");
        setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        setResizable(false);
        getContentPane().setLayout(new java.awt.GridLayout(11, 2, 10, 10));

        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("FULL NAME");
        getContentPane().add(jLabel1);
        getContentPane().add(fname);

        jLabel2.setForeground(new java.awt.Color(0, 102, 102));
        jLabel2.setText("AGE");
        getContentPane().add(jLabel2);

        age.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60", "61", "62", "63", "64", "65", "66", "67", "68", "69", "70", "71", "72", "73", "74", "75", "76", "77", "78", "79", "80", "81", "82", "83", "84", "85", "86", "87", "88", "89", "90", "91", "92", "93", "94", "95", "96", "97", "98", "99", "100" }));
        getContentPane().add(age);

        jLabel3.setForeground(new java.awt.Color(0, 102, 102));
        jLabel3.setText("ADDRESS");
        getContentPane().add(jLabel3);
        getContentPane().add(add);

        jLabel4.setForeground(new java.awt.Color(0, 102, 102));
        jLabel4.setText("CONTACT NUMBER");
        getContentPane().add(jLabel4);
        getContentPane().add(connumber);

        jLabel5.setForeground(new java.awt.Color(0, 102, 102));
        jLabel5.setText("EMAIL ID");
        getContentPane().add(jLabel5);
        getContentPane().add(email);

        jLabel6.setForeground(new java.awt.Color(0, 102, 102));
        jLabel6.setText("AADHAR NUMBER");
        getContentPane().add(jLabel6);
        getContentPane().add(adhar);

        jLabel7.setForeground(new java.awt.Color(0, 102, 102));
        jLabel7.setText("PAN NUMBER");
        getContentPane().add(jLabel7);
        getContentPane().add(pan);

        jLabel8.setForeground(new java.awt.Color(0, 102, 102));
        jLabel8.setText("ACCOUNT TYPE");
        getContentPane().add(jLabel8);

        atype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CURRENT", "SAVINGS" }));
        atype.setPreferredSize(new java.awt.Dimension(150, 30));
        atype.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atypeActionPerformed(evt);
            }
        });
        getContentPane().add(atype);

        jLabel10.setForeground(new java.awt.Color(0, 102, 102));
        jLabel10.setText("PASSWORD");
        getContentPane().add(jLabel10);

        PASSWORD.setToolTipText("");
        PASSWORD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PASSWORDActionPerformed(evt);
            }
        });
        getContentPane().add(PASSWORD);

        jLabel9.setForeground(new java.awt.Color(0, 102, 102));
        jLabel9.setText("INITIAL DEPOSIT");
        getContentPane().add(jLabel9);

        deposit.setText("50");
        getContentPane().add(deposit);

        cancel.setText("CANCEL");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });
        getContentPane().add(cancel);

        submit.setText("SUBMIT");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });
        getContentPane().add(submit);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void atypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_atypeActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        this.dispose();
    }//GEN-LAST:event_cancelActionPerformed

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        StringBuilder sb= new StringBuilder();
        int f=0;
        String ab=deposit.getText();
        int abc=Integer.parseInt(ab);
        
        if(!fname.getText().matches("^[A-Za-z\\s]{1,}[\\.]{0,1}[A-Za-z\\s]{0,}$"))
        {
            sb.append("first name cannot be empty!!\n");
            f+=1;
        }
        if(add.getText().isEmpty())
        {
            sb.append("Address cannot be empty!!\n");
            f+=1;
        }
        if(!connumber.getText().matches("^[0][1-9]\\d{9}$|^[1-9]\\d{9}$"))
        {
            sb.append("Contact number invalid!!\n");
            f+=1;
        }
        if(!email.getText().matches("^([a-zA-Z0-9_\\-\\.]+)@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.)|(([a-zA-Z0-9\\-]+\\.)+))([a-zA-Z]{2,4}|[0-9]{1,3})(\\]?)$"))
        {
            sb.append("Email Id invalid!!\n");
            f+=1;
        }
        if(!adhar.getText().matches("^\\d{4}\\s\\d{4}\\s\\d{4}$"))
        {
            sb.append("Aadhar number invalid!!\n");
            f+=1;
        }
        if(pan.getText().isEmpty() || pan.getText().length()>10)
        {
            sb.append("Pan number cannot be empty or is invalid!!\n");
            f+=1;
        }
        if(PASSWORD.getText().isEmpty() || PASSWORD.getText().length()>16)
        {
            sb.append("Password cannot be empty or invalid is invalid!!\n");
            f+=1;
        }
        try
        {
        if(abc<=50)
        {
            sb.append("Minimum Depsoit is 51\n");
        }
        }
        catch(Exception e)
        {
            System.out.print(e);
        }
        if(sb.length()>0)
        {
            JOptionPane.showMessageDialog(this , sb.toString());
        }
        if(f==0)
        {
            JOptionPane.showMessageDialog(this , "CONRAULATIONS!! YOUR ACCOUNT HAS BEEN CREATED.....\nYOU MUST NOW LOGIN AGAIN");
            this.dispose();
        }
        if(sb.length()<=0)
        {
            String abcd;
            String a[]=new String[10];
            a[0]=fname.getText();
            abcd=(String)age.getSelectedItem();
            int age1=Integer.parseInt(abcd);
            a[2]=add.getText();
            a[3]=connumber.getText();
            //int PHONE_NUMBER=Integer.parseInt(a[3]);
            a[4]=email.getText();
            a[5]=adhar.getText();
            a[6]=pan.getText();
            a[7]=(String)atype.getSelectedItem();
            a[8]=PASSWORD.getText();
            a[9]=deposit.getText();
            Double deposit1=Double.parseDouble(a[9]);
            //JOptionPane.showMessageDialog(this ,(a[0]+"\n"+a[1]+"\n"+a[2]+"\n"+a[3]+"\n"+a[4]+"\n"+a[5]+"\n"+a[6]+"\n"+a[7]+"\n"+a[8]+"\n"+a[9]));
            {
                try
                {
                    Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/bank","harsh","123456");
                    String Query=("insert into CUSTOMER values(?,?,?,?,?,?,?,?,?,?,?)");
                    PreparedStatement psmt=con.prepareStatement(Query);
                    Random random = new Random();
                    String id = String.format("%04d", random.nextInt(10000));
                    int random1=Integer.parseInt(id);
                    psmt.setInt(1,random1);
                    psmt.setString(2,a[0]);
                    psmt.setString(3,a[3]);
                    psmt.setInt(4,age1);
                    psmt.setString(5,a[2]);
                    psmt.setString(6,a[4]);
                    psmt.setString(7,a[6]);
                    psmt.setString(8,a[7]);
                    psmt.setString(9,a[5]);
                    psmt.setDouble(10,deposit1);
                    psmt.setString(11,a[8]);
                    psmt.executeUpdate();
                    JOptionPane.showMessageDialog(this,"saved!!");
                }
                catch(SQLException e)
                {
                    System.out.println(e);
                }
                
            }
        }
    }//GEN-LAST:event_submitActionPerformed

    private void PASSWORDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PASSWORDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PASSWORDActionPerformed

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
            java.util.logging.Logger.getLogger(create_acc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(create_acc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(create_acc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(create_acc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(() -> {
            create_acc dialog = new create_acc(new javax.swing.JFrame(), true);
            dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                @Override
                public void windowClosing(java.awt.event.WindowEvent e) {
                    System.exit(0);
                }
            });
            dialog.setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField PASSWORD;
    private javax.swing.JTextField add;
    private javax.swing.JTextField adhar;
    private javax.swing.JComboBox<String> age;
    private javax.swing.JComboBox<String> atype;
    private javax.swing.JButton cancel;
    private javax.swing.JTextField connumber;
    private javax.swing.JTextField deposit;
    private javax.swing.JTextField email;
    private javax.swing.JTextField fname;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField pan;
    private javax.swing.JButton submit;
    // End of variables declaration//GEN-END:variables

    private static class Account {

        public Account() {
            
        }
    }
}
