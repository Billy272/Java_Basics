package Trade;
import java.util.Scanner;
public class customer {
    public String Name;
    public String Email;
    public double CreditLimit;

    public String getName() {
        return this.Name;
    }
    public void setName(String Name) {
        this.Name = Name;
    }
    public String getEmail(){
        return this.Email;
    }
    public void setEmail(String Email) {
        this.Email = Email;
    }
    
    
//create methods to display
    public void displayDetails(){
        System.out.println("Name: "+ Name+" Email: "+ Email+" Credit Limit: "+ CreditLimit);
        
    }
}