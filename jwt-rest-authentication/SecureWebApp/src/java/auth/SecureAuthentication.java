/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package auth;

import javax.security.enterprise.authentication.mechanism.http.HttpAuthenticationMechanism;
import java.io.Serializable;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.security.enterprise.AuthenticationException;
import javax.security.enterprise.AuthenticationStatus;
import javax.security.enterprise.authentication.mechanism.http.HttpMessageContext;
import javax.security.enterprise.credential.Credential;
import javax.security.enterprise.credential.Password;
import javax.security.enterprise.credential.UsernamePasswordCredential;
import javax.security.enterprise.identitystore.CredentialValidationResult;
import javax.security.enterprise.identitystore.CredentialValidationResult.Status;
import javax.security.enterprise.identitystore.IdentityStoreHandler;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import record.KeepRecord;

/**
 *
 * @author root
 */
@Named
@RequestScoped
public class SecureAuthentication implements HttpAuthenticationMechanism, Serializable {
@Inject IdentityStoreHandler handler;
CredentialValidationResult result;
AuthenticationStatus status;
    
    
    @Override
    public AuthenticationStatus validateRequest(HttpServletRequest request, HttpServletResponse response, HttpMessageContext ctx) throws AuthenticationException {
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    try{
      if(request.getParameter("username")!=null)
      {
          String username = request.getParameter("username");
          String password = request.getParameter("password");
          Credential credential = new UsernamePasswordCredential(username, new Password(password));
          result = handler.validate(credential);
          if(result.getStatus()== Status.VALID)
          {
              status = ctx.notifyContainerAboutLogin(result);
              
              KeepRecord.setPrincipal(result.getCallerPrincipal());
              KeepRecord.setRoles(result.getCallerGroups());
              
              if(request.getRequestURI().contains("index.jsp"))
              {
                  request.setAttribute("user", result.getCallerPrincipal().getName());
                  if(result.getCallerGroups().contains("Admin"))
                          {
                              
                              request.getServletContext().getRequestDispatcher("/admin.jsp").forward(request, response);
                          return status;
                          }
                  else if(result.getCallerGroups().contains("Supervisor"))
                          {
                              
                              request.getServletContext().getRequestDispatcher("/users.jsp").forward(request, response);
                          return status;
                          }
                  
                  
              }
          }
          else
          {
              request.setAttribute("error", "User Name and Password do not match with our records ..");
              request.getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
              return ctx.doNothing();
          }
          
          
          
          
      }
      
     if(KeepRecord.getPrincipal()!=null)
     {
         ctx.notifyContainerAboutLogin(KeepRecord.getPrincipal(), KeepRecord.getRoles());
     }
      
    }
    catch(Exception e)
    {
        e.printStackTrace();
    }
      return ctx.doNothing();
    }
    
    
}
