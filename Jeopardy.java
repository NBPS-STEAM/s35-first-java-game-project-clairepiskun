import java.util.Scanner;

public class Jeopardy {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    String dog200Answer, dog400Answer, dog600Answer, movie200Answer, movie400Answer, movie600Answer;
    
  

    System.out.println("Welcome to Jeopardy! Let's get started.");
    
    //Ask user to choose category
    System.out.println("Choose a category. Dogs, Movies, or Candy for $200, $400, or $600.");
    String category = input.nextLine();


    if(category.equals("Dogs for $200")){
      System.out.println("These dogs were bred to pull sleds over long distances and are known for yelling.");
      
       dog200Answer = input.nextLine();  
    }

    if(dog200Answer.equals("Husky") || dog200Answer.equals  ("Huskies")){
      System.out.println("Correct! You have been awarded $200!");
    }
    else{
      System.out.println("Incorrect.");
    }


    if(category.equals("Dogs for $400")){
      System.out.println("This is the most popular dog breed in the United States");
      
       dog400Answer = input.nextLine();
    }

    if(dog400Answer.equals("Labrador Retriever") || dog400Answer.equals ("Labrador") || dog400Answer.equals("Lab")){
      System.out.println("Correct! You have been awarded $400!");
    }
    else{
      System.out.println("Incorrect.");
    }

 
  if(category.equals("Dogs for $600")){
    System.out.println("This was the dog breed that starred in the movie Beethoven.");
  
     dog600Answer = input.nextLine();
  }

  if(dog600Answer.equals("St. Bernard") || dog600Answer.equals ("Saint Bernard")){
    System.out.println("Correct! You have been awarded $600!");
  }
  else{
    System.out.println("Incorrect.");
  }



  if(category.equals("Movies for $200")){
    System.out.println("Which 2010 Disney film is a retelling of the Rapunzel story?");

    movie200Answer = input.nextLine();
  }

  if(movie200Answer.equals("Tangled")){
    System.out.println("Correct! You have been awarded $200!");
  }
  else{
    System.out.println("Incorrect.");
  }

  if(category.equals("Movies for $400")){
    System.out.println("Which festive movie from 1990 revolves around a character called Kevin McAllister?");

    movie400Answer = input.nextLine();
  }

  if(movie400Answer.equals("Home Alone")){
    System.out.println("Correcct! You have been awarded $400!");
  }
  else{
    System.out.println("Incorrect.");
  }

  if(category.equals("Movies for $600")){
    System.out.println("Which highly successful 2008 musical comedy was largely filmed on the Greek island of Skopelos?");

    movie600Answer = input.nextLine();
  }

  if(movie600Answer.equals("Mamma Mia!") || movie600Answer.equals("Mamma Mia")){
    System.out.println("Correct! You have been awarded $600!");
  }
  else{
    System.out.println("Incorrect.");
  }



  if(category.equals("Candy for $200")){
    System.out.println("What red and white striped candy is a popular Christmas favorite?");

    candy200Answer = input.nextLine();
  }

  if(candy200Answer.equals("Candy Cane") || candy200Answer.equals("Candy cane")){
    System.out.println("Correct! You have been awarded $200!");
  }
  else{
    System.out.println("Incorrect.");
  }
  
  if(category.equals("Candy for $400")){
    System.out.println("Which candy sucker can you wear on your finger?");

    candy400Answer = input.nextLine();
  }

  if(candy400Answer.equals("Ring Pop") || candy400Answer.equals("Ring pop")){
    System.out.println("Correct! You have been awarded $400!");
  }
  else{
    System.out.println("Incorrect.");
  }

  if(category.equals("Candy for $600")){
    System.out.println("What candy comes in refillable dispensers with characters on top?");

    candy600Answer = input.nextLine();
  }

  if(candy600Answer.equals("Pez")){
    System.out.println("Correct! You have been awarded $600!");
  }
  else{
    System.out.println("Incorrect.");
  }
  }
    
}