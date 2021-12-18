/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import entity.BookMaster;
import java.util.Collection;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author root
 */
@Stateless
public class DataEJB implements DataEJBLocal {
@PersistenceContext(unitName = "JPAWebAppPU")
EntityManager em;
 
Collection<BookMaster> books;
    
    
    @Override
    public Collection<BookMaster> getAllBooks() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   
        books = em.createNamedQuery("BookMaster.findAll").getResultList();
        return books;
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    @Override
    public Collection<BookMaster> getBookByPublisher(String publisher) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    Collection mybooks = em.createNamedQuery("BookMaster.findByPublisherName")
                           .setParameter("publisherName", publisher)
                           .getResultList();
    
    return mybooks;
    }


}
