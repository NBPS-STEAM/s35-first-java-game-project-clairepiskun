import java.util.Scanner;

public class Jeopardy {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    String dog200Answer, dog400Answer, dog600Answer;
    
  

    System.out.println("Welcome to Jeopardy! Let's get started.");
    
    //Ask user to choose category
    System.out.println("Choose a category. Dogs, Movies, or Candy for $200, $400, or $600.");
    String category = input.nextLine();

    if(category.equals("Dogs for $200")){
      System.out.println("These dogs were bred to pull sleds over long distances and are known for yelling.");
      
      dog200Answer = input.nextLine();

      
    }

    if(dogAnswer.equals("Husky") || dogAnswer.equals  ("Huskies")){
      System.out.println("Correct! You have been awarded $200!");
    }
    else{
      System.out.println("Incorrect.");
    }

    if(category.equals("Dogs for $400")){
      System.out.println("This is the most popular dog breed in the United States");
    }

    String dogAnswerTwo = input.nextLine();

    if(dogAnswerTwo.equals("Labrador Retriever") || dogAnswerTwo.equals ("Labrador") || dogAnswerTwo.equals("Lab")){
      System.out.println("Correct! You have been awarded $400!");
    }
    else{
      System.out.println("Incorrect.");
    }

  }
    
}