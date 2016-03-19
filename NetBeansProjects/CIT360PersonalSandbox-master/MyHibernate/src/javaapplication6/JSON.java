/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6;

/**
 *
 * @author sdababneh
 * Model
 */
public class JSON {
  private int id;
  private String MeJSON; 
  
  public JSON () {}
  public JSON (String MyJSON) {
      this.MeJSON = MyJSON;
  }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMeJSON() {
        return MeJSON;
    }

    public void setMeJSON(String MeJSON) {
        this.MeJSON = MeJSON;
    }

  
}
