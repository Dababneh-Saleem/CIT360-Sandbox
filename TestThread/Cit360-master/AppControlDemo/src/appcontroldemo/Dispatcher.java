/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appcontroldemo;

/**
 *
 * @author christianray
 */
public class Dispatcher
{
  private FirstPage  first;
  private SecondPage second;
  private ThirdPage  third;

  public Dispatcher()
  {
    first = new FirstPage();
    second = new SecondPage();
    third = new ThirdPage();
  }

  public void dispatch( String request )
  {
    if( request.equalsIgnoreCase("FIRST") )
    {
      first.show();
    }
    else if( request.equalsIgnoreCase("SECOND") )
    {
      second.show();
    }
    else
    {
      third.show();
    }
  }
}