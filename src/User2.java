/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HARSH
 */
public class User2 {
    
    private int amount,account;
    private String name,purpose,term;
    
    public User2(String name,String purpose,int amount,int account,String term)
    {
        this.name=name;
        this.purpose=purpose;
        this.amount=amount;
        this.account=account;
        this.term=term;
    }
    public String getPurpose()
    {
        return purpose;
    }
    
    public String getName()
    {
        return name;
    }
    
    public int getAmount()
    {
        return amount;
    }
    
    public int getAccount()
    {
        return account;
    }
    
    public String getTerm()
    {
        return term;
    }
}

