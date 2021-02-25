import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

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

  public int getAcesScore()
  {
    int count = 0;
    for (int i = 0;i < 5;i++)
    {
      if (dices.get(i).getNumber() == 1)
      {
        count++;
      }
    }
    return count;
  }

  public int getTwosScore()
  {
    int count = 0;
    for (int i = 0;i < 5;i++)
    {
      if (dices.get(i).getNumber() == 2)
      {
        count++;
      }
    }
    return count;
  }

  public int getThreesScore()
  {
    int count = 0;
    for (int i = 0;i < 5;i++)
    {
      if (dices.get(i).getNumber() == 3)
      {
        count++;
      }
    }
    return count;
  }

  public int getFoursScore()
  {
    int count = 0;
    for (int i = 0;i < 5;i++)
    {
      if (dices.get(i).getNumber() == 4)
      {
        count++;
      }
    }
    return count;
  }

  public int getFivesScore()
  {
    int count = 0;
    for (int i = 0;i < 5;i++)
    {
      if (dices.get(i).getNumber() == 5)
      {
        count++;
      }
    }
    return count;
  }

  public int getSixesScore()
  {
    int count = 0;
    for (int i = 0;i < 5;i++)
    {
      if (dices.get(i).getNumber() == 6)
      {
        count++;
      }
    }
    return count;
  }

  public int getPair() {
    int count = 0;
    for(int i=0;i<5;i++){
      for(int j=i+1;j<5;j++){
        if(dices.get(i).getNumber()==dices.get(j).getNumber())
          count++;
      }
    }
    return count;
  }

  public boolean get3OfAKind()
  {
    return (getPair() == 3);
  }

  public boolean get4OfAKind()
  {
    return (getPair() == 6);
  }

  public boolean getYahtzee()
  {
    return (getPair() == 10);
  }

  public boolean getFullHouse()
  {
    return (getPair() == 4);
  }

  public int Straight()
  {
    Collections.sort(dices, new Comparator<Dice>()
    {
      @Override public int compare(Dice o1, Dice o2)
      {
        if (o1.getNumber() > o2.getNumber())
        {
          return 1;
        }
        else
        {
          return -1;
        }
      }
    });
    int a = dices.get(4).getNumber() - dices.get(3).getNumber();
    int b = dices.get(3).getNumber() - dices.get(2).getNumber();
    int c = dices.get(2).getNumber() - dices.get(1).getNumber();
    int d = dices.get(1).getNumber() - dices.get(0).getNumber();
    if (a == b && b == c && c == d)
    {
      return 2;
    }
    if ((a == b && b == c) || (b == c & c == d))
    {
      return 1;
    }
    return 0;
  }

  public int sum()
  {
    int count = 0;
    for (int i = 0;i < 5;i++)
    {
      count = count + dices.get(i).getNumber();
    }
    return count;
  }

}
