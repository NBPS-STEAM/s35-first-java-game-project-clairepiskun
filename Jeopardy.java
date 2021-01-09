import java.util.Scanner;

public class Jeopardy {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    int score = 0;
    
   for(int i = 10; i < 130; i += 30) {
      System.out.println(i);
    }

    System.out.println("Welcome to Jeopardy! Let's get started.");
    
    //Ask user to choose category
    System.out.println("Choose a category. Dogs, Movies, or Candy for $200, $400, or $600.");
    String category = input.nextLine();

   //If user chooses Dogs for $200
    if(category.equals("Dogs for $200")){
      System.out.println("These dogs were bred to pull sleds over long distances and are known for yelling.");
      
       String dog200Answer = input.nextLine();  

       if(dog200Answer.equals("Husky") || dog200Answer.equals  ("Huskies")){
      System.out.println("Correct! You have been awarded $200!");
      score += 200;
    }   
    else{
      System.out.println("Incorrect.");
    }
    }

   //If user chooses Dogs for $400
    if(category.equals("Dogs for $400")){
      System.out.println("This is the most popular dog breed in the United States");
      
       String dog400Answer = input.nextLine();

       if(dog400Answer.equals("Labrador Retriever") || dog400Answer.equals ("Labrador") || dog400Answer.equals("Lab")){
      System.out.println("Correct! You have been awarded $400!");
      score += 400;
    }
    else{
      System.out.println("Incorrect.");
    }
    }

  //If user chooses Dogs for $600
  if(category.equals("Dogs for $600")){
    System.out.println("This was the dog breed that starred in the movie Beethoven.");
  
     String dog600Answer = input.nextLine();

    if(dog600Answer.equals("St. Bernard") || dog600Answer.equals ("Saint Bernard")){
    System.out.println("Correct! You have been awarded $600!");
    score += 600;
  }
  else{
    System.out.println("Incorrect.");
  }
  }


 //If user chooses Movies for $200
  if(category.equals("Movies for $200")){
    System.out.println("Which 2010 Disney film is a retelling of the Rapunzel story?");

    String movie200Answer = input.nextLine();
    
    if(movie200Answer.equals("Tangled")){
    System.out.println("Correct! You have been awarded $200!");
    score += 200;
  }
  else{
    System.out.println("Incorrect.");
  }
  }

//If user chooses Movies for $400
  if(category.equals("Movies for $400")){
    System.out.println("Which festive movie from 1990 revolves around a character called Kevin McAllister?");

    String movie400Answer = input.nextLine();

    if(movie400Answer.equals("Home Alone")){
    System.out.println("Correcct! You have been awarded $400!");
    score += 400;
  }
  else{
    System.out.println("Incorrect.");
  }
  }

//If user chooses Movies for $600
  if(category.equals("Movies for $600")){
    System.out.println("Which highly successful 2008 musical comedy was largely filmed on the Greek island of Skopelos?");

    String movie600Answer = input.nextLine();

    if(movie600Answer.equals("Mamma Mia!") || movie600Answer.equals("Mamma Mia")){
    System.out.println("Correct! You have been awarded $600!");
    score += 600;
  }
  else{
    System.out.println("Incorrect.");
  }
  }


//If user chooses Candy for $200
  if(category.equals("Candy for $200")){
    System.out.println("What red and white striped candy is a popular Christmas favorite?");

    String candy200Answer = input.nextLine();
    
    if(candy200Answer.equals("Candy Cane") || candy200Answer.equals("Candy cane")){
    System.out.println("Correct! You have been awarded $200!");
    score += 200;
  }
  else{
    System.out.println("Incorrect.");
  }
  }

//If user chooses Candy for $400 
  if(category.equals("Candy for $400")){
    System.out.println("Which candy sucker can you wear on your finger?");

    String candy400Answer = input.nextLine();
    
    if(candy400Answer.equals("Ring Pop") || candy400Answer.equals("Ring pop")){
    System.out.println("Correct! You have been awarded $400!");
    score += 400;
  }
  else{
    System.out.println("Incorrect.");
  }
  }

//If user chooses Candy for $600
  if(category.equals("Candy for $600")){
    System.out.println("What candy comes in refillable dispensers with characters on top?");

    String candy600Answer = input.nextLine();
  
    if(candy600Answer.equals("Pez")){
    System.out.println("Correct! You have been awarded $600!");
    score += 600;
  }
  else{
    System.out.println("Incorrect.");
   }
  }

//Prints out final score 
System.out.println(score);

  }
}