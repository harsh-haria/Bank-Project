
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HARSH
 */
public class main_page extends javax.swing.JFrame {
    String carry=MAIN_WINDOW.pass_carry;
    String mnum,name1,eid,type1,add1,pan1,password1,adhar1;
    int  age1,acc1;
    double c;
    int check1;
    int dep=0;
    double deposit1;
    int b1[]=new int[20];
    String b2[]=new String[20];
    int send_acc;
    private int FLAG;
    /**
     * Creates new form main_page
     */
    public main_page() {
        initComponents();
        setLocationRelativeTo(null);
        details();
        show_acc();
        //email.setText(MAIN_WINDOW.pass_carry);
    }
   
    public void details()
    {
        try{
        Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/bank","harsh","123456");
        String query="select * from customer where email='"+carry+"'";
        Statement st=con.createStatement();
        ResultSet rs=st.executeQuery(query);
        while(rs.next()){
            acc1=rs.getInt(1);
            name1=rs.getString(2);
            mnum=rs.getString(3);
            age1=rs.getInt(4);
            add1=rs.getString(5);
            eid=rs.getString(6);
            pan1=rs.getString(7);
            type1=rs.getString(8);
            adhar1=rs.getString(9);
            deposit1 = rs.getDouble(10);
            password1=rs.getString(11);
        }
        }
        catch(SQLException e)
        {
        
        }
        
        name.setText(name1);
        email.setText(eid);
        mobile.setText(""+mnum);
        account_number.setText(""+acc1);
        balance.setText(""+deposit1);
          
        
    }
    public ArrayList<User3> userlist3()
    {
        ArrayList<User3> userlist3=new ArrayList<>();
        try
                    {
                    Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/bank","harsh","123456");
                    String query1="select * from customer";
                    Statement st=con.createStatement();
                    ResultSet rs=st.executeQuery(query1);
                    User3 user3;
                    while(rs.next())
                    {
                        user3=new User3(rs.getInt(1));
                        userlist3.add(user3);
                        
                    }
                    }
                    catch(SQLException e)
                    {
                        System.out.println(e);
                    }
                    return userlist3;
    }
    public void show_acc()
    {
        ArrayList<User3> list=userlist3();
        for(int i=0;i<list.size();i++)
        {
            b1[i]=list.get(i).getAcc_num();
            b2[i]=""+b1[i];
            a_acc.addItem(b2[i]);
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
        jLabel1 = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        email = new javax.swing.JLabel();
        mobile = new javax.swing.JLabel();
        account_number = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        balance = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        withdraw = new javax.swing.JButton();
        w_money = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        a_send = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        send_button = new javax.swing.JButton();
        depo = new javax.swing.JTextField();
        depo_in = new javax.swing.JButton();
        a_acc = new javax.swing.JComboBox<>();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("MY ACCOUNT");
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DETAILS", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/man_img1.jpg"))); // NOI18N

        name.setText("name");

        email.setText("email");

        mobile.setText("mobile");

        account_number.setText("account number");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(account_number, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                    .addComponent(mobile, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(email, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(name, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(mobile, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(account_number, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "BALANCE", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/money.png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setText("=");

        balance.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        balance.setForeground(new java.awt.Color(0, 0, 255));
        balance.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        balance.setText("5000000");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(balance, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(balance, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "MISCELLANEOUS", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP));
        jPanel3.setToolTipText("Account :-");
        jPanel3.setName(""); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setText("ACCOUNT FUNCTIONS");

        withdraw.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        withdraw.setForeground(new java.awt.Color(255, 0, 51));
        withdraw.setText("WITHDRAW");
        withdraw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                withdrawActionPerformed(evt);
            }
        });

        w_money.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/downarrow.png"))); // NOI18N
        jLabel5.setText("SEND MONEY");

        a_send.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Account No. :-");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Amount :-");

        send_button.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        send_button.setForeground(new java.awt.Color(0, 255, 0));
        send_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login.jpg"))); // NOI18N
        send_button.setText("SEND");
        send_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                send_buttonActionPerformed(evt);
            }
        });

        depo.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        depo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                depoActionPerformed(evt);
            }
        });

        depo_in.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        depo_in.setForeground(new java.awt.Color(0, 0, 204));
        depo_in.setText("DEPOSIT");
        depo_in.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                depo_inActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(a_send)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(a_acc, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(send_button)
                        .addGap(13, 13, 13))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(depo, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(w_money))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(withdraw, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(depo_in, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(86, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(74, 74, 74))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(withdraw, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(w_money, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(depo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(depo_in))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(a_acc))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(a_send)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(send_button, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE))
                .addContainerGap(8, Short.MAX_VALUE))
        );

        jMenu1.setText("File");

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images.png"))); // NOI18N
        jMenuItem1.setText("EXIT");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void send_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_send_buttonActionPerformed
        int f=0;
        
        if(a_send.getText().isEmpty() || !a_send.getText().matches("^[0-9]*$"))
        {
            JOptionPane.showMessageDialog(this,"please enter valid amount!");
            
        }
        else
        {   
        String a=a_send.getText();
        int amount1=Integer.parseInt(a);
        String b=balance.getText();
        Double amount2=Double.parseDouble(b);
        String abcd=(String) a_acc.getSelectedItem();
        check1=Integer.parseInt(abcd);
            if(check1==acc1)
            {
                JOptionPane.showMessageDialog(this,"You cannot send money to this same account...");
            }
            else
            {
                try
                {
                    Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/bank","harsh","123456");
                    String query1="select deposit from customer where acc_num="+check1+"";
                    Statement st=con.createStatement();
                    ResultSet rs=st.executeQuery(query1);
                    while(rs.next())
                    {
                        dep=rs.getInt(1);
                    }
                }
                catch(SQLException e)
                {
                    JOptionPane.showMessageDialog(this,e);
                }
            Double finalamm=(double)dep+amount1;
                try//for sending
                {
                    Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/bank","harsh","123456");
                    String query2="update customer set deposit=? where acc_num=?";
                    PreparedStatement psmt = con.prepareStatement(query2);
                    psmt.setDouble(1,finalamm);
                    psmt.setInt(2,check1);
                    psmt.executeUpdate();
                }
                catch(SQLException e)
                {
                    JOptionPane.showMessageDialog(this , e);
                }
            String bal=balance.getText();
            Double bal1=Double.parseDouble(bal);
            Double finalsend=(double)bal1-amount1;
                try//for the sender
                {
                    Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/bank","harsh","123456");
                    String query2="update customer set deposit=? where acc_num=?";
                    PreparedStatement psmt = con.prepareStatement(query2);
                    psmt.setDouble(1,finalsend);
                    psmt.setInt(2,acc1);
                    psmt.executeUpdate();
                }
                catch(SQLException e)
                {
                    JOptionPane.showMessageDialog(this , e);
                }
                if(amount1<0)
                {
                    JOptionPane.showMessageDialog(this , "THIS TRABSACTION CANNOT BE COMPLETED");
                }
                else
                {
                    f=1;
                }
                if(f==1)
                {
                    if(amount1>amount2)
                    {
                        JOptionPane.showMessageDialog(this , "THIS TRABSACTION CANNOT BE COMPLETED");
                    }
                    else
                    {
                        balance.setText(""+(amount2-amount1));
                        JOptionPane.showMessageDialog(this , "TRANSACTION COMPLETED!!!");
                    }
                }
            }
        }
    }//GEN-LAST:event_send_buttonActionPerformed

    private void withdrawActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_withdrawActionPerformed
        if(w_money.getText().isEmpty() || !w_money.getText().matches("^[0-9]*$"))
        {
            JOptionPane.showMessageDialog(this, "please enter a valid number!");
            w_money.setText("");
        }
        else
        {
        String check=w_money.getText();
        double b=Double.parseDouble(check);
        String check1=balance.getText();
        double a=Double.parseDouble(check1);
        c=a-b;
        try
        {
            Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/bank","harsh","123456");
            String query2="update customer set deposit=? where acc_num=?";
            PreparedStatement psmt = con.prepareStatement(query2);
            psmt.setDouble(1,c);
            psmt.setInt(2,acc1);
            psmt.executeUpdate();
            JOptionPane.showMessageDialog(this,"Transaction Complete");
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(this,e);
        }
        balance.setText(""+c);
        w_money.setText("");
        }
    }//GEN-LAST:event_withdrawActionPerformed

    private void depo_inActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_depo_inActionPerformed
        if(depo.getText().isEmpty() || !depo.getText().matches("^[0-9]*$"))
        {
            JOptionPane.showMessageDialog(this, "please enter a valid number!");
            depo.setText("");
        }
        else
        {
        String check=depo.getText();
        int b=Integer.parseInt(check);
        String check1=balance.getText();
        Double a=Double.parseDouble(check1);
        c=a+b;
        try
        {
            Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/bank","harsh","123456");
            String query2="update customer set deposit=? where acc_num=?";
            PreparedStatement psmt = con.prepareStatement(query2);
            psmt.setDouble(1,c);
            psmt.setInt(2,acc1);
            psmt.executeUpdate();
            JOptionPane.showMessageDialog(this,"Transaction Complete");
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(this,e);
        }
        balance.setText(""+c);
        depo.setText("");
        }
    }//GEN-LAST:event_depo_inActionPerformed

    private void depoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_depoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_depoActionPerformed

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
            java.util.logging.Logger.getLogger(main_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main_page().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> a_acc;
    private javax.swing.JTextField a_send;
    private javax.swing.JLabel account_number;
    private javax.swing.JLabel balance;
    private javax.swing.JTextField depo;
    private javax.swing.JButton depo_in;
    private javax.swing.JLabel email;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel mobile;
    private javax.swing.JLabel name;
    private javax.swing.JButton send_button;
    private javax.swing.JTextField w_money;
    private javax.swing.JButton withdraw;
    // End of variables declaration//GEN-END:variables
}