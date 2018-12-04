import java.util.Scanner;

public class When
{
   private String question;
   private String phrase;
   private int goodOrBad;
   private Scanner reader = new Scanner(System.in);
   private String dunno = ("Relatable.");
   
   public When(String q)
   {
      question = q;
   }
   
   public void getAdvice()
   {
      System.out.println("When the time is right. Trust yourself.");
   }
}