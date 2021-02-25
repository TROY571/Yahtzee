public class Dice
{
  private int number;

  public int roll()
  {
    number = (int)(Math.random()*6)+1;
    return number;
  }

  public int getNumber()
  {
    return number;
  }
}
