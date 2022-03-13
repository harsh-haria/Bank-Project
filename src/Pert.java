/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HARSH
 */
public class Pert {
    public int acc,mnum,depo;
    public String name1,eid,type1;
    
    public Pert(int acc,String name1,int mnum,String eid,String type1,int depo)
    {
        this.acc=acc;
        this.name1=name1;
        this.mnum=mnum;
        this.eid=eid;
        this.type1=type1;
        this.depo=depo;
    }
    public int getAcc()
    {
        return acc;
    }
    
    public String getName1()
    {
        return name1;
    }
    
    public int getMnum()
    {
        return mnum;
    }
    
    public String getEid()
    {
        return eid;
    }
    
    public String getType1()
    {
        return type1;
    }
    
    public int getDepo()
    {
        return depo;
    }
}
