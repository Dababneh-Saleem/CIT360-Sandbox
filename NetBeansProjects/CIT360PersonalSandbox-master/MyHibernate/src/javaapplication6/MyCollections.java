/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6;

/**
 *
 * @author sdababneh
 */
import java.util.HashMap;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.json.simple.JSONObject;

/**
 *
 * @author sdababneh
 */
@Named
@RequestScoped
public class MyCollections {
    private static SessionFactory factory;
    private Session session;
    
    public MyCollections() {
     try{
            factory = new Configuration().configure().buildSessionFactory();
            session = factory.openSession();
        }catch (Throwable ex) { 
            System.err.println("Failed to create sessionFactory object." + ex);
            throw new ExceptionInInitializerError(ex); 
        }
    }
    public HashMap MyHashMap () {
        HashMap<Integer, String> hmap = new HashMap<Integer, String>();
        
        hmap.put(1, "One");
        hmap.put(10, "Ten");
        hmap.put(6, "Six");
        hmap.put(11, "Eleven");
        
        String otext = hmap.get(6);
        return hmap;
    } 
    private Integer addCollections(HashMap hmap2){
      Transaction tx = null;
      Integer HmapID = null;
      try{
         tx = session.beginTransaction();
         Collections collection = new Collections(hmap2.toString());
         HmapID = (Integer) session.save(collection); 
         tx.commit();
      }catch (HibernateException e) {
         if (tx!=null) tx.rollback();
         e.printStackTrace(); 
      }
      
      return HmapID;
   }
   public void CAdd(){
        MyCollections MJ = new MyCollections();
        MJ.addCollections(MyHashMap());
        CloseConnection();
    }

    private void CloseConnection() {
        session.close();
    }
}

