import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class HelloString 
{
    public static void main(String[] args)
    {
        String name = "Shashank";
        String message = "Welcome to java programming!";
        String fullMessage = "Hello, " + name + "! " + message;
        LocalDateTime currentTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedDateTime = currentTime.format(formatter);
        System.out.println(fullMessage);
        System.out.println("Your name has " + name.length() +  "characters.");  
        System.out.println("Current date and time: " + formattedDateTime);
    }
}
