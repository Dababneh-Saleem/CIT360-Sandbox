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
public class Collections {
  private int id;
  private String MeCollection; 
  
  public Collections () {}
  public Collections (String MyCollection) {
      this.MeCollection = MyCollection;
  }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMeCollection() {
        return MeCollection;
    }

    public void setMeCollection(String MeCollection) {
        this.MeCollection = MeCollection;
    }

  
}
