package javaapplication6;

import java.util.List;
import static junit.framework.Assert.assertNotNull;
import static junit.framework.Assert.assertSame;
import static junit.framework.Assert.assertNotSame;
import static junit.framework.Assert.assertNull;
import org.hibernate.HibernateException;
import org.hibernate.Query;
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
           List employees = null;    
           assertNull(employees);
            employees = session.createQuery("FROM Employee").list(); 
           assertNotNull(employees);
           assertEquals(1,employees.size());
           if(employees.size() == 1)
           {
               System.out.println("Employee "+employee);
                System.out.println("List Employee "+employees.get(0));
                assertSame(employee,employees.get(0));    
                
                Employee newemployee = new Employee("Zara", "Ali", 1000);
                 System.out.println("New Employee "+newemployee);
                assertNotSame(newemployee,employees.get(0));
                
           //Update Employee
                 tx = session.beginTransaction();
           String queryStr = "from Employee where id =:employeeId ";
           Query query = session.createQuery(queryStr);
           Employee dbEmployee = (Employee)employees.get(0);
              System.out.println("Employee ID is "+dbEmployee.getId());
           query.setInteger("employeeId",dbEmployee.getId() );
           Employee updateEmployee = (Employee)query.uniqueResult();
           updateEmployee.setSalary(5000);
           session.update(updateEmployee);
             tx.commit();
           assertSame(employee,updateEmployee);
           System.out.println("Employee is updated. First Name is "+newemployee.getFirstName());
           
           //Delete Employee 
            tx = session.beginTransaction();
           String queryString = "from Employee where id =:employeeId ";
           Query deleteQuery = session.createQuery(queryString);         
           deleteQuery.setInteger("employeeId",dbEmployee.getId() );
           Employee deleteEmployee = (Employee)deleteQuery.uniqueResult();
            assertSame(employee,deleteEmployee);
           session.delete(deleteEmployee);
           tx.commit();
           System.out.println("Employee "+deleteEmployee.getFirstName()+ " is deleted.");
           
           
           }
           
        
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
