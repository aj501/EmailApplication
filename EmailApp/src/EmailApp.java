import java.sql.SQLOutput;

public class EmailApp {
  public static void main(String[] args) {
    Email e = new Email("Alex", "Pham");
   /* e.setAlternateEmail("alexpham@gmail.com");
    System.out.println("New email: "  + e.getAlternateEmail());
    e.changePassword("Hello!");
    System.out.println("New Password: " + e.getNewPassword());
    e.setMailBoxCapacity(2000);
    System.out.println("New mailbox capacity: "+ e.getMailBoxCapacity());*/
    System.out.println( e.showInfo());
  }
}
