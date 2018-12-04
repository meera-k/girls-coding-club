import java.util.Scanner;

public class Where
{
   private String question;
   private String phrase;
   private int goodOrBad;
   private Scanner reader = new Scanner(System.in);
   private String dunno = ("Relatable.");
   
   public Where(String q)
   {
      question = q;
   }
   
   public void getAdvice()
   {
      System.out.println("Somewhere over the rainbow. ");
   }
}