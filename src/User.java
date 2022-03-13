/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HARSH
 */
class User {
    private double deposit;
    private int acc_num,age;
    private String name,phone_num,address,email,pan,type,adhar,password;
    
    public User(int acc_num,String name,String phone_num,int age,String address,String email,String pan,String type,String adhar,double deposit,String password)
    {
        this.acc_num=acc_num;
        this.name=name;
        this.phone_num=phone_num;
        this.age=age;
        this.address=address;
        this.email=email;
        this.pan=pan;
        this.type=type;
        this.adhar=adhar;
        this.deposit=deposit;
        this.password=password;
    }
    public int getAcc_num()
    {
        return acc_num;
    }
    
    public String getName()
    {
        return name;
    }
    
    public String getPhone_num()
    {
        return phone_num;
    }
    
    public int getAge()
    {
        return age;
    }
    
    public String getAddress()
    {
        return address;
    }
    
    public String getEmail()
    {
        return email;
    }
    
    public String getPan()
    {
        return pan;
    }
    
    public String getType()
    {
        return type;
    }
    
    public String getAdhar()
    {
        return adhar;
    }
    
    public double getDeposit()
    {
        return deposit;
    }
    
    public String getPassword()
    {
        return password;
    }
}
