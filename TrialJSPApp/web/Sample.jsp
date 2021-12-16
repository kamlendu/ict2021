<%-- 
    Document   : Sample
    Created on : 15/12/2021, 1:18:38 PM
    Author     : root
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" import="ejb.*,myejb.*, javax.naming.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%!
            
            MyRemoteBeanRemote mbr=null;
            ALocalBeanLocal alocal =null;
            
            
         public void jspInit()
        {
            try{

                InitialContext ic = new InitialContext();
                mbr = (MyRemoteBeanRemote) ic.lookup("ejb/rem");
                alocal = (ALocalBeanLocal) ic.lookup("java:global/TrialJSPApp/ALocalBean");
                
            }
        catch(Exception e) 
        {
            e.printStackTrace();
        }


        }

        public void jspDestroy()
            {
                mbr = null;
                alocal=null;
            }

            
            %>
        
        
            <h2>   Remote Bean Says : <%=mbr.sayHi()%>  <br/>
             Local Bean Says : <%=alocal.sayLocalHello()%>
             
         
           
        
        </h2> 
        
        
       
    </body>
</html>
