import java.util.Scanner;

public class What
{
   private String question;
   private String phrase;
   private int goodOrBad;
   private Scanner reader = new Scanner(System.in);
   private String dunno = ("Relatable.");
   
   public What(String q)
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
   }
   
   public void askMoreQuestions()
   {
      if (goodOrBad == 2)
      {
         if (phrase.equals("what did i"))
         {
            System.out.print("You're amazing.");
         }
         else if (phrase.equals("what do i"))
         {
            if (question.contains("what do i do if")) {
            System.out.print("\nIs there anything you can do to fix it? ");
            String fix = reader.nextLine();
            fix = fix.toLowerCase();
            if (fix.contains("yes")) {
               System.out.print("\nWill you do it? ");
               String willDo = reader.nextLine();
               willDo = willDo.toLowerCase();
               if (willDo.contains("yes"))
                  System.out.print("\nAlright, problem solved!");
               else if (willDo.contains("no"))
                  System.out.print("\nIf you can fix it, you should. If not for your own sake, then for others’.");
               else
                  System.out.print(dunno);
            }
            else if (fix.contains("no")) {
               System.out.println("\nThen you have to roll with these punches and accept them as part of life.");
               System.out.print("I know it might be difficult, but you have to let it go if there's nothing you can do about it.");
            }
            else
               System.out.print(dunno);
         }
      else
         System.out.print("You have to follow your gut on this one. I believe you'll do the right thing.");

         }
         else if (phrase.equals("what do my"))
         {
            System.out.print(dunno);
         }
         else if (phrase.equals("what did my"))
         {
            System.out.print(dunno);
         }
         else if (phrase.equals("what should i"))
         {
            System.out.print(dunno);
         }
         else if (phrase.equals("what can i"))
         {
            System.out.print(dunno);
         }
         else if (phrase.equals("what can my"))
         {
            System.out.print(dunno);
         }
         else if (phrase.equals("what would my"))
         {
            System.out.print(dunno);
         }
         else if (phrase.equals("what could my"))
         {
            System.out.print(dunno);
         }
         else if (phrase.equals("what could i"))
         {
            System.out.print(dunno);
         }
         else if (phrase.equals("what am i"))
         {
            System.out.print(dunno);
         }
         else if (phrase.equals("what are my"))
         {
            System.out.print(dunno);
         }
         else
         {
            System.out.print("Trust yourself you can do this.");
         }
      }
      else if (goodOrBad == 1)
      {
         if (phrase.equals("what did i"))
         {
            System.out.println("Nothing. This isn't your fault.");
         }
         else if (phrase.equals("what do i"))
         {
            if (question.contains("what do i do if")) {
            System.out.print("\nIs there anything you can do to fix it? ");
            String fix = reader.nextLine();
            fix = fix.toLowerCase();
            if (fix.contains("yes")) {
               System.out.print("\nWill you do it? ");
               String willDo = reader.nextLine();
               willDo = willDo.toLowerCase();
               if (willDo.contains("yes"))
                  System.out.print("\nAlright, problem solved!");
               else if (willDo.contains("no"))
                  System.out.print("\nIf you can fix it, you should. If not for your own sake, then for others’.");
               else
                  System.out.print(dunno);
            }
            else if (fix.contains("no")) {
               System.out.println("\nThen you have to roll with these punches and accept them as part of life.");
               System.out.print("I know it might be difficult, but you have to let it go if there's nothing you can do about it.");
            }
            else
               System.out.print(dunno);
         }
      else
         System.out.print("You have to follow your gut on this one. I believe you'll do the right thing.");

         }
         else if (phrase.equals("what do my"))
         {
            System.out.println("I don't know. Ask them.");
         }
         else if (phrase.equals("what did my"))
         {
            System.out.println("If you ask them, you'll have a better idea.");
         }
         else if (phrase.equals("what should i"))
         {
         
         }
         else if (phrase.equals("what can i"))
         {
            System.out.println("Be observant and keep an eye out for different ways to improve.");
         }
         else if (phrase.equals("what can my"))
         {
            System.out.println("Ask them for advice. They'll be able to help more than I can.");
         }
         else if (phrase.equals("what would my"))
         {
            System.out.println("You have to trust that they will be supportive of you no matter what, because they care about you.");
         }
         else if (phrase.equals("what could my"))
         {
            System.out.println("Ask them for advice. They'll be able to help more than I can.");
         }
         else if (phrase.equals("what could i"))
         {
            System.out.println("Be observant and keep an eye out for different ways to improve.");
         }
         else if (phrase.equals("what am i"))
         {
            System.out.println("42.");
         }
         else if (phrase.equals("what are my"))
         {
            System.out.println("You have to trust that they will be supportive of you no matter what, because they care about you.");
         }
         else
         {
            System.out.print("Trust yourself you can do this.");

         }
      }
      else
      {
         if (question.contains("what do i do if")) {
            System.out.print("\nIs there anything you can do to fix it? ");
            String fix = reader.nextLine();
            fix = fix.toLowerCase();
            if (fix.contains("yes")) {
               System.out.print("\nWill you do it? ");
               String willDo = reader.nextLine();
               willDo = willDo.toLowerCase();
               if (willDo.contains("yes"))
                  System.out.print("\nAlright, problem solved!");
               else if (willDo.contains("no"))
                  System.out.print("\nIf you can fix it, you should. If not for your own sake, then for others’.");
               else
                  System.out.print(dunno);
            }
            else if (fix.contains("no")) {
               System.out.println("\nThen you have to roll with these punches and accept them as part of life.");
               System.out.print("I know it might be difficult, but you have to let it go if there's nothing you can do about it.");
            }
            else
               System.out.print(dunno);
         }
      else
         System.out.print("You have to follow your gut on this one. I believe you'll do the right thing.");

      }
      
      
   }
}
