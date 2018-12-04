import java.util.Scanner;

public class Why
{
   private String question;
   private String phrase;
   private int goodOrBad;
   private Scanner reader = new Scanner(System.in);
   private String dunno = ("Relatable.");
   
   public Why(String q)
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
      String[] questionArray = question.split(" ");
      
      phrase = (questionArray[0] + " " + questionArray[1] + " " + questionArray[2]);
   }
   
   public void getConnotation()
   {      
      Scanner reader = new Scanner(System.in);
      Connotation conn = new Connotation();
      goodOrBad = conn.getConnotation(question);
      
      if (goodOrBad == 0)
      {
         System.out.println("And how does this make you feel? ");
         String feeling = reader.nextLine();
         
         goodOrBad = conn.getConnotation(feeling);
      }
   }
   
   public void askMoreQuestions()
   {
      if (goodOrBad == 2)
      {
         if (phrase.equals("why did i"))
         {
             System.out.println("You're just too cool.");
         }
         else if (phrase.equals("why do i"))
         {
            System.out.println("You seem to be a very good person. Talking to a bot about your feelings will only harm your mental health. It was nice to meet you!");
         }
         else if (phrase.equals("why did my"))
         {
            System.out.println(dunno);
         }
         else if (phrase.equals("why do my"))
         {
            System.out.println(dunno);
         }
         else if (phrase.equals("why does my"))
         {
            System.out.println("You're just too cool.");
         }
         else if (phrase.equals("why should i"))
         {
            System.out.println("It's worth it, i promise.");
         }
         else if (phrase.equals("why would my"))
         {
            System.out.println(dunno);
         }
         else if (phrase.equals("why am i"))
         {
            System.out.println("You're just too cool.");
         }
         else if (phrase.equals("why are my"))
         {
            System.out.println("Because you're just a great person. Nice.");
         }
         else if (phrase.equals("why is my"))
         {
            System.out.print("Ask them. They'll have a better idea.");
         }
         else
         {
            System.out.print("That's a question you need to ask yourself.");
         }
      }
      else if (goodOrBad == 1)
      {
         if (phrase.equals("why did i"))
         {      
            System.out.print("Did you try your best? ");
            String trybest = reader.nextLine();
            trybest = trybest.toLowerCase();
            if (trybest.contains("yes")) {
               System.out.print("\nDid you prepare as well as you could have? ");
               String prepare = reader.nextLine();
               prepare = prepare.toLowerCase();
               if (prepare.contains("yes")) {
                  System.out.print("\nDid anyone help you prepare? ");
                  String help = reader.nextLine();
                  if (help.contains("yes")) {
                     System.out.print("\nCan you think of another person who can help you? ");
                     String moreHelp = reader.nextLine();
                     moreHelp = moreHelp.toLowerCase();
                     if (moreHelp.contains("no")) {
                        System.out.println("\nThen it sounds like you are setting impossibly high standards for yourself.");
                        System.out.print("You should reconsider your expectations for yourself.");
                     }
                     else if (moreHelp.contains("yes"))
                        System.out.print("\nThen you should ask them.");
                     else
                        System.out.print(dunno);
                  }
                  else if (help.contains("no")) {
                     System.out.print("\nThen ask your parents for help next time. They want to see you succeed.");
                  }
                  else
                     System.out.print(dunno);
               }
               else if (prepare.contains("no"))
                  System.out.print("\nThen prepare next time.");
               else
                  System.out.print(dunno);
            }
            else if (trybest.contains("no")) {
               System.out.print("\nThen try your best next time.");
            }

         }
         else if (phrase.equals("why do i"))
         {
            System.out.println("\nDid you ever not do this? ");
            String notDo = reader.nextLine();
            notDo = notDo.toLowerCase();
            if (notDo.contains("yes")) {
               System.out.print("\nWhat's changed since then?" );
               reader.nextLine();
               System.out.print("\nIs there anything you can do to reverse these changes?" );
               String reverse = reader.nextLine();
               reverse = reverse.toLowerCase();
               if (reverse.contains("yes"))
                  System.out.print("\nThen I wish you good luck. Do what you need to.");
               else if (reverse.contains("no")) {
                  System.out.print("\nIs this a top priority for you?");
                  String priority = reader.nextLine();
                  priority = priority.toLowerCase();
                  if (priority.contains("yes"))
                     System.out.print("\nThen you should talk to someone you trust about it.");
                  else if (priority.contains("no"))
                     System.out.print("Then recognize that this isn’t important to you and you can spend your time on other things.");
                  else
                     System.out.print(dunno);
               }
               else
                  System.out.print(dunno);
            }
            else if (notDo.contains("no")){
               System.out.println("Then talk to a trusted adult about this.");
               System.out.print("This seems to be an important issue that should be addressed as soon as possible.");
            }
         }
         else if (phrase.equals("why did my"))
         {
            System.out.print(dunno);
         }
         else if (phrase.equals("why do my"))
         {
            System.out.print("");
         }
         else if (phrase.equals("why does my"))
         {
            System.out.print("Have your actions caused this? ");
            String actions = reader.nextLine();
            actions = actions.toLowerCase();
            if (actions.contains("yes")) 
               System.out.print("Then maybe you should rethink your actions. Try to fix what you've done wrong.");
            else 
               System.out.println("Then all you can really do is come to terms with the situation and try to move on. ");
         }
         else if (phrase.equals("why should i"))
         {
            if (question.contains("live"))
               System.out.print("Your life contains value, I promise.");
            else 
               System.out.print(dunno);
         }
         else if (phrase.equals("why would my"))
         {
            System.out.print("That's a question you need to ask yourself.");
         }
         else if (phrase.equals("why am i"))
         {
            System.out.println("How long have you been like this? Is there anything you can do to prevent it? ");
            String prevent = reader.nextLine();
            prevent = prevent.toLowerCase();
            if (prevent.contains("yes")) 
               System.out.println("Then pursue that.");
            else
               System.out.println("Then the only thing you can truly do is recognize the circumstances you are facing and adapt.");
               
         }
         else if (phrase.equals("why are my"))
         {
            System.out.print("Because you have unreasonably high expectations for bots.");
         }
         else if (phrase.equals("why is my"))
         {
            System.out.print("Ask them. They'll have a better idea.");
         }
         else
         {
            System.out.print("That's a question you need to ask yourself.");
         }
      }
      else 
      {
         if (phrase.equals("why should i") && question.contains("live"))
            System.out.print("Your life contains value, I promise.");
         else
            System.out.print("That's a question you need to ask yourself.");
      }
   }
}
