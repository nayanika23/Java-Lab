import java.util.Scanner;
import java.util.Random;
import java.io.*;
import java.util.*;

class Customer {
  private int customer_id;
  private String name;
  private String addr;
  private String email;
  private Long mobile;
  private String pwd;

  public Customer() {

  }

  public Customer(int cid,String cname, String caddr, String sEmail, Long mobileNo, String pwdword) {
    customer_id = cid;
    name = cname;
    addr = caddr;
    email = sEmail;
    mobile = mobileNo;
    pwd = pwdword;
  }

  public Customer(int cid,String cname, String caddr, String pwdword, Long mobileNo) {
    customer_id = cid;
    name = cname;
    addr = caddr;
    pwd = pwdword;
    mobile = mobileNo;
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

  public void display() {
    System.out.println("Customer Id is - " + this.customer_id);
    System.out.println("Name is - " + this.name);
    System.out.println("addr is - " + this.addr);
    if (this.email != null || this.email != "") {
      System.out.println("Email is - " + this.email);
    }
    System.out.println("mobile no is - " + this.mobile);
    System.out.println("\n\n");
  }
}
class Signup extends Customer {
  private String email;
  private String username;
  private String pwd;

  void login(String email, String pwd, Customer cust) {
    
     if (email.equals(cust.getEmail()) && pwd.equals(cust.getpwdword())) {
      System.out.println("Successfully logged in with email");
      // System.exit(0);
    } else {
      System.out.print("Wrong Credentials");
      // System.exit(0);
    }
  }

  void login(Long mobile, String pwd,Customer cust) {
    if (mobile.equals(cust.getmobileNo()) && pwd.equals(cust.getpwdword())) {
      System.out.println("Successfully logged in with phone no");
      // System.exit(0);
    } else {
      System.out.print("Wrong Credentials");
      // System.exit(0);
    }
  }
}
class Booking {

    static int total_room=50;
    static int room;
    int count;
    public class Book_room
    {
        void getdata_room()
        {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter No.of rooms you want to book:");
        room= sc.nextInt();
        System.out.println("Enter No.of Person :");
        count= sc.nextInt();
        }
    
    void check_room()
    {
        if (total_room<room)
        {
            System.out.println("-----Rooms not Available------.");
        }
        else
        {   
            Random rand = new Random();
            int booking_id= rand.nextInt(1000);
            System.out.println("--------Booking Sucessfull!!---------");
            System.out.println("Booking ID is:"+booking_id);
        }
    }
    }
     public static class InnerBooking{
        void avail_room(){
            total_room=total_room-room;
            System.out.println("Number of rooms Available for booking:"+total_room);
    
        }
    } 
}
public class Main {
  public static Customer getData(String method) {
    Scanner sc = new Scanner(System.in);
    System.out.println("------Enter Details of Customer----");

    Random rand = new Random();
    int cid= rand.nextInt(1000);

    System.out.print("Enter Your Name: ");
    String name = sc.nextLine();

    System.out.print("Enter Your address: ");
    String addr = sc.next();

    System.out.print("Enter Your mobile no: ");
    Long mobile = sc.nextLong();
    if (String.valueOf(mobile).length() != 10) {
      System.out.println("Incorrect contact number");
      System.exit(0);
    }

    String email = "";
    if (method == "email") {
      System.out.print("Enter Your Email: ");
      email = sc.next();
      String regex = "^[\\w-\\.+]*[\\w-\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
      if (email.matches(regex) == false) {
        System.out.println("wrong email");
        System.exit(0);
      }

    }

    Console console = System.console();
    String pwdwordArray = new String(console.readPassword("Enter your password(it must be atleast 5 character): "));

    if (pwdwordArray.length() < 5) {
      System.out.println("Invalid password length");
      System.exit(0);
    }
    if (method == "email") {
      return new Customer(cid,name, addr, email, mobile, pwdwordArray);
    } else {
      return new Customer(cid,name, addr, pwdwordArray, mobile);
    }
  }

  public static void main(String args[]) {
    Customer cust = new Customer();
    Signup log = new Signup();
    Booking.InnerBooking ob= new Booking.InnerBooking();
    Booking outer= new Booking();
    Booking.Book_room inner= outer.new Book_room();
    Scanner sc = new Scanner(System.in);

    int ch;
    do {
        System.out.println("----Welcome to Hotel booking----");
        System.out.println("1.Register\n2.Login\n3.Display\n4.Booking\n5.Exit");
        System.out.println("Your choice : ");
        ch = sc.nextInt();

        switch (ch) {
            case 1:
                System.out.println("1. Register using email ");
                System.out.println("2. Register using mobile ");
                System.out.print("Enter Your Choice: ");
                int ch1 = sc.nextInt();
                if (ch1 == 1) {
                    cust = getData("email");
                    break;
                } 
                else 
                {
                    cust = getData("mobile");
                    break;
                } 

            case 2:
                if (cust.getpwdword() == null) {
                    System.out.println("-- No Data Found Register First --\n\n");
                    System.out.println("1. Register using email ");
                    System.out.println("2. Register using mobile ");
                    System.out.print("Enter Your Choice: ");
                    int choice = sc.nextInt();
                    if (choice == 1) {
                        cust = getData("email");
                    }
                } 
                System.out.println("Enter Login details");
                System.out.println("1. Login with mobile ");
                System.out.println("2. Login with Email ");
                System.out.println("Enter your choice: ");
                int chl = sc.nextInt();
                if (chl == 1) {
                    System.out.print("Enter your mobile no: ");
                    Long mobile = sc.nextLong();
                    Console console = System.console();
                    String pwdwordArray = new String(console.readPassword("Enter your password: "));
                    log.login(mobile, pwdwordArray,cust);
                }
                if (ch == 2) {
                    sc.nextLine();
                    System.out.print("Enter your email id: ");
                    String email = sc.nextLine();
                    Console console = System.console();
                    String pwdwordArray = new String(console.readPassword("Enter your password: "));
                    log.login(email, pwdwordArray,cust);
                }
                break;

            case 3:
                cust.display();
                break;
            case 4: 
                inner.getdata_room();
                inner.check_room();
                ob.avail_room();
                break;


        }
    } while (ch != 5);

    // for (int i = 0; i < num; i++) {
    // Customer s = new Customer();
    // s1[i] = s.getData();
    // }

    // for(int i=0; i<s1.length; i++){
    // sp.login(s1[i].email, s1[i].pwd);
    // }
    // for(int i=0;i<s1.length;i++){
    // s1[i].display();
    // }
  }
}