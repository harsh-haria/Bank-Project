//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.Statement;
//import javax.swing.JOptionPane;
//
///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//
///**
// *
// * @author HARSH
// */
//public class NewClass {
//    
//        if(acc_number.getText().isEmpty())
//        {
//            JOptionPane.showMessageDialog(this,"account empty!");
//            f=1;
//        }
//        if(name.getText().isEmpty())
//        {
//            sb.append("first name cannot be empty!!\n");
//            f=1;
//        }
//        if(path.getText().isEmpty())
//        {
//            sb.append("Please Attach a correct file!!!\n");
//            f=1;
//        }
//        if(acc_number.getText().isEmpty())
//        {
//            sb.append("Please Enter a acoount number!!\n");
//            f=1;
//        }
//        else{
//        try
//        {
//            Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/bank","harsh","123456");
//            String query1="select acc_num from customer";
//            Statement st=con.createStatement();
//            ResultSet rs=st.executeQuery(query1);
//            for(int j=0;j<=10;j++)
//            {
//                while(rs.next())
//                {
//                    b[j]=rs.getInt(1);
//                    //values are getting fetched
//                }
//            }
//            for(int i=0;i<=10;i++)
//            {
//                if(b[i]==acc_number2)
//                {
//                    FLAG=1;
//                    send_acc = b[i];
//                    JOptionPane.showMessageDialog(this,"VALID ACCOUNT FOUND!");
//                }
//            }
//        }
//        catch(SQLException e)
//        {
//            System.out.println(e);
//        }
//        }//for else
//        
//        
//        if(sb.length()>0 || FLAG==0)
//        {
//            JOptionPane.showMessageDialog(this , sb.toString());
//            JOptionPane.showMessageDialog(this , "please check the details!");
//        }
//        else
//        {
//            amount2=(int)amount.getValue();
//            //amount2=Integer.parseInt(amount1);
//            
//            String term_value1="";
//            if(J1.isSelected())
//            {
//                term_value1="1";
//            }
//            else if(J2.isSelected())
//            {
//                term_value1="5";
//            }
//            else
//            {
//                term_value1="10";
//            }
//        try
//        {
//            Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/bank","harsh","123456");
//            String Query=("insert into LOAN_APP values(?,?,?,?,?)");
//            PreparedStatement psmt=con.prepareStatement(Query);
//            psmt.setString(1,name.getText());
//            psmt.setString(2,(String)purpose.getSelectedItem());
//            psmt.setInt(3,amount2);
//            psmt.setInt(4,acc_number2);
//            psmt.setString(5,term_value1);
//            psmt.executeUpdate();
//            JOptionPane.showMessageDialog(this, "Loan application will be reviewed and if all details are valid then the amount will be deposited into your account");
//            //this.dispose();
//        }
//        catch(SQLException e)
//        {
//           JOptionPane.showMessageDialog(this, e);
//        }
//        }
//       
//        //for fetching values
//        try
//        {
//            
//            Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/bank","harsh","123456");
//            String query1="select deposit from customer where acc_num="+acc_number2+"";
//            Statement st=con.createStatement();
//            ResultSet rs=st.executeQuery(query1);
//            while(rs.next())
//            {
//                depsit=rs.getInt(1);
//            }
//            
//            //JOptionPane.showMessageDialog(this,new_balance);
//        }
//        
//        catch(SQLException e)
//        {
//            JOptionPane.showMessageDialog(this,e);
//        }
//        int new_balance;
//        new_balance=depsit+amount2;
//        //final update values
//        try//for sending
//        {
//            Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/bank","harsh","123456");
//            String query2="update customer set deposit=? where acc_num=?";
//            PreparedStatement psmt = con.prepareStatement(query2);
//            psmt.setInt(1,new_balance);
//            psmt.setInt(2,acc_number2);
//            psmt.executeUpdate();
//        }
//        catch(SQLException e)
//        {
//            JOptionPane.showMessageDialog(this , e);
//        }
//}
//
//else
//        {
//            try
//            {
//                acc_number1=acc_number.getText();
//                acc_number2=Integer.parseInt(acc_number1);
//                Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/bank","harsh","123456");
//                String query1="select acc_num from customer";
//                Statement st=con.createStatement();
//                ResultSet rs=st.executeQuery(query1);
//                for(int j=0;j<=10;j++)
//                {
//                    while(rs.next())
//                    {
//                        b[j]=rs.getInt(1);
//                        //values are getting fetched
//                    }
//                }
//                for(int i=0;i<=10;i++)
//                {
//                    if(acc_number2==b[i])
//                    {
//                        FLAG=1;
//                        send_acc = b[i];
//                        JOptionPane.showMessageDialog(this,"VALID ACCOUNT FOUND!");
//                    }
//                }
//            }
//            catch(SQLException e)
//            {
//                System.out.println(e);
//            }
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.Statement;
//import javax.swing.JOptionPane;
//
