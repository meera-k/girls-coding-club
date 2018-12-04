import java.util.Scanner;

public class Who
{
   private String question;
   private String phrase;
   private int goodOrBad;
   private Scanner reader = new Scanner(System.in);
   private String dunno = ("Relatable.");
   
   public Who(String q)
   {
      question = q;
   }
   
   public void getAdvice()
   {
      getPhrase();
      getConnotation();
      askMoreQuestions();  
   }
   
   public void getPhrase()
   {
      String[] questionArray = question.split(" ", 3);
      
      phrase = (questionArray[0] + " " + questionArray[1] + " " + questionArray[2]);
   }
   
   public void getConnotation()
   {
      Connotation conn = new Connotation();
      goodOrBad = conn.getConnotation(question);
      
      if (goodOrBad == 0)
      {
         System.out.println("How does this make you feel? ");
         String feeling = reader.nextLine();
         
         goodOrBad = conn.getConnotation(feeling);
      }

   }
   
   public void askMoreQuestions()
   {
      if (goodOrBad == 2)
      {
         if (phrase.equals("who do i"))
         {
            System.out.print("Someone you trust. Definitely not a bot. Like me.");
         }
         else if (phrase.equals("who should i"))
         {
            if (question.contains("go"))
               System.out.print("Someone that you trust; please don’t burden me with your problems.");
            else
               System.out.print("Please, anyone else.");
         }
         else if (phrase.equals("who can i"))
         {
            System.out.print("Trust in the people closest to you. They’ll have your best interests in mind.");
         }
         else if (phrase.equals("who could i"))
         {
            System.out.print("Trust in the people closest to you. They’ll have your best interests in mind.");
         }
         else if (phrase.equals("who am i"))
         {
            System.out.print("That is something you must figure out for yourself, young padawan.");
         }
         else
         {
            System.out.println(dunno);
         }
      }
      else if (goodOrBad == 1)
      {
         if (phrase.equals("who do i"))
         {
            System.out.print("Someone you trust. Definitely not a bot. Like me.");
         }
         else if (phrase.equals("who should i"))
         {
            if (question.contains("go"))
               System.out.print("Someone that you trust; please don’t burden me with your problems.");
            else
               System.out.print("Please, anyone else.");
         }
         else if (phrase.equals("who can i"))
         {
            System.out.print("Trust in the people closest to you. They’ll have your best interests in mind.");
         }
         else if (phrase.equals("who could i"))
         {
            System.out.print("Trust in the people closest to you. They’ll have your best interests in mind.");
         }
         else if (phrase.equals("who am i"))
         {
            System.out.print("That is something you must figure out for yourself, young padawan.");
         }
         else
         {
            System.out.println(dunno);
         }
      }
      else
      {
         System.out.println(dunno);
      }
      
      
   }
}