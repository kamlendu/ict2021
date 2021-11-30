/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.Stateless;

/**
 *
 * @author root
 */
@Stateless(mappedName = "ejb/mydata")
public class DataEJB implements DataEJBRemote {

  Statement stmt;
  Connection con;
  ResultSet rs;
  String query;
    
    @PostConstruct
  public void setConnection()
  {
      try
      {
          Class.forName("com.mysql.jdbc.Driver");
          
          con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test?useSSL=false", "root", "ompandey");
          
          
          
      }
      catch(ClassNotFoundException cnf)
      {
          cnf.printStackTrace();
      }
      catch(SQLException se)
      {
          se.printStackTrace();
      }
      
      
      
  }
  
    
    @Override
    public List<String> getAllBookNames() {
            //    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    
            List<String> names = new ArrayList<String>();
           try{ 
           
               stmt = con.createStatement();
               
               query = "select * from BookMaster";
               
               rs = stmt.executeQuery(query);
               
               while(rs.next())
               {
                   names.add(rs.getString(1) +  "  "+ rs.getString(2));
               }
            
        
           }
           catch(SQLException sqle)
           {
               sqle.printStackTrace();
           }
      return names;
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")



}
