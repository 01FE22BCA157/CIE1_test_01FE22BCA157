
/**
 * The `Person` class in Java represents a person with attributes for name and date of birth, and
 * methods to display the name and calculate and display the age based on the date of birth.
 */
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Person  {
    public String name;
    public String dob;

    public void displayName() {
        System.out.println("Name of the person is: " + name);
    }

   /**
    * The function `displayAge` calculates and displays the age of a person based on their date of
    * birth.
    * 
    * @param dob The parameter `dob` in the `displayAge` method stands for the date of birth of a
    * person. It is expected to be in the format "dd-MM-yyyy", representing the day, month, and year of
    * birth.
    */
    public void displayAge(String dob) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate birthDate = LocalDate.parse(dob, formatter);
        LocalDate currentDate = LocalDate.now();
        Period period = Period.between(birthDate, currentDate);
        int age = period.getYears();
        System.out.println("Age of Person: " + age +"years");
    }
    public static void main(String[] args) {
        Person p=new Person();
        p.name = "Kavya C";
        p.displayName();
        p.displayAge("19-06-2004");

        
    }
}