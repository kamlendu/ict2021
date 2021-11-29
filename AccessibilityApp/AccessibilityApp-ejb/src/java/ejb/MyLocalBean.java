/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import javax.ejb.Stateless;

/**
 *
 * @author root
 */
@Stateless
public class MyLocalBean implements MyLocalBeanLocal {

    @Override
    public String sayLocalHi(String str) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    
       return " Local Hi to "+ str;
    
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

        

}
