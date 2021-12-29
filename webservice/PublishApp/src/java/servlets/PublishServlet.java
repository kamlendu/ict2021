/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import service.Address;
import service.Customer;
import service.Subscription;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.WebServiceRef;
import service.PublishBean;
import service.PublishBeanService;

/**
 *
 * @author root
 */
@WebServlet(name = "PublishServlet", urlPatterns = {"/PublishServlet"})
public class PublishServlet extends HttpServlet {
    
   // @EJB PublishBeanLocal pbl;
    @WebServiceRef(wsdlLocation = "http://localhost:8080/PublishBeanService/PublishBean?WSDL")
    PublishBeanService pbservice;
    PublishBean pbl;

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet PublishServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            
            pbl = pbservice.getPublishBeanPort();
            
           // pbl.removeCustomer(26);
          //  pbl.addCustomer("Sudha", "Mishra");
          //pbl.addAddressToCustomer("S-143", "Bikaner", "Rajasthan", "345212", 26);
          //pbl.addAddressToCustomer("Marshal street", "Indore", "Madhya Pradesh", "512321", 26);
//          pbl.removeAddressToCustomers(26, 31);
//          pbl.removeAddressToCustomers(26, 32);
          
          //  pbl.removeAddressToCustomers(24, 25);
          List<Integer> ids = new ArrayList<Integer>();
          ids.add(3); ids.add(4); ids.add(5);
          
         // pbl.addSubscriptionsToCustomer(26, ids);
            
          // pbl.removeSubscriptionsToCustomer(26, ids);
            
            
            
            
            
            
            out.println("<h3>");
            
            Collection<Customer> customers = pbl.getAllCustomers();
            
            for(Customer c : customers )
            {
               out.println("Cust Id : "+ c.getCustomerID() +" Name : "+ c.getFirstName()+" "+ c.getLastName());
            
               Collection<Address> addresses = pbl.getAddressOfCustomer(c.getCustomerID());
                for(Address a : addresses)
                {
                   out.println("<br/>Address Id : "+ a.getAddressId() +" City : "+ a.getCity()+" State "+ a.getState()+ " Zip : "+ a.getZip());
             
                }
                
                Collection<Subscription> subs = pbl.getSubscriptionsofCustomer(c.getCustomerID());
            
                for(Subscription s : subs)
                {
                     out.println("<br/>Sub Id : "+ s.getSubscriptionId() +" Title : "+ s.getTitle()+" Type : "+ s.getType());
            
               
                }
            
             out.println("<hr/>");
            
            }
            
            out.println("</h3>");
            
            
            
            
            out.println("<h1>Servlet PublishServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
