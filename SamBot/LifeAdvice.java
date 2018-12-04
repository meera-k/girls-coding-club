import java.util.Scanner;

public class LifeAdvice
{
     public static void main(String[] args) 
     {
         String question;
         String firstWord;
         Who whoAdvice;
         What whatAdvice;
         Where whereAdvice;
         When whenAdvice;
         Why whyAdvice;
         How howAdvice;
         
         question = readInQuestion();
         firstWord = getFirstWord(question);
         
         if (firstWord.equals("who"))
         {
            whoAdvice = new Who(question);
            whoAdvice.getAdvice();
         }
         
         else if (firstWord.equals("what"))
         {
            whatAdvice = new What(question);
            whatAdvice.getAdvice();
         }
         
         else if (firstWord.equals("where"))
         {
            whereAdvice = new Where(question);
            whereAdvice.getAdvice();
         }
         
         else if (firstWord.equals("when"))
         {
            whenAdvice = new When(question);
            whenAdvice.getAdvice();
         }
         
         else if (firstWord.equals("why"))
         {
            whyAdvice = new Why(question);
            whyAdvice.getAdvice();
         }
         
         else
         {
            howAdvice = new How(question);
            howAdvice.getAdvice();
         }
         
            
     }
     
     public static String readInQuestion()
     {
         Scanner reader = new Scanner(System.in);
         
         System.out.println("Enter your question: ");
         String theQuestion = reader.nextLine();
         
         String question = theQuestion.toLowerCase();
         
         return question;
     }
     
     public static String getFirstWord(String question)
     {
         String[] theFirstWord = question.split(" ", 0);
         
         String firstWord = theFirstWord[0];
         
         return firstWord;
     }
     
}