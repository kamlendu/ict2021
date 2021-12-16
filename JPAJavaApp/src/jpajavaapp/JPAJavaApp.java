/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpajavaapp;

import java.util.Collection;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author root
 */
public class JPAJavaApp {

    /**
     * @param args the command line arguments
     */
    
    EntityManagerFactory emf;
    EntityManager em;
    
    public JPAJavaApp() {
        
        emf = Persistence.createEntityManagerFactory("jpapu");
        em = emf.createEntityManager();
        
    }

    public static void main(String[] args) {
        // TODO code application logic here
        
        JPAJavaApp japp = new JPAJavaApp();
       // japp.insertEmployee(21, "Arvind Patel", 8990.00);
     //  japp.updateEmployee(21, "Saurabh Sinha", 9000);
         japp.removeEmployee(21);
        japp.showAllEmployees();
    }
    
    private void showAllEmployees()
    {
        Collection<Employee> employees = em.createNamedQuery("Employee.findAll").getResultList();
        
        for(Employee e : employees)
        {
            System.out.println("\n"+e.getEmpno()+" "+ e.getEname()+ "  "+ e.getSalary());
        }
    }
    
    private void insertEmployee(int empno, String ename, double salary)
    {
        Employee e = new Employee();
        e.setEmpno(empno);
        e.setEname(ename);
        e.setSalary(salary);
        
        em.getTransaction().begin();
        
        em.persist(e);
        
        em.getTransaction().commit();
        
    }
    
     private void updateEmployee(int empno, String ename, double salary)
    {
        Employee e = (Employee) em.find(Employee.class, empno);
        e.setEname(ename);
        e.setSalary(salary);
        
        em.getTransaction().begin();
        
        em.merge(e);
        
        em.getTransaction().commit();
        
    }
    
      private void removeEmployee(int empno)
    {
          Employee e = (Employee) em.find(Employee.class, empno);
          
           em.getTransaction().begin();
        
            em.remove(e);
        
        em.getTransaction().commit();
    }
    
}
