import java.sql.SQLOutput;
import java.util.Scanner;

public class Email {
  //Creating Objects for email inside Email class
  /**
   * Use private for variables since we don't want anyone to access them directly
   * WE weill access the info through class API
   */
  private String firstName;
  private String lastName;
  private String password;
  private String department;
  private String email;
  private String companySuffix = ".idealcompany.com";
  private int DefaultPasswordLength = 15;
  private int mailBoxCapacity = 1000;
  private String alternateEmail;


  //Create a constructor to receive firstName and lastName
  public Email(String firstName, String lastName) {

    //this.firstName is class variable = firstName which is local variable in the constructor
    this.firstName = firstName;

    //this.lastName is class variable = lastName which is local variable in the constructor
    this.lastName = lastName;

    //Print out firstName and lastName
    System.out.println("Name received: " + this.firstName + " " + this.lastName);

    //Call method asking for department and return department
    this.department = setDepartment();
   // System.out.println("The employee's department is: " + department);
    this.password = randomPasswordGenerator(DefaultPasswordLength);
    //System.out.println("The password is: " + this.password);

    //Combine information to form email address of form firstName.lastName@department.company.com
    email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@"
            + this.department.toLowerCase() + companySuffix;
    //System.out.println("Email address is: " + email);
  }


  //Ask for department
  private String setDepartment() {
    System.out.print("Department Codes: \n1 for Sales\n2 for Development\n3 " +
                      "for Accounting\n0 for none \nEnter Department Code: \n");
    Scanner input = new Scanner(System.in);
    int Dept = input.nextInt();
    if (Dept == 1) {
      return "Sales";
    } else if (Dept == 2) {
      return "Development";
    } else if (Dept == 3) {
      return "Accounting";
    } else {
      return "None";
    }
  }

  /**
   * @param length store length of defaul password length
   * @return string of a new password
   */
  private String randomPasswordGenerator(int length) {
    String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()";
    char[] password = new char[length];
    for (int i = 0; i < length; i++) {
      int rand = (int) (Math.random() * passwordSet.length());
      password[i] = passwordSet.charAt(rand);
    }
    return new String(password);
  }

  //Set mailbox capacity using encapsulation, hiding actual property of mailbox capacity
  public void setMailBoxCapacity(int capacity) {
    this.mailBoxCapacity = capacity;
  }
  //Set alternate email
public void setAlternateEmail(String alternateEmail){
  this.alternateEmail = alternateEmail;
}

//Change password
public void changePassword(String pw){
    this.password = pw;
}

public int getMailBoxCapacity(){
    return mailBoxCapacity;
}
public String getAlternateEmail(){
    return alternateEmail;
}
public String getNewPassword(){
    return password;
}
public String showInfo(){
   return "Name: " + firstName + " " + lastName + "\n" + "Email address: " + email
          + "\nMail box capacity: " + mailBoxCapacity;
}
}


