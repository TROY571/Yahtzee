import java.util.ArrayList;

public class Round
{
  private ArrayList<Dice> dices;
  private Dice dice;

  public Round()
  {
    dices = new ArrayList<>();
  }

  public void addDice(Dice dice)
  {
    if(dices.size()<4)
    {
      dices.add(dice);
    }
    else
      System.out.println("You can't add more dices.");
  }

  public void removeDice(Dice dice)
  {
    dices.remove(dice);
  }

  public int sum()
  {
    int count = 0;
    for(int i=0;i<dices.size();i++)
    {
      dice.roll();
      count+=dice.roll();
    }
    return count;
  }
}
