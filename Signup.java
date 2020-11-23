/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel;

/**
 *
 * @author nayanikapramanik
 */
public class Signup extends Customer {
  private String email;
  private String username;
  private String pwd;

  public void login(String email, String pwd, Customer cust) {
    
     if (email.equals(cust.getEmail()) && pwd.equals(cust.getpwdword())) {
      System.out.println("Successfully logged in with email");
      // System.exit(0);
    } else {
      System.out.println("Wrong Credentials");
      // System.exit(0);
    }
  }

 public void login(Long mobile, String pwd,Customer cust) {
    if (mobile.equals(cust.getmobileNo()) && pwd.equals(cust.getpwdword())) {
      System.out.println("Successfully logged in with phone no");
      // System.exit(0);
    } else {
      System.out.println("Wrong Credentials");
      // System.exit(0);
    }
  }
  public void welcome(){
    super.welcome();
    System.out.println("----Welcome Guest to Our Hotel----");
  }
}
