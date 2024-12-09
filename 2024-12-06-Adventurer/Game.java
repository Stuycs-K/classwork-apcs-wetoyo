import java.util.Scanner;
import java.util.Random;
public class Game {

  public static void main(String[] args) {
    //do this once
    Scanner userInput = new Scanner(System.in);

    //You can do the rest many times:
    CodeWarrior p2 = new CodeWarrior();

    System.out.println("Enter username");
    //Read one line of user input
    String userName = userInput.nextLine();
    //Do something with the input
    System.out.println("Username is: " + userName);
    Guy p1 = new Guy(userName);
    boolean playing = true;
    Random rand = new Random();
    while(p2.getHP() > 0 && p1.getHP()>0 && playing)
    {
      System.out.println("Type: (a)ttack / (sp)ecial / (su)pport / quit");
      //Read one line of user input
      String input = userInput.nextLine();
      switch (input)
      {
        case "a":
          p1.attack(p2);
          System.out.println("p2 has " + p2.getHP()+" hp remaining");
          break;
        case "sp":
          p1.specialAttack(p2);
          System.out.println("p1 has " + p1.getSpecial()+ " special");
          System.out.println("p2 has " + p2.getHP()+" hp remaining");
          break;
        case "su":
          p1.support(p2);
          System.out.println("p2 has " + p2.getHP()+" hp remaining");
          break;
        case "quit":
          playing = false;
          break;
        default:
          System.out.println("invalid input");
          break;
      }
      int random = rand.nextInt(3);
      switch (random)
      {
        case 0:
          System.out.println("p2 has attacked p1");
          p2.attack(p1);
          System.out.println("p1 has " + p1.getHP()+" hp remaining");
          break;
        case 1:
          p2.specialAttack(p1);
          System.out.println("p2 has attacked p1 with" + p1.getSpecialName());
          System.out.println("p2 has " + p2.getSpecial() + " special");
          System.out.println("p1 has " + p1.getHP()+" hp remaining");
          break;
        case 2:
          System.out.println("p2 has supported p1");
          p2.support(p1);
          System.out.println("p1 has " + p2.getHP()+" hp remaining");
          break;
      }
    }
    if(playing)
    {
      System.out.println(p1.getHP()>p2.getHP()? "P1 wins" : "P2 wins");
    }
  }
}
