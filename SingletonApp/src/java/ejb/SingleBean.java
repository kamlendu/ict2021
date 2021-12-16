/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import java.util.concurrent.TimeUnit;
import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import javax.ejb.AccessTimeout;
import javax.ejb.ConcurrencyManagement;
import javax.ejb.ConcurrencyManagementType;
import javax.ejb.DependsOn;
import javax.ejb.Lock;
import javax.ejb.LockType;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.transaction.UserTransaction;

/**
 *
 * @author root
 */


@ConcurrencyManagement(ConcurrencyManagementType.BEAN)
@TransactionManagement(TransactionManagementType.BEAN)
@AccessTimeout(unit = TimeUnit.SECONDS, value = 30 )
@Startup
@Singleton
@DependsOn({ "FirstBean", "SecondBean" })
public class SingleBean {
    
    @Resource UserTransaction utx;
    
    String firstName;
    String lastName;

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    @PostConstruct
    public void initialize()
    {
        System.out.println("Single Bean is intantiated");
    }

public int substract(int x, int y)
{
    return x-y;
}

    @Lock(LockType.READ)
    public String getFirstName() {
        return firstName;
    }

     @Lock(LockType.WRITE)
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

     @Lock(LockType.READ)
    public String getLastName() {
        return lastName;
    }

    @Lock(LockType.WRITE)
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    
 @Lock(LockType.READ)
public String getFullName(String firstName, String lastName)
{
    String fullName="";
    try{
    
    
    fullName = firstName+" "+ lastName;
    utx.commit();
    }
    catch(Exception e)
    {
        try{
        utx.rollback();
        }
        catch(Exception tr)
        {
            tr.printStackTrace();
        }
        
    }
    return fullName;
}
    
    
    
}
