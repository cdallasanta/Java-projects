import java.util.Scanner;
import java.util.Random;
import java.util.List;
import java.util.ArrayList;

public class Magic8Ball
{

  public static void main(String[] args)
  {
    List<String> answers = new ArrayList<String>();
    
    answers.add("Answer unclear");
    answers.add("Indisputably");
    answers.add("Aw heck no");
    answers.add("Only if you really want it");
    answers.add("Yes, up until the last moment when it is snatched from your grasp");
    answers.add("Ask again");
    
    System.out.println("Please type a yes or no question");
    Scanner input = new Scanner(System.in);
    String question = input.next();
    
    Random r = new Random();
    int selection = r.nextInt(answers.size());
    System.out.println(answers.get(selection));
  }
}
