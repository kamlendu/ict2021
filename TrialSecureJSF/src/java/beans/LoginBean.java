/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.util.Set;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.security.enterprise.AuthenticationStatus;
import static javax.security.enterprise.AuthenticationStatus.SEND_FAILURE;
import static javax.security.enterprise.AuthenticationStatus.SUCCESS;
import javax.security.enterprise.SecurityContext;
import static javax.security.enterprise.authentication.mechanism.http.AuthenticationParameters.withParams;
import javax.security.enterprise.credential.Credential;
import javax.security.enterprise.credential.Password;
import javax.security.enterprise.credential.UsernamePasswordCredential;
import javax.security.enterprise.identitystore.CredentialValidationResult;
import javax.security.enterprise.identitystore.IdentityStoreHandler;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author root
 */
@Named(value = "loginBean")
@RequestScoped
public class LoginBean {
    
    @Inject  SecurityContext securitycontext;
    @Inject private IdentityStoreHandler handler;
   // @Inject IdentityStoreHandler handler;
    private String username;
    private String password;
    private Set<String> roles;
    private String errormsg;

    
    

    /**
     * Creates a new instance of LoginBean
     */
    public LoginBean() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Set<String> getRoles() {
        return roles;
    }

    public void setRoles(Set<String> roles) {
        this.roles = roles;
    }

    public String getErrormsg() {
        return errormsg;
    }

    public void setErrormsg(String errormsg) {
        this.errormsg = errormsg;
    }
    
    public String login()
    {
        try{
        System.out.println("user="+username); 
        System.out.println("password="+username); 
        Credential credential = new UsernamePasswordCredential(username, new Password(password));
        
        HttpServletRequest request = (HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext().getRequest();
         HttpServletResponse response = (HttpServletResponse) FacesContext.getCurrentInstance().getExternalContext().getResponse();
       
        CredentialValidationResult result = handler.validate(credential);
         
         AuthenticationStatus status = securitycontext.authenticate(request, response, withParams().credential(credential));
       
        
        System.out.println("status="+result.getCallerGroups().toString());
        if(status.equals(SUCCESS))
        {
            System.out.println("In Success"+ securitycontext.getCallerPrincipal().getName());
        
            if(result.getCallerGroups().contains("Admin"))
                 return "/admin/Admin";
          
            else if(result.getCallerGroups().contains("Supervisor"))
                return "/user/User";
            
//            if(securitycontext.isCallerInRole("Admin"))
//                 return "/admin/Admin";
//          
//            else if(securitycontext.isCallerInRole("Supervisor"))
//                return "/user/User";
//                        
        }
        else
        {
            errormsg = "Username or Password are not correct";
            return "Login";
        }
        }
        catch(Exception e)
        {
            errormsg = "Username or Password are not correct";
            return "Login";
        }
        
        return "Login";
    }
    
}
