package javaapplication6;

import java.util.List;
import javaapplication6.Employee;
import javaapplication6.ManageEmployee;
import static junit.framework.Assert.assertNotNull;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.After;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sdababneh
 */
public class TestJUnit  {
    
    public SessionFactory sessionFactory = null;
    public Session session = null;
    
  @Before  
  public void before()
  {
      // get session factory 
      Configuration conf = new Configuration().configure("hibernate.cfg.xml");
       sessionFactory = conf.buildSessionFactory();
       session = sessionFactory.openSession();
      
  }
  
  @Test
  public void testEmployeeInsert()
  {
      //use session factory 
      //insert employee into database
      //check insert is done or not 
      
        ManageEmployee ME = new ManageEmployee();
         Transaction tx = null;
      Integer employeeID = null;
      try{
         tx = session.beginTransaction();
         Employee employee = new Employee("Zara", "Ali", 1000);
         employeeID = (Integer) session.save(employee); 
         tx.commit();
           List employees = session.createQuery("FROM Employee").list();
           assertNotNull(employees);
           assertEquals(1,employees.size());
         
      }catch (HibernateException e) {
         if (tx!=null) tx.rollback();
         e.printStackTrace(); 
      }
  }
  
  @After
  public void end()
  {
      // close session factory 
      //close session
      session.close();
      sessionFactory.close();
  }

  
    
    
}
