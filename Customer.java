/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel;

public class Customer {
  private int customer_id;
  private String name;
  private String addr;
  private String email;
  private Long mobile;
  private int age;
  private String pwd;

  public Customer() {

  }

  public Customer(int cid,String cname, String caddr, String sEmail, Long mobileNo, int cage, String pwdword) {
    customer_id = cid;
    name = cname;
    addr = caddr;
    email = sEmail;
    mobile = mobileNo;
    age = cage;
    pwd = pwdword;
  }

  public Customer(int cid,String cname, String caddr, String pwdword, Long mobileNo, int cage) {
    customer_id = cid;
    name = cname;
    addr = caddr;
    pwd = pwdword;
    mobile = mobileNo;
    age = cage;
  }

  public String getEmail() {
    return email;
  }

  public Long getmobileNo() {
    return mobile;
  }

  public String getpwdword() {
    return pwd;
  }

  public void welcome(){
    System.out.println("---Book your room now----");
  }

  public void display() {
    System.out.println("Customer Id is - " + this.customer_id);
    System.out.println("Name is - " + this.name);
    System.out.println("Age is - " + this.age);
    System.out.println("addr is - " + this.addr);
    if (this.email != null || this.email != "") {
      System.out.println("Email is - " + this.email);
    }
    System.out.println("mobile no is - " + this.mobile);
    System.out.println("\n\n");
  }
}
