/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6;


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
public class MyJSON {
    private static SessionFactory factory;
    private Session session;
    
    public MyJSON() {
     try{
            factory = new Configuration().configure().buildSessionFactory();
            session = factory.openSession();
        }catch (Throwable ex) { 
            System.err.println("Failed to create sessionFactory object." + ex);
            throw new ExceptionInInitializerError(ex); 
        }
    }
    public JSONObject MyJSONifier () {
        JSONObject obj = new JSONObject();
        MyJSON m = new MyJSON();
        obj.put("name", "foo");
        obj.put("num", new Integer(100));
        obj.put("balance", new Double(1000.21));
        obj.put("is_vip", new Boolean(true));
        return obj;
    } 
    private Integer addJSON(JSONObject obj2){
      Transaction tx = null;
      Integer JSONID = null;
      try{
         tx = session.beginTransaction();
         JSON json = new JSON(obj2.toJSONString());
         JSONID = (Integer) session.save(json); 
         tx.commit();
      }catch (HibernateException e) {
         if (tx!=null) tx.rollback();
         e.printStackTrace(); 
      }
      
      return JSONID;
   }
   public void JAdd(){
        MyJSON MJ = new MyJSON();
        MJ.addJSON(MyJSONifier());
        CloseConnection();
    }

    private void CloseConnection() {
        session.close();
    }
}
