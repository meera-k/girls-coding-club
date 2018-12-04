import java.util.Scanner;

public class How
{
   private String question;
   private String phrase;
   private int goodOrBad;
   private Scanner reader = new Scanner(System.in);
   private String dunno = ("Relatable.");
   
   public How(String q)
   {
      question = q;
   }
   
   public void getAdvice()
   {
      getConnotation();
      askMoreQuestions();
   }
   
   public void getConnotation()
   {
      System.out.println("How do you hope to feel after doing this? ");
      String answer = reader.nextLine();
      
      Connotation conn = new Connotation();
      goodOrBad = conn.getConnotation(answer);
   }
   
   public void askMoreQuestions()
   {
      if (goodOrBad == 1)
         System.out.println("Don't.");
      else
         System.out.println("Google has all the answers you need.");
   }
}