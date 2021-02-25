public class Player
{
  private Round round;
  private String name;

  public int[] round()
  {
    return 
  }

  public boolean getAdditionalYahtzeeScore()
  {
    return false;
  }

  public int finalScore()
  {
    int count=0;
    if (round.sum()>63)
    {
      count = round.sum()+ 35;
    }
    else
    {
      count = round.sum();
    }
    return count;
  }
}
